class CovidTest {
double k=0,m=0,n=0,r=0, probability=1,sum;

 public void test(Patient patient){
        if (patient.mask==true) {k=0.1;}
        if(patient.workHome==true){m=0.21;}
        if(patient.vaccine!= Patient.Vaccine.NO){n=0.39;}
        if (patient.disease==true){r=0.18;}

        sum=probability-k-n-m-r;
        if(sum<0.5){
            System.out.println("Пациент не болен");
        }else System.out.println("Пациент болен");

    }

}
