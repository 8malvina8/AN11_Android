public class Main {
    public static void main(String[] args) {
        Patient patient=new Patient(false, false, Patient.Vaccine.NO,false);
        switch(patient.vaccine){
            case PFIZER:
                System.out.println("Pfrizer");
                break;
            case SPUTNIK_V:
                System.out.println("Sputnik V");
                break;
            case VERO_CELL:
                System.out.println("Vero sell");
                break;
            case NO:
                System.out.println("No");
                break;
    }
    CovidTest covidTest = new CovidTest();
        covidTest.test(patient);

    }
}
