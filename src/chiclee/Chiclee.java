package chiclee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chiclee {

    public void ofertaChicles(int envoltorio1, int envoltorio2, int chiclesComprados) {
        int devolucion;
        int devolucion2;
        int acumulacionDevoluciones;
        if (envoltorio2 < envoltorio1) {
            devolucion = chiclesComprados / envoltorio1;
            if (devolucion <= envoltorio2) {
                devolucion2 = devolucion / envoltorio1;
                System.out.println(devolucion);
                acumulacionDevoluciones = devolucion2;
            } else {

                devolucion2 = devolucion / envoltorio1;
                acumulacionDevoluciones = devolucion2;
                while (devolucion2 > envoltorio1) {
                    devolucion2 = devolucion2 / envoltorio1;
                    acumulacionDevoluciones = acumulacionDevoluciones + devolucion2;
                }

                System.out.println(devolucion2 % envoltorio1);
            }

            System.out.println(chiclesComprados + devolucion + acumulacionDevoluciones);
        } else if (envoltorio1 != 0 && envoltorio2 != 0 && chiclesComprados != 0) {
            System.out.println("RUINA");
        }

    }

    public Chiclee() {
        int envoltorio1 = 1;
        int envoltorio2 = 1;
        int chiclesComprados = 1;

        while (envoltorio1 != 0 && envoltorio2 != 0 && chiclesComprados != 0) {

            System.out.println("Introduzca los números : ");

            try {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();
                String[] numerosComoArray = s.split(" ");
                envoltorio1 = Integer.parseInt(numerosComoArray[0]);
                envoltorio2 = Integer.parseInt(numerosComoArray[1]);
                chiclesComprados = Integer.parseInt(numerosComoArray[2]);
                ofertaChicles(envoltorio1, envoltorio2, chiclesComprados);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chiclee();
            }
        });
    }
}
