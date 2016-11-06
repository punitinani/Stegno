/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stegno;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author p_unit
 */
public class finalize {

    public int height, width;

    public static void main(String[] args) throws IOException {

        File file = new File("a.PNG");

        System.out.println("File is " + file.exists());
        Image image;
        image = ImageIO.read(file);

        int h = image.getHeight(null);
        int w = image.getWidth(null);

        System.out.println(" h = " + h + " " + " w  =  " + w);

          BufferedImage data = ImageIO.read(file);

        BufferedImage data1 = null; 

        Color c;

        File hidden = new File("Hidden.png");

        FileOutputStream fos = new FileOutputStream(hidden);

        //  BufferedImage   hide  =ImageIO.read(file);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {

                c = new Color(data.getRGB(i, j));
//
                System.out.println("[" + i + " ] [ " + j + "]");

                System.out.println(" r " + c.getRed() + " b " + (char) c.getBlue() + " g" + c.getGreen());

                data1.setRGB(i, j, (c.getRed() + c.getBlue() + (int) 'a'));

                //System.out.println("inserted at " + "  i" + i + " j " + j + "   " + (char) getToChars[a]);
               ImageIO.write(data, "jpg", fos);
            }

        }
        fos.close();
        
        
      
         

    }

}
