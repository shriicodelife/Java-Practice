package D03_Encapsulation;
//6. Employee ID Setter
//Task:
//Class Employee with private id.
//Set ID using setId(int) and display it with getId().
//Prevent setting negative IDs.
//
//✔ Goal: Hide employee data and protect using conditions in setters.

public class EmployeeIdSetter {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid Id");
        }
    }
    //main method
    public static void main(String[] args){
        EmployeeIdSetter employeeIdSetter=new EmployeeIdSetter();
        employeeIdSetter.setId(223);
        System.out.println("Employee Id:" +employeeIdSetter.getId());
        employeeIdSetter.setId(-55);  // Invalid ID
        System.out.println(" Employee ID after invalid attempt: " + employeeIdSetter.getId());
    }
}




