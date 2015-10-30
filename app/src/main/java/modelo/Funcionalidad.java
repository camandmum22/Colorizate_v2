package modelo;


import android.graphics.Color;

import java.lang.reflect.Constructor;

/**
 * Created by Andres on 29/10/2015.
 */
public class Funcionalidad
{

    // --------------------------------------------------------------------------------------------
    // Atributos
    // --------------------------------------------------------------------------------------------

    private ColorB colorBase;

    // --------------------------------------------------------------------------------------------
    // Constructor
    // --------------------------------------------------------------------------------------------

    public Funcionalidad()
    {

    }

    // --------------------------------------------------------------------------------------------
    // Metodos
    // --------------------------------------------------------------------------------------------

    public double calcularPorcentajeIgualdad(Color color1, Color color2)
    {
        return 0.0;
    }

    public double calcularPorcentajeAnalogo(Color color1, Color color2)
    {
        return 0.0;
    }

    public double calcularPorcentajeMonocromatico(Color color1, Color color2)
    {
        return 0.0;
    }

    public double calcularPorcentajeTriada(Color color1, Color color2)
    {
        return 0.0;
    }

    public double calcularPorcentajeComplemento(Color color1, Color color2)
    {
        return 0.0;
    }

    public double calcularPorcentajeMadurez(Fruta fruta, Color color2)
    {
        return 0.0;
    }

    // --------------------------------------------------------------------------------------------
    // Getters and Setter
    // --------------------------------------------------------------------------------------------

    public ColorB getColorBase() {
        return colorBase;
    }

    public void setColorBase(ColorB colorBase) {
        this.colorBase = colorBase;
    }
}
