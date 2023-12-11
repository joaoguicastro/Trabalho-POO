package Entidades;
import Interfaces.interfaceProdutos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Produtos implements interfaceProdutos{
    protected LocalDate validade;
    protected double preco;
    protected String nome;
    protected String marca;
    protected boolean estragou;
    
    

    public Produtos(LocalDate validade, double preco, String nome, String marca, boolean estragou) {
        this.validade = validade;
        this.preco = preco;
        this.nome = nome;
        this.marca = marca;
        this.estragou = false;
    }


    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            throw new IllegalArgumentException();
        }
        else{
            this.preco = preco;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstragou() {
        return estragou;
    }

    public void setEstragou(boolean estragou) {
        this.estragou = estragou;
    }    
    
    public abstract int calcularValidade();

    public String getValidadeFormatada(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return validade.format(formatter);
    }


    @Override
    public String toString() {
        return "Produtos [validade=" + validade + ", preco=" + preco + ", nome=" + nome + ", marca=" + marca + ", estragou=" + estragou + "]";
    }


    
}
