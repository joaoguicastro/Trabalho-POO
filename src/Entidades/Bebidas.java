package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bebidas extends Produtos{
    private boolean alcoolica;


    public Bebidas(LocalDate validade, double preco, String nome, String marca, boolean estragou, double imposto,
            boolean alcoolica) {
        super(validade, preco, nome, marca, estragou, imposto);
        this.alcoolica = alcoolica;
    }

    @Override
    public int calcularValidade() {
        LocalDate hoje = LocalDate.now();
        if(validade.isBefore(hoje)){
            return 0;
        }
        else{
            return (int) ChronoUnit.DAYS.between(hoje, validade);
        }
    }

    @Override
    public double calcularValor() {
        return preco + imposto;
    }


}
