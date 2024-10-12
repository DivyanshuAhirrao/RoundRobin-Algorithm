import java.util.LinkedList;
import java.util.Queue;

public class RoundRobinScheduler {
    private Queue<Process> processQueue;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.processQueue = new LinkedList<>();
        this.timeQuantum  = timeQuantum;
    }
    public void addProcess(Process process) {
        processQueue.add(process);
    }

    public void execute() {
        while (!processQueue.isEmpty()) {
            Process currentProcess = processQueue.poll();
            if (currentProcess.getRemainingTime() > 0) {
                System.out.println("Executing "+currentProcess.getName());
                int executionTime = Math.min(currentProcess.getRemainingTime(), timeQuantum);
                currentProcess.setRemainingTime(currentProcess.getRemainingTime()-executionTime);
                System.out.println(currentProcess.getName() + " executed for " + executionTime + " units.");
                System.out.println(currentProcess.getName() + " remaining time: " + currentProcess.getRemainingTime());

                // If the process still has remaining time, re-add it to the queue
                if (currentProcess.getRemainingTime() > 0) {
                    processQueue.add(currentProcess);
                } else {
                    System.out.println(currentProcess.getName() + " has finished executing.\n");
                }
            }
        }
    }

}
