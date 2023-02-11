public class Main {
    public static void main(String[] args) {
        //Initialize variable
        String partyAffil = "AAA";
        //Output asking for affiliation
        System.out.println("What is your party affiliation? R for Republican, D for Democrat, I for Independent or Other");
        if (partyAffil == "R") {
            System.out.println("You get a Republican Elephant.");
        } else if (partyAffil == "D") {
            System.out.println("You get a Democratic Donkey.");
        } else if (partyAffil == "I") {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other Other.");
        }
    }
}