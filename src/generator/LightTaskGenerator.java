package generator;

import entity.LightTask;
import entity.Task;
import entity.Type;
import utils.RandomStringSelector;

public class LightTaskGenerator {

    public Task spawnLightTask(int id) {

        String word = new RandomStringSelector().selectRandomString();

        Task task = new LightTask(word);
        task.setType(Type.LIGHT);
        task.setID(id);
        return task;
    }

}
