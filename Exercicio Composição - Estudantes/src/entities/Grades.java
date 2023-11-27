package entities;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private Double averageGrade;

    private List<Double> list = new ArrayList<>();

    public Grades(Double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void addGrade(double grade) {
        if(grade >= 0.0 && grade <= 100.0) {
            list.add(grade);
        } else {
            throw new IllegalArgumentException("Grade must be between 0.0 and 100.0");
        }
    }
    
    public double average(){
        double sum = 0.0;
        for(int i=0;i<list.size();i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }
}