/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.castell.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author SABADO-MANHANA
 */
@Entity
@Table(name = "archivo_pruebas")
public class ArchivoPrueba {
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
     @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "ruta")
    private String ruta;
    @Column(name = "mime")
    private String mime;
    
    @Column(name = "tamanio")
    private Integer tamanio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
    
    
}
