package DziennikStudent;

import java.sql.SQLOutput;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Dziennik dziennik = new Dziennik();

        Optional<Student> s = dziennik.zwrocStudenta1("123")
                if(s.isPresent()) {
                    Student wypakowany = s.get();
                    System.out.println(wypakowany);
                }
                Student student = dziennik.zwrocStudenta2("123");
                if(student !=null)  {
                    System.out.println(student.getImie());
                }
                try {
                    Student student_2 = dziennik.zwrocStudenta2("123");
                    //jesli kod dotarl w to miejsce to znaczy ze student istnieje
                    System.out.println(studet_2);
                } catch (StudentNotFoundException e)  {
                    System.out.println("Blad nie znaaleziono studenta");
                }
    }
}
