package ar.urnr.model;

public class MotorComun extends Motor{

    public MotorComun (){
        System.out.println("Creando motor común");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando motor Común");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor Común");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor Común");
    }
}
