package schoolmanagement;

import java.util.List;

public class school {

    private List<teachers> tchrs;
    private List<student> stdnts;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    public school(List<teachers> tchrs, List<student> stdnts){
        this.tchrs=tchrs;
        this.stdnts=stdnts;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;

    }

    public List<teachers> getTchrs() {
        return tchrs;
    }
    public void addTeacher(teachers teacher){
        tchrs.add(teacher);
    }


    public List<student> getStdnts() {
        return stdnts;
    }

    public void addStudents(student students){
        stdnts.add(students);
    }
    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTchrs(List<teachers> tchrs) {
        this.tchrs = tchrs;
    }

    public void setStdnts(List<student> stdnts) {
        this.stdnts = stdnts;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned+=MoneyEarned;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned-=MoneySpent;
    }
}
