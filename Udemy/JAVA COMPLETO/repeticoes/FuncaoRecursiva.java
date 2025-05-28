public class FuncaoRecursiva {

    public static void main(String[] args) {

        System.out.println(somarNumero(2));
    }

    private static int somarNumero(int n) {
        int n2 = n + 2;
        System.out.println("n2 1 " + n2);

        if (n2 < 100) {
            return n2 + somarNumero(n2);
        }

        System.out.println("n2 2 " + n2);
        return n2;
    }
}
