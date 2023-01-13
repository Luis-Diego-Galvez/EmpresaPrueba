/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.models;

/**
 *
 * @author LuisD
 */

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="empresa")
public class empresa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable=false)
    private int id;
    
    private String nombre;
    private String NIT;
    private Date f_Fundacion;
    private String direccion;
    
    public String getNombre() {return this.nombre;}
    public String getNIT() {return this.NIT;}
    public Date getFechaFundacion() {return this.f_Fundacion;}
    public String getDireccion() {return this.direccion;}
    

    public void setNombre(String Nombre) {this.nombre = Nombre;}
    public void setNIT(String nit) { this.NIT = nit; }
    public void setFechaFundacion(Date fecha) {this.f_Fundacion = fecha;}
    public void setDireccion(String Direccion) {this.direccion = Direccion; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
