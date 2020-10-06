import java.util.Scanner;

class Password {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String answer   = "";

        
        System.out.print("What is the password? ");
        answer = sc.nextLine();
        if ("password".equals(answer)) {
            System.out.println("Correct! My secret is: I am the imposter.");
        } else {
            System.out.println("Incorrect Password! My secret is still safe...");
        }
    }
}