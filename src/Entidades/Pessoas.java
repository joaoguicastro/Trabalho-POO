package Entidades;

public class Pessoas {
    protected int idade;
    protected String nome;

    public Pessoas(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoas [idade=" + idade + ", nome=" + nome + "]";
    }

    

    
}
