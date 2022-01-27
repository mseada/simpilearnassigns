package implemts;

import java.io.File;

public class FileHandler  {

	private String filename ;
	private String directory ; 
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	
	public String listfiles (String Direcorty) {
		
		File dir = new File(Direcorty) ;
		
		String [] files = dir.list()  ;
		
		if (files == null)
		{
			System.out.print("directory is empty or not found");
			
		}
		else {
			
			for (int i =0 ; i < files.length ;  i++  ) 
			{
				String filename = files[i] ; 
				System.out.print(filename+"\n");
			}
		}
		///
		
		///
		System.out.println(Direcorty);
		 
		return Direcorty ; 
		
	}
	
public String deletefile (String filename) {
	

		String status ="Success"  ;  
		return status ;	
	}

public String addfile (String filename) {
	
	///
	String status ="Success"  ;  
	return status ;
		
}
}
