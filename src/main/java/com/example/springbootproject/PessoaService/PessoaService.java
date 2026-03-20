package com.example.springbootproject.PessoaService;

import com.example.springbootproject.PessoaModels.Pessoa;
import com.example.springbootproject.PessoaRepository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> listPessoa(){
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> buscarPorID(long id){
        return pessoaRepository.findById(id);
    }

    public Pessoa cadastrarPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public void deletarPessoa(long id){
        pessoaRepository.deleteById(id);
    }
}
