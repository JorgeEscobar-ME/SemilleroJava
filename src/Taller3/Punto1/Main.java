package Taller3.Punto1;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            Cliente cliente =new Cliente(-1);
            Precios precio = new Precios();
            precio.tablaPrecios(cliente.getBoletos());
        }catch (Exception e){
            System.out.println("El valor de los boletos debería ser al menos cero");
        }


    }
}
