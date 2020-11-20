package OOPLab5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class test {
    public static void main(String[] args) {
        Date startDate=new GregorianCalendar(2015,Calendar.JANUARY,11).getTime();
        Date endDate=new GregorianCalendar(2015,Calendar.FEBRUARY,20).getTime();
        Project p=new Project("Test",startDate,endDate);
        p.addEmployee(new Employee("haha","HiHi",10,1,2));
        p.addEmployee(new Employee("haha","HeHe",10,0,3));
        p.addEmployee(new Employee("haha","HoHo",10,1,1));
        p.addEmployee(new Employee("haha","Hhhh",10,0,1));
        p.printProject();
    }
}
