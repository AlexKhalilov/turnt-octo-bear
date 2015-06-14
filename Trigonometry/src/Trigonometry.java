public class Trigonometry
{
    static String myString="";

    public static void main(String args [])
    {
        Screen myScreen = new Screen();
        myScreen.print("\n\tВведите:\n\t1. перевод градусов в радианы.\n\t2. перевод радианов в градусы.\n");

        do{
            myString = myScreen.input();
        }while((!myString.equals("1")) && (!myString.equals("2")));
        myScreen.print("Введите исследуемое число: \n");
        
        if(myString.equals("1")){
            myScreen.print("\nОтвет: "+ Conversion.degToRad(myScreen.input())+" радиан");
        }else{
            myScreen.print("\nОтвет: "+ Conversion.radToDeg(myScreen.input())+" градусов");
        }
    }

}
