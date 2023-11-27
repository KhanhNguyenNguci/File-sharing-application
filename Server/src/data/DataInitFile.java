/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author NKT
 */
public class DataInitFile {
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
    private String fileName;
    private long fileSize;
    
    public DataInitFile(String fileName, long fileSize){
        this.fileName = fileName;
        this.fileSize = fileSize;
    }
     public DataInitFile(){
        
    }
}
