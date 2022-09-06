
public class Convertir {

    int n = 100;

    int base = 5;

    int inverso = 0;

    public int inverso()
    {
        while (n > 0)
        {

            inverso = 10*inverso + n%base;

            n = n/base;
        }

        return inverso;
    }

    public int invertir()
    {
        while (inverso>0)
        {
            n = 10*n + inverso%10;

            inverso = inverso/10;
        }
        return n;
    }

    public class Main
    {

        public static void main(String args[])
        {
            Convertir convertir = new Convertir();

            System.out.println(convertir.inverso());

            System.out.println(convertir.invertir());
        }
    }

}