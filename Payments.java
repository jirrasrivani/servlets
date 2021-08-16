import java.io.*;
// import javax.script.ScriptException;
import javax.servlet.*;
import javax.servlet.http.*;
public class Payments extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
	{
		res.setContentType("text/html");
		String firstname=req.getParameter("firstname");
        String lastname=req.getParameter("lastname");
        String address=req.getParameter("address");
        String city=req.getParameter("city");
        String state=req.getParameter("state");
        String pincode=req.getParameter("pincode");
        String nameoncard=req.getParameter("nameoncard");
        String creditcardnumber=req.getParameter("creditcardnumber");
        String month=req.getParameter("month");
        String year=req.getParameter("year");
        String cvv=req.getParameter("cvv");
        

		PrintWriter pw=res.getWriter();
		if( firstname=="" || lastname=="" || address=="" || city=="" ||state=="" ||pincode=="" ||nameoncard==""||creditcardnumber==""||month==""||year=="" || cvv=="" ) {
			pw.println("Some fields are Empty!");
		}
		else{
				res.sendRedirect("userprofile.html");
			
		}

	}
}