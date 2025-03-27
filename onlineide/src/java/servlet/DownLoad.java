/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author student2
 */

@WebServlet(name = "DownLoad", urlPatterns = {"/DownLoad"})
public class DownLoad extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
            HttpSession hs=request.getSession();
                String downloadfile=(String)hs.getAttribute("PATH");
                System.out.println(downloadfile);
                String prj=request.getParameter("projectd");
                String fil=request.getParameter("pfile");
                System.out.println(downloadfile);
                System.out.println("kjkj");
		File file =  new File(downloadfile+"/"+prj+"/"+fil);
                System.out.println("kkj");
                FileInputStream fileInputStream = new FileInputStream(file);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		int start = 0;
		int length = 1024;
		int offset = -1;
		byte [] buffer = new byte [length];
        try {
            while ((offset = bufferedInputStream.read(buffer, start, length)) != -1){
		      byteArrayOutputStream.write(buffer, start, offset);
            }

		bufferedInputStream.close();
		byteArrayOutputStream.flush();
		buffer = byteArrayOutputStream.toByteArray();
		byteArrayOutputStream.close();
                System.out.println("....."+file.getName());
		response.addHeader("Content-Disposition", "attachment;filename=\"" + file.getName() + "\"");
		response.addHeader("Content-Transfer-Encoding", "binary");
		response.setContentType("application/octet-stream");
		response.setContentLength((int ) file.length());
		response.getOutputStream().write(buffer);
		response.getOutputStream().flush();
                
	}
        catch(Exception e)
        {
            System.out.println(e);
        }
    finally {
           // out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
