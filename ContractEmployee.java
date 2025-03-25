class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(String name, int id, double contractAmount) {
        super(name, id, 0); // baseSalary is not relevant here
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount; // Fixed contract payment
    }
}
