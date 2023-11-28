package Entidades;

public class Clientes extends Pessoas{
    private double gasto;
    private boolean cadastro;

    
    public Clientes(int idade, String nome, double gasto, boolean cadastro) {
        super(idade, nome);
        this.gasto = gasto;
        this.cadastro = cadastro;

    }


    public double getGasto() {
        return gasto;
    }


    public void setGasto(double gasto) {
        if(gasto<0){
            throw new IllegalArgumentException();
        }
        else{
            this.gasto = gasto;
        }
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
