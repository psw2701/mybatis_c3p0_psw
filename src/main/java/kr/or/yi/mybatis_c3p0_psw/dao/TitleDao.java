package kr.or.yi.mybatis_c3p0_psw.dao;

import java.util.List;

import kr.or.yi.mybatis_c3p0_psw.dto.Title;

public interface TitleDao {
	List<Title> selectedTitleByAll();
	Title selectedTitleByCode(Title title);
	int insertTitle(Title title);
	int deleteTitle(int code);
	int updateTitle(Title title);
}
