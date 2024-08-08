package com.projects.cadastropf.controller;

import com.projects.cadastropf.entity.Cadastro;
import com.projects.cadastropf.repository.CadastroRepository;
import com.projects.cadastropf.service.CadastroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
    private CadastroService cadastroService;

    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }
    @PostMapping
    List<Cadastro> create(@RequestBody Cadastro cadastro){
        return cadastroService.create(cadastro);
    }
    @GetMapping
    List<Cadastro> read(){
        return cadastroService.read();
    }
    @PutMapping
    List<Cadastro> update(Cadastro cadastro){
        return cadastroService.update(cadastro);
    }
    @DeleteMapping("{id}")
    List<Cadastro> delete(@PathVariable("id") Long id){
        return cadastroService.delete(id);
    }

}
