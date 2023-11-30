package Entidades;

import java.time.LocalDate;

public class Bebida extends Produto{
    private boolean alcoolica;


    public Bebida(LocalDate validade, double preco, String nome, String marca, double imposto,
            boolean alcoolica) {
        super(validade, preco, nome, marca, imposto);
        this.alcoolica = alcoolica;
    }

    public boolean isAlcoolica() {
        if (alcoolica == true) {
            System.out.println("Bebida alcoolica");
            return true;
        } else {
            System.out.println("Bebida não alcoolica");
            return false;
        }
    }
    
    @Override
    public double calcularValor() {
        return preco + imposto;
    }


}
