package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Animal {
    private static int totalAnimales = 0;
    private static List<Animal> listado = new ArrayList<>();
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona; // 0 ó 1

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona; // 0 ó 1
        totalAnimales++;
        listado.add(this);
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
        listado.add(this);
    }

    public Animal() {
        totalAnimales++;
        listado.add(this);
    }

    public static List<Animal> getListado() {
        return listado;
    }
        public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.getListado().size() + "\n" +
               "Aves: " + Ave.getListado().size() + "\n" +
               "Reptiles: " + Reptil.getListado().size() + "\n" +
               "Peces: " + Pez.getListado().size() + "\n" +
               "Anfibios: " + Anfibio.getListado().size();
    }

    public String toString() {
        if (this.zona != null) {
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre() + ", en el " + this.zona.getZoo().getNombre();
        } else {
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero;
        }
    }
}
