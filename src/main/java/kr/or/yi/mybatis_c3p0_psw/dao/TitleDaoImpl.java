package kr.or.yi.mybatis_c3p0_psw.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_c3p0_psw.dto.Title;
import kr.or.yi.mybatis_c3p0_psw.jdbc.MyBatisSqlSessionFactory;

public class TitleDaoImpl implements TitleDao {
	private static final String namespace = "kr.or.yi.mybatis_c3p0_psw.dao.TitleDao";

	@Override
	public List<Title> selectedTitleByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Title selectedTitleByCode(Title title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertTitle(Title title) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(namespace + ".insertTitle", title);
					sqlSession.commit();
			return res;
		}
	}

	@Override
	public int deleteTitle(int code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

}
