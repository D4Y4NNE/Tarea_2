
public class Temperatura
{
    public static void main(String[] args)
    {

        double gradosC = 55;
        double gradosF;
        double gradosK;
        double gradosR;

        System.out.println("Introduce grados Celsius:");
        gradosF = ((9/5)*gradosC+32);
        System.out.println(gradosC + " ºC = " + gradosF + " ºF");

        System.out.println("Introduce grados Celsius:");
        gradosK = gradosC+273;
        System.out.println(gradosC + " ºC = " + gradosK + " ºK");

        System.out.println("Introduce grados Celsius:");
        gradosR = (9/5)*gradosC+492;
        System.out.println(gradosC + " ºC = " + gradosR + " ºR");


    }
}   //F= (9/5)*C+32;
    //K=C+273;
    //R=(9/5)*C+492;

