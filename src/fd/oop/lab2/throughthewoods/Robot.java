package fd.oop.lab2.throughthewoods;

import java.io.PrintStream;
import java.util.Random;

/**
 *
 * @author TB
 */
public abstract class Robot implements Participant {

    private final String model;
    private final int serialNumber;
    protected final Random randomFactors = new Random();
    
    private PrintStream communicationMedium;
    

    public Robot(String model, int numerSeryjny) {
        this.model = model;
        this.serialNumber = numerSeryjny;
    }
    
    
    @Override
    public void sayTo(PrintStream ps) {
        communicationMedium = ps;
    }
    
    
    public final String identify()
    {
        return model+" no. "+serialNumber;
    }
    
    protected void communicate(String communicates)
    {
        communicationMedium.print(identify()+" communicates: ");
        communicationMedium.println(communicates);
    }

    @Override
    public String toString() {
        return identify();
    }
    
    
}
