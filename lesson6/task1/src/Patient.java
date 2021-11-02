public class Patient {
       boolean mask;//маска
    boolean workHome;//удаленка
    public Vaccine vaccine;//вакцинирован
    boolean disease;//болел

 Patient(boolean pMask, boolean pWorkHome, Vaccine pVaccine, boolean pDisease){
     this.disease=pDisease;
     this.mask=pMask;
     this.workHome=pWorkHome;
     vaccine=pVaccine;
 }
            enum Vaccine {
            PFIZER,
            SPUTNIK_V,
            VERO_CELL,
                NO
        }
    }




