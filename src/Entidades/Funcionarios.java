package Entidades;

public abstract class Funcionarios extends Pessoas{

    protected double salarioFixo;
    protected int id;
    protected int horaExtra;
    protected String escolaridade;
    protected int quantidadeHorasExtras;

    public Funcionarios(int idade, String nome, double salarioFixo, int id, int horaExtra, String escolaridade, int quantidadeHorasExtras) {
        super(idade, nome);
        this.salarioFixo = 2500;
        this.id = id;
        this.horaExtra = 50;
        this.escolaridade = escolaridade;
        this.quantidadeHorasExtras = quantidadeHorasExtras;
    }

     public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public int getQuantidadeHorasExtras() {
        return quantidadeHorasExtras;
    }

    public void setQuantidadeHorasExtras(int quantidadeHorasExtras) {
        this.quantidadeHorasExtras = quantidadeHorasExtras;
    }
    
    
    public abstract double calcularSalario();

    public abstract double calcularHoraExtra();

    public abstract double calcularEscolartidade();

    @Override
    public String toString() {
        return "Funcionarios [salarioFixo=" + salarioFixo + ", id=" + id + ", horaExtra=" + horaExtra
                + ", escolaridade=" + escolaridade + "]";
    }




   
}
