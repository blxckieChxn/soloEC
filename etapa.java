import java.lang.*;

public class etapa {

    private String nombre;
    private Double dificultad;
    private Double longitud;

    public etapa(String nombre, Double dificultad, Double longitud) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.longitud = longitud;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDificultad(Double dificultad) {
        this.dificultad = dificultad;
    }

    public Double getDificultad() {
        return dificultad;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void showEtapa() {
        System.out.println(
                "<etapa:" + getNombre() + "> <dificultad:" + getDificultad() + "> <distancia:" + getLongitud() + ">");
    }
}