
import java.util.HashMap;

//public class frequencycount {
//    public static void main(String[] args) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int arr[] = {1, 1, 2, 3, 4, 5, 5, 6};
//        for(int x:arr){
//            map.put(x,map.getOrDefault(x,0)+1);
//        }
//     System.out.println(map);
//
//
//    }
//}


       // Frequency Count
public class frequencycount {
    public static void main(String[] args) {
        String str="abcdbaba";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        //System.out.println(map);
        for(char ch : str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
        }
    }






