package br.com.techx.aula.controller;

import br.com.techx.aula.Model.Aluno;
import br.com.techx.aula.Repositorio.AlunoRepositorio;
import br.com.techx.aula.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

//
//    Aluno aluno = new Aluno(1L,"Luis", 19, 2024001);
//
//    @GetMapping("/nome")
//    public String getNome() {
//        return aluno.getNome();
//    }
//
//    @GetMapping("/idade")
//    public int getIdade() {
//        return aluno.getIdade();
//    }
//
//    @GetMapping()
//    public Aluno getAluno() {
//        return aluno;
//    }
//
//
//    @GetMapping("/info")
//    public String getInfo() {
//        return "O RA do aluno " + aluno.getNome() + " é " + aluno.getRa();
//    }
    @Autowired
    private AlunoRepositorio alunoService;

    @GetMapping
    public List<Aluno> getAll() {
        return alunoService.findAll();
    }

}

