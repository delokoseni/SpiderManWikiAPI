package io.github.delokoseni.spidermanwiki.controller;

import io.github.delokoseni.spidermanwiki.model.Hero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    @GetMapping("/{name}")
    public Hero getHero(@PathVariable String name) {
        return new Hero("Peter Parker1", "Spider from Marvel universe");
    }
}
