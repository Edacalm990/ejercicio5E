/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5E;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author eli
 */
public class Ticket {

    private Cinta cinta;
    private LocalDateTime fecha;

    public Ticket() {
        this.cinta = new Cinta<>();
        this.fecha = LocalDateTime.now();
    }

    @Override
    public String toString() {
        String tmp="""
                   -------------------------------------------------------------------------------------------------
                                               Supermercados El
                   
                   Fecha: %s         Hora: %s    
                   -------------------------------------------------------------------------------------------------
                   Producto             Precio     Cantidad      IVA      Precio sin IVA
                   -------------------------------------------------------------------------------------------------
                  %s
                   
                   """.formatted(
                           fecha.toLocalDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)), 
                           fecha.toLocalTime().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), 
                           cinta);
        
        return tmp;
    }


    public Cinta getCinta() {
        return cinta;
    }

    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }
}
