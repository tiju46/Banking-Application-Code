package schoolmanagement;

public class student {


    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public student(int id, String name, int grade){

        this.id=id;
        this.name=name;
        this.grade=grade;
        feesPaid=0;
        feesTotal=30000;


    }

    public void setGrade(int grade){
        this.grade=grade;
    }
    public void payfees(int fees){
        feesPaid += fees;
        school.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
}
