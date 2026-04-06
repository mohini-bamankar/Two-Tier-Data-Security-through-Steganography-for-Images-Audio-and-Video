
package videosteganography;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class GeneticEncoding 
{
       public String isVideoEncoded(String videofilepath, String Textfilepath,String encodeFilename,String key)
    {
      String encfilename="";
        try{
        File videofile = new File(videofilepath); // D://Sample video files//Org 1.mp4
        String parentpath=videofile.getParent(); // D://Sample video files
        String tempname=videofile.getName();  //Org 1.mp4
        tempname=tempname.replace(".","#");  //Org 1#mp4
        String st[]=tempname.split("#"); // st[0]=Org 1 , st[1]=mp4
        String extension=st[1]; //mp4
        String encodedpath=parentpath+"//"+encodeFilename+"."+extension; //D://Sample video files//Abhishek.mp4
        File textfile = new File(Textfilepath);
        FileInputStream initial_population = new FileInputStream(videofilepath); //Initial population
        FileOutputStream fos = new FileOutputStream(encodedpath);
        byte abyte0[] = new byte[8];
        int i;
        int k;
        for(k = 0; (i = initial_population.read(abyte0, 0, 8)) > 0; k = i)
            fos.write(abyte0, 0, i);

        initial_population.close();
        int fitnessvalue=(int)Math.pow(2, 6)+1; //Fitness function.
        
        for(int l = 1; l <= 8 - k; l++)
            fos.write(fitnessvalue);

        fos.write("DATAFILE".getBytes(), 0, 8);
        System.out.println("File name==="+textfile.getName());
        String selectiondata=textfile.getName()+"@"+key; //Selection // abhishek.txt@1234
        StringBuffer stringbuffer = new StringBuffer(selectiondata);
        stringbuffer.setLength(50);
        fos.write(stringbuffer.toString().getBytes(), 0, 50);
        FileInputStream cross_overdata = new FileInputStream(Textfilepath); //Crossover.
        int j;
        
        // Mutation process
        while((j = cross_overdata.read(abyte0, 0, 8)) > 0) 
            fos.write(abyte0, 0, j);
        cross_overdata.close();
        fos.close();
       
         encfilename=encodedpath;
        }
        catch(Exception e)
        {
            e.printStackTrace();
           
        }
        return encfilename;
    }
}
