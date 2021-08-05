package chapterFive;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();

        int counter = 1;

        while(counter <= number){

            counter++;

            if(number % counter == 0)


            System.out.printf("%d ", counter );



        }

    }
}
