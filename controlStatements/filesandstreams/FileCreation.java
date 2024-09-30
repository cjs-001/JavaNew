package filesandstreams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataInputStream ds = new DataInputStream(System.in);
		
		FileOutputStream fs = new FileOutputStream("myfile.txt");
		
		System.out.println("enter text @ at the end");
		
		char ch;
		
		//adding into the txt file
		
		while((ch=(char)ds.read())!='@')
		{
			fs.write(ch);
			
//			fs.close();
		}
		
		//reading from the txt file
		
		FileInputStream fi = new FileInputStream("myfile.txt");
		
		int i;
		
		while((i=fi.read())!=-1)
		{
			System.out.print((char)i);
		}
				
		
	}

}
