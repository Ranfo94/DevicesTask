package generator;

import entity.MediumTask;
import entity.Task;
import entity.Type;
import utils.RandomNumberGenerator;

public class MediumTaskGenerator {



    public Task spawnMediumTask(int id) {
        Task task = new MediumTask();
        int randNum = new RandomNumberGenerator().Generate5Digits();
        ((MediumTask) task).setNumber(randNum);
        task.setType(Type.MEDIUM);
        task.setID(id);
        return task;
    }

}
