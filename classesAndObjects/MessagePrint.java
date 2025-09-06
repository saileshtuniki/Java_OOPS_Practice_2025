package classesAndObjects;

public class MessagePrint {
    public void printMessage(String name){
        System.out.println("Hello" + name);
    }


    public static void main(String[] args) {
        MessagePrint m1 = new MessagePrint();

        m1.printMessage("Sailesh");
    }
}

