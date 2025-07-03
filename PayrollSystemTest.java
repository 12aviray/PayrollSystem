
public class PayrollSystemTest {
    public static void main(String[] args) {

        // Create an array of Employee references
        Employee[] employees = new Employee[4];

        // Initialize the array with objects of each subclass
        employees[0] = new SalariedEmployee("Avishek", "Ray", "111-11-111", 800.00);
        employees[1] = new HourlyEmployee("Sagar", "Paul", "222-22-222", 16.75, 40);
        employees[2] = new CommissionEmployee("Sojib", "Ray", "333-33-333", 10000, 0.06);
        employees[3] = new BasePlusCommissionEmployee("Sukanto", "Bormon", "444-44-444", 5000, 0.04, 300);

        System.out.println("Employees processed polymorphically:\n");

        // Iterate through the array and process each employee
        for (Employee currentEmployee : employees) {
            // Invoke toString to display employee information
            System.out.println(currentEmployee);

            // This section fulfills the requirement to increase base salary by 10%
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // Downcast Employee reference to a BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary(oldBaseSalary * 1.10); // Increase base salary by 10%

                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            }

            // Display earnings for each employee using the polymorphic call to earnings()
            System.out.printf("earned: $%,.2f%n%n", currentEmployee.earnings());
        }
    }
}