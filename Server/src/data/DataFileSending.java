/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author NKT
 */
public class DataFileSending {

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
    public DataFileSending(int fileID, byte[] data, boolean finish){
        this.fileID = fileID;
        this.data = data;
        this.finish = finish;
    }
    public DataFileSending(){
        
    }
    private int fileID;
    private byte[] data;
    private boolean finish;
}
