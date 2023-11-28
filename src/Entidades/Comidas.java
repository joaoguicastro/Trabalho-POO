package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Comidas extends Produtos{

    public Comidas(LocalDate validade, double preco, String nome, String marca, boolean estragou, double imposto,
            String tipo) {
        super(validade, preco, nome, marca, estragou, imposto);
    }

    public String getValidadeFormatada(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return validade.format(formatter);
    }

    public double calcularValor(){
        return preco+imposto;
    }

    public abstract int calcularValidade();
}
