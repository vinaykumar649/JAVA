import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferInput {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter Your Name: ");
        String str = br.readLine();
        System.out.println("Your Name: ");
        System.out.println(str);
}
}
    

