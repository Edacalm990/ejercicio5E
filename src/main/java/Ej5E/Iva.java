/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Ej5E;

/**
 *
 * @author eli
 */
public enum Iva {
    SUPER_REDUCIDO (0.4),
    REDUCIDO(0.10),
    NORMAL(0.21);
    
    private double cantidad;

    private Iva(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Iva{" + "cantidad=" + cantidad + '}';
    }
        
    
}
