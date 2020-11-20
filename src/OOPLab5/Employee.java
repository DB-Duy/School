package OOPLab5;

public class Employee implements Comparable<Employee>{
    private String employeeID;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    public Employee(String employeeID, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }
    public int calculateWeeklySalary(){
        return salaryPerHour*8*(5-noOfLeavingDay+noOfTravelDay/2);
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public void setNoOfLeavingDay(int noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }

    public int getNoOfTravelDay() {
        return noOfTravelDay;
    }

    public void setNoOfTravelDay(int noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }
    public String toString(){
        return "[Name: "+this.getEmployeeName()+" - Salary per hour: "+this.getSalaryPerHour()+" - Weekly salary: "+calculateWeeklySalary()+"]";
    }
    public int compareTo(Employee a) {
        int i;
        if(this.getNoOfTravelDay()==a.getNoOfTravelDay()){
            if(this.getNoOfLeavingDay()<a.getNoOfLeavingDay()){
                i=1;
            }
            else i=-1;
        }
        else {
            if(this.getNoOfTravelDay()>a.getNoOfTravelDay()){
                i=1;
            }
            else i=-1;
        }
        return i;
    }
}
