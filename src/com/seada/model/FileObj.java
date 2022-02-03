/**
 * 
 */
package com.seada.model;

/**
 * @author mseada
 *
 */
public class FileObj {

	private String fileName;
	private String filePath;
	private long fileSize;
	private String fileType;
	
	
	public FileObj(String fileName, String filePath, String fileType, long fileSize) {
		super();
		this.fileName = fileName;
		this.filePath = filePath;
		this.fileType = fileType;
		this.fileSize = fileSize;
	}
	
	public FileObj(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileType() {
		return fileType;
	} 
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	@Override
	public String toString() {
		return "FileObj [fileName=" + fileName + ", filePath=" + filePath + ", fileType=" + fileType +", fileSize=" + fileSize + "]";
	}
	
	public int compareTo(FileObj f1) {
		// TODO Auto-generated method stub
		String i0 = this.fileName;
		String i1=f1.fileName;
		
		return i1.compareTo(i0);
	}
	
}