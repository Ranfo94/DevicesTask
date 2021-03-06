import entity.Task;
import generator.TaskGenerator;
import utils.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class SpawnTask {

    private static int MIN_RAND = 0;
    private static int MAX_RAND = 2;

    public static void main(String[] args) throws InterruptedException {

        int id=0;
        ArrayList<Task> taskList = new ArrayList<>();
        TaskGenerator taskGenerator = new TaskGenerator();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        System.out.println("Spawning Tasks...");

        while (true){
            int randNum = randomNumberGenerator.generateRandom(MIN_RAND,MAX_RAND);
            Task newTask = taskGenerator.generateTask(randNum,id);
            taskList.add(newTask);
            ++id;
            System.out.println("Task n° "+newTask.getID() + ", type = "+ newTask.getType());
            Thread.sleep(randomNumberGenerator.generateRandom(1000,5000));
        }

    }

    private static void printTaskList(ArrayList<Task> list){
        for(int i=0;i<list.size();i++){
            System.out.println("Task n° "+list.get(i).getID() + ", type = "+ list.get(i).getType());
        }
    }

}
