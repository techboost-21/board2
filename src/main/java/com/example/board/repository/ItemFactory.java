package com.example.board.repository;

import java.util.Date;
import java.util.UUID;

/**
 * 項目のファクトリークラス.
 */
public class ItemFactory {

	/** 非公開 */
	private ItemFactory() {
	}

	/**
	 * 新規の項目を生成する。
	 * 
	 * @return 新規の項目
	 */
	public static Item newItem() {
		Item item = new Item();
		return item;
	}

	/**
	 * 入力内容を設定した項目を生成する。
	 * 
	 * @param item 項目
	 * @return 項目
	 */
	public static Item createItem(Item item) {
		String id = UUID.randomUUID().toString();
		item.setId(id);
		Date current = new Date();
		item.setCreatedDate(current);
		item.setUpdatedDate(current);
		return item;
	}

	/**
	 * 更新内容を設定した項目を生成する。
	 * 
	 * @param item 項目
	 * @return 項目
	 */
	public static Item updateItem(Item item, Item form) {
		item.setPostName(form.getPostName());
		item.setTitle(form.getTitle());
		item.setBody(form.getBody());
		Date current = new Date();
		item.setUpdatedDate(current);
		return item;
	}

	/**
	 * 削除内容を設定した項目を生成する。
	 * 
	 * @param item 項目
	 * @return 項目
	 */
	public static Item deleteItem(Item item) {
		Date current = new Date();
		item.setUpdatedDate(current);
		item.setDeleted(true);
		return item;
	}

}