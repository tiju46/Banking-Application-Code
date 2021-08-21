package schoolmanagement;

public class teachers {

    private String name;
    private int id;
    private int salary;
    private int salaryEarned;

    public teachers(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        salaryEarned=0;

    }
    public String getname(){
        return name;
    }
    public int getsalary(){
        return salary;
    }
    public int getid(){
        return id;
    }
    public int setsalary(int salary){
        return this.salary;
    }

    public void receiveSalary(int sal){
        salaryEarned+=sal;
        school.updateTotalMoneySpent(salaryEarned);

    }
}

