/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.ArrayList;

/**
 *
 * @author jcgol
 */
public class Pokedex extends Pokemon{
    private ArrayList<Pokemon> pokemon;

    public Pokedex() {
    }

    public Pokedex(ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public Pokedex(ArrayList<Pokemon> pokemon, String nombre, double dano, double vida, String velocidad) {
        super(nombre, dano, vida, velocidad);
        this.pokemon = pokemon;
    }
    
    
    
    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
    
    
    
}
