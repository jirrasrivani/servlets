import java.io.*;
// import javax.script.ScriptException;
import javax.servlet.*;
import javax.servlet.http.*;
public class Register extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
	{
		res.setContentType("text/html");
		String username=req.getParameter("username");
		String firstname=req.getParameter("firstname");
        String lastname=req.getParameter("lastname");
        String email=req.getParameter("email");
        String occupation=req.getParameter("occupation");
        String password=req.getParameter("password");
        String birthday=req.getParameter("birthday");

		PrintWriter pw=res.getWriter();
		if(username=="" || firstname=="" || lastname=="" || email=="" || occupation=="" || password=="" || birthday==""){
			pw.println("Some fields are Empty!");
			// res.sendRedirect("register.html");
		}
		else{
				res.sendRedirect("userprofile.html");
		}

	}
}