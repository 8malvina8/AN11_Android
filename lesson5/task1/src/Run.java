import hands.IHand;
import hands.SamsungHand;
import hands.SonyHand;
import hands.ToshibaHand;
import heads.IHead;
import heads.SamsungHead;
import heads.SonyHead;
import heads.ToshibaHead;
import legs.ILeg;
import legs.SamsungLeg;
import legs.SonyLeg;
import legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {

        IHand hand1 = new SonyHand(1000);
        IHand hand2 = new SamsungHand(1500);
        IHand hand3 = new ToshibaHand(1300);

        IHead head1 = new SonyHead(2000);
        IHead head2 = new SamsungHead(1);
        IHead head3 =new ToshibaHead(1800);

        ILeg leg1 = new SonyLeg(1500);
        ILeg leg2 = new SamsungLeg(1400);
        ILeg leg3 = new ToshibaLeg(1500);

        Robot rob1 = new Robot(head1, hand1,leg2);
        Robot rob2 = new Robot(head3,hand2,leg1);
        Robot rob3 = new Robot(head1,hand3,leg3);

        int[] arr = new int[3];
        rob1.action();
        arr[0]=rob1.getPrice();
        System.out.println(arr[0]);


        System.out.println();
        rob2.action();
       arr[1] = rob2.getPrice();
        System.out.println(arr[1]);

        System.out.println();
        rob3.action();
        arr[2]= rob3.getPrice();
        System.out.println(arr[2]);

        Robot robot = new Robot();
        robot.maxPrice(arr[0], arr[1], arr[2]);


    }
}

