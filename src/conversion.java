import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float km;

        System.out.println("\n Ingresa la cantidad de kilometros: ");
        km=teclado.nextFloat();

        System.out.println("\n Metros: "+ (km * 1000) );
    }
}
