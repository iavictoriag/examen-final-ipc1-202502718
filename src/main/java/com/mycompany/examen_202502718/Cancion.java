/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_202502718;

/**
 *
 * @author vicky
 */
public class Cancion extends Multimedia {
    private String cantante;

    public Cancion(String titulo, int duracion, String artista) {
        super(titulo, duracion);
        this.cantante = cantante;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: " + getTitulo() + " - " + cantante + " (" + getDuracion() + "s)");
    }

    public String getArtista() {
        return cantante;
    }

    public void setArtista(String artista) {
        this.cantante = artista;
    }
}