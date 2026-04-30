package parking;

public class CentroComercial {
    static final int total_aparcamiento = 20;
    static final int acceso_aparcamiento = 15;

    public static void main(String[] args) {
        int total_conductores = 25;

        for(int i = 1; i <= total_conductores; i++){
            new Conductor(i).start();
        }
    }
}
