import java.util.ArrayList;
import java.util.Comparator;

public class equipo {
    private String nombre;
    private ArrayList<ciclista> ciclistasEquipo; //orden variable en tiempo de ejecucion
    private ArrayList<ciclista> ciclistasAbandono; //por orden de insercion 
    private ArrayList<bicicleta> bicisEquipo; //orden variable en tiempo de ejecucion
    private Comparator bicicletasComparator;
    private Comparator ciclistasComparator;
    private boolean ascDescBici; //true = ascendente - false = descendente
    private boolean ascDescCiclista; //true = ascendente - false = descendente
    


    public equipo(String nombre, Comparator bicicletasComparator, Comparator ciclistasComparator, boolean ascDescBici, boolean ascDescCiclista){
        this.nombre=nombre;
        ciclistasEquipo= new ArrayList<>();
        ciclistasAbandono=new ArrayList<>();
        bicisEquipo=new ArrayList<>();
        this.bicicletasComparator=bicicletasComparator;
        this.ciclistasComparator=ciclistasComparator;
        this.ascDescBici=ascDescBici;
        this.ascDescCiclista=ascDescCiclista;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setAscDescBici(boolean ascDescBici){
        this.ascDescBici=ascDescBici;
    }

    public boolean getAscDescBici(){
        return ascDescBici;
    }

    public void setAscDescCiclista(boolean ascDescCiclista){
        this.ascDescCiclista=ascDescCiclista;
    }

    public boolean getAscDescCiclista(){
        return ascDescCiclista;
    }
}
