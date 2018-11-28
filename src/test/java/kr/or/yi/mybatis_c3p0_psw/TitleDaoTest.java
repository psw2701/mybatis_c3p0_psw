package kr.or.yi.mybatis_c3p0_psw;

import static org.junit.Assert.*;


import org.junit.Assert;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_c3p0_psw.dao.TitleDao;
import kr.or.yi.mybatis_c3p0_psw.dao.TitleDaoImpl;
import kr.or.yi.mybatis_c3p0_psw.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleDaoTest  extends AbstractTest{
	private static TitleDao titleDao = new TitleDaoImpl();
	



	@Test
	public void test01insertTitle() {
		log.debug("test01insertTitle()");
		Title title = new Title ();
		title.setCode(5);
		title.setName("인턴");
		
		int res= titleDao.insertTitle(title);
		Assert.assertEquals(1, res);
	}

}
