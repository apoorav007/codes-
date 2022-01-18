public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int count = 0;
            for (int i=0; i<n;i++){
                if(s.charAt(i) == 'B'){
                    count++;
                }
            }
            if(count *2 == n){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }

        }
    }

