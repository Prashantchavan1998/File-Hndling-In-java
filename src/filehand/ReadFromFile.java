//Read data from file

package filehand;
import java.io.*;
public class ReadFromFile 
{

	public static void main(String[] args)
	{
		try
		{
			FileReader r=new FileReader("filehand.txt");
			
			try
			{
				int i;
				while((i=r.read())!=-1)
				{
					System.out.print((char)i);
				}
			}
			finally
			{
				r.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
