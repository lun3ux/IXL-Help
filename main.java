


public class main {

    public static void main(String[] args) {
        double a = 12;
        double b = 13;
        double c = 14;
        double missingleg = IXL_Stuff.missingleg(a, b);
        boolean pythageoreanisrighttrangle = IXL_Stuff.pythageoreanisrighttrangle(a,b,c);
        double pythageoreantheorem = IXL_Stuff.pythageoreantheorem(a,b);
        System.out.println("Missing leg is " + missingleg);
        System.out.println("Missing leg is " + pythageoreanisrighttrangle);
        System.out.println("Missing leg is " + pythageoreantheorem);
    }
}
