package kr.or.yi.mybatis_c3p0_psw;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import kr.or.yi.mybatis_c3p0_psw.jdbc.MyBatisSqlSessionFactory;

public class MybatisSqlSessionFactoryTest {
	private static final Log Log = LogFactory.getLog(MybatisSqlSessionFactoryTest.class);

	@Test
	public void testOpenSession() {
		Log.debug("testOpenSession()");
		
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		Log.debug("session " + session);
		Assert.assertNotNull(session);
	}

}
