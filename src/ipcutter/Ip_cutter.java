/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipcutter;

/**
 *
 * @author mahmoud_mohsen
 */
public class Ip_cutter {
    private String cmdLine;
    
    public Ip_cutter(String cmdLine){
        this.cmdLine = cmdLine;
    }
    
    public Ip_cutter(){
        this.cmdLine = "";
    }
    public void setCmdline(String cmd){
        this.cmdLine = cmd;
    }
    public String getCmdline(){
        return this.cmdLine;
    }
    
    void doOperation(){
        String[] parts = cmdLine.split("\\.");
        int[] intParts = new int[parts.length];
        for(int i=0; i < parts.length; i++){
            intParts[i] = Integer.parseInt(parts[i]);
            System.out.println(intParts[i]);
        }
       
    }
    
}