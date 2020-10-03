package ejemplopolimorfismo;

public class EjemploPolimorfismo {

   
    public static void main(String[] args) {
        
        Vehiculo vehiculo[] = new Vehiculo[3]; 
        
        vehiculo[0] = new Vehiculo("DQF99D","AKT","2015");
        vehiculo[1] = new VehiculoDeportivo("DQF99D","AKT","2015",4);
        vehiculo[2] = new VehiculoTurismo("DQF99D","AKT","2015",125);
        
        for(Vehiculo v : vehiculo){
            v.mostrarDatos();
            System.out.println("");
        }
    }
    
}
