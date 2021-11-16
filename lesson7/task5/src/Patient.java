public class Patient {
    String name;
    boolean mask;
    boolean workHome;
    public Patient.Vaccine vaccine;
    boolean disease;

    Patient(String pName, boolean pMask, boolean pWorkHome, Patient.Vaccine pVaccine, boolean pDisease) {
        this.name = pName;
        this.disease = pDisease;
        this.mask = pMask;
        this.workHome = pWorkHome;
        this.vaccine = pVaccine;
    }

    static enum Vaccine {
        PFIZER,
        SPUTNIK_V,
        VERO_CELL;
    }
}
