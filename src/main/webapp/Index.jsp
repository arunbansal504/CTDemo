<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title> Palindrome Checker </title>
</head>
    <body style="background-color:white;">
        <h1><i>Welcome to Palindrome Check Page</i></h1>
        <hr align ="left" width="37%">
        <br><br>
        <form action = "PalindromeCheck" method ="Post">
      <table width="75%">
        <tr> 
          <td width="10%"><b>Enter the Input Text:</b></td>
          <td width="52%">
            <input type="text" name="inputText" />
          </td>
        </tr>
      </table>
      <br>
      <p> 
        <input type="submit" name="Submit" value="Submit"/>
      </p>
     </form>
     ${Output}
     
    </body>
</html>