package ejemplopolimorfismo;

public class VehiculoTurismo extends Vehiculo{
    private int numeroPuertas;
    
    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas){
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    
    public void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Matricula = " + super.getMatricula());
        System.out.println("Marca = " + super.getMarca());
        System.out.println("Modelo = " + super.getModelo());
        System.out.println("Numero de Puertas = " + this.getNumeroPuertas());
    }
}
