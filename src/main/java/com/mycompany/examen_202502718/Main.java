/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_202502718;

/**
 *
 * @author vicky
 */
public class Main {
    public static void main(String[] args) {
        Multimedia c1 = new Cancion("UNA NOTI", 205, "Omar Courtz");
        Multimedia c2 = new Cancion("King ofWatches", 197, "Omar Camacho");
        Multimedia c3 = new Cancion("Deja Vu", 203, "Hades66");

        c1.reproducir();
        c2.reproducir();
        c3.reproducir();
    }
}