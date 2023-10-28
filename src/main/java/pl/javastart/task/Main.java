package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Bed bed1 = new Bed();
        bed1.color = "zielony";
        bed1.length = 200;
        bed1.width = 140;
        bed1.printInfo();

        Bed bed2 = new Bed();
        bed2.color = "niebieski";
        bed2.length = 220;
        bed2.width = 160;
        bed2.printInfo();

    }
}