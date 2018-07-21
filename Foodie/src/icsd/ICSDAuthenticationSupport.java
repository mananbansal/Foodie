//import javax.naming.AuthenticationException;
package icsd;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ICSDAuthenticationSupport {

	public static HttpSession checkAuthenticationException(HttpServletRequest request)throws Authenticationexception
	{
		HttpSession session =request.getSession(false);
		if(session==null)
		{
			throw new Authenticationexception("please login first");
		}
		return session;
		
	}
}
