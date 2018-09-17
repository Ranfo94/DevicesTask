package generator;

import entity.HeavyTask;
import entity.Task;
import entity.Type;

public class HeavyTaskGenerator {

    public Task spawnHeavyTask(int id) {

        Task task = new HeavyTask();
        task.setType(Type.HEAVY);
        task.setID(id);
        return task;
    }


}
