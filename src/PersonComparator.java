import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getSurname().length() < p2.getSurname().length()) {
            return 1;
        }
        if (p1.getSurname().length() > p2.getSurname().length()) {
            return -1;
        }
        return - (p1.getAge() - p2.getAge());
    }
}
