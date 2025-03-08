package files.demo;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FilesPractise {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\mtuta\\Downloads\\sql");
		
		//System.out.println(Arrays.toString(f.listFiles()));
		//System.out.println(f.createNewFile());
		//ystem.out.println(f.delete());
		//System.out.println(f.exists());
		//System.out.println(f.createNewFile());
		//System.out.println(f.canWrite());
		//f.setWritable(false);
		//System.out.println(f.canWrite());
		
		System.out.println(new Date(f.lastModified()));
	}	


}
