import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nContador = input.nextInt();

        for (int i = 1; i <= nContador; i++) {
            System.out.println(i);
        }

        input.close();
    }
}
