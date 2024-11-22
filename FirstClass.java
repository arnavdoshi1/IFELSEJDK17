public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hey [NAME]!");

        int highScore = 50;
        int lowScore = 5;
        int userScore = 100;

        System.out.println("You're score is " + userScore + ".");

        if (userScore > lowScore && userScore < highScore) {
            System.out.println("You're score was higher than the lowest score, but less than the highest score.");
        }
        else if (userScore > highScore) {
            System.out.println("You're score was higher than the highest score!!");
        }
        else if (userScore < lowScore) {
            System.out.println("Unfortunately, you're score was lower than the lowest score.");
        }
    }
}