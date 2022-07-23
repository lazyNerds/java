public class App1 extends Apps implements SupportApp{

    private int zahl;
    private String name;
    private double preis;
    private float nummer;

    public App1(int zahl, String name, double preis, float nummer){
        this.zahl = zahl;
        this.name = name;
        this.preis = preis;
        this.nummer = nummer;
    }


    public static void main(String[] args) {
        
        App1 tiktok = new App1(2, "Martin", 20, 1);

        System.out.println(tiktok);
        System.out.println(tiktok.name + " "+ anzahlReifen);
        tiktok.land();


        
       
    }


    @Override
    public int anzahlReifen() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public void animalSound() {
        // TODO Auto-generated method stub
        
    }


   
    
}
