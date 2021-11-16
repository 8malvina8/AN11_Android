public class Main {
    public static void main(String[] args) {
        IStart obj1 = new Cosmodrome();

       System.out.println("Запуск шатла...");
       IStart shuttle = new Shuttle();
               boolean examenatoin= obj1.EngineStarting(obj1);

        if(examenatoin==true){
           shuttle.Start();
        }else {System.out.println("Предстартовая проверка провалилась!");}

        System.out.println();
        System.out.println("Запуск ракеты...");
        IStart obj2 = new Cosmodrome();
        IStart superShip= new SuperShip();
        boolean exsamenation1=obj2.EngineStarting(obj2);

        if(exsamenation1==true){
            superShip.Start();
        }else {System.out.println("Предстартовая проверка провалилась!");}
    }
}
