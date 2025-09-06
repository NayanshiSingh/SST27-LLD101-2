package exercise;
public class EmployeeCSV_Adaptor implements Employee{

    EmployeeCSV emp_CSV;
    public String getId(){
        return emp_CSV.tokens()[0];
    }
    public String getFirstName(){
        return emp_CSV.tokens()[1];
    }
    public String getLastName(){
        return emp_CSV.tokens()[2];
    }
    public String getEmail(){
        return emp_CSV.tokens()[3];
    }
}
