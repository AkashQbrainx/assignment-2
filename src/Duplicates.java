import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Duplicates {
    
    public static void findDuplicates(int[] arr){

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        System.out.println(map.entrySet().stream().filter(f->f.getValue()==1).map(f->f.getKey()).collect(Collectors.toList()));
    }
}
