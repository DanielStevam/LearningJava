import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int maior = 0;
        int menor = 100;
        int i;
        int j;
        int linha1 = 0;
        int coluna1 = 0;
        int linha2 = 0;
        int coluna2 = 0;

        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
            matriz[i][j] = (int)(Math.random()*100);
            System.out.println(matriz[i][j]);
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                if(matriz[i][j]>maior){
                    maior = matriz[i][j];
                     linha1 = i;
                     coluna1 = j;
                }
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                if(matriz[i][j]<menor){
                    menor = matriz[i][j];
                    linha2 = i;
                    coluna2 = j;
                }
            }
        }
        System.out.println("O número maior é:" +maior +" \n"+
                "Sua posição é:" + "["+linha1+"]"+"["+coluna1+"]");
        System.out.println("O número menor é:" +menor +" \n"+
                "Sua posição é:" + "["+linha2+"]"+"["+coluna2+"]");
    }
}
