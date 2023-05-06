package application;

import java.util.Scanner;
import entities.Rent;

public class Program {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent []vect = new Rent[10];
		System.out.println("How many rooms will be rented: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Rent " +(i+1));
			System.out.printf("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.println("Room");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Rent(name, email);
		}
		System.out.println("Busy rooms: ");
		for(int i=0; i<10;i++) {
			if(vect[i]!= null) {
				System.out.println(i +": "+vect[i]);
			}
		}
		
		sc.close();
		
	}
}
class Jogador {
	private int id;
	private String nome;
	private int altura;
	private int peso;
	private String universidade;
	private int anoNascimento;
	private String cidadeNascimento;
	private String estadoNascimento;

	public Jogador() {

	}
	public Jogador(int id, String nome, int peso, String universidade, int altura, int anoNascimento, String estadoNascimento, String cidadeNascimento) {
		this.id = id;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.universidade = universidade;
		this.anoNascimento = anoNascimento;
		this.cidadeNascimento = cidadeNascimento;
		this.estadoNascimento = estadoNascimento;
	}
	public String toString() {
		return "[" + this.id + " ## " + this.nome + " ## " + this.altura + " ## " + this.peso +
				" ## " + this.anoNascimento + " ## " + this.universidade + " ## " +
				this.cidadeNascimento + " ## " + this.estadoNascimento + "]";
	}
	public Jogador clone() {
		Jogador clone = new Jogador();
		clone.setId(this.id);
		clone.setNome(this.nome);
		clone.setAltura(this.altura);
		clone.setPeso(this.peso);
		clone.setUniversidade(this.universidade);
		clone.setAnoNascimento(this.anoNascimento);
		clone.setCidadeNascimento(this.cidadeNascimento);
		clone.setEstadoNascimento(this.estadoNascimento);
		return clone;
	}
	public void imprimir() {
		System.out.printf("[%d ## %s ## %d ## %d ## %s ## %d ## %s ## %s]\n",
				this.id,this.nome,this.altura,this.peso,this.universidade,this.anoNascimento,this.estadoNascimento);
	}
	public void ler() {
		Scanner sc = new Scanner(System.in);

		System.out.print("ID do jogador: ");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do jogador: ");
		this.nome = sc.nextLine();
		System.out.print("Altura do jogador: ");
		this.altura = sc.nextInt();
		sc.nextLine();
		System.out.print("Peso do jogador: ");
		this.peso = sc.nextInt();
		sc.nextLine();
		System.out.print("Universidade do jogador: ");
		this.universidade = sc.nextLine();
		System.out.print("Ano de nascimento do jogador: ");
		this.anoNascimento = sc.nextInt();
		sc.nextLine();
		System.out.print("Cidade de nascimento do jogador: ");
		this.cidadeNascimento = sc.nextLine();
		sc.close();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getUniversidade() {
		return universidade;
	}
	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getCidadeNascimento() {
		return cidadeNascimento;
	}
	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
	public String getEstadoNascimento() {
		return estadoNascimento;
	}
	public void setEstadoNascimento(String estadoNascimento) {
		this.estadoNascimento = estadoNascimento;
	}

}