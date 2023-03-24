package Taller3.Punto1;

public class Precios {
    public double tablaPrecios(int boletos) throws Exception {
        double precio=30000;
        if(boletos<0){
            throw new Exception("Error del número de boletos");
        }else if (boletos>10){
            precio=precio*0.4;
            System.out.println("El precio del boleto es de " + precio);
        } else if (boletos>5){
            precio=precio*0.7;
            System.out.println("El precio del boleto es de " + precio);
        }
        return precio;
    }
}
