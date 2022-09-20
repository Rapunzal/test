package mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data="Hey Folks, we are discussing file outputstream";
		FileOutputStream obj=new FileOutputStream("/Users/rakesh/eclipse1-workspace/FileDemo/Test.txt");
		obj.write(data.getBytes());
		obj.close();
		System.out.println("Data written onto the file");
	}

}
