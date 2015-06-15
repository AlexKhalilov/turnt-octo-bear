
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KeyboardInput
{
    public static void main(String [] args) throws Exception{
        // создаем объект reader получающий поток со стандартного входа
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String name = reader.readLine();// получаем строковую переменную
        
        String sAge = reader.readLine();// получаем числовую переменную 1 способ
        int nAge = Integer.parseInt(sAge);
        
        int dig = Integer.parseInt(reader.readLine());// 2 способ/ короче
    }
}
