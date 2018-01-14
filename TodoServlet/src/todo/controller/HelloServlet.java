package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // JSPに適当な文字列を渡す
	    request.setAttribute("foo", "bar");	// TODO Auto-generated method stub //$NON-NLS-1$ //$NON-NLS-2$

	    String name = (String) request.getAttribute("userName"); //$NON-NLS-1$

	    if (name == null || "".equals(name)) { //$NON-NLS-1$
	        request.setAttribute("userName", Messages.getString("HelloServlet.5")); //$NON-NLS-1$ //$NON-NLS-2$
	    }

	    String view = "/WEB-INF/view/index.jsp"; //$NON-NLS-1$
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	    dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 文字コードの指定
	    request.setCharacterEncoding("utf-8"); //$NON-NLS-1$
	    // formから値を取得
	    String name = request.getParameter("name"); //$NON-NLS-1$

	    request.setAttribute("userName", name); //$NON-NLS-1$

	    doGet(request, response);
	}

}
