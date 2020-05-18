package object.chapter12.step02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Lecture lecture = new Lecture("객체지향 프로그래밍",
                70,
                Arrays.asList(81, 95, 75, 50, 45));
        String result = lecture.evaluate();
        //System.out.println("evaluration : " + result);

        Lecture gradeLecture = new GradeLecture("객체지향 프로그래밍",
                70,
                Arrays.asList(
                        new Grade("A", 100, 95),
                        new Grade("B", 94, 80),
                        new Grade("C", 79, 70),
                        new Grade("D", 69, 50),
                        new Grade("F", 49, 0)
                ),
                Arrays.asList(81, 95, 75, 50, 45));
        String gradeResult = gradeLecture.evaluate();
        //System.out.println("gradeResult : " + gradeResult);

        Professor professor = new Professor(
                "다익스트라",
                gradeLecture
        );
        String statistics = professor.compileStatistics();
        System.out.println("statistics : " + statistics);
    }
}
