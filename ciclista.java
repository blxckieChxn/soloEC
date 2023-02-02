import java.util.ArrayList;

public class ciclista {

    private String nombre;
    private bicicleta bicicleta;
    private Double habilidad;
    private Double energia;
    private equipo equipo;
    private boolean abandono;
    private int totalEtapas;
    private ArrayList<Double> resultados;

    public ciclista(String nombre, bicicleta bicicleta, Double habilidad, Double energia, equipo equipo,
            boolean abandono, int totalEtapas) {
        this.nombre = nombre;
        this.bicicleta = bicicleta;
        this.habilidad = habilidad;
        this.energia = energia;
        this.equipo = equipo;
        this.abandono = abandono;
        this.totalEtapas = totalEtapas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Double getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Double habilidad) {
        this.habilidad = habilidad;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    public equipo getEquipo() {
        return equipo;
    }

    public void setAbandono(boolean abandono) {
        this.abandono = abandono;
    }

    public boolean getAbandono() {
        return abandono;
    }

    public void setTotalEtapas(int totalEtapas) {
        this.totalEtapas = totalEtapas;
    }

    public int getTotalEtapas() {
        return totalEtapas;
    }

    public boolean checkAbandono() {
        boolean abandona = false;
        if (energia <= 0.0) {
            abandona = true;
            System.out.println("El ciclista: " + getNombre() + "ha abandonado");
        }

        return abandona;
    }

    public void correrEtapa(etapa e) {
        if (abandono != true) {
            resultados.add(bicicleta.tiempoMedio(e));
        }
    }

}