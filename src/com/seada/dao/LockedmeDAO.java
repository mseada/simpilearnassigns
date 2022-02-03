package com.seada.dao;

import java.io.IOException;
import java.util.List;

import com.seada.model.FileObj;
import com.seada.exceptions.BusinessException;

public interface LockedmeDAO {

	public List <FileObj> listallFiles (String filepath) throws BusinessException ;
	public FileObj deleteFile (String filename) throws BusinessException ;
	public String addFile (FileObj newfile) throws BusinessException ; 
	public List<FileObj> searchFile(String fileName) throws BusinessException;
	FileObj addFile(String fileName) throws BusinessException, IOException;
	
}
