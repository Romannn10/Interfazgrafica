/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ventas;
import vendedor.Sucursal;
import vendedor.Vendedor;
/**
 *
 * @author Alumno
 */
public class Clase1InterfazGarfiaca {

    public static void main(String[] args) {
        /*
        Venta v1=new Venta();
        
        v1.setNroVenta(12);
        System.err.println("NroVenta: "+v1.getNroVenta());
        */
        Sucursal suc= new Sucursal();
        suc.setNombre("ALBERDI");
        suc.setNroSuc(1);
        
        Vendedor vende1= new Vendedor("V01", suc, "JUAN", "CASTRO", 33542142);
        System.out.println(vende1.toString()); 
    }
}
