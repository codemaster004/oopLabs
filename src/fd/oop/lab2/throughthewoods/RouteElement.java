package fd.oop.lab2.throughthewoods;

/**
 *
 * @author TB
 */
public interface RouteElement {
    Iterable<Participant> getParticipants();
    void addParticipant(Participant u);
    void removeParticipant(Participant u);
    int getParticipantsCountOnRoute();
}
