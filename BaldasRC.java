public class BaldasRC {
    
    final private int NUMERO_PANES_MAXIMO = 3;
    private int numeroPanes;


    synchronized public boolean sePuedeRellenarPan(){
        return numeroPanes<=NUMERO_PANES_MAXIMO;
    }

    synchronized public void rellenarPan(){
        numeroPanes++;
        notifyAll();
    }

    synchronized public boolean sePuedeComprarPan(){
        return numeroPanes>0;
    }

    synchronized public void comprarPan(){
        numeroPanes--;
        notifyAll();
    }
}
