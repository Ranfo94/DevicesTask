package factory;

import entity.LightTask;
import entity.Task;
import entity.Type;

public class LightTaskGenerator {

    public Task spawnLightTask(int id) {

        String word = "ciao";

        //TODO AUTOMATIC GENERATE WORD

        Task task = new LightTask(word);
        task.setType(Type.LIGHT);
        task.setID(id);
        return task;
    }

}
