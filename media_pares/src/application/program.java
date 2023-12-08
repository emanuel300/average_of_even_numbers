package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int cont;
        double soma,media;

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = ler.nextInt();
        double[] vetPar = new double[n];

        for (int i = 0; i < vetPar.length; i++){
            System.out.print("Números: ");
            vetPar[i] = ler.nextInt();
        }

        soma = 0; cont = 0; media = 0;
        for (int i = 0; i < vetPar.length; i++){
            if (vetPar[i] % 2 == 0){
                soma += vetPar[i];
                cont ++;
            }
        }

        if (cont == 0 ){
            System.out.print("NENHUM NUMERO PAR ");
        }
        else {
            media = soma/ (double) cont;
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }





        ler.close();
    }
}
