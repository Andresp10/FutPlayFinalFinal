package Controlador;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class uploadfiles extends HttpServlet {

    private final String UPLOAD_DIRECTORY = "/Imagenes";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        if(ServletFileUpload.isMultipartContent(request)){
            
            try {
                List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);       

                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                        String name = new File(item.getName()).getName();
                        item.write( new File(this.getServletContext().getRealPath(UPLOAD_DIRECTORY) + File.separator + name));
                    }
                }           
                
            } catch (Exception ex) {
                System.out.println("file uploading has failed");
                System.err.println(ex);
            }                  

        }else{
            System.out.println("only mutipart bitch");
       }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
