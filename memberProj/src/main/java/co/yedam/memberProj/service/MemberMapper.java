package co.yedam.memberProj.service;

import java.util.List;

import co.yedam.memberProj.vo.MemberVO;

public interface MemberMapper {
	List<MemberVO> SelectList();
	List<MemberVO> SelectOne(MemberVO vo);
	
	int memInsert(MemberVO vo);
	int memUpdate(MemberVO vo);
	int memDelete(MemberVO vo);
}
