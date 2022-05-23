package com.example.examen;

public class MascotaModelo {
    private String nombre;
    private int foto;

    public MascotaModelo() {
    }

    public MascotaModelo(String nombre, int foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
