package com.example.springbootproject.PessoaRepository;

import com.example.springbootproject.PessoaModels.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
