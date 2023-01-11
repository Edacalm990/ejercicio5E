/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5E;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author venganzaalchocolate
 */
/*
En la clase llamada Supermercado, incluye un método de clase llamado generarTicket que reciba una Caja y devuelva un Ticket según los productos de su cinta.
Incluye en esta clase un método main y realiza las siguientes acciones:
A) Crea una serie de productos con las descripciones, precios y cantidad a comprar que decidas. Deben ser de IVA diferentes.
B) Crea una caja, con el número identificador que tú quieras.
C) Añade a la cinta de la caja creada en B) los productos creados en A)
D) Genera el ticket de la caja creada en B)
E) Imprime en consola el ticket obtenido en D).*/
public class Supermercado {
    
    public static void main(String[] args) {
        // A) Crea una serie de productos con las descripciones, precios y cantidad a comprar que decidas. Deben ser de IVA diferentes.
        Product pan = new Product("pan        ", 2, 0.50, Iva.SUPER_REDUCIDO);
        Product fuet= new Product("fuet       ", 5, 1.5, Iva.NORMAL);
        Product mantequilla = new Product("mantequilla", 1, 1.75, Iva.REDUCIDO);
        Product huevos = new Product("huevos    ", 2, 2.5, Iva.SUPER_REDUCIDO);
        Product pizza = new Product("pizza     ", 3, 3.6, Iva.NORMAL);
        
        // B) Crea una caja, con el número identificador que tú quieras.
        Caja caja= new Caja(1);

        // C) Añade a la cinta de la caja creada en B) los productos creados en A)
        caja.anadirProducto(fuet);
        caja.anadirProducto(pan);
        caja.anadirProducto(mantequilla);
        caja.anadirProducto(huevos);
        caja.anadirProducto(pizza);
        
        // D) Genera el ticket de la caja creada en B)
        Ticket ticket = generarTicket(caja);
        
        // E) Imprime en consola el ticket obtenido en D)
        System.out.println(ticket);
        
    }
        
    public static Ticket generarTicket(Caja caja){
    return caja.generarTicket();
    }
    
}
