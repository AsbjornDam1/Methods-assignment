import java.util.Scanner;

public class MethodsAssignment {

    //Task 4
    public static double areaOfTriangle(double triangleSideA, double triangleSideB, double triangleSideC) {
        double heron = (triangleSideA + triangleSideB + triangleSideC) / 2;
        return Math.sqrt(heron*(heron-triangleSideA)*(heron-triangleSideB)*(heron-triangleSideC));
    }
    //Task 3
    public static String getMiddleChar(String middleCharInput) {
        int position;
        int length;
        if (middleCharInput.length() % 2 == 0)
        {
            position = middleCharInput.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = middleCharInput.length() / 2;
            length = 1;
        }
        return middleCharInput.substring(position, position + length);

    }

    //Task 1
    public static int smallestNumber(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }
    //Task 1 ends here
    //Task 2 starts here
    public static int posNegZero (int numberToTest) {



        if(numberToTest>0)
            System.out.println(numberToTest + " is a positive number");

        else if(numberToTest<0)
            System.out.println(numberToTest + " is a negative number");

        else
            System.out.println("It's actually zero");

        return numberToTest;



        }
        //Task 2 ends here

    public static void main(String[] args) {
        //Task 1

        Scanner scan1 = new Scanner(System.in);

        Scanner scan2 = new Scanner(System.in);

        Scanner scan3 = new Scanner(System.in);

        System.out.println("Pick three numbers, and ill tell which is smallest.");

        System.out.println("Enter first number here:");

        int a = scan1.nextInt();

        System.out.println("Enter second number here:");

        int b = scan2.nextInt();

        System.out.println("Enter third number here:");

        int c = scan3.nextInt();

        System.out.println("You picked these 3 numbers: " + a + " " + b + " " + c);

        smallestNumber(a,b,c);

        System.out.println("The smallest number is " + smallestNumber(a,b,c));

        //Task 1 ends here

        //Task 2

        int numberToBeTested = 0;

        posNegZero(numberToBeTested);

        //Task 2 ends here

        //Task 3

        Scanner scannerMiddleChar = new Scanner(System.in);
        System.out.print("Input a string: ");
        String stringToMiddleChar = scannerMiddleChar.nextLine();
        System.out.print("The middle character in the string: " + getMiddleChar(stringToMiddleChar)+"\n");


        //Task 3 ends here

        //Task 4


        double side1 = 10;
        double side2 = 15;
        double side3 = 20;
        System.out.println(areaOfTriangle(side1,side2,side3));



        //Task 4 ends here









    }
}
