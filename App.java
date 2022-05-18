public class App {
    public static void main(String[] args) throws Exception {
        
        Semaforo sema = new Semaforo(2);
        Spogliatoio spo = new Spogliatoio();
        Classifica clas = new Classifica();

        Persona p1 = new Persona(sema, spo, "Alessandro");
        Persona p2 = new Persona(sema, spo,"Mirko");
        Persona p3 = new Persona(sema, spo, "Gabriele");
        Persona p4 = new Persona(sema, spo, "Matteo");
        Persona p5 = new Persona(sema, spo, "Davide");
        Persona p6 = new Persona(sema, spo, "Mattia");
        Persona p7 = new Persona(sema, spo, "Daniel");
        Persona p8 = new Persona(sema, spo, "Rigers");
        
        System.out.println("START");
        System.out.println(" ");

       
         p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        clas.Aggiungi(p1);
        clas.Aggiungi(p2);
        clas.Aggiungi(p3);
        clas.Aggiungi(p4);
        clas.Aggiungi(p5);
        clas.Aggiungi(p6);
        clas.Aggiungi(p7);
        clas.Aggiungi(p8);
        clas.ordi();
        
        System.out.println(" ");
        System.out.println("Classifica");
        System.out.println(" ");

        for(int n = 0; n < clas.classifica.size(); n++){
            System.out.println(clas.classifica.get(n).nome + " " + clas.classifica.get(n).time);
        }
        
        System.out.println(" ");
        System.out.println("EXIT");
    }
}
