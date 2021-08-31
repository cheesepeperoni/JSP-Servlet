package co.yedam.memberProj.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.memberProj.common.Command;
import co.yedam.memberProj.service.MemberMapper;
import co.yedam.memberProj.service.MemberService;
import co.yedam.memberProj.vo.MemberVO;

public class MemberInsert implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		MemberMapper dao = new MemberService();
		MemberVO vo = new MemberVO();
		
		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		vo.setPhone(request.getParameter("phone"));
		vo.setBirth(Date.valueOf(request.getParameter("birth")));
		vo.setAddress(request.getParameter("address"));
		
		dao.memInsert(vo);
		
		
		return "phoebe";
	}

}
