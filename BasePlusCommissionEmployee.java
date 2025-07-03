
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings() {
        // We use super.earnings() to get the commission part and add the base salary
        return getBaseSalary() + super.earnings();
    }

    // Return a String representation of a BasePlusCommissionEmployee
    @Override
    public String toString() {
        // We use super.toString() to get the commission employee's info
        return String.format("base-salaried %s; %s: $%,.2f",
                super.toString(), "base salary", getBaseSalary());
    }
}