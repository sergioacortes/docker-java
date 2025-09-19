package io.sergiocortes.javadockerapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadyzController {

    @GetMapping("/readyz")
    public String readyz() {
        return "";
    }

}
