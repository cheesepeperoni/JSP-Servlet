package co.yedam.memberProj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.memberProj.common.Command;
import co.yedam.memberProj.service.MemberService;

public class SelectList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		MemberService dao = new MemberService();
		
		request.setAttribute("list", dao.selectList());
		
		return "selectList";
	}

}
