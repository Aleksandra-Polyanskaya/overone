package oop.interface1;

public class Blouse implements WashableAndPress, DryCleaningAndBleach{

    String view;
    int tempPress;
    String dryCleaning;
    String bleach;

    public Blouse(String view, int tempPress, String dryCleaning, String bleach) {
        this.view = view;
        this.tempPress = tempPress;
        this.dryCleaning = dryCleaning;
        this.bleach = bleach;
    }

    @Override
    public String dryCleaning() {
        return "Это Химчистка разрешена";

    }

    @Override
    public void bleach() {

    }

    @Override
    public void wash() {
    }

    @Override
    public void press() {

    }
}
