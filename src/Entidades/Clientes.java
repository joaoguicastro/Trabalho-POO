package Entidades;

public class Clientes extends Pessoas{
    private boolean cadastro;

    
    public Clientes(int idade, String nome, boolean cadastro) {
        super(idade, nome);
        this.cadastro = cadastro;

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
        return "Clientes [cadastro=" + cadastro + "]";
    }

    
    
}
