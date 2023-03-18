public class Inmueble {
    int id;
    int area;
    String direccion;

    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
    }

    public void impuesto(){
        int impuesto;
        String clase=getClass().getSimpleName();
        if (clase=="CasaRural" || clase=="Apartaestudio"){
            impuesto=area*1500000;
        } else if (clase=="CasaUrbanaConjuntoCerrado") {
            impuesto=area*2500000;
        } else if (clase=="CasaUrbanaInd" || clase=="LocalComercial") {
            impuesto=area*3000000;
        } else if (clase=="ApartamentoFamiliar") {
            impuesto=area*2000000;
        } else if (clase=="Oficina") {
            impuesto=area*3500000;
        }else {
            System.out.println("No se pudo calcular su impuesto");
        }
    }
}