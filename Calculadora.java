package calculadora;

public class Calculadora {

    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int multi(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int div(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return numero1 / numero2;
    }

    public static int sub(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static void main(String[] args) {
        // Exemplo de expressão: 4 + 9 * 2 / 2 - 5
        int resultadoMultiplicacao = multi(9, 2); // 18
        int resultadoDivisao = div(2, resultadoMultiplicacao);
        int resultadoSoma = soma(4, resultadoDivisao);
        int resultadoFinal = sub(resultadoSoma, 5);

        System.out.println("Resultado: " + resultadoFinal);
    }
}
