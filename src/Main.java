import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Vasily", "Galperov", 47));
        persons.add(new Person("Sonya", "Chernyshova", 35));
        persons.add(new Person("Ekaterina", "Ivanova", 31));
        persons.add(new Person("Alexey", "Rostov", 52));
        persons.add(new Person("Igor", "Prostoy", 47));
        persons.add(new Person("Viktoria", "Ivanova", 35));


        Comparator<Person> PersonComparator = (p1, p2) -> {
            if (p1.getSurname().length() < p2.getSurname().length()) {
                return 1;
            }
            if (p1.getSurname().length() > p2.getSurname().length()) {
                return -1;
            }
            return -(p1.getAge() - p2.getAge());
        };

        Collections.sort(persons, PersonComparator);

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}