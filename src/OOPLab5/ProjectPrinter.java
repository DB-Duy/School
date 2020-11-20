package OOPLab5;

public class ProjectPrinter implements Runnable{
    private Project project;

    public ProjectPrinter(Project project){
        this.project=project;
    }
    public void run() {
        project.sortEmployeeList();
        for(int i=0;i<project.getListOfEmployee().size();i++){
            System.out.println("[Project ID: "+project.getProjectID()+" - Project duration: "+project.getStartDate()+" to "+project.getEndDate()+"]"+"[Name: "+project.getListOfEmployee().get(i).getEmployeeName()+" - Salary per hour: "+project.getListOfEmployee().get(i).getSalaryPerHour()+"]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
