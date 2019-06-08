package Zad3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("123", "pawel", "gawel", Gender.MALE));
        students.add(new Student("233", "rrrr", "xxxxx", Gender.MALE));
        students.add(new Student("333", "gggg", "nnnn", Gender.FEMALE));
        students.add(new Student("444", "ggyy", "kkkkk", Gender.FEMALE));
        students.add(new Student("555", "rrrr", "vvvv", Gender.MALE));
        students.add(new Student("666", "nnnnn", "xxxx", Gender.MALE));

        //a wyisanie pierwszego obiektu
        System.out.println(students.get(0));
// b wypisuje wszystkich (pamietaj o nadpisaniu metody to sstring w klasie Student)
        System.out.println(students);
//c
        for (Student student : students) {
            if (student.getGender().equals(Gender.FEMALE)) {
                System.out.println(student);
            }
        }
//d
        for (Student student : students) {

        }
    }
}
