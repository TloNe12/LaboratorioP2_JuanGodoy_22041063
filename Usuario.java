/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jcgol
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contra;
    private Date fecha;
    private Date edad;
    private Color favorito;
    private ArrayList<Pokedex> pokemon;

    public Usuario(String nombre, String apellido, String usuario, String contra, Date fecha, Color favorito, ArrayList<Pokedex> pokemon) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contra = contra;
        this.fecha = fecha;
        this.favorito = favorito;
        this.pokemon = pokemon;
    }
    
    

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public Color getFavorito() {
        return favorito;
    }

    public void setFavorito(Color favorito) {
        this.favorito = favorito;
    }

    public ArrayList<Pokedex> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokedex> pokemon) {
        this.pokemon = pokemon;
    }

    

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + 
                ", usuario=" + usuario + ", contra=" + contra 
                + ", fecha=" + fecha + ", edad=" + edad + ", favorito=" 
                + favorito + ", pokemon=" + pokemon + '}';
    }
    
    
    
    
}
