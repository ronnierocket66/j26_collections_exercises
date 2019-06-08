package DziennikStudent;

import java.util.*;

public class Dziennik {
    private Map<String, Student> studentMap = new HashMap<>();

    public void dodajStudenta(Student student) {
        //umiesc w mapie studentaa
        //kluczem wpisu jest indeks, wartosc obiektu student
        studentMap.put(student.getIndeks(), student);
    }

    public Student zwrocStudenta2(String indeks) throws StudentNotFoundException {
        if (studentMap.containsKey(indeks)) {
            return studentMap.get(indeks);
        }
    }

    public void usunStudenta(Student student) {
        studentMap.remove(student.getIndeks());
    }

    public void usunStudenta(String indeks) {
        studentMap.remove(indeks);
    }

    public Optional<Student> zwrocStudenta1(String indeks) {
        if (studentMap.containsKey(indeks)) {
            return Optional.ofNullable(studentMap.get(indeks));
        }
        return Optional.empty();

    }

    public double podajSrednik(String indeks) throws StudentNotFoundException {
        double sum = 0.0;
        Student sstudentKtoregoSredniaLiczymy = zwrocStudenta2(indeks);
        for (Double ocena : sstudentKtoregoSredniaLiczymy.getListaOcen()) {
            sum += ocena;
        }
        return sum / sstudentKtoregoSredniaLiczymy.getListaOcen().size();
    }

    public List<Student> zwrocZagrozonych() {
        List<Student> listaWynikowa = new ArrayList<>();
        //kopia indeksow
        Set<String> kopiaIndeksow = new HashSet<>(studentMap.keySet());

        for (String indeks : studentMap.keySet()) {
            try {
                if (podajSrednik(indeks) <= 2.0) {
                    listaWynikowa.add(studentMap.get(indeks));
                }
            } catch (StudentNotFoundException e) {
                System.out.println("Błąd, nie można było odnalezc student.");
            }
        }
        return listaWynikowa;
    }

    public List<Student> zwrocPosortowanaListeStudentow() {
        //kopiuje wszystkich studentow z mapy (wartosci) do listy
        List<Student> studentList = new ArrayList<>(studentMap.values());

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 1 - o1>o2
                // 0 - ==
                // -1 - o1<o2
                int indeks1 = Integer.parseInt(o1.getIndeks());
                int indkes2 = Integer.parseInt(o2.getIndeks());
                return Integer.compare(indeks1, indkes2);
            }
        });
        return studentList;
    }
}
