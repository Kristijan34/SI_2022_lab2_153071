import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String [] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String s = null;
        for(int i=0; i<n; i++){
            s = reader.readLine();
            list.add(s);
        }
        System.out.println(SILab2.function(list));
    }
}
