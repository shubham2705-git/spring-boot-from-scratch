package MultipleConfigFiles2.beans;

public class Employee {
    private String empname;
    private int empid;

    public String getempname() {
        return empname;
    }
    public void setempname(String empname) {
        this.empname = empname;
    }
    public int getempid() {
        return empid;
    }
    public void setempid(int empid) {
        this.empid = empid;
    }
    public void empDisplay() {
        System.out.println("Emp Name: "+empname);
        System.out.println("Emp Id : "+empid);
    }
}
