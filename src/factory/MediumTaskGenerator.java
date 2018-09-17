package factory;

import entity.MediumTask;
import entity.Task;
import entity.Type;

public class MediumTaskGenerator {



    public Task spawnMediumTask(int id) {
        Task task = new MediumTask();
        task.setType(Type.MEDIUM);
        task.setID(id);
        return task;
    }

}
