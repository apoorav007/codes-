import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            boolean p = false;
            char c [] = s.toCharArray();
            for(int i=0; i<n-1;i++){
                if(c[i]=='1' &&(c[i+1]=='0' || c[i+1]=='1')){
                    p = true;
                    System.out.println("Yes");
                    break;
                }
            }
            if(p == false){
                System.out.println("No");
            }

        }
    }
}