package zooAnimales;

import java.util.ArrayList;
import java.util.List;
import gestion.Zona;;

public class Reptil extends Animal {
    private static List<Animal> listado = new ArrayList<>();
    public static int iguanas = 0;
    public static int serpientes = 0;
    private String colorEscamas;
    private Integer largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero,
                  String colorEscamas, Integer largoCola, Zona zona) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero,
                  String colorEscamas, Integer largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        listado.add(this);
    }

    public Reptil() {
        super();
        listado.add(this);
    }

    public static List<Animal> getListado() {
        return Reptil.listado;
    }

    public static void setListado(List<Animal> listado) {
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String color) {
        this.colorEscamas = color;
    }

    public Integer getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(Integer largo) {
        this.largoCola = largo;
    }

    public static int cantidadReptiles() {
        return Reptil.listado.size();
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero, Zona zona) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3, zona);
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }

    public Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1, zona);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }
}
