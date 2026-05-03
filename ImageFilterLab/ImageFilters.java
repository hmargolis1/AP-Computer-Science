import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

public class ImageFilters {
    public static void main(String[] args) {
        try {
            // Load an image file
            BufferedImage image = loadFile("images/landscape.jpg");

            // apply a filter
            invertColors(image);

            // Save the edited file to desired location
            saveFile("images/edited-landscape.jpg", image);
            
            // to-do: create 9 more filters using the invertColors as a starting point
            // note you might need to run the filters separately to avoid altering the image multiple times

            // to-do: save all changes as individual files using saveFile()


        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    // helper methods
    // This method searches the folder path to the target image and returns a BufferedImage object
    // using the data from the file
    public static BufferedImage loadFile(String pathToImage) throws IOException {
        // Load an image file
        File inputFile = new File(pathToImage);
        BufferedImage image = ImageIO.read(inputFile);
        return image;

    }

    // This method creates a new JPG file at the target save location, and copies the data from the
    // BufferedImage object to the file.
    public static void saveFile(String saveLocation, BufferedImage image) throws IOException {
        // Save the edited image
        File outputFile = new File(saveLocation);
        outputFile.createNewFile();
        ImageIO.write(image, "jpg", outputFile);
        System.out.println("Image color changed and saved successfully!");
    }

    // filter methods

    // invert colors
    public static void invertColors(BufferedImage image) {
        // grab the dimensions
        int width = image.getWidth();
        int height = image.getHeight();

        // loop across the height and width of the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

               // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // create a Color obj using the RGB values of the pixel as a starting point 
                Color color = new Color(pixel, true);

                // modify the RGB values of the color 
                // the code below inverts colors 
                color = new Color(255 - color.getRed(), 255 - color.getGreen(),
                        255 - color.getBlue());

                // update the pixel's color to the new color 
                // this code directly modifies the BufferedImage
                image.setRGB(x, y, color.getRGB());
            }
        }

    }
}
