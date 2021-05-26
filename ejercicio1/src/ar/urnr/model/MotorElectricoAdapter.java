package ar.urnr.model;

public class MotorElectricoAdapter extends Motor{
    private MotorElectrico motorElectrico;

    @Override
    public void arrancar() {
        System.out.println("Arrancando Motor Eléctrico");
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando Motor Eléctrico");
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando Motor Eléctrico");
        motorElectrico.detener();
        motorElectrico.desconectar();
    }
}
