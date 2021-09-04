package lesson_3;

public class Group {
    private static final int MAX_EMPLOYEE_COUNT = 10;
    private String groupName;
    private Worker[] workers;
    private int count = 0;

    public Group() {
        this.workers = new Worker[MAX_EMPLOYEE_COUNT];
    }

    public void addWorker(Worker... newWrk) {
        for (Worker wrk : newWrk) {
            for (int i = count; i < MAX_EMPLOYEE_COUNT; i++){
                if(wrk != null){

                }
            }
        }

    }
}
