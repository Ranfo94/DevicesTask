import entity.LightTask;
import entity.Task;
import factory.LightTaskGenerator;
import factory.TaskGenerator;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class SpawnTask {

    private static int MIN_RAND = 0;
    private static int MAX_RAND = 2;

    public static void main(String[] args) {

        int id=0;
        ArrayList<Task> taskList = new ArrayList<>();
        TaskGenerator taskGenerator = new TaskGenerator();

        System.out.println("Spawning Tasks...");

        for (int k=0;k<50;k++){

            int randNum = generateRandom();
            Task newTask = taskGenerator.generateTask(randNum,id);
            taskList.add(newTask);
            ++id;
        }

        printTaskList(taskList);

    }

    private static int generateRandom(){
        return ThreadLocalRandom.current().nextInt(MIN_RAND, MAX_RAND + 1);
    }

    private static void printTaskList(ArrayList<Task> list){

        for(int i=0;i<list.size();i++){
            System.out.println("Task n° "+list.get(i).getID() + ", type = "+ list.get(i).getType());
        }
    }
}
