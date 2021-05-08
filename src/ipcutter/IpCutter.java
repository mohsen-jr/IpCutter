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
public class IpCutter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String commandLine = "163.121.12.30";
        Ip_cutter cutter = new Ip_cutter(commandLine);
        cutter.doOperation();
    }
    
}
