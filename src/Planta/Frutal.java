package Planta;

public abstract class Frutal extends Planta{
    private String colorHoja;
    protected boolean tieneFruto;
    public Frutal(){
    }
    public Frutal(String nombre, String tipo, String colorHoja){
        super(nombre, tipo);
        this.colorHoja = colorHoja;
    }

    public abstract void darFruta();
    public String getColorHoja() {
        return colorHoja;
    }
}
