package arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double notasAlunoA[] = new double[3];
        notasAlunoA[0] = 5.5;
        notasAlunoA[1] = 8.9;
        notasAlunoA[2] = 7.2;

        System.out.println(Arrays.toString(notasAlunoA));

        for (int i = 0; i < notasAlunoA.length; i++) {
            System.out.println(notasAlunoA[i]);
        }
    }
}
