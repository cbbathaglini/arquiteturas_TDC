package hexagonal.core;

import java.util.ArrayList;
import java.util.List;

public class ListaDesejos {

    private ArrayList<String> listaDesejos;

    public ListaDesejos() {
        this.listaDesejos = new ArrayList<>();
    }

    public void adicionarDesejo(String desejo){
        this.listaDesejos.add(desejo);
    }

    public List<String> getListaDesejos(){
        return listaDesejos;
    }
}
