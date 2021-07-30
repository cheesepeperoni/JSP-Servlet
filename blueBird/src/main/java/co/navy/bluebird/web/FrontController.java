package co.navy.bluebird.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.navy.bluebird.command.Command;
import co.navy.bluebird.command.Main;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Command> map = new HashMap<String,Command>();   
   
    public FrontController() {
        super();
        // TODO 
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO 
		map.put("/main.do", new Main());
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO 
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());
		
		Command command = map.get(page);
		String viewPage = command.execute(request, response);
		
		if (!viewPage.endsWith(".do")) { // "home.do"
			if (!viewPage.endsWith(".jsp")) {
				viewPage = viewPage + ".tiles"; // "home/home"
			} else {
				viewPage = "/WEB-INF/views/" + viewPage; // "home/home.jsp"
			}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
		
	}

}
