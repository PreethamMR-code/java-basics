class StudyPlanner {
    public static void main(String[] args) {
        allocateStudyHours(5, 3);
        allocateStudyHours(6, 2);
        allocateStudyHours(4, 4);
    }

    public static void allocateStudyHours(int available, int used) {
        int remaining = available - used;
        System.out.println("Hours Remaining: " + remaining);
    }
}