package company;

/**
 * Created by 46995932D on 09/05/2017.
 */
public abstract class Vehiculo {

    protected long matricula;


    public Vehiculo(long matricula) {
        this.matricula = matricula;

    }

    public double calcularPrecio(long dias){
        return 50*dias;
    }
}
