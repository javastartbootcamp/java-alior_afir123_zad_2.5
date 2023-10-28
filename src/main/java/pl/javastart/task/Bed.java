package pl.javastart.task;

public class Bed {
    String color;
    int length;
    int width;

    Bed(String col, int len, int wid) {
        color = col;
        length =len;
        width = wid;
    }

    void printInfo() {
        System.out.println("Łóżko posiada kolor " + color + ", długość: " + length + "cm i szerokość: " + width + "cm");
    }
}
