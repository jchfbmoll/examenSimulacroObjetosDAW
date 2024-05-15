import Planta.*;
import Inventario.Inventario;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Inventario inventario = new Inventario();
       Ficus ficus = new Ficus("Ficus", "Diurno", "Palma", 10);
       Laurel laurel = new Laurel("Laurel", "Aromático", "Verde");
       Melocotonero melocotonero = new Melocotonero("Melocotonero", "Salvaje", "Amarillo", "Salvaje", false);
       Albaricoquero albaricoquero = new Albaricoquero("Albaricoquero", "Frutal","Verde", "Amarillenta", true);

       inventario.insertarPlanta(ficus);
       inventario.insertarPlanta(laurel);
       inventario.insertarPlanta(melocotonero);
       inventario.insertarPlanta(albaricoquero);

       inventario.mostrarListaPlantas();

       inventario.mostrarDatosPlanta(ficus);

       inventario.eliminarPlanta(albaricoquero);

       inventario.mostrarTodosDatosPlantas();

       inventario.vaciarInventario();

       inventario.mostrarTodosDatosPlantas();

    }
}