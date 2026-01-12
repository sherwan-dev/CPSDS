/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CPSDS;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author Sherwan
 * 
 */


public class Similarity {
 
    BufferedImage img11 = null, img21 = null, img12 = null, img22 = null;
    int i, j, clr, red, green, blue, y, gray, k, h2, w2;
 
    // this function converts the image to an array of rgb 
    int[]  getMYRGB(BufferedImage bfimg) throws IOException {
        this.i= this.j=this.clr=this.red=this.green=this.blue=this. y=this.gray=this.k=this. h2=this.w2=0;
        int[] rgbs1 = new int[320*160];  
            img11 = bfimg;
            h2 = img11.getHeight();
            w2 = img11.getWidth();
            rgbs1 = new int[h2 * w2]; 

            for (i = 0; i < w2; i++) {
                for (j = 0; j < h2; j++) {
                    clr = img11.getRGB(i, j);
                    red = (clr & 0x00ff0000) >> 16;
                    green = (clr & 0x0000ff00) >> 8;
                    blue = clr & 0x000000ff;
                    
                    y = (int) ((0.3 * red) + (0.59 * green) + (0.11 * blue));
                    rgbs1[k] = y; 
                    k++;
                }
            } 
        return rgbs1; 
    }
    
    // returns the Simiularity between xx and yy, ()
    public double SSIM(int xx[], int yy[]){
        double s=320*160;
        double a[]=new double[320*160]; 
        double b[]=new double[320*160]; 
        for(int i=0;i<s;i++)
        {
            a[i]=(int)xx[i];
            b[i]=(int)yy[i];
        }
        double ux=0, uy=0, l=255, k1=0.01, k2=0.03, Qx=0, Qy=0, Qxy=0, c1=0, c2=0, ssim=0, Q=0;
        c1=Math.pow((k1*l),2);
        c2=Math.pow((k2*l),2);
        //double C1 = 6.5025, C2 = 58.5225; 
        for(int i=0;i<s;i++)
            {
                ux=ux+a[i];
                uy=uy+b[i];
            }

        ux=ux/s;
        uy=uy/s;

        for(int i=0;i<s;i++)
        {
            Qx=Qx+Math.pow((a[i]-ux),2);
            Qy=Qy+Math.pow((b[i]-uy),2);
        }
        
        Qx=Qx/(s-1);
        Qy=Qy/(s-1);
        Qx=Math.pow(Qx, 0.5);
        Qy=Math.pow(Qy, 0.5);
        
        for(int i=0;i<s;i++)
            {
                Qxy=Qxy+((a[i]-ux)*(b[i]-uy));
            } 
        
        Qxy=Qxy/(s-1);  
        ssim=(((2*ux*uy)+c1)*((2*Qxy)+c2))/((Math.pow(ux, 2)+Math.pow(uy, 2)+c1)*(Math.pow(Qx, 2)+Math.pow(Qy, 2)+c2));
        
        return ssim;
}
}
