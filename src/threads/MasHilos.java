package threads;

class MasHilos {
    public static void main(String[] args) {

        System.out.println("Iniciando hilos");

        MiHilo miHilo1 = MiHilo.Comenzar("Hilo 1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("Hilo principal interrumpido.");
            }
        MiHilo miHilo2 = MiHilo.Comenzar("Hilo 2");
        try {
            Thread.sleep(10);
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal interrumpido.");
        }
        MiHilo miHilo3 = MiHilo.Comenzar("Hilo 3");
        try {
            Thread.sleep(10);
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Introduce los números: ");
        }

    }

