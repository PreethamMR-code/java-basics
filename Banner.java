class Banner {
    static String bannerText;
    static String backgroundColor;
    static String fontStyle;
    static int widthInPixels;
    static int heightInPixels;
    static boolean isAnimated;

    public static boolean registerBanner(String text, String bgColor, String font, int width, int height, boolean animated) {
        boolean isBannerRegistered = false;

        boolean textOk = false;
        boolean colorOk = false;
        boolean fontOk = false;
        boolean widthOk = false;
        boolean heightOk = false;
        boolean animationOk = false;

        if (text != null && !text.isEmpty()) {
            bannerText = text;
            textOk = true;
        } else {
            System.out.println("Banner text can’t be empty.");
        }

        if (bgColor != null && !bgColor.isEmpty()) {
            backgroundColor = bgColor;
            colorOk = true;
        } else {
            System.out.println("Background color is required.");
        }

        if (font != null && !font.isEmpty()) {
            fontStyle = font;
            fontOk = true;
        } else {
            System.out.println("Please choose a font style.");
        }

        if (width > 0) {
            widthInPixels = width;
            widthOk = true;
        } else {
            System.out.println("Width must be greater than 0.");
        }

        if (height > 0) {
            heightInPixels = height;
            heightOk = true;
        } else {
            System.out.println("Height must be greater than 0.");
        }

        isAnimated = animated;
        animationOk = true;

        if (textOk && colorOk && fontOk && widthOk && heightOk && animationOk) {
            isBannerRegistered = true;
        } else {
            System.out.println("Banner registration failed.");
        }

        return isBannerRegistered;
    }

    public static void getBannerDetails() {
        System.out.println("Banner Text: " + bannerText);
        System.out.println("Background Color: " + backgroundColor);
        System.out.println("Font Style: " + fontStyle);
        System.out.println("Width: " + widthInPixels + "px");
        System.out.println("Height: " + heightInPixels + "px");
        System.out.println("Animated: " + isAnimated);
    }
}
