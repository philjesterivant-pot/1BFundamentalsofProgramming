import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EVENNUMBERB {
    public static void main(String [] args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int x = 2; x <= 100; x += 2) {
            System.out.print(x + " ");

            if (x % 20 == 0) {
                System.out.println();
            }
        }
    }
}
