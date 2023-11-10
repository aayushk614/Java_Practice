package MVC;

public class EmployeeModel {

    private String name;
    private String EmpId;
    private int age;

    public EmployeeModel(String name, String empId, int age) {
        this.name = name;
        EmpId = empId;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
