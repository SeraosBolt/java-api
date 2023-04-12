package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunosController {
    @Autowired
    private IAlunosRep alunosRep;
    @GetMapping
    public Iterable<Alunos> getAlunos() {
        return alunosRep.findAll();
    }
}
