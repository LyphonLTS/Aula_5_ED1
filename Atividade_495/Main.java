import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] nomes = new String[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite um nome: ");
      nomes[i] = scanner.nextLine().toUpperCase();
    }

    nomes = ordenarNomes(nomes);

    for (int i = 0; i < 5; i++) {
      System.out.println((i + 1) + " - " + nomes[i]);
    }

    scanner.close();
  }

  public static String[] ordenarNomes(String[] nomes) {
    String aux = "";

    for (int i = 0; i < 5; i++) {
      for (int j = (i + 1); j < 5; j++) {
        if (0 < nomes[i].compareTo(nomes[j])) {
          aux = nomes[i];
          nomes[i] = nomes[j];
          nomes[j] = aux;
        }
      }
    }

    return nomes;
  }
}