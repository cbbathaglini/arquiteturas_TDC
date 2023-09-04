package hexagonal;

import hexagonal.adapter.ListaDesejosAdapter;

public class Hexagonal {

    public static void main(String[] args) {
        ListaDesejosAdapter adapter = new ListaDesejosAdapter();
        adapter.run();
    }
}
