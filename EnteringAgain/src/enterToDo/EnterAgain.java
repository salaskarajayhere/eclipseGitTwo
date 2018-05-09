package enterToDo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnterAgain
 */
@WebServlet("/EnterAgain")
public class EnterAgain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterAgain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = "sue";
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<b>Welcome to JEE ! Get Kicking !! Make it Big, Very Very BIIIIGGGGGG !!!!</b>");
		out.println("<b>And <i>BINGO</i> it is  !!!!! </b>");
		out.println("<img src='" + request.getContextPath() + "/romance.jpg' alt='romance' height='400px' width='500px'>");
		//out.println("<img src='file:///C:/Users/Ajay/Downloads/WALLPAPERS/romance.jpg' alt='romance' height='600px' width='700px'>");

		out.println("</html>");
		trialPost tp = new trialPost();
		out.println("\n");
		out.println(tp.display());
		String[] args = {"this","that"};
		out.println("/////Context path is "+ request.getContextPath());
		trialPost.main(args);
		out.println("Entering a text to update a file so as to push it upstream");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
