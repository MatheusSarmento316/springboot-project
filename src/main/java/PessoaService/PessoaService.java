package PessoaService;

import PessoaModels.Pessoa;
import PessoaRepository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> listPessoa(PessoaRepository pessoaRepository){
        return pessoaRepository.findAll();
    }
}
