package Planta;

public class Melocotonero extends Frutal {
    private String variedad;
    private Boolean tienePlaga;
    public Melocotonero(){
    }
    public Melocotonero(String nombre, String tipo, String colorHoja, String variedad, boolean tienePlaga){
        super(nombre, tipo, colorHoja);
        this.variedad = variedad;
        this.tienePlaga = tienePlaga;
    }
    @Override
    public void darFruta(){
       tieneFruto = true;
    }

    @Override
    public String toString(){
        String strMel="Melocotonero{ " + "\nnombre " + getNombre() + "\ntipo: " + getTipo() + "\nestado: " + getEstado() + "\nedad: " + getEdadMeses() +
                "\ncolorHoja: " + getColorHoja() + "\ntieneFruto: "+ tieneFruto + "\nvariedad:" + variedad + "\ntienePlaga: " + tienePlaga+"}";
        return strMel;
    }
}
