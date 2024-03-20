package fd.oop.lab2.throughthewoods;

import java.util.HashSet;
import java.util.Set;

public class TerrainTask implements RouteElement {
    private final TaskField task;

    private final Set<Participant> participantsInTask = new HashSet<>();

    public TerrainTask(TaskField task) {
        this.task = task;
    }

    public TaskField getTask() {
        return task;
    }

    @Override
    public Iterable<Participant> getParticipants() {
        return participantsInTask;
    }

    @Override
    public void addParticipant(Participant u) {
        participantsInTask.add(u);
    }

    @Override
    public void removeParticipant(Participant u) {
        participantsInTask.remove(u);
    }

    @Override
    public int getParticipantsCountOnRoute() {
        return participantsInTask.size();
    }
}
