package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Ave extends Animal {
    private static List<Animal> listado = new ArrayList<>();
    public static int halcones = 0;
    public static int aguilas = 0;
    private String colorPlumas;
    
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas, Zona zona) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        listado.add(this);
    }

    public Ave() {
        super();
        listado.add(this);
    }

    public static List<Animal> getListado() {
        return Ave.listado;
    }

    public static void setListado(List<Animal> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String color) {
        colorPlumas = color;
    }

    public static int cantidadAves() {
        return Ave.listado.size();
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
        halcones++;
        return new Ave(nombre, edad, "montanas", genero, "café glorioso", zona);
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montanas", genero, "café glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo", zona);
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }
}
