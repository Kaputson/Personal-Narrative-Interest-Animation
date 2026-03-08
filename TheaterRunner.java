import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    /*
     SceneOne images: Adds images of Bands 
    */
    ImageFilter[][] sceneOneImages = {
      { new ImageFilter("Beatles-img.jpg"), new ImageFilter("metallica.jpg"), new ImageFilter("rhcp.png"), new ImageFilter("soad.jpg")  }
    };

    // Instantiate the scenes
    SceneOne scene1 = new SceneOne(sceneOneImages);
    SceneTwo scene2 = new SceneTwo();

    // Draw scenes first (optional)
    scene1.drawScene();
    scene2.drawScene();

    // Play them in order
    Theater.playScenes(scene1, scene2);
  }
}
