package DevOps.CTDemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class PalindromeServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String input = req.getParameter("inputText");
		
		String Output = isPalindrome(input);
		

		req.setAttribute("Output", "<b>Result: </b>" +Output);
		req.getRequestDispatcher("/Index.jsp").forward(req, res);
	
	}
	
	public String isPalindrome (String input){
		String Output;
		if (input.length()==0) {
			Output ="Input should not be null";
		}
		else if (input.equals(reverse(input))) {
			Output =input +" is a Palindrome";
			//return true;
		} else
			Output =input +" is not a Palindrome";
		return Output;
	}

	private String reverse(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;		
	}
}
