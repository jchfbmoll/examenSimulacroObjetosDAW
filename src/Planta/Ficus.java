package Planta;

public class Ficus extends Planta{
    private String origen;
    private int tamanyo;
    public Ficus(){
    }
    public Ficus(String nombre, String tipo, String origen, int tamanyo){
        super(nombre, tipo);
        this.origen = origen;
        this.tamanyo = tamanyo;
    }

    @Override
    public String toString(){
        String strFicus="Ficus{" + "\nnombre: " + getNombre() + "\ntipo: " + getTipo() + "\nestado: " + getEstado() + "\nedad " + getEdadMeses() +
                "\norigen: " + origen+ "\ntamaño: "+ tamanyo + "}";
        return strFicus;
    }

}
