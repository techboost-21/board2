package com.example.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 項目のリポジトリー.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}