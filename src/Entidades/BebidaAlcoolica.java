package Entidades;

import java.time.LocalDate;

public class BebidaAlcoolica extends Bebida{

    public BebidaAlcoolica(LocalDate validade, double preco, String nome, String marca, double imposto) {
        super(validade, preco, nome, marca, imposto);
    }

}
