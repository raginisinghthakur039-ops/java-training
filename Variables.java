
    public class Variables {
        static int a = 5; //static variable//
        public static void main (String [] args) {
            int a = 5; //local variable//
            Variables obj = new Variables();
            int b = 10 ;
            System.out.println(obj.a); //n static variable we need to make its object//
            System.out.println(b);
        }
    }

