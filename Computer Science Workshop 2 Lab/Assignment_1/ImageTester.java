class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "#000000";
    }

    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String toString() {
        return "Image[Width=" + imageWidth + ", Height=" + imageHeight + ", ColorCode=" + colorCode + "]";
    }
}

public class ImageTester {
    public static void main(String[] args) {
        Image defaultImage = new Image();
        Image customImage = new Image(1920, 1080, "#FF5733");

        System.out.println(defaultImage);
        System.out.println(customImage);
    }
}
