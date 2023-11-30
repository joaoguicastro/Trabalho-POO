import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.*;
import Interfaces.*;
import Exceções.*;
public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        String path = "Resumo.txt";
        List<LocalDate> doubleData = new ArrayList <>();
        File file = new File(path);

        List<Funcionario> list = new ArrayList<Funcionario>();

        list.add( new Gerente(40, "Leonardo", 100, 60, "Ensino superior completo", 50, 4500));
        list.add( new Caixa(20, "as", 200, 70, "Ensino medio completo", 0, 2000));
        list.add( new Repositor(30, "Guilherme Amaral", 1000, 300, 10, "Ensino medio incompleto", 20));
    }
}
