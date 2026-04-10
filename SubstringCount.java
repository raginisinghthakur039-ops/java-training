public class SubstringCount {

        public static void main(String[]args){
            String  str = "abc";
            int count =0;
            for (int i =0; i<str.length();i++){
                for(int j=i;j<str.length(); j++){
                    String sub = str.substring(i,j+1);

                    if(sub.charAt(0)==sub.charAt(sub.length()-1)){
                        //System.out.println(sub);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

