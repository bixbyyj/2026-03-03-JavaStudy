package com.sist.music;
// 데이터를 모아서 관리하는 곳
//데이터형 클래스 => 이게 바로 캡슐화
//MusicVo / MusicDTO / MusicEntity
//|데이터     |전송(Data          
//             Trans for
//             Object)

import lombok.Getter;
import lombok.Setter;

@Getter // 읽기
@Setter // 쓰기 <이 두개가 없으면 아래 있는 모든 걸 다 get set 을 받아와야해서 7*2 총 14개의 코드를 더 짜야함
//@Data 는 더 큰 범위임 // 실무용

 public class Music {

	private int no; // < 노래에 번호 부여하는 코드
	// @Getter
	// @Setter 이렇게 하면 title만 get set이 생김
	private String title;
	private String singer;
	private String album;
	private String state;
	private int idcrement;
	//private String poster;

	
}
