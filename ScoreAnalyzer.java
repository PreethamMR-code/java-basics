class ScoreAnalyzer {
    public static void main(String[] args) {
        calculateGrade(85);
        calculateGrade(65);
        calculateGrade(45);
    }

    public static void calculateGrade(int marks) {
        String grade = marks >= 75 ? "A" : (marks >= 50 ? "B" : "C");
        System.out.println("Grade: " + grade);
    }
}