package Entidades;

public class Gerente extends Funcionarios{
    
    public Gerente(int idade, String nome, double salarioFixo, int id, int horaExtra, String escolaridade, int quantidadeHorasExtras) {
        super(idade, nome, salarioFixo, id, horaExtra, escolaridade,quantidadeHorasExtras );
    }
    
    @Override
    public double calcularEscolaridade() {
        try{if (escolaridade == "ensino medio incompleto"){
            return 100;
        }
        if (escolaridade == "ensino medio completo"){
            return 200;
        }
        if (escolaridade == "ensino superior incompleto"){
            return 300;
        }
        if (escolaridade == "ensino superior completo"){
            return 400;
        }
        else{
            return 0;
            }
        }
        catch(RuntimeException e){
            System.out.println(e);
            e.printStackTrace();
        }

        }
    

    @Override
    public double calcularHoraExtra() {
        double totalHoraExtra = quantidadeHorasExtras * horaExtra;
        return totalHoraExtra;
    }
    
    @Override
    public double calcularSalario() {
        return salarioFixo + calcularHoraExtra() + calcularEscolaridade();
    }

    @Override
    public String toString() {
        return "Gerente [Id: " + getId() + ", Nome: " + getNome() + ", Salário Fixo: " + getSalarioFixo() + "]";
    }


}
