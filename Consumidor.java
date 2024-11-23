public class Consumidor extends Thread {

    private String name;
    private BaldasRC baldasRC;



    public Consumidor(String name, BaldasRC baldasRC) {
        this.name = name;
        this.baldasRC = baldasRC;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            while (baldasRC.sePuedeComprarPan()) { 
                System.out.printf("Soy el CONSUMIDOR con nombre %s y voy a comprar un pan%n",name);
                baldasRC.comprarPan();
            }
            if(!baldasRC.sePuedeComprarPan()){
                wait();
            }

        } catch (InterruptedException ex) {
        }
        
    }
    
    
}
