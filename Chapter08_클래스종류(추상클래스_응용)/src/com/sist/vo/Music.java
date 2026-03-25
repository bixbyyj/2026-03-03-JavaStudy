package com.sist.vo;

public class Music 

// getter setter 가져오기
// 사용자 정의 데이터 형 => 한 개의 뮤직에 대한 정도를 가지고 있음
// 데이터를 모아서 한 번에 윈도우/브라우저로 전송
// 데이터 보호 위해서 private 배정 =>그러나 필요시에 사용 가능하게 하기 위해서(변수의 기능 : 읽기/쓰기 = getter/setter) : 캡슐화
// 데이터베이스의 칼럼과 일치해야함

{
	
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String state;
	private String poster;
	private int idcrement;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	
	
	
	

}
