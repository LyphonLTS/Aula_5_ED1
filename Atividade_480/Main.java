import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int val = Integer.parseInt(scanner.nextLine());

    int result = reverso(val);
    String message = (result == val) ? "É um número capicua" : "Não é um número capicua";

    System.out.println(val + " - " + result);
    System.out.println(message);

    scanner.close();
  }

  public static int reverso(int val) {
    int soma = 0;
    int reverso = 0;

    while (val != 0) {
      reverso = val % 10;
      soma = (soma * 10) + reverso;
      val = val / 10;
    }

    return soma;
  }
}