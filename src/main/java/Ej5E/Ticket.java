/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5E;

import java.time.LocalDate;

/**
 *
 * @author eli
 */
public class Ticket {

    private Cinta cinta;
    private LocalDate fecha;

    public Ticket() {
        this.cinta = new Cinta<>();
        this.fecha = LocalDate.now();
    }

    @Override
    public String toString() {
        String tmp="";
        
        return "Ticket{" + "cinta=" + cinta + ", fecha=" + fecha + '}';
    }

    
}
