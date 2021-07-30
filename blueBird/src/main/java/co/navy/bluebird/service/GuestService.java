package co.navy.bluebird.service;

import java.util.List;

import co.navy.bluebird.vo.GuestVO;

public interface GuestService {
	
	List<GuestVO> guestServiceList();	 // 전체 조회
	GuestVO guestSelect(GuestVO vo);	 // 한 명 조회
	
	GuestVO guestLogin(GuestVO vo); 	 // 로그인 
	
	int guestInsert(GuestVO vo);		 // 등록
	int guestUpdate(GuestVO vo);		 // 수정
	int guestDelete(GuestVO vo);		 // 삭제
	
	

}
