/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author NKT
 */
public class DataRequestFile {
    private int fileID;
    private long length;

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public DataRequestFile(int fileID, long length) {
        this.fileID = fileID;
        this.length = length;
    }
    
    
    public DataRequestFile() {
    }
    
}
