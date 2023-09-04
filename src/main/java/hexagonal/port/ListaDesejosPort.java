package hexagonal.port;

import java.util.List;

public interface ListaDesejosPort {
    void adicionarDesejo(String desejo);
    List<String> getDesejos();
}