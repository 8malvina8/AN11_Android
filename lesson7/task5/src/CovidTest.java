public class CovidTest{
        double k = 0.0D;
        double m = 0.0D;
        double n = 0.0D;
        double r = 0.0D;
        double probability = 1.0D;
        double sum;
        boolean result;

        CovidTest(Patient pPatient) {
        }

        public boolean test(Patient patient) {
            if (patient.mask) {
                this.k = 0.1D;
            }

            if (patient.workHome) {
                this.m = 0.21D;
            }

            if (patient.vaccine != null) {
                this.n = 0.39D;
            }

            if (patient.disease) {
                this.r = 0.18D;
            }

            this.sum = this.probability - this.k - this.n - this.m - this.r;
            if (this.sum < 0.5D) {
               result=false;
            } else {
                result=true;
            }
        return result;
        }
}
