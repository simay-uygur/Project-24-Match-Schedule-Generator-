import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<String>();

        ArrayList<String> teams = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String line = input.nextLine();
            if(line.equals("0")){
                break;
            }
            teams.add(line);
        }
        int num = teams.size();

        if(num % 2 != 0){
            teams.add("Bay");
            num++;
        }
        int roundnum = 0;

        while(set.size() < num * (num - 1)){
            Collections.shuffle(teams, new Random()); // tried num*3 or else but didnt work (dont know why) :)
            String str = teams.get(0) + " vs " + teams.get(1);
            if(set.contains(str)){
                continue;
            }
            roundnum++;
            System.out.println("Round "+ roundnum);
            for(int i = 0; i < num-1; i+=2){
                str = teams.get(i) + " vs " + teams.get(i+1);
                set.add(str);
                System.out.println(str);
                
            }
            roundnum++;
            System.out.println("Round "+ roundnum);
            for(int i = 0; i < num-1; i+=2){
                str = teams.get(i+1) + " vs " + teams.get(i);
                set.add(str);
                System.out.println(str);
                
            }
        }

    }
}