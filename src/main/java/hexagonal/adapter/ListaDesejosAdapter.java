package hexagonal.adapter;

import hexagonal.core.ListaDesejos;
import hexagonal.port.ListaDesejosPort;
import mvc.model.ListaDesejosModel;

import java.util.List;
import java.util.Scanner;

public class ListaDesejosAdapter implements ListaDesejosPort {
    private ListaDesejos listaDesejos = new ListaDesejos();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void adicionarDesejo(String desejo) {
        listaDesejos.adicionarDesejo(desejo);
    }

    @Override
    public List<String> getDesejos() {
        return listaDesejos.getListaDesejos();
    }


    public void run() {
        String input = "1";
        while(!"3".equals(input)){
            System.out.println("Informe uma das opções abaixo:");
            System.out.println("1 - para adicionar um item à lista de desejos");
            System.out.println("2 - para listar seus desejos");
            input = scanner.nextLine();

            switch (input){
                case "1":
                    System.out.println("Informe o seu desejo:");
                    String item = scanner.nextLine();
                    adicionarDesejo(item);
                    break;
                case "2":
                    System.out.println(getDesejos());
                    break;
                case "3":
                    System.out.println("Até uma próxima");
                    break;
            }

        }
    }




}