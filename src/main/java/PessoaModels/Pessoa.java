package PessoaModels;

import jakarta.persistence.*;

@Entity
@Table(name = "Pessoas")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private int idade;
    private String cpf;

    public Pessoa() {

    }

    public Pessoa(long id, String nome, int idade, String cpf){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
