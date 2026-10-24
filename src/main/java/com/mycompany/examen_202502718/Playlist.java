/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_202502718;

/**
 *
 * @author vicky
 */

public class Playlist {
    private NodoDoble cabeza;//primero
    private NodoDoble cola;//ultimo
    private NodoDoble actual;//la que se esta reproducciendo
    private int tamanio;//total de las canciones

    public Playlist() {
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
        this.tamanio = 0;
    }

    public void agregarCancion(Cancion c) {
        NodoDoble nuevo = new NodoDoble(c);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        tamanio++;
    }

    //imprime la canción en orden
    public void mostrarPlaylist() {
        System.out.println("\n--- Playlist (Total: " + tamanio + ") ---");
        NodoDoble temp = cabeza;
        int i = 1;
        while (temp != null) {
            System.out.println(i + ". " + temp.getDato().getTitulo() + " - " + temp.getDato().getArtista());
            temp = temp.getSiguiente();
            i++;
        }
    }

    public void siguiente() {
        if (actual != null && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
            System.out.println("Reproduciendo: " + actual.getDato().getTitulo());
        } else {
            System.out.println("Ya estás en la última canción de la playlist.");
        }
    }

    public void anterior() {
        if (actual != null && actual.getAnterior() != null) {
            actual = actual.getAnterior();
            System.out.println("Reproduciendo: " + actual.getDato().getTitulo());
        } else {
            System.out.println("Ya estás en la primera canción de la playlist.");
        }
    }

    public void eliminarActual() {
        if (actual == null) {
            System.out.println("No hay ninguna canción seleccionada para eliminar.");
            return;
        }

        System.out.println("Eliminando canción actual: " + actual.getDato().getTitulo());

        if (actual == cabeza && actual == cola) {
            cabeza = null;
            cola = null;
            actual = null;
        } else if (actual == cabeza) {
            cabeza = cabeza.getSiguiente();
            cabeza.setAnterior(null);
            actual = cabeza;
        } else if (actual == cola) {
            cola = cola.getAnterior();
            cola.setSiguiente(null);
            actual = cola;
        } else {
            NodoDoble anteriorNodo = actual.getAnterior();
            NodoDoble siguienteNodo = actual.getSiguiente();
            
            anteriorNodo.setSiguiente(siguienteNodo);
            siguienteNodo.setAnterior(anteriorNodo);
            
            actual = siguienteNodo;
        }

        tamanio--;
    }

    public NodoDoble getCabeza() { return cabeza; }
    public NodoDoble getCola() { return cola; }
    public NodoDoble getActual() { return actual; }
    public int getTamanio() { return tamanio; }
}