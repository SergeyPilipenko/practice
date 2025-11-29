import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Serg", 2, 5, 5);
        Student student2 = new Student("Petr");
        System.out.println("Студент1-> " + student1);
        System.out.println("Студент2-> " + student2);

        student1.addGrade(4);
        student2.addGrade(5);

        int[] grades1 = student1.getGrades();
        int[] grades2 = student2.getGrades();
        System.out.println("Оценки1-> " + Arrays.toString(grades1));
        System.out.println("Оценки2-> " + Arrays.toString(grades2));

    }
}
