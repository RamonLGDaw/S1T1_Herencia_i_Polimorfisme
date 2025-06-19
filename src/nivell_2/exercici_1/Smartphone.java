package nivell_2.exercici_1;

public class Smartphone extends Telefon implements Rellotge, Camara{

    public Smartphone(String marca, String model){
        super(marca, model);
    }

    @Override
    public void alarma(){
        System.out.println("Està sonant la alarma.");
    }

    @Override
    public void fotografiar(){
        System.out.println("S'està fent una foto.");
    }
}
