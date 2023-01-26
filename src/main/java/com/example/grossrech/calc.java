package com.example.grossrech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class calc {
    @GetMapping("/calc")
    public double calculation(double feet) {

        return (feet*30.48);
    }


}
