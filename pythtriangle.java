import java.util.ArrayList;

public class pythtriangle {
    public static void main(String[] args) {
    }
    public static boolean pythageoreanisrighttrangle(double a, double b, double c) {
        int x;
        int y;
        int z;

            ArrayList<Integer> numbers = new ArrayList<>();

            numbers.add((int) a);
            numbers.add((int) b);
            numbers.add((int) c);
            int largest = numbers.get(0);
            for (int i = 0; i < 3; i++) {
                if (numbers.get(i) > largest) {
                    largest = numbers.get(i);
                    
                }
                numbers.remove(numbers.indexOf(largest));
            
                numbers.add(largest);
            }   x = numbers.get(0) * numbers.get(0);
            y = numbers.get(1) * numbers.get(1);
            z = largest * largest;
        return x+y==z;
    }
   
    public static double pythageoreantheorem(double a, double b) {
            ArrayList<Integer> numbers = new ArrayList<>();

            numbers.add((int) a);
            numbers.add((int) b);

            double x = numbers.get(0)* numbers.get(0);
            double y = numbers.get(1)* numbers.get(1);
            
            double z = x+y; 
            double w = Math.sqrt(z);
            return w;
    }
  
    public static double missingleg(double a,double b) {
        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(a);
        numbers.add(b);

        double largest = numbers.get(0);

        for (int i = 0; i < 1; i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);      
        }

        }
        numbers.remove(numbers.indexOf(largest));      
        int x = (int) (numbers.get(0)* numbers.get(0));
        double z = largest-x;
        double w = Math.sqrt(z);
        return w;
    }
    
}