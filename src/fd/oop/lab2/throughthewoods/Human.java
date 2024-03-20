package fd.oop.lab2.throughthewoods;

import java.io.PrintStream;
import java.util.Random;

/**
 * @author TB
 */
public abstract class Human implements Participant {

    /**
     * Gender
     */
    public enum Gender {
        /**
         * Woman
         */
        WOMAN,

        /**
         * Man
         */
        MAN;
    }

    private final String firstName;
    private final String lastName;
    private final Gender gender;

    protected final Random mudeAndPersonalDeterminants = new Random();

    private PrintStream communicationMedium = null;

    public Human(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    /**
     * Introduce yourself
     */
    public abstract void introduceYourself();

    @Override
    public void sayTo(PrintStream ps) {
        communicationMedium = ps;
    }

    protected void say(String content) {
        communicationMedium.print(firstName + " " + lastName + " says: ");
        communicationMedium.println(content);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public double movementSpeed(TerrainType terrainType) {
        switch (terrainType) {
            case ROAD:
                say("I'm going along a way.");
                return mudeAndPersonalDeterminants.nextDouble() * 0.2 + 0.8; //From 0.8 to 1.0
            case PATH:
                say("What a pretty path in the forest.");
                return mudeAndPersonalDeterminants.nextDouble() * 0.2 + 0.6; //From 0.6 to 0.8
            case HIGH_FORREST:
                say("I'm going across the forest. Maybe I will find mushrooms?");
                return mudeAndPersonalDeterminants.nextDouble() * 0.2 + 0.4; //From 0.4 to 0.6
            case LOW_FOREST:
                say("There is a lot of branches. It is hard way.");
                return mudeAndPersonalDeterminants.nextDouble() * 0.2 + 0.2; //From 0.2 to 0.4
            case SWAMP:
            default:
                say("OMG! Where I am?");
                return mudeAndPersonalDeterminants.nextDouble() * 0.2; //From 0 to 0.2
        }
    }

    @Override
    public boolean solveTask(TaskField terrainTask) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber <= 10;
    }
}
