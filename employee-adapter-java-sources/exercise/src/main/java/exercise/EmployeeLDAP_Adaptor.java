package exercise;
public class EmployeeLDAP_Adaptor implements Employee{
    
    EmployeeLDAP emp_LDAP ;
    public String getId(){
        return emp_LDAP.get("uid");
    }
    public String getFirstName(){
        return emp_LDAP.get("givenName");
    }
    public String getLastName(){
        return emp_LDAP.get("sn");
    }
    public String getEmail(){
        return emp_LDAP.get("mail");
    }
}
