import java.util.Random;

class Cosmodrome implements IStart {
    int x;
    boolean rez=false;

    @Override
    public boolean Examination() {
        Random random = new Random();
        random.nextBoolean();
        x=(int)(Math.random()*2);
        if (x==1){ rez=true;}
        return rez;
    }

    @Override
    public void Start() {

    }

    @Override
    public boolean EngineStarting(IStart obj) {
        boolean pRez= obj.Examination();
    if(pRez==true){

        System.out.println("Предстартовая проверка прошла успешно! Запуск двигателя через... ");
        for (int i=10; i>-1;i--){
            System.out.println(i);
        }
        System.out.println("Двигатели Шатла запущены.\n" +
                "Все системы в норме.");
    }
    return pRez;
    }
}
