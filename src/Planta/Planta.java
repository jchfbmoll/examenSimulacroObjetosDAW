package Planta;

public abstract class Planta {
    private String nombre;
    private String tipo;
    private int edadMeses;
    private String estado;
    private static int contPlantas = 0;

    public Planta(){
    }
    public Planta(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.edadMeses = 0;
        this.estado = "Viva";
        aumentaContador();
    }

    private static void aumentaContador(){
        contPlantas++;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public int getEdadMeses(){
        return edadMeses;
    }
    public String getEstado(){
        return estado;
    }
    @Override
    public abstract String toString();


    public void cumpleAños(){
        edadMeses++;
    }
}
