package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private List<Produto> consumiveis = new ArrayList<Produto>();
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Supermercado(List consumiveis, List funcionarios) {
        this.consumiveis = consumiveis;
        this.funcionarios = funcionarios;
    }
    public Supermercado(){

    }

    public void imprimirInformacaoFuncionarios(){
        System.out.println("Quantidade de funcionarios: Repositores = ");
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof Repositor){
                System.out.println(funcionarios.get(i));
            }
        }
        System.out.println("Quantidade de funcionarios: Caixas = ");
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof Caixa){
                System.out.println(funcionarios.get(i));
            }
        }
        System.out.println("Quantidade de funcionarios: Gerente = ");
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof Gerente){
                System.out.println(funcionarios.get(i));
            }
        }}
        public void imprimirInformacaoProdutos(){
        System.out.println("Quantidade de produtos: Comida = ");
        for(int i = 0; i < consumiveis.size(); i++){
            if(consumiveis.get(i) instanceof Comida){
                System.out.println(consumiveis.get(i));
            }
        }
        System.out.println("Quantidade de produtos: Bebida = ");
        for(int i = 0; i < consumiveis.size(); i++){
            if(consumiveis.get(i) instanceof Bebida){
                System.out.println(consumiveis.get(i));
            }
        }
    }

    public void exibirCustos(){
        double total = 0;
        double totalMedioIncompleto = 0;
        double totalMedioCompleto = 0;
        double totalSuperiorIncompleto = 0;
        double totalSuperiorCompleto = 0;
        

        for(int i = 0; i < funcionarios.size(); i++){
            total += funcionarios.get(i).calcularSalario();

            if(funcionarios.get(i).getEscolaridade().equals("ensino medio incompleto")){
                totalMedioIncompleto+=funcionarios.get(i).calcularSalario();
            }else if(funcionarios.get(i).getEscolaridade().equals("ensino medio completo")){
                totalMedioCompleto+=funcionarios.get(i).calcularSalario();
            }else if(funcionarios.get(i).getEscolaridade().equals("ensino superior incompleto")){
                totalSuperiorIncompleto+=funcionarios.get(i).calcularSalario();
            }else if(funcionarios.get(i).getEscolaridade().equals("ensino superior completo")){
                totalSuperiorCompleto+=funcionarios.get(i).calcularSalario();
            }
        }
        
        System.out.println("Descritivo:");
        System.out.println("Valor Salários: "+total);
        System.out.println("Valor Ensino medio incompleto: "+totalMedioIncompleto);
        System.out.println("Valor Ensino medio completo: "+totalMedioCompleto);
        System.out.println("Valor Ensino superior incompleto: "+totalSuperiorIncompleto);
        System.out.println("Valor Ensino Superior completo: "+totalSuperiorCompleto);
        
    }    

    public void exibirPreco(){
        double total = 0;
        double totalComida = 0;
        double totalBebida = 0;


        for(int i = 0; i < consumiveis.size(); i++){
            if(consumiveis.get(i) instanceof Produto){
                total += consumiveis.get(i).calcularValor();
            }
        }
        for(int i = 0; i < consumiveis.size(); i++){
            if(consumiveis.get(i) instanceof Comida){
                totalComida+=consumiveis.get(i).calcularValor();
            }
        }
        for(int i = 0; i < consumiveis.size(); i++){
            if(consumiveis.get(i) instanceof Bebida){
                totalBebida+=consumiveis.get(i).calcularValor(); 
            }
        }

        System.out.println("Descritivo:");
        System.out.println("Valor Total: "+total);
        System.out.println("Valor Total de Comida: "+totalComida);
        System.out.println("Valor Total de Bebida: "+totalBebida);
    }


}
        // for(int i = 0; i < funcionarios.length; i++){
        //     total += consumiveis[i].calcularValor();
        //     totalComida+=consumiveis[i].calcularValor();
        //     totalBebida+=consumiveis[i].calcularValor();  
        // }