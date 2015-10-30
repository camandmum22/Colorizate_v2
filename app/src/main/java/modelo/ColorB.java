package modelo;

import android.graphics.Color;

/**
 * Created by Andres on 29/10/2015.
 */
public class ColorB
{
    // --------------------------------------------------------------------------------------------
    // Atributos
    // --------------------------------------------------------------------------------------------

    private Color color;

    // --------------------------------------------------------------------------------------------
    // Constructor
    // --------------------------------------------------------------------------------------------
    
    public ColorB(Color color)
    {
        this.color = color;
    }
    // --------------------------------------------------------------------------------------------
    // Metodos
    // --------------------------------------------------------------------------------------------

    public double calcularPorcentajeIgualdad(Color colorSecundario)
    {
        return 0.0;
    }

    public Color darColorAnalogo()
    {
        return null;
    }

    public Color darColorMonocromatico()
    {
        return null;
    }

    public Color darColorTriada()
    {
        return null;
    }

    public Color darColorComplemento()
    {
        return null;
    }

    // --------------------------------------------------------------------------------------------
    // Getters and Setter
    // --------------------------------------------------------------------------------------------

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
