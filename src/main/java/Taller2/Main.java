package Taller2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        CalculosNumericos calculadora = new CalculosNumericos();
            try {
                calculadora.raiz(500);
                calculadora.raiz(-5);
            }catch (ArithmeticException e){
                System.out.println("Ingresaste un numero negativo");
            }
            try {
                double m= calculadora.pendiente(9,7,9,4);
                System.out.println("La pendiente es " + m);
            }catch (ArithmeticException e){
                System.out.println("La recta es vertical");
            }
            try {
                ArrayList<Double> puntoMedio=calculadora.puntoMedio(2,3,5,4);
                System.out.println("La coordenada en x es " + puntoMedio.get(0));
                System.out.println("La coordenada en y es " + puntoMedio.get(1));
            }catch (ArithmeticException e){
                System.out.println("Error aritmetico desconocido");
            }
        double a=-4;
        double b=-16;
        double c=3;
            try{
                calculadora.raizG2(a,b,c);
            }catch (AException e){
                System.out.println("El valor de a es 0, por lo tanto es una ecuacion lineal");
                double x=-b/c;
                System.out.println("La solucion de la ecuacion es " + x);
            }catch (ArithmeticException e){
                System.out.println("Error, dividiste algo entre cero");
            }
        System.out.println(calculadora.baseB(9877,16));
    }

}
