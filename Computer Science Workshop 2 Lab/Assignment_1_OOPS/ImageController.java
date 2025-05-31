import java.util.ArrayList;
import java.util.List;

class ImageLibrary {
    private List<Image> images;

    public ImageLibrary() {
        this.images = new ArrayList<>();
    }

    public void insertImage(Image image) {
        images.add(image);
    }

    public Image getImage(int index) {
        if (index >= 0 && index < images.size()) {
            return images.get(index);
        }
        return null;
    }

    public Image searchImage(int width, int height, String colorCode) {
        for (Image image : images) {
            if (image.getImageWidth() == width && image.getImageHeight() == height && image.getColorCode().equals(colorCode)) {
                return image;
            }
        }
        return null;
    }
}

public class ImageController {
    public static void main(String[] args) {
        ImageLibrary library = new ImageLibrary();

        Image img1 = new Image(1920, 1080, "#FF5733");
        Image img2 = new Image(1280, 720, "#00FF00");
        Image img3 = new Image(800, 600, "#0000FF");

        library.insertImage(img1);
        library.insertImage(img2);
        library.insertImage(img3);

        System.out.println("Inserted Images:");
        System.out.println(library.getImage(0));
        System.out.println(library.getImage(1));
        System.out.println(library.getImage(2));

        Image searchResult = library.searchImage(1280, 720, "#00FF00");
        System.out.println("Search Result: " + (searchResult != null ? searchResult : "Not Found"));
    }
}
