package classesAndObjects;

public class TrackObjets {

    static int count;

     public TrackObjets(){
         count++;
     }

     public void display(){
         System.out.println("Current count of Object: "+ count);
     }

    public static void main(String[] args) {
         TrackObjets tc1 = new TrackObjets();
         tc1.display();
         TrackObjets tc2 = new TrackObjets();
         tc2.display();
        TrackObjets tc3 = new TrackObjets();
        tc3.display();
    }
}
