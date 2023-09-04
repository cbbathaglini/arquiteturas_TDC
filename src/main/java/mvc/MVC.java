package mvc;

import mvc.controller.ListaDesejosController;
import mvc.model.ListaDesejosModel;
import mvc.view.ListaDesejosView;

import java.util.Scanner;

public class MVC {

    public static void main(String[] args) {
        ListaDesejosModel listaDesejosModel = new ListaDesejosModel();
        ListaDesejosView listaDesejosView = new ListaDesejosView();
        ListaDesejosController listaDesejosController = new ListaDesejosController(listaDesejosModel,listaDesejosView);


        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Digite '1' para adicionar um item à lista de desejos:");
            String input = scanner.nextLine();

            if ("1".equalsIgnoreCase(input)) {
                System.out.println("Informe o seu desejo:");
                String item = scanner.nextLine();
                listaDesejosController.adicionarDesejo(item);
                listaDesejosController.atualizaView();

            } else {
                System.out.println("Comando inválido.");
                break;
            }
        }
    }


}
