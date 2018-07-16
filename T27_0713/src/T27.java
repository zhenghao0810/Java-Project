import java.io.BufferedReader;
import java.io.FileReader;

public class T27 {
	
	public static void main(String[] args)throws Exception {	
		FileReader fReader = new FileReader("d://111.xlsx");
		BufferedReader bReader = new BufferedReader(fReader);
		String str = null;
		while((str = bReader.readLine())!=null) {
			System.out.println(str.split(",")[1]);
			
		}
		bReader.close();
		fReader.close();
		
		
	
	}
}