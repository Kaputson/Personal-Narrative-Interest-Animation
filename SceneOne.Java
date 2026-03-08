import org.code.theater.*;

public class SceneOne extends Scene {

  // both Private Variables
  private ImageFilter[][] images;
  private String[] captions;

  // contains captions and gets images from the TheaterRunner class
  public SceneOne(ImageFilter[][] images) {
    this.images = images;

    // Captions for each image in scene one
    captions = new String[] {
      "The Beatles",
      "Metallica",
      "Red Hot Chili Peppers",
      "System of a Down"
    };
  }

  public void drawScene() {
    showImages();
  }

  /*
  Contains main method,
  saturates images in scene one and plays music
  */
  private void showImages() {
 
    int imageSize = 250;

    for (int i = 0; i < images[0].length; i++) {
      ImageFilter img = images[0][i];

      clear("white");

      int centerX = getWidth() / 2 - imageSize / 2;
      int centerY = getHeight() / 2 - imageSize / 2 - 40;

      // Draw original
      drawImage(img, centerX, centerY, imageSize);

      setTextColor("black");
      setTextHeight(20);
      drawText(captions[i], 60, centerY + imageSize + 40);

      pause(2.0);

      // Apply saturate filter
      img.saturate(1);
      drawImage(img, centerX, centerY, imageSize);

      pause(2.0);
    }
  }
}

