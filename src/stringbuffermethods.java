public class stringbuffermethods {


    static void stringmethods(String str){

        StringBuffer num = new StringBuffer(),
        alpha =  new StringBuffer(), special = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                num.append(str.charAt(i));
            }else if(Character.isAlphabetic(str.charAt(i))){
                alpha.append(str.charAt(i));
            }else {
                special.append(str.charAt(i));
            }
        }
        System.out.println(num);
        System.out.println(alpha);
        System.out.println(special);

    }


    public static void main(String[] args) {
        String str = "tiju123@#";
        stringmethods(str);

    }
}
