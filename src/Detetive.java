public class Detetive {
    public static boolean podeSerLadrao(int[] notas) {
        int esquerda = 0;
        int direita = notas.length - 1;

        while (esquerda < direita) {
            int soma = notas[esquerda] + notas[direita];

            if (soma == 150) {
                System.out.println("Notas encontradas: " + notas[esquerda] + " e " + notas[direita]);
                return true;
            } else if (soma <= 150) {
                esquerda++;
            } else {
                direita--;
            }
        }
        return false;
    }
}
