package MVC;

public class EmployeeController {

    EmployeeModel model;
    EmployeeView view;

    EmployeeController(EmployeeModel model, EmployeeView view){
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        model.setName(name);
    }


    public void show(){

        view.viewEmployee(model.getName(), model.getEmpId(), model.getAge());
    }



}
