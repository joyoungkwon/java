package sec03;

import javax.print.attribute.standard.Severity;

public class HttpServletExmple {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FildeDownLoadServlet());

	}
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
