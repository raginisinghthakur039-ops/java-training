//public class main5 {
//    public static void main(String[]args){
//        StringBuilder str=new StringBuilder("hello");
        //str.insert(1,"byee");
        //System.out.println(str);
        //replace()
//        str.replace(1,4,"JAVA");
//        System.out.println("replace():"+str);
        //reverse
//        str.reverse();
//        System.out.println("reverse():"+str);
       // System.out.println("length():"+str);

//    }
//}
////output-hbyeeello

//reverse
//class main5 {
//    public static void main(String[] args) {
//        String str = "i love java";
//        String a[] = str.split(" ");
//        StringBuilder result=new StringBuilder();
//        for(String i:a){
//            StringBuilder data=new StringBuilder(i);
//            result.append(data.reverse()).append(" ");
//        }
//        System.out.println(result);
//    }
//}
////output-i evol avaj


//compress
class main5 {
    public static void main(String[] args) {
        String str="aabbc";

        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                result.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        System.out.println(result);
        count=1;
    }
    }
    //output-a2b2c1

