package company;

/**
 * Created by 46995932D on 09/05/2017.
 */
public class Camion extends Vehiculo{

    private double PMA;

    public Camion(long matricula, long plaza, double PMA) {
        super(matricula, plaza);
        this.PMA = PMA;
    }

    @Override
    public double calcularPrecio(long dias) {
        double base = super.calcularPrecio(dias);

        return base + (20 * PMA) + 40;
    }

    public String toString() {
        return "Camion{" +
                "matricula=" + matricula +
                ",plaza=" + plaza +
                ",PMA=" +PMA+
                "}";
    }
}
