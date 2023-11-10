package MVC;

public class TestMVC {

    public static void main(String[] args) {

        EmployeeModel model  = getEmployee();
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.show();

        controller.setName("Raman");

        controller.show();




    }

    public static EmployeeModel getEmployee(){
        EmployeeModel model = new EmployeeModel("Ram", "MT22001", 30);

        return model;


    }




}
