package ar.urnr.model;

public class MotorEconomico extends Motor{

    public MotorEconomico(){
        System.out.println("Creando motor Económico");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando motor Económico");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor Económico");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor Económico");
    }
}
