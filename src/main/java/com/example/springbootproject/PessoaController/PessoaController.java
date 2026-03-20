package com.example.springbootproject.PessoaController;

import com.example.springbootproject.PessoaModels.Pessoa;
import com.example.springbootproject.PessoaService.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public List<Pessoa> listarPessoas(){
        return pessoaService.listPessoa();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscarPorID(@PathVariable Long id){
        return pessoaService.buscarPorID(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Pessoa cadastrarPessoa(@RequestBody Pessoa pessoa){
        return pessoaService.cadastrarPessoa(pessoa);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPessoa(@PathVariable Long id){
        pessoaService.deletarPessoa(id);
        return ResponseEntity.noContent().build();
    }
}
