public class Main {
 public boolean covidResult;

          public Main() {
        }

        public void message(Patient pPatient, boolean pTest){
              if(pTest==true){
                  System.out.println("Уважаемый "+pPatient.name+", \n"+
                                  "результат вашего теста на коронавирус  положительный. Вам \n" +
                          " необходимо соблюдать режим самоизоляции в течении 7-ми дней.\n" +
                          "Антител на коронавирус в вашем организме не обнаружено.");

              }else System.out.println("Уважаемый "+pPatient.name+", \n"+
                      "результат вашего теста на коронавирус  отрицательный. \n"+
                      "В вашем организме обнаружены антитела на короновирус.");
        }

        public static void main(String[] args) {

            Patient patient = new Patient("Александр Викторович",true, true, Patient.Vaccine.SPUTNIK_V, false);
            switch(patient.vaccine) {
                case PFIZER:
                    System.out.println("Pfrizer");
                    break;
                case SPUTNIK_V:
                    System.out.println("Sputnik V");
                    break;
                case VERO_CELL:
                    System.out.println("Vero sell");
                    break;

            }

            CovidTest covidTest = new CovidTest(patient);
            Main main = new Main();
            main.message(patient,covidTest.test(patient));
        }
}
