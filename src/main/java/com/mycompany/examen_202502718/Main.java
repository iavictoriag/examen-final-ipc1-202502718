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
        Cancion c1 = new Cancion("UNA NOTI", 205, "Omar Courtz");
        Cancion c2 = new Cancion("King ofWatches", 197, "Omar Camacho");
        Cancion c3 = new Cancion("Deja Vu", 203, "Hades66");

        c1.reproducir();
        c2.reproducir();
        c3.reproducir();
        
        Playlist playlist = new Playlist();
        playlist.agregarCancion(c1);
        playlist.agregarCancion(c2);
        playlist.agregarCancion(c3);
        
       System.out.println("1. MOSTRAR PLAYLIST INICIAL");
        playlist.mostrarPlaylist();

        System.out.println("2. SIGUIENTE");
        playlist.siguiente();

        System.out.println("\n3. SIGUIENTE");
        playlist.siguiente();

        System.out.println("\n4. ANTERIOR");
        playlist.anterior();

        System.out.println("\n5. ELIMINAR ACTUAL");
        playlist.eliminarActual();

        System.out.println("\n6. MOSTRAR PLAYLIST FINAL");
        playlist.mostrarPlaylist();
    }
}