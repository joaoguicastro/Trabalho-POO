package Entidades;

public class Supermercado {
    private Produto[] consumiveis;
    private Funcionario[] funcionarios;

    public Supermercado(Produto[] consumiveis, Funcionario[] funcionarios) {
        this.consumiveis = consumiveis;
        this.funcionarios = funcionarios;
    }

    public void imprimirInformacaoFuncionarios(){
        System.out.println("Quantidade de funcionarios: Repositores = ");
        for(int i = 0; i < funcionarios.length; i++){
            if(funcionarios[i] instanceof Repositor){
                System.out.println(funcionarios[i]);
            }
        }
        System.out.println("Quantidade de funcionarios: Caixas = ");
        for(int i = 0; i < funcionarios.length; i++){
            if(funcionarios[i] instanceof Caixa){
                System.out.println(funcionarios[i]);
            }
        }
        System.out.println("Quantidade de funcionarios: Gerente = ");
        for(int i = 0; i < funcionarios.length; i++){
            if(funcionarios[i] instanceof Gerente){
                System.out.println(funcionarios[i]);
            }
        }}
        public void imprimirInformacaoProdutos(){
        System.out.println("Quantidade de produtos: Comida = ");
        for(int i = 0; i < consumiveis.length; i++){
            if(consumiveis[i] instanceof Comida){
                System.out.println(consumiveis[i]);
            }
        }
        System.out.println("Quantidade de produtos: Bebida = ");
        for(int i = 0; i < consumiveis.length; i++){
            if(consumiveis[i] instanceof Bebida){
                System.out.println(consumiveis[i]);
            }
        }
    }

    public void exibirCustos(){
        double total = 0;
        double totalMedioIncompleto = 0;
        double totalMedioCompleto = 0;
        double totalSuperiorIncompleto = 0;
        double totalSuperiorCompleto = 0;
        

        for(int i = 0; i < funcionarios.length; i++){
            total += funcionarios[i].calcularSalario();

            if(funcionarios[i].getEscolaridade().equals("ensino medio incompleto")){
                totalMedioIncompleto+=funcionarios[i].calcularSalario();
            }else if(funcionarios[i].getEscolaridade().equals("ensino medio completo")){
                totalMedioCompleto+=funcionarios[i].calcularSalario();
            }else if(funcionarios[i].getEscolaridade().equals("ensino superior incompleto")){
                totalSuperiorIncompleto+=funcionarios[i].calcularSalario();
            }else if(funcionarios[i].getEscolaridade().equals("ensino superior completo")){
                totalSuperiorCompleto+=funcionarios[i].calcularSalario();
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


        for(int i = 0; i < consumiveis.length; i++){
            if(consumiveis[i] instanceof Produto){
                total += consumiveis[i].calcularValor();
            }
        }
        for(int i = 0; i < consumiveis.length; i++){
            if(consumiveis[i] instanceof Comida){
                totalComida+=consumiveis[i].calcularValor();
            }
        }
        for(int i = 0; i < consumiveis.length; i++){
            if(consumiveis[i] instanceof Bebida){
                totalBebida+=consumiveis[i].calcularValor(); 
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