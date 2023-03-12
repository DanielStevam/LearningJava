import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Digite a primeira nota:");
        Scanner sc1 = new Scanner(System.in);
        float n1 = sc1.nextFloat();
        System.out.println("Digite a segunda nota:");
        Scanner sc2 = new Scanner(System.in);
        float n2 = sc2.nextFloat();
        System.out.println("Digite a terceira nota:");
        Scanner sc3 = new Scanner(System.in);
        float n3 = sc3.nextFloat();
        float notas = (n3 + n2 + n1)/3;
        if(notas >=6){
            System.out.println("Aprovado");
        }else if(notas <6 && notas >=4){
            System.out.println("Exame Especial");
        }else{
            System.out.println("Reprovado");
        }

    }
}