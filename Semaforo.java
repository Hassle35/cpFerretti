public class Semaforo {
    int valore;
    public Semaforo(int val){
        this.valore = val;
    }
    synchronized public void ent(){
        while(valore == 0){
            try{
                wait();
            }
            catch(Exception e){

            }
        }
        valore--;
    }

    synchronized public void esc(){
        valore++;
        notify();
    }
}
