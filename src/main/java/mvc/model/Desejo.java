package mvc.model;

public class Desejo {

    private String desejo;

    public Desejo() {
    }

    public String getDesejo() {
        return desejo;
    }

    public void setDesejo(String desejo) {
        this.desejo = desejo;
    }

    @Override
    public String toString() {
        return "Desejo{" +
                "desejo='" + desejo + '\'' +
                '}';
    }
}
