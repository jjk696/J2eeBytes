/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import op.DBOperation;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



/**
 *
 * @author user
 */
@WebServlet(name = "uploadpic", urlPatterns = {"/uploadpic"}) 
public class uploadpic extends HttpServlet {
private static  int BYTE_READ_SIZE ;
private static final String TEMP_REPOSITORY = "D:/";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          String path="C:\\Users\\Guru\\Documents\\NetBeansProjects\\onlineide\\web\\";
        try {
            DiskFileItemFactory factory = new DiskFileItemFactory();
                 //Any file that is more than 5KB is stored in temporary repository. Feel free to change = this.value.
            factory.setSizeThreshold(5000);
            System.out.println("cjvnjv");
            factory.setRepository(new File(TEMP_REPOSITORY));
            System.out.println("cjfvnf");
            ServletFileUpload upload = new ServletFileUpload(factory);
            System.out.println("dcbfhv");
            List<FileItem> items = upload.parseRequest(request);
            System.out.println("jcnfjvg");
            for (FileItem item : items) {
                System.out.println("cjnfjvf");
                if (!item.isFormField()) {
                     System.out.println("cvbvb");
                    InputStream is = item.getInputStream();
                    System.out.println(" cvfjvvjg");
                    System.out.println(item.getName());
                    BYTE_READ_SIZE=(int)item.getSize();
                   // FileOutputStream os = new FileOutputStream(new File(STORAGE_LOCATION + item.getName()));
                    byte[] b = new byte[BYTE_READ_SIZE];
                    System.out.println("cvhfvbhf");
                  //  int bytesRead = 0;
                   // while ((bytesRead = is.read(b)) != -1) {
//                        os.write(b, 0, bytesRead);
//                    }
//                    os.flush();
//                    os.close();
                    is.read(b);
                    System.out.println(" cfbvhvgh");
                    HttpSession session=request.getSession();
               String username=(String)session.getAttribute("USERNAME"); 
               String pic_path="user_pic/"+username+".jpg";
               DBOperation db=new DBOperation();
               boolean b1=db.updateProfilePic(username,pic_path);
               if(b1)
               {
               FileOutputStream ot=new FileOutputStream(path+pic_path);
               ot.write(b);
               
  
               response.sendRedirect("myprofile.jsp");
               }
               else
               {
                   response.sendRedirect("myprofile.jsp?imageudstatus=error");
               }
                    
        }
            }
        }
        catch(Exception e){
            System.out.println("Exception in UploadImage ------------ "+e);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
