/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5E;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eli
 */
public class Cinta<Producto> {

    private List<Producto> lista;

    public Cinta() {
        this.lista = new ArrayList<>();
    }

    @Override
    public String toString() {
        String tmp="";
        for (Producto producto : lista) {
            tmp+=producto.toString()+ "\n";
        }
        return tmp;
    }
    
    public void anadirProducto(Producto producto) {
        this.lista.add(producto);
    }
    
    public void quitarProducto(Producto producto) {
        this.lista.remove(producto);
    }
    
    public boolean estaVacia(){
        return lista.isEmpty();
    }
}
