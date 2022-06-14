package dev.igor.javadocker.controller;

import dev.igor.javadocker.entity.Hero;
import dev.igor.javadocker.service.HeroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {
    private final HeroService heroService;

    public HeroController(HeroService heroService) {
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
}
