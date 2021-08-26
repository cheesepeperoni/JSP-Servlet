package co.yedam.memberProj.service;

import java.util.List;

import co.yedam.memberProj.vo.MemberVO;

public interface MemberMapper {
	List<MemberVO> selectList();
	
	int memInsert(MemberVO vo);
	int memUpdate(MemberVO vo);
	int memDelete(MemberVO vo);
}
