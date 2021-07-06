package com.restaurant_naver.wishlist.repository;

import org.springframework.stereotype.Repository;

import com.restaurant_naver.db.MemoryDbRepositoryAbstract;
import com.restaurant_naver.wishlist.entity.WishListEntity;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
