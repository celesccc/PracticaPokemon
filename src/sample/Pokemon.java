package sample;

import javafx.scene.image.Image;

public class Pokemon {
    String nombre;
    String nivel;
    int vidaTotal;
    int vidaRestante;
    Image imagenPokemon;
    Image imagenPelea;

    public Pokemon(String nombre, String nivel, int vidaTotal, int vidaRestante, Image imagenPokemon, Image imagenPelea) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vidaTotal = vidaTotal;
        this.vidaRestante = vidaRestante;
        this.imagenPokemon = imagenPokemon;
        this.imagenPelea = imagenPelea;
    }
}
