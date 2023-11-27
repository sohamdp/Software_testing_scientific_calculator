package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.Math;
import java.util.TreeMap;


class Scientific_calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Menu menu=new Menu();
        int choice;

        while(true)
        {
            System.out.println("\n1. Basic Arithmetic Operations.");
            System.out.println("2. Advanced Arithmetic Operations.");
            System.out.println("3. Bitwise Operations.");
            System.out.println("4.Calculation of Area or Volume.");
            System.out.println("5.Trigonometric operation.");
            System.out.println("6.Conversion operation.");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    menu.Basic_operations();
                    break;

                case 2:
                   menu.Advance_operations();
                    break;

                case 3:
                    menu.Bitwise_operations();
                    break;

                case 4:
                    menu.Calculate_Area();
                    break;

                case 5:
                    menu.Trigonometric_functions();
                    break;

                case 6:
                    menu.conversion_operations();
                    break;

                default:
                    System.out.println("Wrong input!!!");
                    return;
            }
        }
    }
}

class Calculations
{

    //Addition of two numbers
    public double add(double a, double b)
    {
        double sum;
        sum = a + b;
        return sum;
    }


    //Subtraction of two numbers
    public double subtract(double a, double b)
    {
        double sub;
        sub = a - b;
        return sub;
    }


    //Multiplication of two numbers
    public double multiply(double a, double b)
    {
        double mul;
        mul = a * b;
        return mul;
    }

    //Division of two numbers
    public double divide(double a, double b)
    {
        double div;
        div = a / b;
        return div;
    }


    //Modulo of two numbers
    public double modulo(double a, double b)
    {
        double mod;
        mod = a % b;
        return mod;
    }

    //Square of two numbers
    public double square(double a)
    {
        double sq;
        sq = a * a;
        return sq;
    }


    //Square Root of a number
    public double squareRoot(double a)
    {
        double sqrt;
        sqrt = Math.sqrt(a);
        return sqrt;
    }

    //Inverse of a number
    public double multiInverse(double a)
    {
        double inv;
        inv = 1 / a;
        return inv;
    }

