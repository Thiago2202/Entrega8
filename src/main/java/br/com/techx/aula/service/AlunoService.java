package br.com.techx.aula.service;

import br.com.techx.aula.Model.Aluno;
import br.com.techx.aula.Repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepositorio alunoRepositorio;


    public List<Aluno> findAll() {
        return alunoRepositorio.findAll();
    }
}
