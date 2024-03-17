package zooAnimales;

import java.util.ArrayList;
import java.util.List;
import gestion.Zona;

public class Pez extends Animal {
    private static List<Animal> listado = new ArrayList<>();
    public static int salmones = 0;
    public static int bacalaos = 0;

    private String colorEscamas;
    private Integer cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero,
               String colorEscamas, Integer cantidadAletas, Zona zona) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public Pez(String nombre, int edad, String habitat, String genero,
               String colorEscamas, Integer cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public Pez(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        listado.add(this);
    }

    public Pez() {
        super();
        listado.add(this);
    }

    public static List<Animal> getListado() {
        return Pez.listado;
    }

    public static void setListado(List<Animal> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String color) {
        this.colorEscamas = color;
    }

    public Integer getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(Integer cantidad) {
        this.cantidadAletas = cantidad;
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero, Zona zona) {
        salmones++;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6, zona);
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }

    public Pez crearBacalao(String nombre, int edad, String genero, Zona zona) {
        bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6, zona);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }
}
