/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author Laboratorios
 */
@Entity
public class Jugador implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String pseudonimo;
    private String Sexo;
    private String fechaNacimiento;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="direccion id",referencedColumnName = "id")
    private Direccion direccion;

    @ManyToMany(mappedBy = "jugadores")
    private Set<Videojuego> videojuegos;
    
    public Jugador() {
    }

    public Jugador(Long id, String pseudonimo, String Sexo, String fechaNacimiento, Direccion direccion, Set<Videojuego> videojuegos) {
        this.id = id;
        this.pseudonimo = pseudonimo;
        this.Sexo = Sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.videojuegos = videojuegos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Set<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(Set<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    
}
