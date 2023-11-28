package Entidades;

import java.time.LocalDate;

public class Bebidas extends Produtos{
    private boolean alcoolica;


    public Bebidas(LocalDate validade, double preco, String nome, String marca, boolean estragou, double imposto,
            boolean alcoolica) {
        super(validade, preco, nome, marca, estragou, imposto);
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
