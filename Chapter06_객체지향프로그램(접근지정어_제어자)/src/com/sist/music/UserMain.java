package com.sist.music;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         GenieMusicSystem GMS = new GenieMusicSystem();
         
         while(true)
         {
        	 int m=GMS.menu();
        	 
        	 if (m==4)
        	 {
        		 System.out.println("시스템을 종료합니다.");
        		 break;
        	 }
        	 
        	 else if (m==1)
        	 {
        		 GMS.musicList();
        	 }
        	 
        	 else if (m==2)
        	 {
        		 Scanner scan=new Scanner(System.in);
        		 System.out.println("번호 입력");
        		 int no=scan.nextInt();
        		 GMS.musicData(no);
        	 }
        	 
        	 else if (m==3)
        	 {
        		 while(true)
        		 {        			         		 
        		 Scanner scan=new Scanner(System.in);
        		 System.out.printf("1. 곡명 검색\n2. 가수명 검색\n");        		 
        		
        		 int no=scan.nextInt();       		 
        		
        		   if (no==1)
        		   {
        			 System.out.println("검색어를 입력하세요 : ");
        			 String fd=scan.next();
        			 GMS.searchTitle(fd);
        		   }
        		 
        		   else if (no==2)
        		   {
        			 System.out.println("검색어를 입력하세요 : ");
        			 String fd=scan.next();
        			 GMS.searchSinger(fd);
        		   }
        		 
        		   else
        		   {
        			 System.out.println("잘못된 번호입니다.");
        			 
        		   }
        		 }
        		 
        	 }
        	 else
  		    {
  			 System.out.println("잘못된 번호입니다.");
  			 
  		    }
        	 
        
         }
	} 

}
