public class StrongNumber {
    
    public static int fact(int n){
        int fact;
        if(n<=0) return 0;
        else if(n==1) return 1;
        else{
            fact=n*fact(n-1);
        }
        return fact;
    }
    
    public static void findString(int a,int b){
        
        for(int i=a;i<=b;i++){
            int num=i;
            int sum=0;
            while(num!=0){
                int r=i%10;
                sum=sum+fact(r);
                num=num/10;
            }
            if(sum==i) System.out.println(i+" is a strong number");
            else System.out.println(i+" is not a storng number");
        }
    }
}
