


public class main {
    public static void main(String[] args) {
        double a = 1.9;
        double b = 7.7;
        double c = 14;
        double missingleg = pythtriangle.missingleg(a, b);
        boolean pythageoreanisrighttrangle = pythtriangle.pythageoreanisrighttrangle(a,b,c);
        double pythageoreantheorem = pythtriangle.pythageoreantheorem(a,b);
        Double proportions = proportions.proportions(a,b,c);
        System.out.println("Missing leg is " + missingleg);
        System.out.println("Missing leg is " + pythageoreanisrighttrangle);
        System.out.println("Missing leg is " + pythageoreantheorem);
        System.out.println("proportion is " + proportions);
    }
}
