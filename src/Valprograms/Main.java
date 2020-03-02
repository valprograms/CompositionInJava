package Valprograms;

public class Main {

    public static void main(String[] args) {
        Valprograms.Dimensions dimensions = new Valprograms.Dimensions(20, 20, 5);
        Valprograms.Case theCase = new Valprograms.Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Valprograms.Resolution(2540, 1440));

        Valprograms.Motherboard theMotherboard = new Valprograms.Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        Valprograms.PC thePC = new Valprograms.PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
