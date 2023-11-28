package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Produto_Duravel extends Produtos{

    public Produto_Duravel(LocalDate validade, double preco, String nome, String marca, boolean estragou) {
        super(validade, preco, nome, marca, estragou);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int calcularValidade() {
        LocalDate hoje = LocalDate.now();
        if (validade.isBefore(hoje)) {
            return 0; 
        } else {
            return (int) ChronoUnit.DAYS.between(hoje, validade);
        }
    }
    
}
