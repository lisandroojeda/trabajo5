package ar.unrn.main;

import ar.urnr.model.*;

import java.util.Scanner;

public class Main {
    private static Motor motor;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int eleccion;
        do {
            eleccion= menuOpciones();

            if (eleccion ==1){
                motor = new MotorComun();
                motor.arrancar();
                motor.acelerar();
                motor.apagar();
            }
            if (eleccion ==2){
                motor = new MotorEconomico();
                motor.arrancar();
                motor.acelerar();
                motor.apagar();
            }
            if (eleccion ==3){
                motor = new MotorElectricoAdapter();
                motor.arrancar();
                motor.acelerar();
                motor.apagar();
            }
        }while (eleccion !=4);
    }

    public static int menuOpciones(){
        System.out.println("Que auto desea Testear:\n"
                                   +"1. Auto Común.\n"
                                   +"2. Auto Económico.\n"
                                   +"3. Auto Eléctrico.\n"
                                   +"4. Ninguno\n\n");
        return Integer.parseInt(scan.nextLine());
    }
}
