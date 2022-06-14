package dev.igor.javadocker.service;

import dev.igor.javadocker.entity.Hero;

import java.util.List;

public interface HeroService {

    Hero create(Hero hero);
    List<Hero> listAll();

    Hero findByName(String name);
}
