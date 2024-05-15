package Inventario;

import Planta.Planta;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<Planta> Plantas = new ArrayList<Planta>();

    public Inventario(){
    }
    public void mostrarListaPlantas(){
        for(Planta planta: Plantas){
            System.out.println("El nombre de la planta es " + planta.getNombre());
            System.out.println("El tipo de la planta es " + planta.getTipo());
        }
    }
    public void mostrarDatosPlanta(Planta planta){
        System.out.println(planta.toString());
    }
    public void mostrarTodosDatosPlantas(){
        for(Planta planta: Plantas){
            System.out.println(planta.toString());
        }
    }

    public void insertarPlanta(Planta planta){
        Plantas.add(planta);
    }
    public void eliminarPlanta(Planta planta){
        Plantas.remove(planta);
    }
    public void vaciarInventario(){
        Plantas.clear();
    }
}
