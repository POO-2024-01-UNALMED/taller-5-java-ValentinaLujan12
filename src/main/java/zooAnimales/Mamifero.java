package zooAnimales;

import java.util.ArrayList;
import java.util.List;
import gestion.Zona;

public class Mamifero extends Animal {
    private static List<Animal> listado = new ArrayList<>();
    public static int caballos = 0;
    public static int leones = 0;
    private Boolean pelaje;
    private Integer patas;

    public Mamifero(String nombre, int edad, String habitat, String genero,
                    Boolean pelaje, Integer patas, Zona zona) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero,
                    Boolean pelaje, Integer patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero) {
        super(nombre, edad, habitat, genero);
        listado.add(this);
    }

    public Mamifero() {
        super();
        listado.add(this);
    }

    public static List<Animal> getListado() {
        return Mamifero.listado;
    }

    public static void setListado(List<Animal> listado) {
        Mamifero.listado = listado;
    }

    public Boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(Boolean pelaje) {
        this.pelaje = pelaje;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public static int cantidadMamiferos() {
        return Mamifero.listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4, zona);
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4, zona);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
} 

