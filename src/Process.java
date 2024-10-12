public class Process {
    private String name;
    private int burstTime;
    private int remainingTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public Process(String name, int burstTime) {
        this.name = name;
        this.burstTime = burstTime;
        this.remainingTime = remainingTime;
    }

}
