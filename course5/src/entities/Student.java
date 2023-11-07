package entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double finalGrade() {
		return note1 + note2 + note3;
	}
	
	public double missingPoints() {
		return 60 - (note1 + note2 + note3); 
	}
	
	public String toString(){
		return "\nStudent: " + name 
				+ "\nNote 1: " + note1 
				+ "\nNote 2: " + note2 + "\nNote 3: " 
				+ note3 
				+ "\nFINAL GRADE: " + finalGrade();
	}
	
}
