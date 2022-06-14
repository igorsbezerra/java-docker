package dev.igor.javadocker.service.impl;

import dev.igor.javadocker.entity.Hero;
import dev.igor.javadocker.repository.HeroRepository;
import dev.igor.javadocker.service.HeroService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    @Transactional
    public Hero create(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public List<Hero> listAll() {
        return heroRepository.findAll();
    }
}
