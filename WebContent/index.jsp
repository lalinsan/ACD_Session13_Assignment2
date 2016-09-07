<!--
 
 * Student: Eduardo Aguirre
 * Session 13
 * Assignment 2
 * JSP that prompts user to enter registration credentials
 *  
 */
-->


<html>
    <head>
        <title>User Login Form</title>
    </head>
    <body>
        <form method="post" action="Login">
        <table align="left" border="1" >
	<thead>
		<tr>
			<th colspan="2" bgcolor="#A9A9F5">
				Login Form
			</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td bgcolor="#D8CEF6"> User Name </td>
			<td> <input type="text" name="username" required/></td>
		</tr>
		<tr>
			<td bgcolor="#D8CEF6"> Password </td>
			<td> <input type="password" name="password" required/></td>
		</tr>
	    <tr>
	    	<td colspan="2" align="center" bgcolor="#A9A9F5">
	    	<input type="submit" value="Login"/>
	    	&nbsp; &nbsp;
	    	<input type="reset" value="Reset"/>
	        </td>
	    </tr>
	</tbody>
</table>
 </form>
</body>
</html>