package fd.oop.lab2.throughthewoods.humans;

import fd.oop.lab2.throughthewoods.Human;
import fd.oop.lab2.throughthewoods.TerrainType;

/**
 *
 * @author TB
 */
public class SwampRunner extends Human{

    public SwampRunner(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }
    
    @Override
    public void introduceYourself() {
        say("Hi! I am "+getFirstName()+" "+getLastName()+". My favorite plant is swamp moss.");
    }

    @Override
    public double movementSpeed(TerrainType terrainType) {
        if(TerrainType.SWAMP.equals(terrainType))
        {
            say("Generally it is going quite well. Only I need to put feet on this drier and tougher moss.");
            return mudeAndPersonalDeterminants.nextDouble()*0.2 + 0.2; //From 0.2 to 0.4
        }
        else
            return Math.min(1.0, super.movementSpeed(terrainType) * 1.1);
    }
    
    
    
}
