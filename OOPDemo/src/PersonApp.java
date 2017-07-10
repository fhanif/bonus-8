import java.util.ArrayList;

/**
 * Created by fhani on 7/7/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        Person farha = new Person("Farha", 23, "1234 Main St");
        //used constructors

        Person jenny = new Person(); //used empty constructor and getters and setters
        jenny.setAge(26);
        jenny.setFullname("Jenny");
        jenny.setAddress("1570 Woodward");

        //System.out.println(jenny.getFullname() + " " + jenny.getAge() + " " + jenny.getAddress());

        Person ny = new Person();

//        System.out.println(farha.toString()); //in location also includes Class that it belong to
//        System.out.println(jenny); // still prints without calling .toString b/c
//        System.out.println(ny);


        SoccerTeam dcFalcons = new SoccerTeam();

        dcFalcons.setHeadCoach(farha);
        dcFalcons.setAssistantCoach(jenny);

        dcFalcons.printTeam();

        ArrayList<Person> people = new ArrayList<>();
        people.add(jenny);
        people.add(farha);

        System.out.println();
        System.out.println(people);

    }
}
