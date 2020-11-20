package OOPLab5;
import java.util.Collections;
import java.util.Date;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Project {
    private String projectID;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> listOfEmployee = new ArrayList();
    private ProjectPrinter projectPrinter=new ProjectPrinter(this);

    public Project(String projectID, Date startDate, Date endDate) {
        this.projectID = projectID;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

    public void addEmployee(Employee a){
        this.listOfEmployee.add(a);
    }
    public int estimateBudget(){
        int budget=0;
        for(Employee a: listOfEmployee){
            long diff=startDate.getTime()-endDate.getTime();
            budget+=((a.getSalaryPerHour())*(TimeUnit.HOURS.convert(diff,TimeUnit.MILLISECONDS)));
        }
        return budget;
    }
    public void sortEmployeeList(){
        Collections.sort(listOfEmployee);
    }
    public String toString(){
        this.sortEmployeeList();
        String s="";
        for(Employee e:listOfEmployee){
            s+=", "+e.getEmployeeName();
        }
        return s;
    }
    public void printProject(){
        Thread t=new Thread(projectPrinter);
        t.start();
    }
}
