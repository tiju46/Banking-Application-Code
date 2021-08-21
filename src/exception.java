public class exception {
    public static void main(String[] args) {
        try {
            int array[] = new int[3];
            array[5]=9;
            System.out.println(array[2]);

        }catch (Exception e){
            System.out.println("Array index out of bounds");
        }finally {
            System.out.println("tomy");
        }

    }
}
