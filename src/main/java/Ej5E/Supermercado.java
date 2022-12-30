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
        Caja pruebaCaja= new Caja(1);
        Product pan = new Product("pan        ", 2, 0.50, Iva.SUPER_REDUCIDO);
        Product fuet= new Product("fuet       ", 5, 1.5, Iva.NORMAL);
        Product mantequilla = new Product("mantequilla", 1, 1.75, Iva.REDUCIDO);
        pruebaCaja.anadirProducto(fuet);
        pruebaCaja.anadirProducto(pan);
        pruebaCaja.anadirProducto(mantequilla);
        System.out.println(pruebaCaja.generarTicket());
        System.out.println(generarTicket(pruebaCaja));
        
    }
        
    public static Ticket generarTicket(Caja caja){
    return caja.generarTicket();
    }
    
}
