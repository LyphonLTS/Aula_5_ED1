import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número maior que 0");
    int val = Integer.parseInt(scanner.nextLine());

    while (val <= 0) {
      System.out.println("Digite um número maior que 0");
      val = Integer.parseInt(scanner.nextLine());
    }

    String result = verificaPrimo(val) ? "é primo" : "não é primo";

    System.out.println("O número digitado " + result);

    scanner.close();
  }

  public static boolean verificaPrimo(int val) {
    int divisor = 2;

    while (divisor <= (val / 2)) {
      if ((val % divisor) == 0) {
        return false;
      }

      divisor++;
    }

    return true;
  }
}