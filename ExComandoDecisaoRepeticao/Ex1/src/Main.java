import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o valor do seu salario para que a calculadora façao reajuste: ");
        Scanner sc1 = new Scanner(System.in);
        int salario = sc1.nextInt();

        if(salario >= 1200 ){
            int reajuste = salario + (salario/20);
            System.out.println("O reajuste de salario é " +reajuste);
        }else{
            int reajuste = salario + (salario/10);
            System.out.println("O reajuste de salario é "+reajuste);
        }
    }
}