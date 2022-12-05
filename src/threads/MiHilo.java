package threads;

import java.util.Scanner;

class MiHilo implements Runnable{
    Thread hilo;

    MiHilo(String nombre){
        hilo= new Thread(this,nombre);

    }
    public static MiHilo Comenzar (String nombre){
        MiHilo miHilo=new MiHilo(nombre);
        miHilo.hilo.start();
        return miHilo;

    }

    public void run(){

        System.out.println(hilo.getName()+" iniciando.");

        Scanner teclado = new Scanner( System.in );

        double factorial;
        int num;

        num=teclado.nextInt();
        factorial=1;
        for (int i=num;i>0;i--)
        {
            factorial=factorial*i;

        }
        System.out.println("El factorial de " + num + " es: " + factorial + " .... El calculo se realizo en el hilo " + hilo.getName());
    }
}