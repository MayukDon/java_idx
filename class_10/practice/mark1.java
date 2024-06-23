import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class mark1 {
    int m,n,d,s;
    public void inputdata() {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("first num");
        m = Integer.parseInt(in.readLine());
        System.out.println("second num");
        n = Integer.parseInt(in.readLine());
    }
    public void calculation(){
        s = m + n;
        d = m - n;
    }
    public void out(){
        System.out.println("The sum of two numbers is " + s);
        System.out.println("The diff of two numbers is " + d);
    }
    public static void main(String[] args){
        mark1 mayuk = new mark1();
        mayuk.inputdata();
    }
}