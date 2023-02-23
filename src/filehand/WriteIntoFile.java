package filehand;
import java.io.*;
public class WriteIntoFile 
{

	public static void main(String[] args) 
	{
		try 
		{
			FileWriter f=new FileWriter("filehand.txt");
			try
			{
				f.write("Hello This is File Handling Program \n I hope you will Understood...!");
			}
			finally
			{
				f.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
