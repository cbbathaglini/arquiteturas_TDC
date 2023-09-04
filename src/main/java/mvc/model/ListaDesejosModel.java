package mvc.model;

import java.util.ArrayList;
import java.util.List;

public class ListaDesejosModel {

    private ArrayList<String> listaDesejos;

    public ListaDesejosModel() {
        this.listaDesejos = new ArrayList<>();
    }

    public void adicionarDesejo(String desejo){
        this.listaDesejos.add(desejo);
    }

    public List<String> getListaDesejos(){
        return listaDesejos;
    }
}
