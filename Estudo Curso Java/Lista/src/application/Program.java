package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Quantas funcionarios vao ser registrados? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n;i++) {
			System.out.println("Funcionario #" + (i+1));
			System.out.println("ID:");
			Integer id = sc.nextInt();
			System.out.println("Name:");
			String nome = sc.nextLine();
			System.out.println("Salario:");
			double salario = sc.nextDouble();
			
			Funcionario fun = new Funcionario(id,nome,salario);
			
			list.add(fun);
		}
		
		System.out.println("Escreva o Id do funcionario que voce deseja alterar o salario:");
		int idSalario = sc.nextInt();
		Integer pos = hasId(list,idSalario);
		
		if(pos == null) {
			System.out.println("Nao encontrado");
		}else {
			System.out.println("Escreva a porcentagem");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumentoSalario(porcentagem);	
		}
		
		System.out.println("Lista de Empregados:");
		for(Funcionario fun : list) {
			System.out.println(fun);
		}
		
		sc.close();
	}	
	public static Integer hasId(List<Funcionario> list, int id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}return null;
	}

}
