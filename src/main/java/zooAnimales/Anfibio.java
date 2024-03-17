package zooAnimales;

import java.util.ArrayList;
import java.util.List;
import gestion.Zona;

public class Anfibio extends Animal {
    private static List<Animal> listado = new ArrayList<>();
    public static int ranas = 0;
    public static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso, Zona zona) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        listado.add(this);
    }

    public Anfibio() {
        super();
        listado.add(this);
    }

    public static List<Animal> getListado() {
        return Anfibio.listado;
    }

    public static void setListado(List<Animal> listado) {
        Anfibio.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios() {
        return Anfibio.listado.size();
    }

    public static Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
        ranas++;
        return new Anfibio(nombre, edad,"selva", genero, "rojo", true, zona);
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false, zona);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
}
