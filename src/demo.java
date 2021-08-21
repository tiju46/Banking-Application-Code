public class demo extends sample{
    public static void main(String[] args) {
        demo obj=new demo();

        try {
            obj.onemethod();
            obj.demo1("  tiju");
        }
        catch (Exception e){
            System.out.println("Error Found");
        }

    }

    void demo1(String ab){
        System.out.println("child class"+ab);
    }
}
