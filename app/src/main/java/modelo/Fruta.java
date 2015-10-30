package modelo;

import android.graphics.Color;

/**
 * Created by Andres on 29/10/2015.
 */
public class Fruta
{
    // --------------------------------------------------------------------------------------------
    // Atributos
    // --------------------------------------------------------------------------------------------
    private String nombre;
    private Color colorFViche;
    private Color colorFMadura;
    private Color colorFDeteriorada;

    // --------------------------------------------------------------------------------------------
    // Constructor
    // --------------------------------------------------------------------------------------------

    public Fruta(String nombre, Color colorFViche, Color colorFMadura, Color colorFDeteriorada)
    {
        this.nombre = nombre;
        this.colorFViche = colorFViche;
        this.colorFMadura = colorFMadura;
        this.colorFDeteriorada = colorFDeteriorada;
    }

    // --------------------------------------------------------------------------------------------
    // Metodos
    // --------------------------------------------------------------------------------------------



    // --------------------------------------------------------------------------------------------
    // Getters and Setter
    // --------------------------------------------------------------------------------------------


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColorFViche() {
        return colorFViche;
    }

    public void setColorFViche(Color colorFViche) {
        this.colorFViche = colorFViche;
    }

    public Color getColorFMadura() {
        return colorFMadura;
    }

    public void setColorFMadura(Color colorFMadura) {
        this.colorFMadura = colorFMadura;
    }

    public Color getColorFDeteriorada() {
        return colorFDeteriorada;
    }

    public void setColorFDeteriorada(Color colorFDeteriorada) {
        this.colorFDeteriorada = colorFDeteriorada;
    }
}
