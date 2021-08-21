public class stringfunc {
    public static void main(String[] args) {
        String s ="tiju";
//        StringBuilder str = new StringBuilder(s);
//        str.reverse();
//        System.out.println(str);

//        char[] str = s.toCharArray();
//        for (int i =str.length-1; i>=0; i--){
//            System.out.print(str[i]);
        String rev ="";
        for (int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
}
