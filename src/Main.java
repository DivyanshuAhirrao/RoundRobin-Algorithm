public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);
        scheduler.addProcess(new Process("Server 1", 10));
        scheduler.addProcess(new Process("Server 2", 5));
        scheduler.addProcess(new Process("Server 3", 8));
    }
}