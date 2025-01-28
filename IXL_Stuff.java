import java.util.ArrayList;
import java.util.Scanner;


public class IXL_Stuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 = Check If there is a right Triangle");
        System.out.println("1 = Find Hypotenuse");
        System.out.println("2 = Find Leg");

        int control = sc.nextInt();
        switch(control) {
            case 0:
            pythageoreanisrighttrangle(args);
                break;
            case 1:
            pythageoreantheorem(args);
            break;
            case 2:
            missingleg(args);
            default:
            System.out.println("");
            sc.close();
        
        }

    }
    public static void pythageoreanisrighttrangle(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Insert First Digit");
        int a = sc.nextInt();
        System.out.println("Insert Second Digit");
        int b = sc.nextInt();
        System.out.println("Insert Third Digit");
        int c = sc.nextInt();

        numbers.add(a);
        numbers.add(b);
        numbers.add(c);


        int largest = numbers.get(0);

        for (int i = 0; i < 3; i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
                
        }
        numbers.remove(numbers.indexOf(largest));

        System.out.println(numbers);
        System.out.println("The largest is " + largest);
        numbers.add(largest);
        }
        int x = numbers.get(0) * numbers.get(0);
        int y = numbers.get(1) * numbers.get(1);
        int z = largest * largest;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close(); 

        if(x+y==z) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
   
    public static void pythageoreantheorem(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Insert First Digit");
        int a = sc.nextInt();
        System.out.println("Insert Second Digit");
        int b = sc.nextInt();
        
        numbers.add(a);
        numbers.add(b);
        int x = numbers.get(0)* numbers.get(0);
        int y = numbers.get(1)* numbers.get(1);
        int z = x+y;
        double w = Math.sqrt(z);
        System.out.println(w);
        sc.close();
    }
  
    public static void missingleg(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Insert First Digit");
        int a = sc.nextInt();
        System.out.println("Insert Second Digit");
        int b = sc.nextInt();

        numbers.add(a);
        numbers.add(b);

        int largest = numbers.get(0);

        for (int i = 0; i < 3; i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
                
        }
        numbers.remove(numbers.indexOf(largest));

        System.out.println(numbers);
        System.out.println("The largest is " + largest);
        
        int x = numbers.get(0)* numbers.get(0);
        int z = largest-x;
        double w = Math.sqrt(z);
        System.out.println(w);
        sc.close();
    }
    }
}