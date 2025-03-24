public class App {
    public static void main(String[] args) throws Exception {

        Computador computador = new Computador.Builder()
                .marca("Intel")
                .modelo("Gamer")
                .processador("I7")
                .memoriaRam(32)
                .armazenamento(512)
                .build();

        System.out.println("Computador gamer: ");
        System.out.println("CPU: " + computador.getProcessador());
        System.out.println("RAM: " + computador.getMemoriaRam());
        System.out.println("Armazenamento: " + computador.getArmazenamento());

    }
}