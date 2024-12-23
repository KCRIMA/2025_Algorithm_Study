
import java.util.*;

class Solution {


    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        String result;
        for (int test_case = 1; test_case <= T; test_case++) {
            result = "Impossible";
            boolean possible = true;

            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int lastTime = arr[n - 1];
            int bread = 0;
            int idx = 0;
         


            
            if(arr[0] == 0){
                possible = false;
            }else{
            for (int i = 1; i <= lastTime; i++) {
                if (i % m == 0) bread += k;
                if (idx < n) {
                    if (i == arr[idx]) {
                        idx++;
                        if (bread > 0) bread--;
                        else {
                            possible = false;
                            break;
                        }
                    }
                }
            }
            }

            if (possible) result = "Possible";
            sb.append("#").append(test_case).append(" ").append(result + "\n");
        }

        System.out.println(sb);
    }

}