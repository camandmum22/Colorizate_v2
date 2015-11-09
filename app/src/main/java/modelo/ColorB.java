package modelo;

import java.awt.Color;

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
        int r1 = color.getRed();
        int r2 = colorSecundario.getRed();

        int g1 = color.getGreen();
        int g2 = colorSecundario.getGreen();

        int b1 = color.getBlue();
        int b2 = colorSecundario.getBlue();

        double d=sqrt((r2-r1)^2+(g2-g1)^2+(b2-b1)^2);
        double p=d/sqrt((255)^2+(255)^2+(255)^2);
        return p;

    }

    public Color darColorAnalogo()
    {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        int y = (0.2125 * r) + (0.7154 * g) + (0.0721 * b);
        int pb = b - y;
        int pr = r - y;

        Color colorm = new Color(y, pb, pr);
        return colorm;


    }

    public Color darColorMonocromatico()
    {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        int y = Math.min(Math.abs(r * 2104 + g * 4130 + b * 802 + 4096 + 131072)>> 13; 235);
        int u = Math.min(Math.abs(r * -1214 + g * -2384 + b * 3598 + 4096 + 1048576) >> 13; 240);
        int v = Math.min(Math.abs(r * 3598 + g * -3013 + b * -585 + 4096 + 1048576) >> 13; 240);

        Color colorm = new Color(y, u, v);
        return colorm;

    }

    public Color darColorTriada()
    {
        return null;
    }

    public Color darColorComplemento()
    {
        float[] hsv = new float[3];
        Color.RGBToHSV(Color.red(colorToInvert), Color.green(colorToInvert),
                Color.blue(colorToInvert), hsv);
        hsv[0] = (hsv[0] + 180) % 360;
        // black or white? return opposite
        if (hsv[2] == 0) return color(255);
        else if (hsv[2] == 1.0) return color(0);

        // low value? otherwise, adjust that too
        if (hsv[2] < 0.5) {
            hsv[2] = (hsv[2] + 0.5) % 1.0;
        }
        int rgb = Color.HSBtoRGB(hsv[0], hsv[1], hsv[2]);
        Color colorc = new Color(rgb);
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
