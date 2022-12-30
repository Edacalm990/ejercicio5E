/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package Ej5E;

/**
 *
 * @author venganzaalchocolate
 */
public record Product(String nombre, int cantidadComprar, double precio, Iva iva) {
    @Override
    public String toString() {
        String tmp = """
                    %s          %.2f         %d          %.0f%%           %.2f                   
                   """.formatted(
                nombre, precio, cantidadComprar, iva.getCantidad()*100, precio * cantidadComprar
        );

        return tmp;
    }


}
