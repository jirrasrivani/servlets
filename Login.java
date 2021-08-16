import java.io.*;
// import javax.script.ScriptException;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
	{
		res.setContentType("text/html");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		PrintWriter pw=res.getWriter();
		if(username=="" || password==""){
			pw.println("Some fields are Empty!");
			// res.sendRedirect("login.html");
		}
		else{
		       
				res.sendRedirect("userprofile.html");
			
		}

	}
}