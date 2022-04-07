public class SquareNumber {
    
    public static void square(int n){
        for(int i=4;i<n;i++){
            for(int j=2;j<=i/2;j++){
                if((j*j)==i){
                    System.out.println(i +" is a perfect square");
                    break;
            }
        }
    }
}}
