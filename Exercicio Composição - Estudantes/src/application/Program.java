package application;

import entities.enums.ApprovalStatus;
import entities.Grades;
import entities.Student;

public class Program {
	
    public static void main(String[] args) {
    	
        Student student1 = new Student("John", 9.5, ApprovalStatus.APPROVED);
        Student student2 = new Student("Paul", 5.0, ApprovalStatus.RECOVERY);
        Student student3 = new Student("Mary", 10.0, ApprovalStatus.APPROVED);

        Grades grades1 = new Grades(student1.getAverage());
        Grades grades2 = new Grades(student2.getAverage());
        Grades grades3 = new Grades(student3.getAverage());

        grades1.addGrade(8.5);
        grades1.addGrade(9.0);
        grades2.addGrade(6.0);
        grades2.addGrade(7.0);
        grades3.addGrade(10.0);
        grades3.addGrade(9.5);

        student1.setAverage(grades1.average());
        student2.setAverage(grades2.average());
        student3.setAverage(grades3.average());

        student1.setStatus(ApprovalStatus.valueOf(student1.getAverage() <= 7 ? "REPROVED" : "APPROVED"));
        student2.setStatus(ApprovalStatus.valueOf(student2.getAverage() <= 7 ? "REPROVED" : "APPROVED"));
        student3.setStatus(ApprovalStatus.valueOf(student3.getAverage() <= 7 ? "REPROVED" : "APPROVED"));

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}