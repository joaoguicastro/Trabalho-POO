package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alimento_Perecivel extends Comida{

    public Alimento_Perecivel(LocalDate validade, double preco, String nome, String marca,
            double imposto, String tipo) {
        super(validade, preco, nome, marca, imposto, tipo);
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
