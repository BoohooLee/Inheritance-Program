class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // Full-time employees have a fixed salary
    }
}
