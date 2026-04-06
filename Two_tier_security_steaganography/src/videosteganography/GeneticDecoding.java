
package videosteganography;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class GeneticDecoding 
{
    public String isVideoDecoded(String encodedFilePath,String userkey)
    {

        String demfile = "";
        try
        {
            File file = new File(encodedFilePath); // To read the file in File Object
            String outpath=file.getParent(); // Got the Root Directory
            File f=new File(outpath+"\\decode");
        if(!f.exists())
        {
            f.mkdirs();
        }
        String newpath=f.getPath();
            System.out.println("new path: "+newpath);
            FileInputStream mutationstream = new FileInputStream(encodedFilePath); // Read the file in bytes with the name mutationstream
            char c = '\b';
            byte abyte0[] = new byte[c]; // Created an array abyte0 with size of 2
            String s1 = "";
            int i;
            while((i = mutationstream.read(abyte0, 0, c)) > 0) 
            {
                s1 = new String(abyte0);
                if(s1.equals("DATAFILE"))
                    break;
            }
            if(!s1.equals("DATAFILE"))
            {
              
                mutationstream.close();
                return demfile;
            }
            abyte0 = new byte[50];
            mutationstream.read(abyte0, 0, 50);
            s1 = new String(abyte0);
            String s2 = s1.trim(); //abhishek.txt@1234 
            String st[]=s2.split("@");
            String filename=st[0]; //abhishek.txt
            String key=st[1]; //1234
                    
           // String fpath = s2.substring(0, s2.lastIndexOf(".") + 1) + "enc";
            System.out.println("Key is "+key);
            if(key.equals(userkey))
            {
                  String finalpath=newpath+"\\"+filename;
            System.out.println("fpath------"+finalpath);
            FileOutputStream fileoutputstream = new FileOutputStream(finalpath);
            c = '\u5000'; // UNiCODE character for fitness ASCII // UNI Code
            abyte0 = new byte[c];
            while((i = mutationstream.read(abyte0, 0, c)) > 0) 
                fileoutputstream.write(abyte0, 0, i);
            mutationstream.close();
            fileoutputstream.close();
            demfile=finalpath;
            }
         
        }
        catch(Exception exception)
        {
            demfile="";
            exception.printStackTrace();
            System.out.println(exception);
        }
        return demfile;
    }
}
