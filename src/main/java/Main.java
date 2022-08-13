import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PersonInterface sup1 = new Superviser("testtesttest", "test1", "test2", "test3", "test4", "test5");
        PersonInterface job1 = new Job("petya", "loh", "25.06/19", "88005553535", "fsin", "ul.pushkina");
        PersonInterface cli1 = new Client("vasya", "krutoy", "23.09.11", "89368766666", "magaz", "dom_3");

        ArrayList<PersonInterface> people = new ArrayList<PersonInterface>();

        people.add(job1);
        people.add(cli1);
        people.add(sup1);

//        for (PersonInterface person : people) {
//
//            displayPersonData(person);
//        }
//
//        for (int i = 0; i < people.size(); i++) {
//            displayPersonData(people.get(i));
//        }

//        people.forEach(person -> displayPersonData(person));

        people.forEach(person ->
        {
            System.out.println(person.getFIO());
            System.out.println(person.getInfo());
            System.out.println(person.getStatus());
            System.out.println("");
        });

        System.out.println("totalWorkers: " + Person.count);
        System.out.println("totalClients: " + Person.countClients);
    }

    public static void displayPersonData(PersonInterface person) {
        System.out.println(person.getFIO());
        System.out.println(person.getInfo());
        System.out.println(person.getStatus());
        System.out.println("");
    }

}