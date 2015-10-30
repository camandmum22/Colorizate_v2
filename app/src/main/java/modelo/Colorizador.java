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

    public Color calcularColorPromedio(Bitmap recorte)
    {
        return null;
    }

    public Bitmap sacarFragmento(Bitmap foto, int x1, int y1, int x2, int y2)
    {

        int width = x2 - x1;
        int height = y2 - y1;
        Bitmap croppedImage = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(croppedImage);

        Rect srcRect = new Rect(0, 0, recorte.getWidth(), recorte.getHeight());
        Rect dstRect = new Rect(0, 0, width, height);

        int dx = (srcRect.width() - dstRect.width()) / 2;
        int dy = (srcRect.height() - dstRect.height()) / 2;

        // If the srcRect is too big, use the center part of it.
        srcRect.inset(Math.max(0, dx), Math.max(0, dy));

        // If the dstRect is too big, use the center part of it.
        dstRect.inset(Math.max(0, -dx), Math.max(0, -dy));

        // Draw the cropped bitmap in the center
        canvas.drawBitmap(recorte, srcRect, dstRect, null);

        recorte.recycle();

        return croppedImage;
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
