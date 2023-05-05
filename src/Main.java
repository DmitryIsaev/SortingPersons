import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Vasily", "Galperov", 47));
        persons.add(new Person("Sonya", "Chernyshova", 35));
        persons.add(new Person("Ekaterina", "Ivanova", 15));
        persons.add(new Person("Alexey", "Rostov", 17));
        persons.add(new Person("Igor", "Prostoy", 47));
        persons.add(new Person("Viktoria", "Ivanova", 35));

        persons.removeIf(person -> person.getAge() < 18);

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}