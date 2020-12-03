package com.example.recycle_view;

public class Restaurante {
    private String nombre;
    private String urlphotos;
    private float valoracion;
    private String direccion;

    public Restaurante(String nombre, String urlphotos, float valoracion, String direccion) {
        this.nombre = nombre;
        this.urlphotos = urlphotos;
        this.valoracion = valoracion;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlphotos() {
        return urlphotos;
    }

    public void setUrlphotos(String urlphotos) {
        this.urlphotos = urlphotos;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

