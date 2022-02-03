package com.seada.bo;

import java.io.IOException;
import java.util.List;

import com.seada.exceptions.BusinessException;
import com.seada.model.FileObj;

public interface LockedmeBO {
	public List<FileObj> listFiles() throws BusinessException; 
	public FileObj deleteFile (String fileName) throws BusinessException;
	public List<FileObj> searchFile(String fileName) throws BusinessException;
	public FileObj addFile(String fileName) throws BusinessException, IOException;
}