package dev.igor.javadocker.controller;

import dev.igor.javadocker.entity.Hero;
import dev.igor.javadocker.service.HeroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface HeroController {
    @PostMapping
    Hero create(@RequestBody Hero hero);

    @GetMapping
    List<Hero> listAll();

    @GetMapping("/name/{name}")
    Hero findByName(@RequestParam String name);
}
