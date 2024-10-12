public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);
        scheduler.addProcess(new Process("Server 1", 10));
        System.out.println("111");
        scheduler.addProcess(new Process("Server 2", 5));
        System.out.println("222");

        scheduler.addProcess(new Process("Server 3", 8));
        System.out.println("333");

    }
}