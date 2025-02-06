public class circularmath {

    public static double FromDegrees(double a) {
        double radians = a*Math.PI/180;
    return radians;
    }
    
    public static double FromRadians(double a) {
        double degrees = a*180/Math.PI;
    return degrees;
    }

    public static double CircleArea(double a) {
        double area = a*Math.PI;
    return area;
    }

    public static double Circumfrerence(double a) {
        double circumfrerence = 2*Math.PI*a;
        return circumfrerence;
    }

    public static double RadiusFromArea(double a) {
        double radius = Math.sqrt((a)/Math.PI);
        return radius;
    }
}
