/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendedor;

import persona.Persona;

/**
 *
 * @author Alumno
 */
public class Vendedor extends Persona{
    
    private String legajo;
    private Sucursal sucursal;

    public Vendedor(String legajo, Sucursal sucursal, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
        this.sucursal = sucursal;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.getNombre()+ " Apellido: "+this.getApellido()+ " Dni: "
                + this.getDni()+ " Legajo: "+this.getLegajo()+ " Sucursal: "+this.getSucursal().getNroSuc();
    }
    
    
    
}
