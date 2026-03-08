import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  public ImageFilter(String fileName) {
    super(fileName);
  }
// main method for scene one saturates images by multiplying by a multiplier
  public void saturate(int factor) {

    Pixel[][] pixels = getPixelsFromImage();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {

        Pixel currentPixel = pixels[row][col];

        int red = currentPixel.getRed();
        int green = currentPixel.getGreen();
        int blue = currentPixel.getBlue();

        int average = (red + green + blue) / 3;

        int adjustedGrayscale = average + (average - 255) * factor;

        int newRed = 2 * adjustedGrayscale - red;
        int newGreen = 2 * adjustedGrayscale - green;
        int newBlue = 2 * adjustedGrayscale - blue;

        if (newRed > 255) newRed = 255;
        if (newGreen > 255) newGreen = 255;
        if (newBlue > 255) newBlue = 255;

        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
      }
    }
  }
// makes the numbers in color as low as it can go
 public void makeNegative() {

  Pixel[][] pixels = getPixelsFromImage();

  for (int row = 0; row < pixels.length; row++) {
    for (int col = 0; col < pixels[0].length; col++) {

      Pixel currentPixel = pixels[row][col];

      int newRed = 255 - currentPixel.getRed();
      int newGreen = 255 - currentPixel.getGreen();
      int newBlue = 255 - currentPixel.getBlue();

      currentPixel.setRed(newRed);
      currentPixel.setGreen(newGreen);
      currentPixel.setBlue(newBlue);
    }
  }
}

  
}
