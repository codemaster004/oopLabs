package fd.oop.lab2.throughthewoods;

import java.io.PrintStream;

/**
 *
 * @author TB
 */
class Commentator {
    private final PrintStream microphone;

    public Commentator(PrintStream microphone) {
        this.microphone = microphone;
    }
    
    
    private void say(String content)
    {
        microphone.print("COMMENTATOR: ");
        microphone.println(content);
    }
    
    public void inaugurateTheRun(String name, Iterable<Participant> particpants)
    {
        say("Welcome ladies and gentlemen to forest run \""+name+"\"");
        say("Now I will introduce participants.");
        
        introduceParticipants(particpants);
    }

    private void introduceParticipants(Iterable<Participant> participants) {
        boolean first = true;
        
        for(Participant u : participants)
        {
            StringBuilder buff = new StringBuilder();
            if(first)
                buff.append("This is first participant. ");
            else
                buff.append("And this is next participant. ");
            
            
            if(u instanceof Human)
            {
                Human human = (Human) u;
                buff.append("Could you say few words to microphone.");
                
                say(buff.toString());
                human.sayTo(microphone);
                human.introduceYourself();
            }
            else if(u instanceof Robot)
            {
                Robot robot = (Robot) u;
                buff.append("This robot ").append(robot.identify()).append(".");
                say(buff.toString());
            }
            else
            {
                buff.append("Hmmm ... strange.");
                say(buff.toString());
            }
            
            first = false;
        }
    }
    
    public void announceStart(int participantsCount, int routeLenght)
    {
        say("They started!!!");
        say("There is "+participantsCount+" participants, and route is "+routeLenght+" long.");
        say("How will they handle this route? This is the question!");
    }
    
    void announceNewTurn(int turnCounter) {
        say("We have now turn no.: "+turnCounter);
    }
    
    public void report(int elementNumber, Participant p, TerrainType tt)
    {
        say("Participant "+p+" is going through "+tt+". Element no. "+elementNumber+" in route.");
    }

    public void report(int elementNumber, Participant p, TaskField tt)
    {
        say("Participant "+p+" is stuck on task "+tt+". Element no. "+elementNumber+" in route.");
    }
    
}
