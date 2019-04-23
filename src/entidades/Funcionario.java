package entidades;

public class Funcionario {

	private Integer id;
	private String name;
	private double salary;

	public Funcionario(Integer id, String name, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void IncreaseSalary(double percentage) {
		salary += (salary * 10) / 100;
	}

}