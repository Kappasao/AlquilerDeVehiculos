package company;

/**
 * Created by 46995932D on 09/05/2017.
 */
public class Microbus extends Transporte {

    public Microbus(long matricula, long plazas) {
        super(matricula, plazas);
    }

    @Override
    public double calcularPrecio(long dias) {
        double precio = super.calcularPrecio(dias);

        precio = precio + (2 * plazas);
    }

    @Override
    public String toString() {
        return "Microbus{" +
                "matricula=" + matricula +
                ",plaza=" + plazas +
                "}";
    }
}
