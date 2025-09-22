class PetService {
    private static final double BASE_FEE = 50.0;
    private static final double VACCINATION_FEE = 25.0;
    private static final double GROOMING_FEE = 30.0;

    // Basic checkup
    public double calculateFee() {
        return BASE_FEE;
    }

    // With vaccination
    public double calculateFee(boolean withVaccination) {
        if (withVaccination) {
            return BASE_FEE + VACCINATION_FEE;
        }
        return BASE_FEE;
    }

    // With vaccination + grooming
    public double calculateFee(boolean withVaccination, boolean withGrooming) {
        double total = BASE_FEE;
        if (withVaccination) total += VACCINATION_FEE;
        if (withGrooming) total += GROOMING_FEE;
        return total;
    }

    // Emergency
    public double calculateFee(String emergencyType) {
        return 200.0;
    }
}
