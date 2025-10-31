import java.util.*;
class Balancing_bruteforce{

    public static int midElement(int n){
        for(int i=1;i<=n;i++){
            int sum=0;
            int remain=(n*(n+1))/2;
            for(int j=1;j<=i;j++){
                sum=sum+j;
            }
            remain=remain-sum+i;
            if(sum==remain){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(midElement(n));
    }

}
