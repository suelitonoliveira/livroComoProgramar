package algworksworksfor.vetores;

import java.util.Scanner;

public class ExercicioVetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		System.out.println("Informe 5 tarefas: ");
		tarefas[0] = sc.nextLine();
		tarefas[1]= sc.nextLine();
		tarefas[2] = sc.nextLine();
		tarefas[3] = sc.nextLine();
		tarefas[4] = sc.nextLine();
		System.out.println("As tarefas escolhidas foram : ");
		for (String tarefasEscolhidas : tarefas) {
			System.out.println(tarefasEscolhidas + " ");
		}
		
		
		
		sc.close();

	}

}
