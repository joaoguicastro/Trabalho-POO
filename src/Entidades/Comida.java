package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Comida extends Produto{

    public Comida(LocalDate validade, double preco, String nome, String marca, double imposto,
            String tipo) {
        super(validade, preco, nome, marca, imposto);
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