    //Factorial of number
    public long factorial(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //Area of square
    public  double areaOfSquare(double l)
    {
        return l*l;
    }

    //Area of rectangle
    public  double areaOfRectangle(double l,double b)
    {
        return l*b;
    }

    //Area of circle
    public double areaOfCircle(double r)
    {
        return 3.14*r*r;
    }

    //Area of Triangle
    public double areaOfTriangle(double h,double b)
    {
        return 0.5*b*h;
    }

    //Surface Area Of Cube
    public double surfaceAreaOfCube(double l) {
        return 6*l*l;
    }

    //Surface Area of Cylinder
    public double surfaceAreaOfCylinder(double r,double h)
    {
        double pi = 3.14;
        return 2*pi*r*(r+h);
    }

    //Surface Area Of Cone
    public double surfaceAreaOfCone(double r,double l)
    {
        double pi = 3.14;
        return pi*r*(r+l);
    }

    //Surface Area OF Sphere
    public double surfaceAreaOfSphere(double r)
    {
        double pi = 3.14;
        return 4*pi*r*r;
    }

    //Volume of Cube
    public double volumeOfCube(double l) {
        return l*l*l;
    }

    //Volume of Cylinder
    public double volumeOfCylinder(double r,double h)
    {
        double pi = 3.14;
        return pi*r*r*h;
    }

    //Volume of Cone
    public double volumeOfCone(double r, double h)
    {
        double pi = 3.14;
        return 1.0/3.0*pi*r*r*h;
    }

    //Volume of Sphere
    public double volumeOfSphere(double r)
    {
        double pi = 3.14;
        return 4.0/3.0*pi*r*r*r;
    }

    //Sin function
    public double sinFunction(double theta)
    {
        return Math.sin(Math.toRadians(theta));
    }

    //Cos function
    public double cosFunction(double theta)
    {
        return Math.cos(Math.toRadians(theta));
    }

    //Tan function
    public  double tanFunction(double theta)
    {
        if(theta%90==0 && theta%180!=0)
        {
            throw new IllegalArgumentException("Cannot calculate tan for an angle where tan is undefined.");
        }
        double angleInRadians = Math.toRadians(theta);
        double tanValue = Math.tan(angleInRadians);
        return tanValue;
    }

    //sin inverse
    public double arcsin(double value)
    {
        // Check for valid range of input for arcsin (-1 <= value <= 1)
        if (value < -1 || value > 1) {
            throw new IllegalArgumentException("Input value out of range for arcsin.");
        }

        double angleInRadians = Math.asin(value);
        return Math.toDegrees(angleInRadians);
    }

    //cos inverse
    public double arccos(double value)
    {
        // Check for valid range of input for arccos (-1 <= value <= 1)
        if (value < -1 || value > 1) {
            throw new IllegalArgumentException("Input value out of range for arccos.");
        }

        double angleInRadians = Math.acos(value);
        return Math.toDegrees(angleInRadians);
    }

    //tan inverse
    public double arctan(double value) {
        double angleInRadians = Math.atan(value);
        return Math.toDegrees(angleInRadians);
    }


    public long Combinations(int n,int r)
    {
        if (isValidInput(n, r)) {
            return factorial(n) / (factorial(r) * factorial(n - r));
        } else {
            return 0;
        }
    }
    private static boolean isValidInput(int n, int r)
    {
        return n >= 0 && r >= 0 && n >= r;
    }

    public long Permutations(int n,int r)
    {
        if (isValidInput(n, r)) {
            return factorial(n) / factorial(n - r);
        } else {
            return 0;
        }
    }

    //power function
    public double powerFunction(int a,int b)
    {
        return (double) Math.pow(a,b);
    }

    public long log(int n)
    {
        if(n<=0)
            return -1;

        return (long)Math.log(n);
    }

    //Decimal to binary conversion
    public String decimalToBinary(int number)
    {
        if (number == 0) {
            return "0";
        }

        String binary = "";
        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary; // Concatenate to the left to reverse the order
            number /= 2;
        }

        return binary;
    }

    //Binary to decimal conversion
    public int binaryToDecimal(String str)
    {
        int decimalNumber = 0;
        int binaryLength = str.length();

        for (int i = 0; i < binaryLength; i++) {
            char binaryDigit = str.charAt(i);

            if (binaryDigit == '1') {
                decimalNumber += Math.pow(2, binaryLength - 1 - i);
            }
        }

        return decimalNumber;
    }

    //Roman to integer conversion
    public int romanToInt(String str)
    {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('M', 1000);
        romanMap.put('D', 500);
        romanMap.put('C', 100);
        romanMap.put('L', 50);
        romanMap.put('X', 10);
        romanMap.put('V', 5);
        romanMap.put('I', 1);

        int ans = romanMap.get(str.charAt(str.length() - 1));

        for (int i = 0; i < str.length() - 1; i++) {
            if (romanMap.get(str.charAt(i)) < romanMap.get(str.charAt(i + 1))) {
                ans -= romanMap.get(str.charAt(i));
            } else {
                ans += romanMap.get(str.charAt(i));
            }
        }

        return ans;
    }

    //Integer to roman conversion
    public String integerToRoman(int num)
    {
        TreeMap<Integer, String> romanMap = new TreeMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        StringBuilder result = new StringBuilder();

        for (int value : romanMap.descendingKeySet()) {
            while (num >= value) {
                result.append(romanMap.get(value));
                num -= value;
            }
        }

        return result.toString();

    }

    public int bitwiseAnd(int a, int b)
    {
        return a & b;
    }

    public int bitwiseOr(int a, int b)
    {
        return a | b;
    }

    public int bitwiseXor(int a, int b)
    {
        return a ^ b;
    }

    public int bitwiseNot(int a)
    {
        return ~a;
    }

    public int leftShift(int a, int shift)
    {
        return a << shift;
    }

    public  int rightShift(int a, int shift)
    {
        return a >> shift;
    }


}

