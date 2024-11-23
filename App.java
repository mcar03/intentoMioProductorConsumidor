
import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        
        List<String> listaNombresProductores = new ArrayList<>();
        listaNombresProductores.add("Jose p1");
        listaNombresProductores.add("Maria p2");
        listaNombresProductores.add("Manuel p3");
        listaNombresProductores.add("Antonia p4");

        List<String> listaNombresConsumidores = new ArrayList<>();
        listaNombresConsumidores.add("Martin c1");
        listaNombresConsumidores.add("Chema c2");
        listaNombresConsumidores.add("Paco c3");
        listaNombresConsumidores.add("Molina c4");




        BaldasRC baldasRC = new BaldasRC();


        for (int i = 0; i < listaNombresProductores.size(); i++) {
            Productor productor = new Productor(listaNombresProductores.get(i),baldasRC);
            productor.start();
            //ME FALTA JOIN()
        }

        for (int i = 0; i < listaNombresConsumidores.size(); i++) {
            Consumidor consumidor = new Consumidor(listaNombresConsumidores.get(i),baldasRC);
            consumidor.start();
            //ME FALTA JOIN()
        }

    }
}
