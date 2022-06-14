package dev.igor.javadocker.service;

import dev.igor.javadocker.entity.Hero;

public interface HeroService {

    Hero create(Hero hero);
    Hero listAll();
}
