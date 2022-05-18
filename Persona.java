public class Persona extends Thread implements Comparable<Persona>{
    
    long startR;
    long endR;
    long time;

    Semaforo semaforo;
    Spogliatoio spogliatoglio;
    String nome;

    public Persona(Semaforo semaforo, Spogliatoio spogliatoglio, String nome) {
        this.semaforo = semaforo;
        this.spogliatoglio = spogliatoglio;
        this.nome = nome;
    }

    public void run(){

        semaforo.ent();
        spogliatoglio.usaS(nome);
        semaforo.esc();

        System.out.println("Sir " + nome + " è entrato in pista");
        System.out.println(" ");
        startR = System.nanoTime();

        for(int i =0; i < 15; i++){
            try{
                Thread.sleep((long)(Math.random() * 1000));
            }
            catch(Exception e){}   
        }

        endR = System.nanoTime();
        time = (endR-startR) / 1000000;
        System.out.println("Sir " + nome + " è uscito dalla pista");

        semaforo.ent();
        spogliatoglio.usaS(nome);
        semaforo.esc();
    }

    @Override
    public int compareTo(Persona p) {
        return (int)(this.time - p.time);
    }
}
