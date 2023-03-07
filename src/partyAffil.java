import java.util.Scanner;
public class partyAffil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String partyAffiliation;

        System.out.print("Enter your party affiliation (D, R, or I): ");
        partyAffiliation = scanner.nextLine();

        switch (partyAffiliation.toUpperCase()) {
            case "D":
                System.out.println("You get a Democratic Donkey. ");
                break;
            case "R":
                System.out.println("You get a Republican Elephant. ");
                break;
            case "I":
                System.out.println("You get an Independent Person. ");
                break;
            default:
                System.out.println("You get Other.");
        }
    }
}