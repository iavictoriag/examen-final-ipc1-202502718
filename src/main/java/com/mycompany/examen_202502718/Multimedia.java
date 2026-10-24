/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_202502718;

/**
 *
 * @author vicky
 */

public abstract class Multimedia {
    private String titulo;
    private int tiempo; //segundos

    public Multimedia(String titulo, int duracion) {
        this.titulo = titulo;
        this.tiempo = duracion;
    }

    public abstract void reproducir();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return tiempo;
    }

    public void setDuracion(int duracion) {
        this.tiempo = duracion;
    }
}
