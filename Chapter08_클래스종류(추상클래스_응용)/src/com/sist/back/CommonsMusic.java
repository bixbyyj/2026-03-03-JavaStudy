package com.sist.back;

import com.sist.vo.Music; // 다른 패키지에서 Music 정보 가져오기

/* 
 * 1. Genie
 *   1) 데이터가 50개
 *   2) 기능 : 크롤링/목록출력/상세보기/검색기능(가수명/곡명)/동영상 보기
 *  |
 *  | 두 기능 사이에 크롤링만 따로 하면 나머지는 abstract로 선언할 수 있음
 *  |
 * 2. Melon
 *   1) 데이터가 50개
 *   2) 기능 : 크롤링/목록출력/상세보기/검색기능(가수명/곡명)/동영상 보기 
 */
public abstract class CommonsMusic {
	public static Music[] musics=new Music[50];
	// 크롤링
	public abstract void init(); //Genie 랑 melon의 사이트가 달라서 크롤링 방법이 다를거라 추상클래스로 선언
	// 목록 출력
	public Music[] musicAllData() 
	{
		return musics;
	}
    // 상세보기
	// 검색
	// 동영상
}
