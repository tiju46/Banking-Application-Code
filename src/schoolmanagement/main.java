package schoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        teachers lissy = new teachers(1,"lissy",500);
        teachers mia = new teachers(2,"mia",100);
        teachers john = new teachers(3,"john",1200);

        List<teachers> teachersList = new ArrayList<>();
        teachersList.add(lissy);
        teachersList.add(mia);
        teachersList.add(john);

        student alen = new student(01,"alen",99);
        student godson = new student(02,"godson",100);
        student jerint = new student(03,"jerint",89);

        List<student> studentList = new ArrayList<>();
        studentList.add(alen);
        studentList.add(godson);
        studentList.add(jerint);

        school hss = new school(teachersList,studentList);

        alen.payfees(100);
        godson.payfees(200);
        jerint.payfees(200);

        //System.out.println(alen.getFeesPaid());
        System.out.println("HSS has earned " + hss.getTotalMoneyEarned());

        mia.receiveSalary(mia.getsalary());
        System.out.println("HSS has spent for salary to " + mia.getname() + " and now has" + hss.getTotalMoneyEarned());
    }
}

