// This program for create file 

package filehand;
import java.io.File;
public class FileExample 
{

	public static void main(String[] args) throws Exception
	
	{
		File myfile=new File("filehand.txt"); // In this you can give path where do you want to create the file
		
		if(myfile.createNewFile())
		{
			System.out.println("File Successfully Created...");
		}
		else
		{
			System.out.println("File Already Exists");
		}
		
	}

}
