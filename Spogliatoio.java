public class Spogliatoio {
   
    public Spogliatoio(){}

    public void usaS(String nome){
        try{
            System.out.println("Sir " + nome + " è entrato nello spogliatoio");
            System.out.println(" ");
            Thread.sleep((long)(Math.random() * 1000));
            System.out.println("Sir " + nome + " è uscito dallo spogliatoio");
        }
        catch(Exception e){}
    }
}