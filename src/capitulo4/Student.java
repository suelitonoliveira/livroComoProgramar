package capitulo4;

public class Student {
	private String name;
	private double average;

	public Student(String name, double average) {
		this.name = name;

		// v�lida que a m�dica � > 00.00 e <= 100.0 caso contrario armazena o valor
		// padr�o.
		if (average > 0.0) {
			if (average <= 100.0) {
				this.average = average;
			}
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAverage(double average) {
		if (average > 0.00) {
			if (average <= 100.0) {
				this.average = average;
			}
		}
	}
	public double getAverage() {
		return average;
	}
	//determina e retorna a letra da nota de Student
	public String getLetterGrade() {
		String letterGrade = ""; //inicializado como uma String vazia
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		
		return letterGrade;
			
		
	}

}
