public class Conversion
{
    public static double degToRad(String deg){
        
        return (double)(Math.toRadians(Double.valueOf(deg)));
    }
    
    public static double radToDeg(String rad){
        return (double)(Math.toDegrees(Double.valueOf(rad)));
    }
}
