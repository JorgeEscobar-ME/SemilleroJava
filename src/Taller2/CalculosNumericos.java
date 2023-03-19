package Taller2;

import java.util.ArrayList;

public class CalculosNumericos {
    public CalculosNumericos() {
    }

    public void raiz(double num) {
        if (num < 0) {
            throw new ArithmeticException("No puedes calcular la raiz de numeros negativos");
        } else {
            double resultado = Math.sqrt(num);
            System.out.println("La raiz cuadrada de " + num + " es " + resultado);
        }
    }
    public double pendiente(double x1, double y1, double x2, double y2){
        double m;
        if (x2-x1==0){
            throw new ArithmeticException("No se puede realizar la operacion porque el denominador es cero");
        }else {
            m= (y2-y1)/(x2-x1);
        }
        return m;
    }
    public ArrayList<Double> puntoMedio(double x1, double y1, double x2, double y2){
        ArrayList<Double> coordenadas=new ArrayList<>(0);
        coordenadas.add((x1+x2)/2);
        coordenadas.add((y2+y1)/2);
        return coordenadas;
    }

    public ArrayList<Double> raizG2(double a, double b, double c) throws AException {
        ArrayList<Double> soluciones = new ArrayList<>();
        double discriminante = b*b-4*a*c;
        if (a==0){
            throw new AException("Esta ecuacion no es cuadratica, es lineal");
        }
        if (discriminante<0){
            throw new ArithmeticException("La ecuacion cuadratica no tiene solucion");
        } else if (discriminante==0) {
            double sol1= (-b+Math.sqrt(discriminante))/(2*a);
            System.out.println("La ecuacion tiene una unica solucion: " + sol1);
            soluciones.add(sol1);
            return soluciones;
        }else {
            double sol1= (-b+Math.sqrt(discriminante))/(2*a);
            double sol2= (-b-Math.sqrt(discriminante))/(2*a);
            System.out.println("La ecuacion tiene dos soluciones: " + sol1 + " y " + sol2);
            soluciones.add(sol1);
            soluciones.add(sol2);
            return soluciones;
        }
    }
    public double baseB(int x, int b){
        int paso=x/b;
        int cuentapaso=0;
        int valorFinal=0;
        int resto=x%b;
        ArrayList<Integer> resultado = new ArrayList<>();
        while(paso>0){
            resultado.add(resto);
            cuentapaso++;
            resto=paso%b;
            paso=paso/b;
            if (paso==0){
                break;
            }
        }
        for (int i=0;i<resultado.size();i++){
            int valor=resultado.get(i)*(int)Math.pow(10,i);
            valorFinal=valorFinal+valor;
        }
        int contador=0;
        int xTemp=x;
        while (true){
            if (xTemp/b>0){
                xTemp=xTemp/b;
                contador++;
            }else {
                break;
            }
        }
        valorFinal=valorFinal+((xTemp)%10)*(int)Math.pow(10,contador);
        return valorFinal;
    }
}
