import java.lang.Math;

public class EcuacionCuadratica
{
    double a;

    double b;

    double c;

    public void establecerA(double numA)
    {
        a = numA;
    }
    public double obtenerA()
    {
        return a;
    }
    public void establecerB(double numB)
    {
        b = numB;
    }
    public double obtenerB()
    {
        return b;
    }
    public void establecarC(double numC)
    {
        c = numC;
    }
    public double obtenerC()
    {
        return c;
    }

    public double discriminante()
    {
        double discriminante;

        discriminante = Math.pow(obtenerB(), 2) - 4 * obtenerA() * obtenerC();

        return discriminante;

         if (discriminante > 0)
        {
            discriminante((-b)-(4*a*c))/(2*a);
        }
         else
         {
            discriminante((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
         }
         return discriminante;

        {
            EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica();
            ecuacionCuadratica.discriminante();

        }
    }

}