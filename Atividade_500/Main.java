import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] valores1 = new int[5];
    int[] valores2 = new int[5];
    int op = 0;

    for (int i = 0; i < 5; i++) {
      valores1[i] = 0;
      valores2[i] = 0;
    }

    do {
      int flag1 = 0;
      int flag2 = 0;

      System.out.println("\t\tVETORES");
      System.out.println("1 - Dados do vetor A");
      System.out.println("2 - Dados do vetor B");
      System.out.println("3 - Imprime vetores");
      System.out.println("4 - Somar vetores");
      System.out.println("5 - Subtrair vetores");
      System.out.println("6 - Sair do programa");
      Scanner scanner = new Scanner(System.in);
      op = Integer.parseInt(scanner.nextLine());
      scanner.close();

      switch (op) {
        case 1:
          valores1 = entrada(valores1, 5);
          flag1 = 1;
          break;

        case 2:
          valores2 = entrada(valores2, 5);
          flag2 = 1;
          break;

        case 3:
          if (flag1 == 1 && flag2 == 1) {
            imprime(valores1, 5, "A");
            imprime(valores2, 5, "B");
          } else {
            System.out.println("Escolha a opção 1 e 2.");
          }
          break;

        case 4:
          if (flag1 == 1 && flag2 == 1) {
            soma(valores1, valores2, 5);
          } else {
            System.out.println("Escolha a opção 1 e 2.");
          }
          break;

        case 5:
          if (flag1 == 1 && flag2 == 1) {
            subtrair(valores1, valores2, 5);
          } else {
            System.out.println("Escolha a opção 1 e 2.");
          }
          break;

        case 6:
          System.out.println("Saindo do algoritmo");
          break;

        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (1 <= op && op < 6);
  }

  public static int[] entrada(int[] valores, int tam) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Entrada do vetor");

    for (int i = 0; i < tam; i++) {
      System.out.print("Digite um número: ");
      valores[i] = Integer.parseInt(scanner.nextLine());
    }

    scanner.close();

    return valores;
  }

  public static void imprime(int[] valores, int tam, String tipo) {
    for (int i = 0; i < tam; i++) {
      System.out.println("Vetor " + tipo + " : " + (i + 1) + " - " + valores[i]);
    }
  }

  public static void soma(int[] valores1, int[] valores2, int tam) {
    System.out.println("SOMA");

    for (int i = 0; i < tam; i++) {
      System.out.println(valores1[i] + valores2[i]);
    }
  }

  public static void subtrair(int[] valores1, int[] valores2, int tam) {
    System.out.println("DIFERENÇA");

    for (int i = 0; i < tam; i++) {
      System.out.println(valores1[i] - valores2[i]);
    }
  }
}