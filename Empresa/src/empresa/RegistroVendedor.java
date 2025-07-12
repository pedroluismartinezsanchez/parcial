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
public class RegistroVendedor {
    private ArrayList<Vendedor> vendedores;

    public RegistroVendedor() {
       vendedores = new ArrayList<>();
    }

       
    //LOS METODOS 
    public boolean guardarVenta(Vendedor vendedor){
        this.vendedores.add(vendedor);
        return true;
    }
    
    
    
    public ArrayList<Vendedor> getListaVentas() {
        return vendedores;
    }
}
