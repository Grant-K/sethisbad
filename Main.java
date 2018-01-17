
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import gpdraw.*;
public class Main
{
   public static void main(String[] args)
   {
       SketchPad paper = new SketchPad(1920, 1080);
       DrawingTool pen;
       pen = new DrawingTool(paper);
       for(int i = 0; i < 1000; i++)
       {
           pen.up();
           pen.move(1920,1080);
           pen.down();
           pen.move(Math.random()*910, Math.random()*540);
       }
   }
}
