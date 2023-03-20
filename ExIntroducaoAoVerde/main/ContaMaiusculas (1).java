import java.util.Scanner;

	public class ContaMaiusculas{
		public static int ContaMaiusculas(String s) {
			int count = 0;
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if(Character.isUpperCase(c)) {
					count++;
				}
			}
			return count;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linha;
		while(!(linha = sc.nextLine()).equals("FIM")) {
			int numMaiusculos = ContaMaiusculas(linha);
			System.out.println(numMaiusculos);
		}
	}
}
