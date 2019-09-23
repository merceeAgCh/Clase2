
import java.util.Scanner;
public class Clase2 {
        public static void main(String[] args) {
            Scanner teclado=new Scanner(System.in);
            int n1;
            int n2;
            System.out.print("Introduce un número: ");
            n1=teclado.nextInt();
            System.out.print("Introduce otro número: ");
            n2=teclado.nextInt();
            if(n1==n2)
                System.out.println("Son iguales");
            else
                System.out.println("No son iguales");
            if(n1<n2)
                System.out.println("El n1 es menor que n2");
            else
                System.out.println("El n1 no es menor que n2");

            if(n1>n2)
                System.out.println("El n1 es mayor que n2");
            else
                System.out.println("El n1 no es mayor que n2");
        }
    }

