import java.util.HashMap;
//public class hashmap {
//    public static void main(String[]args){
//        HashMap<Integer,Integer>map=new HashMap<>();
//        map.put(1,10);
//        map.put(2,20);
//        System.out.println(map.get(3));
//        System.out.println(map.getOrDefault(3,0));
//        System.out.println(map.containsKey(3));
//for(int x :map.keySet()){
//    System.out.println(map.get(x));
//}
//    }
//
//}


//    TARGET SUM
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[]={2,7,11,15};
        int target=9;
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+" "+i);
                break;
            }
            map.put(arr[i],i);
            System.out.println(i);
        }
    }
}
