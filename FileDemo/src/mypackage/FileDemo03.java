package mypackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileDemo03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data="data releated to file nio";
		Files.write(Paths.get("/Users/rakesh/eclipse1-workspace/fix.txt"),data.getBytes());
		List<String> lines=Arrays.asList("This is line1","This is line2");
		Files.write(Paths.get("Mynewfile1.txt"), lines, StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("data written to file");
	}

}
