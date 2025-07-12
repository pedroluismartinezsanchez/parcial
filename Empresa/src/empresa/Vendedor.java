/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;



import java.util.ArrayList;


public class Vendedor {
    private String nombre;
    private String zona;
    private ArrayList<Venta> ventas;

    public Vendedor(String nombre, String zona) {
        this.nombre = nombre;
        this.zona = zona;
        this.ventas = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getZona() {
        return zona;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    

    // Calcular total de ventas
    public double calcularTotalVentas() {
        double total = 0;
        for (Venta venta : ventas) {
            total += venta.getValor();
        }
        return total;
    }

    // Calcular comisión (10%)
    public double calcularComision() {
        return calcularTotalVentas() * 0.10;
    }

    // Mostrar ventas (puede usarse en consola)
    public void mostrarVentas() {
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println("[" + i + "] " + ventas.get(i));
        }
    }

    @Override
    public String toString() {
        return "Vendedor: " + nombre + ", Zona: " + zona;
    }
}
