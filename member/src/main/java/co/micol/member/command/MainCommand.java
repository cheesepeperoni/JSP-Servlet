package co.micol.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse resoponse) {
		// main.do 요청시 처리하는 곳
		
		
		return "main/home"; // 보여줄 페이지를 선택해서 돌려준다
	}

}
