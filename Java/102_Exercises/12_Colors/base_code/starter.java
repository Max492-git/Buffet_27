/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
        
         
        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);
        


		getColor(red,green,blue);
        getColor(255-red,255-green,255-blue);
        getColor(blue,red,green);
        getColor(green,blue,red);

        int red2 = (int)(Math.random() * 129);
        int green2 = (int)(Math.random() * 129);
        int blue2 = (int)(Math.random() * 129);
        getColor(red2,blue2,green2);
        int red3 = (int)(Math.random() * 129 + 129);
        int green3 = (int)(Math.random() * 129 + 129);
        int blue3 = (int)(Math.random() * 129 + 129);
        getColor(red3,green3,blue3);


	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
        
    
    }
}
