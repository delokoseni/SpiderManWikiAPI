package io.github.delokoseni.spidermanwiki.model;

import lombok.Getter;

@Getter
public class Hero {
    private final String name;
    private final String description;

    public Hero(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
