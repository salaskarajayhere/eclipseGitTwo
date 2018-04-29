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
		//out.println("FirstName : <input type="text" value="fname" name="firstname"/>");
		out.println("</html>");
		trialPost tp = new trialPost();
		tp.display();
		String[] args = {"this","that"};
		tp.main(args);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
