package mypackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileExample{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj=new File("/Users/rakesh/eclipse1-workspace");
		if(obj.createNewFile())
			System.out.println("File created");
		else {
			System.out.println("File already exist");
		}
		String []listoffile=obj.list();
		Arrays.sort(listoffile);
		for(String s:listoffile)
			System.out.println(s);
		/*FileWriter writer=new FileWriter(obj);
		writer.write("Test sgjgfhj bh");
		writer.append('r');
		writer.close();
		System.out.println("Data written to the file.");*/
	}

}
