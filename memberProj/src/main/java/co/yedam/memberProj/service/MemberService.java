package co.yedam.memberProj.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.memberProj.common.DataSource;
import co.yedam.memberProj.vo.MemberVO;

public class MemberService implements MemberMapper {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	@Override
	public List<MemberVO> SelectList() {
		return map.SelectList();
	}

	@Override
	public List<MemberVO> SelectOne(MemberVO vo) {
		return map.SelectOne(vo);
	}

	@Override
	public int memInsert(MemberVO vo) {
		return map.memInsert(vo);
	}

	@Override
	public int memUpdate(MemberVO vo) {
		return map.memUpdate(vo);
	}

	@Override
	public int memDelete(MemberVO vo) {
		return map.memDelete(vo);
	}

}
