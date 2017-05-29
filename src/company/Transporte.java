package company;

/**
 * Created by 46995932D on 12/05/2017.
 */
public abstract class Transporte extends Vehiculo {

    protected long plazas;

    public Transporte(long matricula,long plazas) {
        super(matricula);
        this.plazas = plazas;
    }

    public double calcularPrecio (long dias){return (1.5 * dias) + (1.5 * plazas);}

}
