package Valprograms;


public class PC {
    private Valprograms.Case theCase;
    private Monitor monitor;
    private Valprograms.Motherboard motherboard;

    public PC(Valprograms.Case theCase, Monitor monitor, Valprograms.Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Valprograms.Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Valprograms.Motherboard getMotherboard() {
        return motherboard;
    }
}
