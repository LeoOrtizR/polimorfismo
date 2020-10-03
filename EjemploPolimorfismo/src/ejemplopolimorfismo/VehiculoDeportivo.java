package ejemplopolimorfismo;

public class VehiculoDeportivo extends Vehiculo{
   private int cilindrada;
   
   public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada){
       super(matricula, marca, modelo);
       this.cilindrada = cilindrada;
   }
   
   public int getCilindrada(){
       return cilindrada;
   }
   
   public void setCilindrada(int cilindrada){
       this.cilindrada = cilindrada;
   }
   
   @Override
    public void mostrarDatos(){
        System.out.println("Matricula = " + super.getMatricula());
        System.out.println("Marca = " + super.getMarca());
        System.out.println("Modelo = " + super.getModelo());
        System.out.println("Cilindrada = " + this.getCilindrada());
    }
}
