package Planta;

public class Albaricoquero extends Frutal {
    private String colorCopa;
    private boolean tieneInjerto;
    public Albaricoquero(){
    }
    public Albaricoquero(String nombre, String tipo, String colorHoja, String colorCopa, boolean tieneInjerto){
        super(nombre, tipo, colorHoja);
        this.colorCopa = colorCopa;
        this.tieneInjerto = tieneInjerto;
    }
    @Override
    public void darFruta(){
        tieneFruto = true;
    }

    @Override
    public String toString(){
        String strAlb="Melocotonero{" + "\nnombre: " + getNombre() + "\ntipo: " + getTipo() + "\nestado: " + getEstado() + "\nedad " + getEdadMeses() +
                "\ncolorHoja: " + getColorHoja() + "\ntieneFruto: "+ tieneFruto + "\ncolorCopa:" + colorCopa + "\ntieneInjerto: " + tieneInjerto + "}";
        return strAlb;
    }
}
