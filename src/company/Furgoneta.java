package company;

/**
 * Created by 46995932D on 09/05/2017.
 */
public class Furgoneta extends Vehiculo{

    private double PMA;

    public Furgoneta(long matricula, long plaza, double PMA){
        super(matricula, plaza);
        this.PMA = PMA;
    }

    @Override
    public double calcularPrecio(long dias) {
        double base = super.calcularPrecio(dias);

        return base + (20 * PMA);
    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                "matricula=" + matricula +
                ",plaza=" + plaza +
                ",PMA=" +PMA+
                "}";
    }

}
