
//    class main3{
//    public static void main(String[]args){
//        String str="hello";
//        System.out.println(str.length());
//        //output:5
//        System.out.println(str.toUpperCase());
//        //output:HELLO
//        System.out.println(str.toLowerCase());
//        //output:hello
//        System.out.println(str.trim());
//        //output:hello
//        System.out.println(str.substring(2));
//        //output:llo
//        System.out.println(str.substring(2,3));
//        //output:l
//        System.out.println(str.indexOf(str));
//        //output:0
//
//
//    }
//}



     //string comparision
//class main3 {
//    public static void main(String[] args) {
//        //String str=new String("hello");
//       // String str1=new String("hello");
//        String str="hello";
//        String str1="hello";
//
//        System.out.println(str==str1);
//        System.out.println(str.equals(str1));
//    }
//}


          //check palindrom or not palindrom
//class main3 {
//    public static void main(String[] args) {
//        String a="aba";
//        String b="";
//        for(int i=a.length()-1;i>=0;i--){
//            b+=a.charAt(i);
//        }
//        if(a.equals(b)){
//            System.out.println(" is Palindrom");
//        }else{
//            System.out.println("is not Palindrom");
//
//        }
//    }
//    }
//



//split
//class main3 {
//   public static void main(String[] args) {
//       String str="java cpp c php js";
//       String a[]=str.split(" ");
//       for(String val : a){
//           System.out.println(val);
//       }
//   }
//   }


//find number vowel
class main3 {
   public static void main(String[] args) {
       String str="java";
       int v=0;
       for(char ch : str.toCharArray()){
           if("aeiou".indexOf(ch)!=-1){
               v++;


           }

       }System.out.println(v);

   }
   }
