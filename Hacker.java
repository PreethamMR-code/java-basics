class Hacker {
    static String hackerName;
    static String alias;
    static String skillLevel; 
    static String favoriteLanguage;
    static boolean isEthical;
    static int yearsOfExperience;

    public static boolean registerHacker(String name, String codeName, String level, String language, boolean ethical, int experience) {
        boolean isHackerRegistered = false;

        boolean nameOk = false;
        boolean aliasOk = false;
        boolean levelOk = false;
        boolean langOk = false;
        boolean ethicalOk = false;
        boolean expOk = false;

        if (name != null && !name.isEmpty()) {
            hackerName = name;
            nameOk = true;
        } else {
            System.out.println("Hacker name is required.");
        }

        if (codeName != null && !codeName.isEmpty()) {
            alias = codeName;
            aliasOk = true;
        } else {
            System.out.println("Alias is missing.");
        }

        if (level != null && !level.isEmpty()) {
            skillLevel = level;
            levelOk = true;
        } else {
            System.out.println("Skill level is missing.");
        }

        if (language != null && !language.isEmpty()) {
            favoriteLanguage = language;
            langOk = true;
        } else {
            System.out.println("Favorite language is required.");
        }

        isEthical = ethical;
        ethicalOk = true;

        if (experience >= 0) {
            yearsOfExperience = experience;
            expOk = true;
        } else {
            System.out.println("Experience must be 0 or more.");
        }

        if (nameOk && aliasOk && levelOk && langOk && ethicalOk && expOk) {
            isHackerRegistered = true;
        } else {
            System.out.println("Hacker registration failed.");
        }

        return isHackerRegistered;
    }

    public static void getHackerDetails() {
        System.out.println("Hacker Name: " + hackerName);
        System.out.println("Alias: " + alias);
        System.out.println("Skill Level: " + skillLevel);
        System.out.println("Favorite Language: " + favoriteLanguage);
        System.out.println("Is Ethical Hacker: " + isEthical);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
}
