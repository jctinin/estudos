public class Computador {

  private String marca;
  private String modelo;
  private String processador;
  private int memoriaRam;
  private int armazenamento;

  private Computador() {
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public String getProcessador() {
    return processador;
  }

  public int getMemoriaRam() {
    return memoriaRam;
  }

  public int getArmazenamento() {
    return armazenamento;
  }

  public static class Builder {
    private Computador computador;

    public Builder() {
      computador = new Computador();
    }

    public Builder marca(String marca) {
      computador.marca = marca;
      return this;
    }

    public Builder modelo(String modelo) {
      computador.modelo = modelo;
      return this;
    }

    public Builder processador(String processador) {
      computador.processador = processador;
      return this;
    }

    public Builder memoriaRam(int memoriaRam) {
      computador.memoriaRam = memoriaRam;
      return this;
    }

    public Builder armazenamento(int armazenamento) {
      computador.armazenamento = armazenamento;
      return this;
    }

    public Computador build() {
      return computador;
    }
  }

}
