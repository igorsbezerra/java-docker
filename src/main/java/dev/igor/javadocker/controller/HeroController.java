package dev.igor.javadocker.controller;

import dev.igor.javadocker.entity.Hero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface HeroController {
    @PostMapping
    Hero create(@RequestBody Hero hero);

    @GetMapping
    List<Hero> listAll();

    @GetMapping("/name/{name}")
    Hero findByName(@PathVariable("name") String name);
}
