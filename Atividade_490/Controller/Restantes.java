package Controller;

public class Restantes {
  private int contador;
  private String[] palavras;

  public Restantes() {
    this.contador = 0;
    this.palavras = new String[10];
  }

  public int getContador() {
    return this.contador;
  }

  public void setContador(int contador) {
    this.contador = contador;
  }

  public String[] getPalavras() {
    return this.palavras;
  }

  public void setPalavras(String palavras, int i) {
    this.palavras[i] = palavras;
  }
}
