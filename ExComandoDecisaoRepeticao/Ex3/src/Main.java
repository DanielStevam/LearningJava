import java.util.*;
public class Main{
    public static void main (String [] args){

        int total = 0;
        int VeiculosInfratores = 0;

        int radar[] = new int[5];
        Random random = new Random();

        radar[0] = random.nextInt(100);
        radar[1] = random.nextInt(100);
        radar[2] = random.nextInt(100);
        radar[3] = random.nextInt(100);
        radar[4] = random.nextInt(100);

        for(int i=0; i<5; i++){
            System.out.println("O " + (i+1) + "º carro atravessou o radar a " + radar[i] + "km/h");
            if(radar[i]>60){
                VeiculosInfratores++;
                total = 150 * VeiculosInfratores;
            }
        }
        System.out.println("Houveram " + VeiculosInfratores + " veiculos que atravessaram o radar acima de 60km/h");
        System.out.println("O valor somado das multas é de R$" + total );

    }
}