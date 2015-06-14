
import java.util.*;
public class Screen
{
    // метод выводит на экран полученную строку
    public void print(String str)
    {
        System.out.print(str);
    }

    // метод возвращает строку введенную с клавиатуры
    public String input()
    {
        Scanner myscanner = new Scanner(System.in);
        return myscanner.nextLine();
    }
}
