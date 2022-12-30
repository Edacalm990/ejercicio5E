/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5E;


import java.util.Objects;

/**
 *
 * @author eli
 */
public class Caja {

    private Ticket ticket;
    private int idCaja;
    private Cinta cinta;

    public Caja(int id) {
        this.idCaja = id;
        this.ticket = new Ticket();
        this.cinta = new Cinta();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idCaja);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caja other = (Caja) obj;
        return this.idCaja == other.idCaja;
    }

    public Ticket generarTicket() {
        ticket.setCinta(this.cinta);
        return this.ticket;
    }

    public boolean anadirProducto(Product producto) {
        if (producto != null) {
            this.cinta.anadirProducto(producto);
            return true;
        } else {
            return false;
        }
    }

}
