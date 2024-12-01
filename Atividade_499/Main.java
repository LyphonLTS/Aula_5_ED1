import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] valores = new int[5];
    int op = 0;

    for (int i = 0; i < 5; i++) {
      valores[i] = 0;
    }

    do {
      int flag = 0;

      System.out.println("\t\tMENU VETOR - FUNÇÃO");
      System.out.println("1 - Dados do vetor");
      System.out.println("2 - Ordenar vetor");
      System.out.println("3 - Imprime vetor");
      System.out.println("4 - Sair do programa");
      Scanner scanner = new Scanner(System.in);
      op = Integer.parseInt(scanner.nextLine());
      scanner.close();

      switch (op) {
        case 1:
          valores = entrada(valores, 5);
          flag = 1;
          break;

        case 2:
          if (flag == 1) {
            valores = ordena(valores, 5);
          } else {
            System.out.println("Escolha a opção 1.");
          }
          break;

        case 3:
          if (flag == 1) {
            imprime(valores, 5);
          } else {
            System.out.println("Escolha a opção 1.");
          }
          break;

        case 4:
          System.out.println("Saindo do algoritmo");
          break;

        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (1 <= op && op < 4);
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

  public static void imprime(int[] valores, int tam) {
    for (int i = 0; i < tam; i++) {
      System.out.println((i + 1) + " - " + valores[i]);
    }
  }

  public static int[] ordena(int[] valores, int tam) {
    int aux = 0;

    for (int i = 0; i < tam; i++) {
      for (int j = (i + 1); j < tam; j++) {
        if (valores[i] > valores[j]) {
          aux = valores[i];
          valores[i] = valores[j];
          valores[j] = aux;
        }
      }
    }

    return valores;
  }
}