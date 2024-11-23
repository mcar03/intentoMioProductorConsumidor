public class Productor extends Thread {

    private String name;
    private BaldasRC baldasRC;

    public Productor(String name, BaldasRC baldasRC) {
        this.name = name;
        this.baldasRC = baldasRC;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            while (baldasRC.sePuedeRellenarPan()) { 
                System.out.printf("Soy el hilo PRODUCTOR %s y voy a colocar un pan en una balda disponible%n", name); 
                baldasRC.rellenarPan();   
            }
           if(!baldasRC.sePuedeRellenarPan()){
                wait();
           }

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}