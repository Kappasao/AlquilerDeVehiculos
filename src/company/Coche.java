package company;

/**
 * Created by 46995932D on 09/05/2017.
 */
public class Coche extends Transporte {


    private boolean Fumar;
    private String Categoria;

    public Coche(long matricula, long plazas, boolean Fumar, String Categoria)
    {
        super(matricula, plazas);
        this.Fumar=Fumar;
        this.Categoria=Categoria;
    }

    @Override
    public double calcularPrecio(long dias) {

        double precio = super.calcularPrecio(dias);


        if (Fumar == true) {

            precio = precio + 50;

        }

        switch (Categoria){
            case "A":
                precio = precio + 40;
                break;
            case "B":
                precio = precio + 30;
                break;
            case "C":
                precio = precio + 20;
                break;
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula=" + matricula +
                ",plazas=" + plazas +
                ",Se puede fumar?" + Fumar +
                ",Categoria" + Categoria +
                "}";
    }
}
