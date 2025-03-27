/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.*;

/**
 *
 * @author Administrator
 */
public class StreamHandlerServiceProvider extends Thread{

    InputStream is;
    OutputStream os;
    String output;

    public StreamHandlerServiceProvider(InputStream is, OutputStream os, String output) {
        this.is = is;
        this.os = os;
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    //this method writes the data in inputStream to outputStream and also store it in variable output.
    @Override
    public void run() {
        int i;
        try {
            String sq = "";
            while ((i = is.read()) != -1) {
                os.write(i);
                os.flush();
                output = output + (char) i;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
