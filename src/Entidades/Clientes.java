package Entidades;

public class Clientes extends Pessoas{
    protected double gasto;
    protected boolean cadastro;

    
    public Clientes(int idade, String nome, double gastos, boolean cadastro) {
        super(idade, nome);
        this.gasto = gasto;
        this.cadastro = cadastro;

    }


    public double getGasto() {
        return gasto;
    }


    public void setGasto(double gasto) {
        this.gasto = gasto;
    }


    public boolean isCadastro() {
        return cadastro;
    }


    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }

    public int conferirCadastro(int cadastroCliente) {
        if (cadastro) {
            return cadastroCliente;
        } else {
            return 0; 
        }
    }


    @Override
    public String toString() {
        return "Clientes [gasto=" + gasto + ", cadastro=" + cadastro + "]";
    }

    
    
}
