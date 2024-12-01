import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.print("Por favor, digite um valor: ");

      int result = dobraVal(Integer.parseInt(scanner.nextLine()));

      System.out.println("O dobro do número digitado é: " + result + "\n");
    }

    scanner.close();
  }

  public static int dobraVal(int val) {
    return val * 2;
  }
}