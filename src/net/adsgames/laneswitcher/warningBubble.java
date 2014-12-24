package net.adsgames.laneswitcher;

import java.awt.*;

public class warningBubble{
   private int x;
   private int y;
   private Image picture;
   private StopWatch timer = new StopWatch();
   
   public warningBubble(int newX, int newY, Image newImage) {
      x = newX;
      y = newY;
      picture = newImage;
   }
   
   public Image getImage(){
     return picture;
   }
   
   public int getX(){
     return x;
   }
   
   public int getY(){
     return y;
   }
   
   public void setX(int newX){
     x = newX;
   }
   
   public void setY(int newY){
     y = newY;
   }
   
   public void setImage(Image newImage){
     picture = newImage;
   }
   
   public StopWatch getTimer(){
     return timer;
   }
}