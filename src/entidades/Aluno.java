package entidades;

public class Aluno {

	public String name;
	public double a;
	public double b;
	public double c;
	

	public double notaFinal() {
		return a + b + c;
		
			}

	public double missing() {
		if (notaFinal()>60) {
			return 0.0;
			
		} else
		{
			return 60.0 - notaFinal();
		}
	}
		
}
