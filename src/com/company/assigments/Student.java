package com.company.assigments;

import java.util.*;

public class Student {

    String name;
    int age;
    List<Score> scores;

    public Student(String name, int age, List<Score> scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    public static void main(String[] args) {
        Score result = new Score("sport", 7);
        Score result2 = new Score("math", 9);
        Score result3 = new Score("biology", 7);
        Score result4 = new Score("chemistry", 8);
        Score result5 = new Score("literature", 9);

        List <Score> scoreList = new ArrayList<>();
        scoreList.add(result);
        scoreList.add(result2);
        scoreList.add(result3);
        scoreList.add(result4);
        scoreList.add(result5);

        Student pupil = new Student("Elsa", 20, scoreList);
        System.out.println(pupil.getAverageScore());
    }
    public int getAverageScore() {
        int sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i).getScoreValue();
        }
        return sum / scores.size();
    }
}




