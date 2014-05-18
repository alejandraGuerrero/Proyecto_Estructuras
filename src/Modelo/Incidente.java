/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;

/**
 *
 * @author Alejandra y  Lina
 */
public class Incidente {
    private int inc_codigoIncidente;
    private String inc_descripcionIncidente;
    private String inc_fechaIncidente;
    private TipoInscidente tipo_incidente;
    private TipoIngresoInsidente tipo_ingreso_incidente;
    private Usuario usuario;
    private Comuna comuna;
    private Barrio barrio; 

    public Incidente() {
    }

    public Incidente(int inc_codigoIncidente, String inc_descripcionIncidente, String inc_fechaIncidente, TipoInscidente tipo_incidente, TipoIngresoInsidente tipo_ingreso_incidente, Usuario usuario, Comuna comuna, Barrio barrio) {
        this.inc_codigoIncidente = inc_codigoIncidente;
        this.inc_descripcionIncidente = inc_descripcionIncidente;
        this.inc_fechaIncidente = inc_fechaIncidente;
        this.tipo_incidente = tipo_incidente;
        this.tipo_ingreso_incidente = tipo_ingreso_incidente;
        this.usuario = usuario;
        this.comuna = comuna;
        this.barrio = barrio;
    }

   
      
    public int getInc_codigoIncidente() {
        return inc_codigoIncidente;
    }

    public void setInc_codigoIncidente(int inc_codigoIncidente) {
        this.inc_codigoIncidente = inc_codigoIncidente;
    }

    public String getInc_descripcionIncidente() {
        return inc_descripcionIncidente;
    }

    public void setInc_descripcionIncidente(String inc_descripcionIncidente) {
        this.inc_descripcionIncidente = inc_descripcionIncidente;
    }

    public String getInc_fechaIncidente() {
        return inc_fechaIncidente;
    }

    public void setInc_fechaIncidente(String inc_fechaIncidente) {
        this.inc_fechaIncidente = inc_fechaIncidente;
    }

    

    public TipoInscidente getTipo_incidente() {
        return tipo_incidente;
    }

    public void setTipo_incidente(TipoInscidente tipo_incidente) {
        this.tipo_incidente = tipo_incidente;
    }

    public TipoIngresoInsidente getTipo_ingreso_incidente() {
        return tipo_ingreso_incidente;
    }

    public void setTipo_ingreso_incidente(TipoIngresoInsidente tipo_ingreso_incidente) {
        this.tipo_ingreso_incidente = tipo_ingreso_incidente;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
 
}
