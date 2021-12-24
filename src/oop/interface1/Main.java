package oop.interface1;

public class Main {
    public static void main(String[] args) {
        WashableAndPress shirt = new Shirt("майка", 2, "разрешена", "разрешено.");
        WashableAndPress blouse = new Blouse("блузка", 1,"разрешена","запрещено.");
        WashableAndPress sweater = new Sweater("свитер", 1, "разрешена", "запрещено.");
        WashableAndPress jeans = new Jeans ("джинсы", 2, "разрешена", "запрещено.");
        WashableAndPress coat = new Coat("пальто", 1,"разрешена","запрещено.");

        WashableAndPress [] mas = {shirt, blouse, sweater, jeans, coat};
        for (WashableAndPress object : mas) {
            object.wash();
        }
    }
}
