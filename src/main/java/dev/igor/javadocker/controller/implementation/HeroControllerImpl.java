package dev.igor.javadocker.controller.implementation;

import dev.igor.javadocker.controller.HeroController;
import dev.igor.javadocker.entity.Hero;
import dev.igor.javadocker.service.HeroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroControllerImpl implements HeroController {

    private final HeroService heroService;

    public HeroControllerImpl(HeroService heroService) {
        this.heroService = heroService;
    }

    @PostMapping
    public Hero create(@RequestBody Hero hero) {
        return heroService.create(hero);
    }

    @GetMapping
    public List<Hero> listAll() {
        return heroService.listAll();
    }

    @Override
    public Hero findByName(@RequestParam String name) {
        return heroService.findByName(name);
    }
}
