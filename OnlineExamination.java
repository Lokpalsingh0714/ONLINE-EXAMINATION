import java.util.Scanner;

public class OnlineExamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "Lucky";
        String password = "1234";

        System.out.print("Enter Username: ");
        String u = sc.nextLine();
        System.out.print("Enter Password: ");
        String p = sc.nextLine();

        if (!u.equals(username) || !p.equals(password)) {
            System.out.println("Login Failed!");
            return;
        }

        System.out.println("Login Successful!\n");

        int score = 0;


        System.out.println("1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) New Delhi");
        System.out.println("c) Chennai");
        System.out.println("d) Kolkata");
        System.out.print("Your Answer: ");
        char ans1 = sc.next().charAt(0);
        if (ans1 == 'b') score++;


        System.out.println("\n2. Who invented Java?");
        System.out.println("a) Dennis Ritchie");
        System.out.println("b) James Gosling");
        System.out.println("c) Bjarne Stroustrup");
        System.out.println("d) Guido van Rossum");
        System.out.print("Your Answer: ");
        char ans2 = sc.next().charAt(0);
        if (ans2 == 'b') score++;


        System.out.println("\n3. Which keyword is used for inheritance in Java?");
        System.out.println("a) super");
        System.out.println("b) extends");
        System.out.println("c) this");
        System.out.println("d) implements");
        System.out.print("Your Answer: ");
        char ans3 = sc.next().charAt(0);
        if (ans3 == 'b') score++;

         System.out.println("\n4. Who is known as the Father of Computer?");
        System.out.println("a) Charles Babbage");
        System.out.println("b) Alan Turing");
        System.out.println("c) Bill Gates");
        System.out.println("d) Dennis Ritchie");
        System.out.print("Your Answer: ");
        char ans4 = sc.next().charAt(0);
        if (ans4 == 'a') score++;

        System.out.println("\n4. Which language is mother of all programming languages?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) C");
        System.out.println("d) Ruby");
        System.out.print("Your Answer: ");
        char ans5 = sc.next().charAt(0);
        if (ans5 == 'c') score++;

        System.out.println("\nExam Finished!");
        System.out.println("Your Score: " + score + "/5");
        System.out.println("Logout Successful. Thank you!");
    }
}
 