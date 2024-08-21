/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;

import vendedor.*;
//import vendedor.Vendedor;

/**
 *
 * @author Alumno
 */
public class Venta {
    
    private int nroVenta;
    protected float totalVemta;
    public String vendedor;
    private VendedorPrueba vend;
    private Sucursal suc;
    
    
    public Venta(){
        super();
    }

    protected int getNroVenta() {
        return nroVenta;
    }

    public void setNroVenta(int nroVenta) {
        this.nroVenta = nroVenta;
    }

    public float getTotalVemta() {
        return totalVemta;
    }

    public void setTotalVemta(float totalVemta) {
        this.totalVemta = totalVemta;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
     
}
