import java.awt.*;
import java.util.*;
public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single digit number -->");
        int number = scanner.nextInt();
        if(number==0)
            System.out.println("Entered number is --> ZERO");
        else if(number==1)
            System.out.println("Entered number is --> ONE");
        else if(number==2)
            System.out.println("Entered number is --> TWO");
        else if(number==3)
            System.out.println("Entered number is --> THREE");
        else if(number==4)
            System.out.println("Entered number is --> FOUR");
        else if(number==5)
            System.out.println("Entered number is --> FIVE");
        else if(number==6)
            System.out.println("Entered number is --> SIX");
        else if(number==7)
            System.out.println("Entered number is --> SEVEN");
        else if(number==8)
            System.out.println("Entered number is --> EIGHT");
        else if(number==9)
            System.out.println("Entered number is --> NINE");
        else
            System.out.println("You Entered invalid number");

    }
}
