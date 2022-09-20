package mypackage;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileDemo04 {

	public static List<String> readFileIntoList(String fileName){
		List<String> lines=Collections.emptyList();
		try {
			lines=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lines;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=readFileIntoList("Mynewfile.txt");
		Iterator<String> it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
