package cvut.fel.omo;

// Proxy pro zaměstnance, který omezuje přístup k citlivým informacím podle role
class EmployeeProxy implements Employee {
    private Employee realEmployee;
    private String role;

    public EmployeeProxy(Employee realEmployee, String role) {
        this.realEmployee = realEmployee;
        this.role = role;
    }

}
