package main;

import object.OBJ_key;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

public class UI {

    GamePanel gp;
    Graphics2D g2;
    Font aerial_40, aerial_80B;
    // BufferedImage keyImage;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    int gameStartCounter = 0;
    public boolean gameFinished = false;

    double playTime;
    DecimalFormat dFormat = new DecimalFormat("0.00");

    public UI(GamePanel gp){
        this.gp = gp;
        aerial_40 = new Font("Aerial", Font.PLAIN,40);
        aerial_80B = new Font("Aerial", Font.BOLD,80);
        //OBJ_key key = new OBJ_key(gp);
        //keyImage = key.image;
    }
    public void showMessage(String text){

        message = text;
        messageOn = true;
    }

    public void draw(Graphics2D g2){

        this.g2 = g2;
        g2.setFont(aerial_40);
        g2.setColor(Color.white);

        if(gp.gameState == gp.playState){
            // TODO playstate stuff
        }
        if(gp.gameState == gp.pauseState){
            drawPauseScreen();
        }


        /*
        // message
        if(gameStartCounter < 250){

            //resize font
            g2.setFont(g2.getFont().deriveFont(30F));
            g2.setColor(Color.YELLOW);

            g2.drawString("Etsi aarre!", 25, gp.tileSize*5);
            gameStartCounter++;

            }


        if(gameFinished == true){

            g2.setFont(aerial_40);
            g2.setColor(Color.white);

            String text;
            int textLenght;
            int x;
            int y;

            text = "Löysit aarteen!!";
            textLenght = (int)g2.getFontMetrics().getStringBounds(text,g2).getWidth();
            x = gp.screenWidth/2 - textLenght/2;
            y = gp.screenHeight/2 -(gp.tileSize*3);
            g2.drawString(text,x,y);

            text = "Aikasi oli :"+dFormat.format(playTime);
            textLenght = (int)g2.getFontMetrics().getStringBounds(text,g2).getWidth();
            x = gp.screenWidth/2 - textLenght/2;
            y = gp.screenHeight/2 + (gp.tileSize*4);
            g2.drawString(text,x,y);

            g2.setFont(aerial_80B);
            g2.setColor(Color.orange);
            text = "Onneksi olkoon!";
            textLenght = (int)g2.getFontMetrics().getStringBounds(text,g2).getWidth();
            x = gp.screenWidth/2 - textLenght/2;
            y = gp.screenHeight/2 +(gp.tileSize*2);
            g2.drawString(text,x,y);

            gp.gameThread = null;
        } else {
            // g2.setFont(new Font("Aerial", Font.PLAIN, 40));
            g2.setFont(aerial_40);
            g2.setColor(Color.white);
            g2.drawImage(keyImage,gp.tileSize/2,gp.tileSize/2,gp.tileSize, gp.tileSize,null);
            g2.drawString("x "+gp.player.hasKey,74 ,65);


            // timer
            playTime +=(double)1/60;
            g2.drawString("Aika: "+dFormat.format(playTime), gp.tileSize*11,65);

            // message
            if(messageOn == true){

                //resize font
                g2.setFont(g2.getFont().deriveFont(30F));

                g2.drawString(message, 25, gp.tileSize*5);
                messageCounter++;

                if(messageCounter > 120){
                    messageCounter = 0;
                    messageOn = false;
                }
            }
        }*/



    }
    public void drawPauseScreen(){

        g2.setFont(g2.getFont().deriveFont(Font.PLAIN,80F));
        String text = "PAUSED";
        int x = getXforCenteredText(text);
        int y = gp.screenHeight/2;

        g2.drawString(text,x,y);
    }
    public int getXforCenteredText(String text){
        int lenght = (int)g2.getFontMetrics().getStringBounds(text,g2).getWidth();
        int x = gp.screenWidth/2 - lenght/2;
        return x;
    }
}
