package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas; // 0 ó más

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<>();
    }

    public Zoologico(String nombre) {
        this.nombre = nombre;
        this.zonas = new ArrayList<>();
    }

    public Zoologico() {
        this.zonas = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Zona> getZona() {
        return this.zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public void agregarZonas(Zona zona) {
        this.zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int total = 0;
        for (Zona zona : this.zonas) {
            total += zona.cantidadAnimales();
        }
        return total;
    }
}
