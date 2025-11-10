//remove duplicate characters
//public class main4 {
//    public static void main(String[] args){
//        String str="hello";
//        String newStr="";
//        for(char ch : str.toCharArray()){
//            if(newStr.indexOf(ch)==-1){
//                newStr+=ch;
//            }
//
//        }
//        System.out.println(newStr);
//    }
//}
//output:helo



//frequency count
//public class main4 {
//    public static void main(String[] args) {
//        int freq[]=new int[256];
//        String str="banana";
//        for (char ch: str.toCharArray()){
//            freq[ch]++;
//        }
//        for(int i=0;i<256;i++){
//            if(freq[i]>0){
//                System.out.println((char)i +"->"+ freq[i]);
//
//            }
//        }
//
//
//    }
//}

//output-a->3
//b->1
//n->2


//find longest word in the string
//public class main4 {
//    public static void main(String[] args) {
//        String str="java is powerful";
//        String a[]=str.split(" ");
//        String largest="";
//        for(String val : a){
//            if(val.length()>largest.length()){
//                largest=val;
//            }
//        }
//        System.out.println(largest);
//    }
//    }
//    //output:powerful


import java.util.Arrays;
//string a and b equal or not

public class main4 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "lloeh";
        char ch1[] = a.toCharArray();
        char ch2[] = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str1 = new String(ch1);
        String str2 = new String(ch2);
        if (str1.equals(str2)) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }

    }
}