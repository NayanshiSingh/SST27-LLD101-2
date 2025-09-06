package exercise;
public class EmployeeDB_Adaptor implements Employee{
    EmployeeDB emp_db ;
    public String getId() {
        return Integer.toString(emp_db.getId());
    }
    public String getFirstName(){
        return emp_db.getFirstName();
    }
    public String getLastName(){
        return emp_db.getSurname();
    }
    public String getEmail(){
        return emp_db.getEmailAddress();
    }
}
