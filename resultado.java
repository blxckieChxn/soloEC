public class resultado {
    private etapa etapaEnCurso; //etapa actual
    private double resultado; //tiempo invertido en cada etapa


    public resultado(){
        etapaEnCurso=null;
        resultado=0.0;
    }

    public resultado(etapa etapaEnCurso, double resultado){
        this.etapaEnCurso=etapaEnCurso;
        this.resultado=resultado;
    }

    public void setEtapa(etapa e){
        etapaEnCurso=e;
    }

    public etapa getEtapa(){
        return etapaEnCurso;
    }

    public void setResultado(double resultado){
        this.resultado=resultado;
    }

    public double getResultado(){
        return resultado;
    }
    
}
