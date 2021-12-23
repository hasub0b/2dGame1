package object;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_boots extends ParentObject{
    GamePanel gp;
    public OBJ_boots(GamePanel gp){

        this.gp = gp;

        name = "Boots";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/boots.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
