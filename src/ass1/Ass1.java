/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass1;

/**
 *
 * @author Ma7moud
 */
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Ass1 {

    public static void main(String[] args) throws IOException {

        Student[] students = {
            new ItStudent(12018, "Mahmoud", "SD", 100, 100, 100),
            new ItStudent(458, "Reem", "CS", 100, 100, 100),
            new ItStudent(748, "Mohammed", "CS", 70, 65, 68),
            new ArtStudent(147, "Sleman", "", 0.16, 6, 5),
            new ArtStudent(963, "Emad", "", 20, 10, 5),
            new ArtStudent(258, "SHEREEN", "", 25, 15, 5)};

        for (int m = 0; m < students.length; m++) {
            for (int s = 0; s < students.length - 1; s++) {
                if (students[s + 1].getGrade() > students[s].getGrade()) {
                    Student temp = students[s];
                    students[s] = students[s + 1];
                    students[s + 1] = temp;
                }
            }
        }

        List<Student> studentsList = Arrays.asList(students);

        studentsList = studentsList.stream().sorted(Comparator.comparing(Student::getGrade)).collect(Collectors.toList());

        System.out.println("Sorted students ================");
        for (Student student : studentsList) {
            System.out.println(student);
        }

        PrintWriter pp = new PrintWriter(new File("src/Student/std.data"));
        for (Student gg : studentsList) {
            pp.println(gg);
        }

        pp.flush();
        pp.close();

    }

}
