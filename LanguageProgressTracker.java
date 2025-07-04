class LanguageProgressTracker {
    public static void main(String[] args) {
        trackVocabulary(100, 30);
        trackVocabulary(200, 150);
        trackVocabulary(50, 25);
    }

    public static void trackVocabulary(int target, int learned) {
        int remaining = target - learned;
        System.out.println("Words Left: " + remaining);
    }
}