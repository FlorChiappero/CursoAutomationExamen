package Ejercicio2;

public class Mago extends Personaje {
    private String magia;

    public Mago(int salud, String magia) {
        super(salud);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    @Override
    public void entrenar() {
        //"Los magos no hacen nada al entrenar, son vagos";
    }
}
