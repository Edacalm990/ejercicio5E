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

    private List<Product> prueba;

    public Cinta() {
        this.prueba = new ArrayList<>();
    }

    @Override
    public String toString() {
        double[][] cantidad = cantidadIvaProductos();
        String tmp = """
                     """;
        for (Product producto : prueba) {
            tmp += producto.toString() + "\n";
        }
        tmp += """
               ------------------------------------------------------------------------------------------------
               Nº prod. iva 4%%: %.0f       Precio sin IVA: %.2f        Precio con IVA: %.2f
               Nº prod. iva 10%%: %.0f     Precio sin IVA: %.2f        Precio con IVA: %.2f
               Nº prod. iva 21%%: %.0f     Precio sin IVA: %.2f        Precio con IVA: %.2f
               -------------------------------------------------------------------------------------------------
               Total a pagar: %.2f€  --  Gracias por su visita
               -------------------------------------------------------------------------------------------------
               """.formatted(cantidad[0][0], cantidad[1][0], cantidad[2][0],
                       cantidad[0][1], cantidad[1][1], cantidad[2][1],
                       cantidad[0][2], cantidad[1][2], cantidad[2][2],
               cantidad[2][0]+cantidad[2][1]+cantidad[2][2]);
        return tmp;
    }

    public boolean anadirProducto(Product producto) {
        if (producto != null) {
            this.prueba.add(producto);
            return true;
        } else {
            return false;
        }
    }

    public boolean quitarProducto(Producto producto) {
        if (producto != null) {
            this.prueba.remove(producto);
            return true;
        } else {
            return false;
        }
    }

    public boolean estaVacia() {
        return prueba.isEmpty();
    }
    
    private double[][] cantidadIvaProductos() {
        double[][] array = new double[3][3];
        for (int i = 0; i < prueba.size(); i++) {
            switch (prueba.get(i).iva().name()) {
                case "SUPER_REDUCIDO":
                    array[0][0]++;
                    array[1][0]+=prueba.get(i).precio()*prueba.get(i).cantidadComprar();
                    array[2][0]+=(prueba.get(i).precio()+(prueba.get(i).precio()*prueba.get(i).iva().getCantidad()))*prueba.get(i).cantidadComprar();
                    break;
                case "REDUCIDO":
                    array[0][1]++;
                    array[1][1]+=prueba.get(i).precio()*prueba.get(i).cantidadComprar();
                    array[2][1]+=(prueba.get(i).precio()+(prueba.get(i).precio()*prueba.get(i).iva().getCantidad()))*prueba.get(i).cantidadComprar();
                    break;
                case "NORMAL":
                    array[0][2]++;
                    array[1][2]+=prueba.get(i).precio()*prueba.get(i).cantidadComprar();
                    array[2][2]+=(prueba.get(i).precio()+(prueba.get(i).precio()*prueba.get(i).iva().getCantidad()))*prueba.get(i).cantidadComprar();
                    break;
                default:
                    throw new AssertionError();
            }
            
        }
        return array;
    }
    
}
