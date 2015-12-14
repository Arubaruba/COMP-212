public class MyRadioDemo {
    public static void main(String args[]) {
        MyRadio myRadio = new MyRadio();

        System.out.println(MyRadio.getClassicFMFrequency());

        System.out.println(MyRadio.getBBC3Frequency());

        myRadio.listenToBRMB();

        myRadio.listenToBBC2();
        myRadio.listenToFrequency(92.7f);
        myRadio.listenToFrequency(94.5f);
    }
}
