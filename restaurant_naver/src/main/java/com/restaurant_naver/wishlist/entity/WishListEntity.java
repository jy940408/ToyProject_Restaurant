package com.restaurant_naver.wishlist.entity;

import java.time.LocalDateTime;

import com.restaurant_naver.db.MemoryDbEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListEntity extends MemoryDbEntity{

	private String title;						// 음식, 장소명
	private String category;					// 카테고리
	private String address;						// 주소
	private String roadAddress;					// 도로명 주소
	private String homePageLink;				// 홈페이지 주소
	private String imageLink;					// 음식, 가게 이미지 주소
	private boolean isVisit;					// 방문 여부
	private int visitCount;						// 방문 카운트
	private LocalDateTime lastVisitDate;		// 마지막 방문 일자
	
}
