import java.util.Scanner;

import Controller.Restantes;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] palavras = new String[10];

    System.out.print("Digite um caracter: ");
    String caracter = scanner.next();

    scanner.nextLine();

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite uma palavra: ");
      palavras[i] = scanner.next().toLowerCase();
      scanner.nextLine();
    }

    Restantes result = restantes(palavras, 10, caracter);

    for (int i = 0; i < 10; i++) {
      System.out.println(i + " - " + result.getPalavras()[i]);
    }

    System.out.println("Total de caracteres removidos: " + result.getContador());

    scanner.close();
  }

  public static Restantes restantes(String[] palavras, int tamanho, String caracter) {
    Restantes restantes = new Restantes();

    for (int i = 0; i < tamanho; i++) {
      if (palavras[i].contains(caracter)) {
        String palavra = palavras[i].replace(caracter, "*");
        restantes.setContador(restantes.getContador() + 1);

        restantes.setPalavras(palavra, i);
      } else {
        restantes.setPalavras(palavras[i], i);
      }
    }

    return restantes;
  }
}