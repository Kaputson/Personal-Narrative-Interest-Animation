import org.code.theater.*;
import org.code.media.*;

public class ImagePlus extends Image {

  private Pixel[][] pixels;
// grabs images
  public ImagePlus(String filename) {
    super(filename);
    pixels = getPixelsFromImage();
  }
// returns pixels
  public Pixel[][] getImagePixels() {
    return pixels;
  }

  // grabs amount of pixels
  public Pixel[][] getPixelsFromImage() {
    Pixel[][] tempPixels = new Pixel[getHeight()][getWidth()];
    // for loop
    for (int row = 0; row < tempPixels.length; row++) {
      for (int col = 0; col < tempPixels[0].length; col++) {
        tempPixels[row][col] = getPixel(col, row);
      }
    }
// returns pixels
    return tempPixels;
  }
}
