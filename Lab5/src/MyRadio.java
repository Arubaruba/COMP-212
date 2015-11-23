public class MyRadio {
    private Radio radio;

    public MyRadio() {
        radio = new Radio();
    }

    public static float getClassicFMFrequency() {
        return Radio.CLASSIC_FM;
    }

    public static float getBBC3Frequency() {
        return Radio.frequencyOfBBC(3);
    }

    public void listenToBRMB() {
        radio.setFrequency(Radio.BRMB);
        radio.listen();
    }

    public void listenToBBC2() {
        radio.setFrequency(Radio.frequencyOfBBC(2));
        radio.listen();
    }

    public void listenToFrequency(float frequency) {
        radio.setFrequency(frequency);
        radio.listen();
    }
}
