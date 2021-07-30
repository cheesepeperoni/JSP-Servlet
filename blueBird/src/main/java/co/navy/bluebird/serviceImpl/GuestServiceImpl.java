package co.navy.bluebird.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.navy.bluebird.command.DAO;
import co.navy.bluebird.service.GuestService;
import co.navy.bluebird.vo.GuestVO;

public class GuestServiceImpl implements GuestService {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	@Override
	public List<GuestVO> guestServiceList() {
		// TODO guest 전체조회
		List<GuestVO> guest = new ArrayList<GuestVO>();
		GuestVO vo;
		String sql = "select * from guest";

		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new GuestVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setGender(rs.getString("gender"));
				vo.setNationality(rs.getString("nationality"));
				vo.setAuthor(rs.getString("author"));
				guest.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return guest;
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public GuestVO guestSelect(GuestVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GuestVO guestLogin(GuestVO vo) {
		// TODO 로그인 하기 수정하기!!!!!!!!!!!
		String sql = "select name,author from guest where id=? and password=? '";

		conn = DAO.getConnection();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int guestInsert(GuestVO vo) {
		// TODO guest 등록
		int n = 0;
		String sql ="insert into guest values(?,?,?,?,?,?)";
		conn = DAO.getConnection();
		try {
			psmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close();
		}
		return 0;
	}

	@Override
	public int guestUpdate(GuestVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int guestDelete(GuestVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
