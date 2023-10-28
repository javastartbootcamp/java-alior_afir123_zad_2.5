package pl.javastart.task;

public class Bed {
    String color;
    int length;
    int width;

    // nie wiedziałem czy zapis w zadaniu "Klasa powinna posiadać konstruktor domyślny" oznacza,
    // iż pownienem go zapisać, mimo iż jest on konstruowany domyślnie. równie dobrze poniższego konstruktora mogłoby nie być.
    Bed() {
    }

    void printInfo() {
        System.out.println("Łóżko posiada kolor " + color + ", długość: " + length + "cm i szerokość: " + width + "cm");
    }
}
