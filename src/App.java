import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.*;
public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        String path = "Resumo.txt";
        List<LocalDate> doubleData = new ArrayList <>();
        File file = new File(path);
        Scanner sc = new Scanner(System.in);

        login();

        
    }

    public static void login(){
        Supermercado supermercado = new Supermercado();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu login: ");
        int login = sc.nextInt();
        if (login == 1){
            System.out.println("Digite sua senha: ");
            int senha = sc.nextInt();
            if(senha == 123){
                int entrada = sc.nextInt();
                if(entrada == 1){
                    cadastrarFuncionario();

                }else if (entrada == 2){
                    cadastrarProduto();
                    
                }else if (entrada == 3 ){
                    listarFuncionarios();
                }else if (entrada == 4 ){
                    
                }else if(entrada == 5 ){
                    supermercado.exibirPreco();
                    
                }else if (entrada == 6 ){
                    
                }else if (entrada == 7 ){
                    System.out.println("Saindo...");
                }
            }else{
                throw new IllegalArgumentException("Senha incorreta!!");
            }
            
        }else{
            throw new IllegalArgumentException("Login incorreto!!");
        }
        
        sc.close();
    }


    private static void listarFuncionarios(){
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        for(Funcionario f : funcionarios){
            System.out.println(f);
        }
    }

    private static void listarProduto(){
        List<Produto> produto = new ArrayList<Produto>();
        for(Produto p : produto){
            System.out.println(p);
        }
    }

    private static void menu(){
        System.out.println("1 - Cadastrar funcionario");
        System.out.println("2 - Cadastrar produto");
        System.out.println("3 - Listar funcionarios");
        System.out.println("4 - Listar produtos");
        System.out.println("5 - Exibir vendas");
        System.out.println("6 - Exibir custos");
        System.out.println("7 - Sair");
    }

    private static void cadastrarFuncionario(){
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        System.out.println("Digite a idade do funcionario: ");
        int idade = sc.nextInt();
        System.out.println("Digite o nome do funcionario: ");
        String nome = sc.next();
        System.out.println("Digite o id do funcionario: ");
        int id = sc.nextInt();
        System.out.println("Digite o salario fixo do funcionario: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Digite a quantidade de horas extras do funcionario: ");
        int quantidadeHorasExtras = sc.nextInt();
        System.out.println("Digite a escolaridade do funcionario: ");
        String escolaridade = sc.next();
        System.out.println("Digite o valor ganho de cada hora extra do funcionario: ");
        String castro = sc.nextLine();
        int horaExtra = sc.nextInt();
        System.out.println("Digite o cargo do funcionario: ");
        String cargo = sc.next();
        if(cargo.equals("Gerente")){
            funcionarios.add( new Gerente(idade, nome, id, horaExtra, escolaridade, quantidadeHorasExtras, salarioFixo));
        }else if(cargo.equals("Caixa")){
            funcionarios.add( new Caixa(idade, nome, id, horaExtra, escolaridade, quantidadeHorasExtras, salarioFixo));
        }else if(cargo.equals("Repositor")){
            funcionarios.add( new Repositor(idade, nome, salarioFixo, id, horaExtra, escolaridade, quantidadeHorasExtras));
        }else{
            throw new IllegalArgumentException("Cargo incorreto!!");
        }
    }
    private static void cadastrarProduto(){
        List<Produto> produto = new ArrayList<Produto>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");

        String nome = sc.next();

        System.out.println("Digite o preço do produto: ");

        double preco = sc.nextDouble();

        System.out.println("Digite a data de validade do produto: ");

        String dataValidade = sc.next();

        LocalDate data = LocalDate.parse(dataValidade, formatter);

        System.out.println("Digite o tipo do produto: ");

        String tipo = sc.next();

        if(tipo.equals("Comida")){
            System.out.println("Digite o tipo do produto (duravel ou perecivel): ");
            
            String tipoa = sc.next();

            System.out.println("Digite o imposto do produto: ");

            double imposto = sc.nextDouble();

            System.out.println("Digite a marca do produto: ");

            String marca = sc.next();
            if(tipoa.equals("duravel")){
                produto.add(new Alimento_Duravel(data, preco, nome, marca, imposto, tipoa));
            }else{
                produto.add(new Alimento_Perecivel(data, preco, nome, marca, imposto, tipoa));
            }

            

        }else if(tipo.equals("Bebida")){
            System.out.println("Digite a validade do produto");

            String validade = sc.next();

            LocalDate dataa = LocalDate.parse(validade, formatter);

            System.out.println("Digite o preco do produto");

            System.out.println("Digite o teor alcoolico do produto: ");

            boolean alcoolica = sc.nextBoolean();

            produto.add(new Bebida(dataa, preco, nome, tipo, alcoolica));
            
        }else{
            throw new IllegalArgumentException("Tipo incorreto!!");
        }
    }

    private static void exibirVendas(){
        private Produto[] consumiveis;
        double total = 0;
        double totalComida = 0;
        double totalBebida = 0;


        for(int i = 0; i < consumiveis.length; i++){
            if(consumiveis[i] instanceof Produto){
                total += consumiveis[i].calcularValor();
            }
        }
        for(int j = 0; j < consumiveis.length; j++){
            if(consumiveis[j] instanceof Comida){
                totalComida+=consumiveis[j].calcularValor();
            }
        }
        for(int k = 0; k < consumiveis.length; k++){
            if(consumiveis[k] instanceof Bebida){
                totalBebida+=consumiveis[k].calcularValor(); 
            }
        }

        System.out.println("Descritivo:");
        System.out.println("Valor Total: "+total);
        System.out.println("Valor Total de Comida: "+totalComida);
        System.out.println("Valor Total de Bebida: "+totalBebida);
    }

    private static void exibirCustos(){
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        double total = 0;
        double totalMedioIncompleto = 0;
        double totalMedioCompleto = 0;
        double totalSuperiorIncompleto = 0;
        double totalSuperiorCompleto = 0;
        
        for(Funcionario funcionario : funcionarios){
            total += funcionario.calcularSalario();

            if(funcionario.getEscolaridade().equals("ensino medio incompleto")){
                totalMedioIncompleto += funcionario.calcularSalario();
            }else if(funcionario.getEscolaridade().equals("ensino medio completo")){
                totalMedioCompleto += funcionario.calcularSalario();
            }else if(funcionario.getEscolaridade().equals("ensino superior incompleto")){
                totalSuperiorIncompleto += funcionario.calcularSalario();
            }else if(funcionario.getEscolaridade().equals("ensino superior completo")){
                totalSuperiorCompleto += funcionario.calcularSalario();
            }
        }
        System.out.println("Total de custos: " + total);
        System.out.println("Total de custos: Ensino medio incompleto = " + totalMedioIncompleto);
        System.out.println("Total de custos: Ensino medio completo = " + totalMedioCompleto);
        System.out.println("Total de custos: Ensino superior incompleto = " + totalSuperiorIncompleto);
        System.out.println("Total de custos: Ensino superior completo = " + totalSuperiorCompleto);
    } 
}
