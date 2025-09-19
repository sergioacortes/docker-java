package io.sergiocortes.javadockerapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivezController {

    @GetMapping("/livez")
    public String livez() {
        return "";
    }

}
