/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */


public class Venta {
    private String producto;
    private double valor;
    private String fecha;
     
    

    public Venta(String producto, double valor, String fecha) {
        this.producto = producto;
        this.valor = valor;
        this.fecha = fecha;
       
    }

    public String getProducto() { return producto; }
    public double getValor() { return valor; }
    public String getFecha() { return fecha; }

    public void setProducto(String producto) { this.producto = producto; }
    public void setValor(double valor) { this.valor = valor; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    
    
    
}
