class TaskCompletionEstimator {
    public static void main(String[] args) {
        estimateTime(5, 2);
        estimateTime(8, 3);
        estimateTime(10, 4);
    }

    public static void estimateTime(int tasks, int hoursPerTask) {
        int totalTime = tasks * hoursPerTask;
        System.out.println("Estimated Completion Time: " + totalTime + " hours");
    }
}
