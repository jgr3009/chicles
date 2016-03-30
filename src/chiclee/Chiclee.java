package chiclee;

public class Chiclee {

    public void ofertaChicles(int envoltorio1, int envoltorio2, int chiclesComprados) {
        int devolucion;
        int devolucion2;
        if (envoltorio2 < envoltorio1) {
            devolucion = chiclesComprados / envoltorio1;
            if (devolucion <= envoltorio2) {
                devolucion2 = devolucion / envoltorio1;
                System.out.println(devolucion);
            } else {
                devolucion2 = devolucion / envoltorio1;
                System.out.println(devolucion / envoltorio1);
            }

            System.out.println(chiclesComprados + devolucion + devolucion2);
        } else {
            System.out.println("RUINA");
        }
    }

    public Chiclee() {
        ofertaChicles(5, 1, 25);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chiclee();
            }
        });
    }

}
