import java.io.*;

public class Main
{
    public static void main(String[] args)  throws IOException
    {
        File file = new File();
        file.write(null , false);
        LengthWire lengthwire = new LengthWire();
        String[] construction = file.read();
        String[] job = new String[2];
        int j;
        String result;

        for (String my_construction:construction)
        {
            j=0;
            job[0]="";
            job[1]="";
            for (int i = 0; i < my_construction.length(); i++)
            {
                if (!Character.isWhitespace(my_construction.charAt(i)))
                {
                    job[j] += String.valueOf(my_construction.charAt(i));
                }
                else
                {
                    j+=1;
                    if(j>1)
                        break;
                }
            }
            lengthwire.setHome(Integer.parseInt(job[0]), Integer.parseInt(job[1]));
        }
        result = String.valueOf(lengthwire.calculate());
        System.out.println(result);
        file.write(result, false);
    }
}
