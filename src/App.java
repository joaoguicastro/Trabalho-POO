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
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        List<Produto> produto = new ArrayList<Produto>();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite seu login: ");
        int login = sc.nextInt();
        if (login == 1){
            System.out.println("Digite sua senha: ");
            int senha = sc.nextInt();
            if(senha == 123){
                System.out.println("1 - Cadastrar funcionario");
                System.out.println("2 - Cadastrar produto");
                System.out.println("3 - Listar funcionarios");
                System.out.println("4 - Listar produtos");
                System.out.println("5 - Exibir vendas");
                System.out.println("6 - Exibir custos");
                System.out.println("7 - Sair");
                int entrada = sc.nextInt();
                if(entrada == 1){

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
                }else if (entrada == 2){

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

                        // produto.add(new Comida(data, preco, nome, marca, imposto, tipoa));

                    }else if(tipo.equals("Bebida")){
                        System.out.println("Digite a validade do produto");

                        String validade = sc.next();

                        LocalDate dataa = LocalDate.parse(validade, formatter);

                        System.out.println("Digite o preco do produto");

                        System.out.println("Digite o teor alcoolico do produto: ");

                        boolean alcoolica = sc.nextBoolean();

                        // produto.add(new Bebida(dataa, preco, nome, tipo, alcoolica));
                        
                    }else{
                        throw new IllegalArgumentException("Tipo incorreto!!");
                    }
                }else if (entrada == 3 ){
                    for(Funcionario f : funcionarios){
                        System.out.println(f);
                    }
                }else if (entrada == 4 ){
                    for(Produto p : produto){
                        System.out.println(p);
                    }
                }else if(entrada == 5 ){

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

}
