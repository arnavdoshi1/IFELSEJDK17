public class SecondClass {
    public static void main(String[] args) {
        int clientAge = 5;
        int minAge = 18;

        if (clientAge > minAge) {
            System.out.println("You are older than " + clientAge + " years old.");
        }
        else if (minAge > clientAge) {
            System.out.println("You are younger than " + minAge + " years old.");
        }
    }
}
