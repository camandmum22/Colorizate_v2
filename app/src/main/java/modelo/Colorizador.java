package modelo;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Andres on 29/10/2015.
 */
public class Colorizador
{
    // --------------------------------------------------------------------------------------------
    // Atributos
    // --------------------------------------------------------------------------------------------

    private ArrayList<Fruta> frutas;
    private Funcionalidad funcion;

    // --------------------------------------------------------------------------------------------
    // Constructor
    // --------------------------------------------------------------------------------------------

    public Colorizador()
    {
        frutas = new ArrayList<Fruta>();
        funcion = new Funcionalidad();
    }

    // --------------------------------------------------------------------------------------------
    // Metodos
    // --------------------------------------------------------------------------------------------

    public int calcularColorPromedio(Bitmap recorte)
    {
        int sizeX = recorte.getWidth();
        int sizeY = recorte.getHeight();
        int colorPromedio = 0;
        for(int x = 0; x < sizeX; x++)
        {
            for(int y = 0; y < sizeY; y++)
            {

                if(colorPromedio == 0)
                {
                    colorPromedio = recorte.getPixel(x,y);
                }

                else
                {
                    int colorActual = recorte.getPixel(x,y);
                    colorPromedio += colorActual;
                    colorPromedio = colorPromedio / 2;
                }
            }
        }

        return colorPromedio;
    }

    public Bitmap sacarFragmento(Bitmap foto, int x1, int y1, int x2, int y2)
    {
        return null;
    }

    public void agregarFruta(String nombre, Color colorFViche, Color colorFMadura, Color colorFDeteriorada)
    {
        Fruta nueva = new Fruta(nombre, colorFViche, colorFMadura, colorFDeteriorada);
        frutas.add(nueva);
    }

    // --------------------------------------------------------------------------------------------
    // Getters and Setter
    // --------------------------------------------------------------------------------------------

    public Funcionalidad getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcionalidad funcion) {
        this.funcion = funcion;
    }

    public ArrayList<Fruta> getFrutas() {
        return frutas;
    }

    public void setFrutas(ArrayList<Fruta> frutas) {
        this.frutas = frutas;
    }
}
