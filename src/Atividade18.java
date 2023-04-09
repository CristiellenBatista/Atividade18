import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido!");
            return;
        }

        System.out.printf("O peso ideal para uma pessoa de %.2f metros de altura e sexo %s é %.2f kg.%n",
                altura, sexo, pesoIdeal);

        sc.close();
    }
}