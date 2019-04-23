package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class ExercicioList1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("How many employees will be registered: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.printf("Employee #%d ", i + 1);
			System.out.println();
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Funcionario f = new Funcionario(id, name, salary);
			list.add(f);
			
		}
			
			System.out.print("Enter the employee id that will have salary increase: ");
			int idEscolhido = sc.nextInt();
			
				for(Funcionario f : list) 
				if (idEscolhido == f.getId()) {
					System.out.print("Enter the percentage: ");
					double percentage = sc.nextDouble();
					f.IncreaseSalary(percentage);
								
				}
	
				else {
					System.out.println("This id does not exist!");
				}
				System.out.println("List of employees: ");
				
				for(Funcionario f : list) {
				
					System.out.printf("ID: %d , %s , %.2f", f.getId(), f.getName(),f.getSalary());
					System.out.println();

					
		}
	
				sc.close();
				
			}
}




