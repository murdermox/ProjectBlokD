package projectblokd;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader {

    BufferedImage wall = null;

    public Image setWallImage() throws IOException {
        try {
            wall = ImageIO.read(new File("src\\resources\\images\\brickwall.png"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return wall;
    }
}
