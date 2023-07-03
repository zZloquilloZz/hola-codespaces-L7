package com.example.holacodespacesL7;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")

public class Controller{
    @GetMapping(path="/")
    public String home(){
        return "LN73257397 - Ademir Fernandez Hernandez";
    }
}