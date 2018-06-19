import java.io.*;
public class CopyContents {

	public static void main(String[] args) {
		try 
		{
			File abc = new File("C:\\Users\\hp\\eclipse-workspace\\Assignment10\\src\\abc.txt");
			File xyz = new File("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\Assignment10\\\\src\\\\xyz.txt");
			FileInputStream fin = new FileInputStream(abc);
			FileOutputStream fout = new FileOutputStream(xyz);
			FileInputStream fnew = new FileInputStream(xyz);
			int i;
			while((i = fin.read()) != -1)
			{
				fout.write(i);
			}
			while((i = fnew.read())!= -1)
			{
				System.out.print((char)i);
			}
			fin.close();
			fout.close();
			fnew.close();
		}
		catch (Exception e) {
			System.out.println("Error occured in copying: " + e.getMessage());
		}
		

	}

}
