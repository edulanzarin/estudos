import java.util.Scanner;

public class ContadorInvertido {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nContador = input.nextInt();

        for (int i = nContador; i >= 0; i--) {
            System.out.println(i);
        }

        input.close();
    }
}
