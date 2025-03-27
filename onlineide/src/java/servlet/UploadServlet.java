/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author rajan
 */
@WebServlet(name = "UploadServlet", urlPatterns = {"/UploadServlet"})
public class UploadServlet extends HttpServlet {
    private static int BYTE_READ_SIZE;
   
   int flag=0;

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
        PrintWriter out = response.getWriter();
        try {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            //Any file that is more than 5KB is stored in temporary repository. Feel free to change = this.value.
            factory.setSizeThreshold(5000);
           
            System.out.println(System.getProperty("user.home"));
            HttpSession session=request.getSession();
            String path=(String)session.getAttribute("PATH");
            String projectnm=(String)session.getAttribute("PROJECTNAME");
            String projectpath=path+"/"+projectnm;
            File f10=new File(projectpath);
             System.out.println("......******"+projectpath);
            factory.setRepository(new File(projectpath));
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = upload.parseRequest(request);
            for (FileItem item : items) {
                System.out.println("Inside for......");
                if (!item.isFormField()) {
                    InputStream is = item.getInputStream();
                   
                    
                     String st[]=f10.list();
              // for(int k=0;k<st.length;k++)
               //System.out.println(st[k]);
             if(st.length>0)
             {
                 System.out.println("length.."+st.length);
                 for(int i=0;i<st.length;i++)
            {
                System.out.println("st[i]...."+st[i]);
                System.out.println("item...."+item.getName());
                if(st[i].equals(item.getName()))
                {
                   flag=1;
                   break;
                }
                else
                {
                   flag=0;
                    }  
                }
                  if(flag==1)
                 {
                     System.out.println("inside if New File Action");
                    response.sendRedirect("ser.jsp?fileuploadstatus= File Already Exists.Try Another One&className=sh"); 
                 }
                 else
                 {
                     System.out.println("flag else");
                   FileOutputStream os = new FileOutputStream(new File(projectpath+"/"+ item.getName()));
                     System.out.println(".....*****"+items.size());
                   BYTE_READ_SIZE=items.size();
                    byte[] b = new byte[BYTE_READ_SIZE];
                    int bytesRead = 0;
                     while ((bytesRead = is.read(b)) != -1) {
                         System.out.println("inside while..............");
                        os.write(b, 0, bytesRead);
                        
                 }
                     os.flush();
                    os.close();
                    is.close();
            }
                
             }
             else
             {
                 System.out.println("Inside else else......");
                  FileOutputStream os = new FileOutputStream(new File(projectpath+"/"+ item.getName()));
                   BYTE_READ_SIZE=items.size();
                    byte[] b = new byte[BYTE_READ_SIZE];
                    int bytesRead = 0;
                 System.out.println("Inside else Upload");
                  while ((bytesRead = is.read(b)) != -1) {
                        os.write(b, 0, bytesRead);
                    }
                  os.flush();
                    os.close();
                    is.close();
             }
           
            
                   
                    
                }
            }
            response.sendRedirect("ser.jsp");//write the output content
        }catch(Exception e){
            System.out.println("Exception in upload file ------------ "+e);
        }
        finally {
            out.close();
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
