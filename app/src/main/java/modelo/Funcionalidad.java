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
        int r1 = color1.getRed();
        int r2 = color2.getRed();

        int g1 = color1.getGreen();
        int g2 = color2.getGreen();

        int b1 = color1.getBlue();
        int b2 = color2.getBlue();

        double d=sqrt((r2-r1)^2+(g2-g1)^2+(b2-b1)^2);
        double p=d/sqrt((255)^2+(255)^2+(255)^2);
        return p;
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
