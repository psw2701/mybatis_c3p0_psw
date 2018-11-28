package kr.or.yi.mybatis_c3p0_psw.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_c3p0_psw.dto.Title;
import kr.or.yi.mybatis_c3p0_psw.jdbc.MyBatisSqlSessionFactory;

public class TitleDaoImpl implements TitleDao {
	private static final String namespace = "kr.or.yi.mybatis_c3p0_psw.dao.TitleDao";

	@Override
	public List<Title> selectedTitleByAll() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace + ".selectedTitleByAll");
		}
	}

	@Override
	public Title selectedTitleByCode(Title title) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace + ".selectedTitleByCode", title);
		}
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
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.delete(namespace + ".deleteTitle", code);
					sqlSession.commit();
			return res;
		}
	}

	@Override
	public int updateTitle(Title title) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.update(namespace + ".updateTitle", title);
					sqlSession.commit();
			return res;
		}
	}

}
