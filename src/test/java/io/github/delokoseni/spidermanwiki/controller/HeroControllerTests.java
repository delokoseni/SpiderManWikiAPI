package io.github.delokoseni.spidermanwiki.controller;

import io.github.delokoseni.spidermanwiki.model.Hero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeroControllerTests {

    @Test
    void getHeroNotNull() {
        HeroController controller = new HeroController();
        Hero hero = controller.getHero("PeterParker");
        assertNotNull(hero);
    }

    @Test
    void getHeroEqualNamePeterParker() {
        HeroController controller = new HeroController();
        Hero hero = controller.getHero("Peter Parker");
        assertEquals("Peter Parker", hero.getName());
    }

    @Test
    void getHeroEqualNameMilesMorales() {
        HeroController controller = new HeroController();
        Hero hero = controller.getHero("Miles Morales");
        assertEquals("Miles Morales", hero.getName());
    }

    @Test
    void getHeroEqualDescription() {
        HeroController controller = new HeroController();
        Hero hero = controller.getHero("Peter Parker");
        assertEquals("Spider from Marvel universe", hero.getDescription());
    }
}
