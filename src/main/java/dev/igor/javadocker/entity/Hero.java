package dev.igor.javadocker.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_hero")
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long name;

    public Hero() {
    }

    public Hero(Long name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getName() {
        return name;
    }
    public void setName(Long name) {
        this.name = name;
    }
}
