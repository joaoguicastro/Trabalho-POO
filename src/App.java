import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.*;
import Exceções.NumeroNaoExistente;
public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        String pathDados = "Files/dados.txt";
        File fileDados = new File(pathDados);
        Scanner sc = null;
        ArrayList<Object> dados = new ArrayList<>();
        try{
            sc = new Scanner(fileDados);
            while(sc.hasNext()){

                String marca = sc.next();
                double preco = sc.nextDouble();
                String dataValidade = sc.next();
                LocalDate data = LocalDate.parse(dataValidade, fmt);
                double imposto = sc.nextDouble();

                dados.add(marca);
                dados.add(preco);
                dados.add(data);
                dados.add(imposto);

            }
        }catch(FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        }
        for (Object elemento : dados) {
            System.out.println(elemento);
        }
        
        menuPrincipal();
        
    }

    private static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha a opção de login:");
            System.out.println("1 - Login Gerente");
            System.out.println("2 - Login Caixa");
            System.out.println("3 - Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    loginGerente();
                    break;
                case 2:
                    loginCaixa();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

    } 

    public static void loginGerente() {
        Supermercado supermercado = new Supermercado();
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;
    
        while (!loggedIn) {
            System.out.println("Digite seu login: ");
            int login = sc.nextInt();
            if (login == 1) {
                System.out.println("Digite sua senha: ");
                int senha = sc.nextInt();
                if (senha == 123) {
                    loggedIn = true;
                    boolean sair = false;
                    while (!sair) {
                        menuGerente();
                        int entrada = sc.nextInt();
                        switch (entrada) {
                            case 1:
                                supermercado.cadastrarFuncionario();
                                break;
                            case 2:
                                supermercado.cadastrarProduto();
                                break;
                            case 3:
                                supermercado.CadastrarCliente();
                                break;
                            case 4:
                                supermercado.imprimirInformacaoFuncionarios();
                                break;
                            case 5:
                                supermercado.imprimirInformacaoProdutos();
                                break;
                            case 6:
                                supermercado.ListarClientes();
                                break;
                            case 7:
                                supermercado.exibirPreco();
                                break;
                            case 8:
                                supermercado.exibirCustos();
                                break;
                            case 9:
                                try {
                                    supermercado.escreverDados();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 10:
                                System.out.println("Saindo...");
                                sair = true;
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                } else {
                    throw new IllegalStateException("Senha inválida.");
                }
            } else {
                throw new IllegalStateException("Login inválido.");
            }
        }

    }

    public static void loginCaixa() {
        Supermercado supermercado = new Supermercado();
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;
    
    try {
        while (!loggedIn) {
            System.out.println("Digite seu login: ");
            int login = sc.nextInt();
            if (login == 2) {
                System.out.println("Digite sua senha: ");
                int senha = sc.nextInt();
                if (senha == 123) {
                    loggedIn = true;
                    boolean sair = false;
    
                    while (!sair) {
                        menuCaixa();
                        int entrada = sc.nextInt();
                        switch (entrada) {
                            case 1:
                               supermercado.cadastrarProduto();
                                break;
                            case 2:
                                supermercado.CadastrarCliente();
                                break;
                            case 3:
                                supermercado.ListarClientes();
                                break;   
                            case 4:
                                supermercado.imprimirInformacaoProdutos();
                                break;
                            case 5:
                                System.out.println("Saindo...");
                                sair = true;
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                } else {
                    throw new IllegalStateException("Senha inválida.");
                }
            } else {
                throw new IllegalStateException("Login inválido.");
            }
        }
        }catch (NumeroNaoExistente e) {
        System.out.println("Numero não existente");
    }
    }
    

    private static void menuGerente(){
        System.out.println("1 - Cadastrar funcionario");
        System.out.println("2 - Cadastrar produto");
        System.out.println("3 - Cadastrar cliente");
        System.out.println("4 - Listar funcionarios");
        System.out.println("5 - Listar produtos");
        System.out.println("6 - Listar clientes");
        System.out.println("7 - Exibir vendas");
        System.out.println("8 - Exibir custos");
        System.out.println("9 - Imprimir os dados");
        System.out.println("10 - Sair");
    }

    private static void menuCaixa(){
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Cadastrar cliente");
        System.out.println("3 - Listar clientes");
        System.out.println("4 - Listar produtos");
        System.out.println("5 - Sair");
    }

    public static void escreverDados() throws IOException {
        File arquivo = new File( "Files\\dadosFinais.txt" );
        Supermercado supermercado = new Supermercado();
        if(!arquivo.exists()) {
           arquivo.createNewFile();
        }
        FileWriter fw = new FileWriter( arquivo );
        BufferedWriter bw = new BufferedWriter(fw );
        bw.write("Exibir custo total: " + supermercado.exibirCustos() + "\n" + "Exibir ventas totais: " + supermercado.exibirPreco());
        bw.close();
        fw.close();
    }
    public void lerConta () throws IOException {
        File arquivo = new File("C:\\Users\\alvaro.bezerra\\Desktop\\conta.txt\\");
        if(!arquivo.exists()) {
           arquivo.createNewFile();
        }
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()) {
           String linha = br.readLine();
           System.out.println(linha);
        }
        br.close();
        fr.close();
    }
}
