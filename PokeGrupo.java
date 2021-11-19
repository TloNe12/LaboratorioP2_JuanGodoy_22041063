/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jcgol
 */
public class PokeGrupo {
    private String nombre;
    private ArrayList<Usuario> lista;
    private Date fecha;
    private Usuario lider;
    private String tipo;

    public PokeGrupo(String nombre, ArrayList<Usuario> lista, Date fecha, Usuario lider, String tipo) {
        this.nombre = nombre;
        this.lista = lista;
        this.fecha = fecha;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
