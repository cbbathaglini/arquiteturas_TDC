package mvc.view;

import java.util.List;

public class ListaDesejosView {

    public void exibirListaDesejos(List<String> desejos){
        desejos.forEach(desejo -> System.out.println(desejo));
    }
}
