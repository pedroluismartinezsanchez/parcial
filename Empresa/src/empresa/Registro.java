/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class Registro {
    private ArrayList<Venta> ventas;

    public Registro() {
       ventas = new ArrayList<>();
    }

       
    //LOS METODOS 
    public boolean guardarVenta(Venta mascota){
        this.ventas.add(mascota);
        return true;
    }
    
    public Venta buscarVenta(String producto){
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getProducto().equalsIgnoreCase(producto)) {
                return ventas.get(i);
            }
        }
        return null;
    }
      
    public boolean eliminarVenta(String producto) {
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getProducto().equalsIgnoreCase(producto)) {
                ventas.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean actualizarVenta(String Producto, Venta nuevaVenta) {
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getProducto().equalsIgnoreCase(Producto)) {
                ventas.set(i, nuevaVenta);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Venta> getListaVentas() {
        return ventas;
    }
}
