import hands.IHand;
import heads.IHead;
import legs.ILeg;

public class Robot implements IRobot{
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot(){}

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

   /**
     * Get the cost of a robot
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;

    }

     public void maxPrice(int a,int b, int c) {
         int[] arr = new int[3];
         arr[0] = a;
         arr[1] = b;
         arr[2] = c;
         int max = arr[0];
         int nom =0;
         for (int i = 0; i < 3; i++) {
             if (max < arr[i]) {
                 max = arr[i];
             }
         }
         for (int i = 1; i < 3; i++) {
             if (max == arr[i]) {
                 System.out.println("Самый дорогой компьютер № " + (i+1));
             }
         }
     }


}
