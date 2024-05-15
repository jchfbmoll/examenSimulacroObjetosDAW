package Planta;

public class Laurel extends Planta{

    private String colorCorteza;
    public Laurel(){
    }
    public Laurel(String nombre, String tipo, String colorCorteza){
        super(nombre, tipo);
        this.colorCorteza = colorCorteza;

    }
    public String getColorCorteza() {
        return colorCorteza;
    }

    @Override
    public String toString(){
        String strLaurel="Laurel{" + "\nnombre: " + getNombre() + "\ntipo: " + getTipo() + "\nestado: " + getEstado() + "\nedad " + getEdadMeses() +
                "\ncolorCorteza: " + colorCorteza + "}";
        return strLaurel;
    }

}
