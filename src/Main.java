//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] carteiraSuspeito = {10, 20, 40, 80, 95, 110, 130};
        boolean resultado = Detetive.podeSerLadrao(carteiraSuspeito);
        System.out.println("O suspeito pode ser o ladrão? " + resultado);
    }
}