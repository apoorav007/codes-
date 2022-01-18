import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();

            for (int i = 1; i < 1667; i++) {
                if (i % 3 == 0 || i % 10 == 3) {
                    continue;
                    // if the above condition is true for i then it is skipped

                    }else{
                        // if it is not true then we will decrement the value of k till 0.
                    k--;
                    if(k==0){
                        System.out.println(i);
                        // when k is 0 then we print the i i.e kth term
                    }
                }
                }
            }


        }
    }

