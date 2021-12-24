package oop.interface1;

public class Shirt implements WashableAndPress, DryCleaningAndBleach{

    String view;
    int tempPress;
    String dryCleaning;
    String bleach;

    public Shirt(String view, int tempPress, String dryCleaning, String bleach) {
        this.view = view;
        this.tempPress = tempPress;
        this.dryCleaning = dryCleaning;
        this.bleach = bleach;
    }

    @Override
    public String toString() {
        return "Это " + view + ". Режим глажки " + tempPress + ". Химчистка " + dryCleaning + ". Отбеливание " + bleach;
    }

    @Override
    public void wash() {
        System.out.println(toString());
    }

    @Override
    public void press() {

    }


    @Override
    public String dryCleaning() {

        return null;
    }

    @Override
    public void bleach() {

    }
}
