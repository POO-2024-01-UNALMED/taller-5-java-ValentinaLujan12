package gestion;

import java.util.ArrayList;
import java.util.List;

import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo; // Solo 1
    private List<Animal> animales; // 0 ó más

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
    }

    public Zona(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public Zona() {
        this.animales = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return this.zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public List<Animal> getAnimales() {
        return this.animales;
    }

    public void setAnimales(Animal animal) {
        this.animales.add(animal);
    }

    public void agregarAnimales(Animal animal) {
        this.animales.add(animal);
    }

    public int cantidadAnimales() {
        return this.animales.size();
    }
}
