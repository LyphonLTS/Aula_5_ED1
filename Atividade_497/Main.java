import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] valores = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um número: ");
      valores[i] = Integer.parseInt(scanner.nextLine());
    }

    valores = ordena(valores, 10);

    System.out.println("Qual número deseja buscar? ");
    System.out.print("R: ");
    int chave = Integer.parseInt(scanner.nextLine());

    int result = busca(valores, 10, chave);

    System.out.println();

    for (int i = 0; i < 10; i++) {
      System.out.println((i + 1) + " - " + valores[i]);
    }

    System.out.println((result == 0) ? "Valor não encontrado!" : "Posição do vetor: " + result);

    scanner.close();
  }

  public static int busca(int[] valores, int tam, int chave) {
    for (int i = 0; i < tam; i++) {
      if (valores[i] == chave) {
        return i + 1;
      }
    }

    return 0;
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