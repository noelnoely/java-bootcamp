import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StudentApp {

    public static void main(String[] args) throws IOException {

        Map<String, List<Book>> booksByStudent = new LinkedHashMap<>();

        for (String line : Files.readAllLines(Path.of("module-2", "students.txt"))) {

            String[] data = line.split(";");

            booksByStudent
                    .computeIfAbsent(data[0], key -> new ArrayList<>())
                    .add(new Book(
                            data[1],
                            data[2],
                            Integer.parseInt(data[3]),
                            Integer.parseInt(data[4])
                    ));
        }

        List<Student> students = booksByStudent.entrySet()
                .stream()
                .map(entry -> new Student(entry.getKey(), entry.getValue()))
                .toList();

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println(
                                "Год выпуска найденной книги: " + year
                        ),
                        () -> System.out.println("Книга отсутствует")
                );
    }
}