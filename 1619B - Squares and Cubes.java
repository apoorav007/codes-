import java.util.HashSet;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long  n = sc.nextLong();
		// hashset does not store duplicate so use hashset here
            HashSet<Integer> s = new HashSet<>();
		// when i*i <=n then only add to hashset
            for(int i=1; i*i<=n;i++){
                s.add(i*i);
            }
            for (int i=1; i*i*i<=n; i++){
                s.add(i*i*i);
            }
            System.out.println(s.size());

        }
            }

        }


