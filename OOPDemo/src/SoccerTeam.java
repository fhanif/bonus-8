/**
 * Created by fhani on 7/7/2017.
 */
public class SoccerTeam {
    private Person headCoach;
    private Person assistantCoach;
    int numOfClipboards;

    //no constructor was created, so java creates it for us by default

    public Person getHeadCoach() {
        return headCoach;
    }

    public void setHeadCoach(Person headCoach) {
        this.headCoach = headCoach;
    }

    public Person getAssistantCoach() {
        return assistantCoach;
    }

    public void setAssistantCoach(Person assistantCoach) {
        this.assistantCoach = assistantCoach;



    }

    public void printTeam() {
        System.out.println("Head Coach: ");
        System.out.println(headCoach.toString());
        System.out.println("Assistant Coach: ");
        System.out.println(assistantCoach.toString());
    }
}
