import java.util.*;

public class PartyAffiliation {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter the name of the party (D, R, I, or other): ");
        char politicalParty = console.next().charAt(0);

        if (politicalParty == 'D' || politicalParty == 'd') {
            System.out.print("You get a Democratic Donkey.");
        }
        else if (politicalParty == 'R' || politicalParty == 'r') {
            System.out.print("You get a Republican Elephant.");
        }
        else if (politicalParty == 'I' || politicalParty == 'i') {
            System.out.print("You get a Independent Person.");
        }
        else {
            System.out.print("You get Other Party.");
        }
    }
}