package com.example.Cgpatopercentage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
public class Controller {

    @Autowired
    Servicee s;


    @PostMapping("/cgpa")
    public float postMethodName(@RequestBody model m) {

        System.out.println("CGPA = " + m.getCgpa());

        return s.calPercentage(m.getCgpa());

    }
    




    
}
