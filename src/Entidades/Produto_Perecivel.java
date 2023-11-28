package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Produto_Perecivel extends Comidas{

    public Produto_Perecivel(LocalDate validade, double preco, String nome, String marca, boolean estragou,
            double imposto, String tipo) {
        super(validade, preco, nome, marca, estragou, imposto, tipo);
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
