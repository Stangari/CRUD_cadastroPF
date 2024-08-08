package com.projects.cadastropf.service;

import com.projects.cadastropf.entity.Cadastro;
import com.projects.cadastropf.repository.CadastroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {

    private CadastroRepository cadastroRepository;

    public CadastroService(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;

    }

    public List<Cadastro> create(Cadastro cadastro){
        cadastroRepository.save(cadastro);
        return read();
    }
    public List<Cadastro> read(){
        return cadastroRepository.findAll();
    }
    public List<Cadastro> update(Cadastro cadastro){
        cadastroRepository.save(cadastro);
        return read();

    }
    public List<Cadastro> delete(Long id){
        cadastroRepository.deleteById(id);
        return read();

    }
}
