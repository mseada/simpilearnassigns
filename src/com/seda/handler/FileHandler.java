package com.seda.handler;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

//import org.apache.commons.io.FileUtils;

import com.seada.dao.LockedmeDAO;
import com.seada.exceptions.BusinessException;
import com.seada.model.FileObj;

public class FileHandler implements LockedmeDAO {

	public String initialiseFiles() throws BusinessException {

		System.out.println("Fetching Root Directory . . .");
		String userDirPath = System.getProperty("user.dir") + "\\bin";
		File maindir = new File(userDirPath);
		maindir.mkdir();

		return userDirPath;

	}

	@Override
	public List<FileObj> listallFiles(String filepath) throws BusinessException {
//		String userDirPath = initialiseFiles();
		File dir = new File(filepath);

		File arr[] = dir.listFiles();

		List<FileObj> fileList = new LinkedList<>();

		if (arr.length > 0) {
			for (File e : arr) {
				String fileName = e.getName();

				String filePath = e.getPath();
				String fileType = "Folder";
				long fileSize;

				if (e.getName().contains(".")) {
					fileType = fileName.substring(fileName.lastIndexOf("."));
					fileName = fileName.substring(0, fileName.lastIndexOf("."));
					System.out.println(fileName + "\n");
					fileSize = e.length();

				} else {
					long size = e.length();
					fileSize = size;

				}
				FileObj file = new FileObj(fileName, filePath, fileType, fileSize);
				fileList.add(file);
			}
		} else {
			throw new BusinessException("Root Directory is empty. Root Directory: ");
		}

		return fileList;
	}

	@Override
	public FileObj deleteFile(String fileName) throws BusinessException {
		
		FileObj fileDel = new FileObj(fileName) ; 
		//util.fil
		return fileDel ; 
		
	}

	@Override
	public String addFile(FileObj newfile) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FileObj> searchFile(String fileName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileObj addFile(String fileName) throws BusinessException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

}

//	private String filename ;
//	private String directory ; 
//	
//	public String getFilename() {
//		return filename;
//	}
//	public void setFilename(String filename) {
//		this.filename = filename;
//	}
//	public String getDirectory() {
//		return directory;
//	}
//	public void setDirectory(String directory) {
//		this.directory = directory;
//	}
//	
//	public String listfiles (String Direcorty) {
//		
//		File dir = new File(Direcorty) ;
//		
//		String [] files = dir.list()  ;
//		
//		if (files == null)
//		{
//			System.out.print("directory is empty or not found");
//			
//		}
//		else {
//			
//			for (int i =0 ; i < files.length ;  i++  ) 
//			{
//				String filename = files[i] ; 
//				System.out.print(filename+"\n");
//			}
//		}
//		///
//		
//		///
//		System.out.println(Direcorty);
//		 
//		return Direcorty ; 
//		
//	}
//	
//public String deletefile (String filename) {
//	
//
//		String status ="Success"  ;  
//		return status ;	
//	}
//
//public String addfile (String filename) {
//	
//	///
//	String status ="Success"  ;  
//	return status ;
//		
//}
