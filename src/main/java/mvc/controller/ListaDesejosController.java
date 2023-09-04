package mvc.controller;

import mvc.model.ListaDesejosModel;
import mvc.view.ListaDesejosView;

public class ListaDesejosController {

    private ListaDesejosModel model;
    private ListaDesejosView view;

    public ListaDesejosController(ListaDesejosModel model, ListaDesejosView view) {
        this.model = model;
        this.view = view;
    }

    public void adicionarDesejo(String item){
        model.adicionarDesejo(item);
    }

    public void atualizaView(){
        view.exibirListaDesejos(model.getListaDesejos());
    }
}
