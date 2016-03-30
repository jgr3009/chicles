package chiclee;

public class Chiclee {

    public void ofertaChicles(int envoltorio1, int envoltorio2, int chiclesComprados) {
        int devolucion;
        int devolucion2;
        int acumulacionDevoluciones;
    if(envoltorio2 < envoltorio1){
        devolucion = chiclesComprados / envoltorio1;
        if(devolucion<=envoltorio2){
            devolucion2 = devolucion / envoltorio1;  
            System.out.println(devolucion);
            acumulacionDevoluciones = devolucion2;
        } else {
            
        devolucion2 = devolucion / envoltorio1; 
        acumulacionDevoluciones = devolucion2;
        while(devolucion2 > envoltorio1){
            devolucion2 = devolucion2 / envoltorio1; 
            acumulacionDevoluciones = acumulacionDevoluciones + devolucion2;
        }
            
        System.out.println(devolucion2%envoltorio1);
        }
        
        System.out.println(chiclesComprados+devolucion+acumulacionDevoluciones);
    } else {
        System.out.println("RUINA");
    }
    
}
    public Chiclee(){
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
