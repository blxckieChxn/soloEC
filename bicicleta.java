
public class bicicleta {

    private String nombre;
    private Double peso;

    public bicicleta(String nombre, Double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public Double calcularVelocidad(ciclista c, etapa e) {
        Double velocidad = (c.getHabilidad() * 100) / (peso * e.getDificultad());
        return velocidad;
    }

    public Double tiempoMedio(ciclista c, etapa e) {
        Double tiempo = (e.getLongitud() / calcularVelocidad(c, e)) * 60;
        return tiempo;
    }
}