class Menu {
    public void Basic_operations() {
        Scanner input = new Scanner(System.in);
        Calculations calculations = new Calculations();
        int choice;
        double a, b;
        int n;

        while (true) {
            System.out.println("\n1. Addition.");
            System.out.println("2. Subtraction.");
            System.out.println("3. Multiplication.");
            System.out.println("4. Division.");
            System.out.println("5. Modulo.");
            System.out.println("6. Square.");
            System.out.println("7. Square root.");
            System.out.println("8. Multiplicative Inverse.");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\nEnter a number : ");
                    a = input.nextDouble();
                    System.out.print("Enter another number : ");
                    b = input.nextDouble();
                    System.out.println("Output (a + b) : " + calculations.add(a, b));
                    break;

                case 2:
                    System.out.print("\nEnter a number : ");
                    a = input.nextDouble();
                    System.out.println("Enter another number : ");
                    b = input.nextDouble();
                    System.out.println("Output (a - b) : " + calculations.subtract(a, b));
                    break;


                case 3:
                    System.out.print("\nEnter a number : ");
                    a = input.nextDouble();
                    System.out.print("Enter another number : ");
                    b = input.nextDouble();
                    System.out.println("Output (a * b) : " + calculations.multiply(a, b));
                    break;


                case 4:
                    System.out.print("\nEnter a number : ");
                    a = input.nextDouble();
                    System.out.print("Enter another number : ");
                    b = input.nextDouble();
                    System.out.println("Output (a / b) : " + calculations.divide(a, b));
                    break;


                case 5:
                    System.out.print("\nEnter a number : ");
                    a = input.nextDouble();
                    System.out.print("Enter another number : ");
                    b = input.nextDouble();
                    System.out.println("Output (a % b) : " + calculations.modulo(a, b));
                    break;


                case 6:
                    System.out.print("\nEnter a number : ");
                    a = input.nextDouble();
                    System.out.println("Output (a ^ 2) : " + calculations.square(a));
                    break;


                case 7:
                    System.out.print("\nEnter a number : ");
                    a = input.nextDouble();
                    System.out.println("Output (sqrt(a)) : " + calculations.squareRoot(a));
                    break;


                case 8:
                    System.out.print("\nEnter a number : ");
                    a = input.nextDouble();
                    System.out.println("Output (1 / a) : " + calculations.multiInverse(a));
                    break;
                default:
                    return;

            }
        }
    }

    public void Trigonometric_functions() {
        Scanner input = new Scanner(System.in);
        Calculations calculations = new Calculations();
        int choice;
        double theta, number;
        int n;

        while (true) {
            System.out.println("\n1. Sin function.");
            System.out.println("2. Cos function.");
            System.out.println("3. Tan function .");
            System.out.println("4. Sec function.");
            System.out.println("5. Cosec function.");
            System.out.println("6. Cot function.");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\nEnter angle in degree : ");
                    theta = input.nextDouble();
                    System.out.println("Output (Sin(theta)) : " + calculations.sinFunction(theta));
                    break;

                case 2:
                    System.out.print("\nEnter angle in degree : ");
                    theta = input.nextDouble();
                    System.out.println("Output (Cos(theta)) : " + calculations.cosFunction(theta));
                    break;


                case 3:
                    System.out.print("\nEnter angle in degree : ");
                    theta = input.nextDouble();
                    try {
                        System.out.println("Output (Tan(theta)) : " + calculations.tanFunction(theta));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;


                case 4:
                    System.out.print("\nEnter value between[1,-1] : ");
                    number = input.nextInt();
                    try {
                        System.out.println("Output (sin-()) : " + calculations.arcsin(number));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;


                case 5:
                    System.out.print("\nEnter value between[1,-1] : ");
                    number = input.nextInt();
                    try {
                        System.out.println("Output (cos-()) : " + calculations.arccos(number));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;


                case 6:
                    System.out.print("\nEnter value: ");
                    number = input.nextInt();
                    try {
                        System.out.println("Output (sin-()) : " + calculations.arctan(number));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                    return;

            }
        }
    }


    public void Calculate_Area() {
        Scanner input = new Scanner(System.in);
        Calculations calculations = new Calculations();
        int choice;
        double a, b;

        while (true) {
            System.out.println("\n1. Calculate Area of Square.");
            System.out.println("2. Calculate Area of Rectangle.");
            System.out.println("3. Calculate Area of Circle.");
            System.out.println("4. Calculate Area of Triangle.");
            System.out.println("5. Calculate Total Surface Area of Cube.");
            System.out.println("6. Calculate Total Surface Area of Cylinder.");
            System.out.println("7. Calculate Total Surface Area of Cone.");
            System.out.println("8. Calculate Total Surface Area of Sphere.");
            System.out.println("9. Calculate Volume of Cube.");
            System.out.println("10. Calculate Volume of Cylinder.");
            System.out.println("11. Calculate Volume of Cone.");
            System.out.println("12. Calculate Volume of Sphere.");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\nEnter length of the Square : ");
                    a = input.nextDouble();
                    System.out.println("Output (Area of Square) : " + calculations.areaOfSquare(a));
                    break;


                case 2:
                    System.out.print("\nEnter length of the Rectangle : ");
                    a = input.nextDouble();
                    System.out.print("Enter breadth of the Rectangle : ");
                    b = input.nextDouble();
                    System.out.println("Output (Area of Rectangle) : " + calculations.areaOfRectangle(a, b));
                    break;

                case 3:
                    System.out.print("\nEnter radius of the Circle : ");
                    a = input.nextDouble();
                    System.out.println("Output (Area of Circle) : " + calculations.areaOfCircle(a));
                    break;

                case 4:
                    System.out.print("\nEnter height of the Circle : ");
                    a = input.nextDouble();
                    System.out.print("Enter base of the Circle : ");
                    b = input.nextDouble();
                    System.out.println("Output (Area of Triangle) : " + calculations.areaOfTriangle(a, b));
                    break;

                case 5:
                    System.out.print("\nEnter radius of the Circle : ");
                    a = input.nextDouble();
                    System.out.println("Output (Area of Circle) : " + calculations.surfaceAreaOfCube(a));
                    break;

                case 6:
                    System.out.print("\nEnter radius of the Cylinder : ");
                    a = input.nextDouble();
                    System.out.print("Enter height of the Cylinder : ");
                    b = input.nextDouble();
                    System.out.println("Output (Surface Area of Cylinder) : " + calculations.surfaceAreaOfCylinder(a, b));
                    break;

                case 7:
                    System.out.print("\nEnter radius of the Cone : ");
                    a = input.nextDouble();
                    System.out.print("Enter length of the Cone : ");
                    b = input.nextDouble();
                    System.out.println("Output (Surface Area of Cone) : " + calculations.surfaceAreaOfCone(a, b));
                    break;


                case 8:
                    System.out.print("\nEnter radius of the Sphere : ");
                    a = input.nextDouble();
                    System.out.println("Output (Surface Area of Sphere) : " + calculations.surfaceAreaOfSphere(a));
                    break;


                case 9:
                    System.out.print("\nEnter length of the Cube : ");
                    a = input.nextDouble();
                    System.out.println("Output (Volume of Cube) : " + calculations.volumeOfCube(a));
                    break;


                case 10:
                    System.out.print("\nEnter radius of the Cylinder : ");
                    a = input.nextDouble();
                    System.out.print("Enter height of the Cylinder : ");
                    b = input.nextDouble();
                    System.out.println("Output (Volume of Cylinder) : " + calculations.volumeOfCylinder(a, b));
                    break;

                case 11:
                    System.out.print("\nEnter radius of the Cone : ");
                    a = input.nextDouble();
                    System.out.print("Enter height of the Cone : ");
                    b = input.nextDouble();
                    System.out.println("Output (Volume of Cone) : " + calculations.volumeOfCone(a, b));
                    break;

                case 12:
                    System.out.print("\nEnter radius of the Sphere : ");
                    a = input.nextDouble();
                    System.out.println("Output (Volume of Sphere) : " + calculations.volumeOfSphere(a));
                    break;
                default:
                    return;
            }
        }
    }


    public void Advance_operations() {
        Scanner input = new Scanner(System.in);
        Calculations calculations = new Calculations();
        int choice;
        int a, b;

        while (true) {

            System.out.println("\n1. Combinations (nCr).");
            System.out.println("2. Permutations (nPr).");
            System.out.println("3. Calculate y th Power of x (x ^ y).");
            System.out.println("4. Log (Natural).");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {


                case 1:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.print("Enter another number : ");
                    b = input.nextInt();
                    System.out.println("Combinations aCb: " + calculations.Combinations(a, b));
                    break;


                case 2:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.println("Enter another number : ");
                    b = input.nextInt();
                    System.out.println("Permutations aPb : " + calculations.Permutations(a, b));
                    break;


                case 3:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.print("Enter another number : ");
                    b = input.nextInt();
                    System.out.println("Output (a ^ b) : " + calculations.powerFunction(a, b));
                    break;


                case 4:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.println("Output ( log(a)) : " + calculations.log(a));
                    break;

                default:
                    return;
            }
        }
    }

    public void conversion_operations()
    {
        int choice;
        Scanner input = new Scanner(System.in);
        Calculations calculations = new Calculations();
        while (true) {

            System.out.println("\n1. Decimal to Binary.");
            System.out.println("2. Binary to Decimal.");
            System.out.println("3. Convert a Roman Number to an Integer.");
            System.out.println("4. Convert an Integer to a Roman Number.");
            System.out.println("5. Exit.");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\nEnter a number : ");
                    int a = input.nextInt();
                    System.out.println("Decimal to Binary: " + calculations.decimalToBinary(a));
                    break;

                case 2:
                    System.out.print("\nEnter a Binary number : ");
                    String str = input.next();
                    System.out.println("Binary to Decimal: " + calculations.binaryToDecimal(str));
                    break;

                case 3:
                    System.out.print("\nEnter the Roman String : ");
                    str = input.next();
                    System.out.println("Roman to Integer: " + calculations.romanToInt(str));
                    break;

                case 4:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.println("Integer to Roman: " + calculations.integerToRoman(a));
                    break;

                default:
                    return;


            }
        }

    }

    public void Bitwise_operations()
    {
        int choice,a,b;
        Scanner input = new Scanner(System.in);
        Calculations calculations = new Calculations();
        while (true) {

            System.out.println("\n1. Bitwise AND.");
            System.out.println("2. Bitwise OR.");
            System.out.println("3. Bitwise XOR.");
            System.out.println("4. Bitwise NOT.");
            System.out.println("5. Bitwise LEFT SHIFT.");
            System.out.println("6. Bitwise RIGHT SHIFT.");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.print("Enter another number : ");
                    b = input.nextInt();
                    System.out.println("Output (a & b) : " + calculations.bitwiseAnd(a, b));
                    break;

                case 2:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.println("Enter another number : ");
                    b = input.nextInt();
                    System.out.println("Output (a | b) : " + calculations.bitwiseOr(a, b));
                    break;


                case 3:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.println("Output (~a) : " + calculations.bitwiseNot(a));
                    break;

                case 4:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.print("Enter another number : ");
                    b = input.nextInt();
                    System.out.println("Output (a ^ b) : " + calculations.bitwiseXor(a, b));
                    break;

                case 5:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.print("Enter number of bits to shift : ");
                    b = input.nextInt();
                    System.out.println("Output (a<<b) : " + calculations.leftShift(a, b));
                    break;


                case 6:
                    System.out.print("\nEnter a number : ");
                    a = input.nextInt();
                    System.out.print("Enter number of bits to shift : ");
                    b = input.nextInt();
                    System.out.println("Output (a<<b) : " + calculations.rightShift(a, b));
                    break;

                default:
                    return;


            }
        }
    }

}


