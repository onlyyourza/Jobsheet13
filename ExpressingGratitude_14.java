import java.util.Scanner;
public class ExpressingGratitude_14 {
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of the people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    public static void sayThankYou() {
        String name = getGreetingRecipient();
        System.out.println("Thankyou " + name + " for being the best teacher in the world\n" +
            "you inspired in me a love for learning and made me feel like I could ask you anything."
        );
    }

    public static void sayAdditionalGreetings(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        sayThankYou();
        sayAdditionalGreetings("Wishing you all the best and continued success!");
    }
}
