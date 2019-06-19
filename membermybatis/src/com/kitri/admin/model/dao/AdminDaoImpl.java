package com.kitri.admin.model.dao;

import java.sql.*;
import java.util.*;

import org.apache.ibatis.session.SqlSession;

import com.kitri.member.model.MemberDetailDto;
import com.kitri.member.model.MemberDto;
import com.kitri.sqlmap.MyBatisConfiguration;

public class AdminDaoImpl implements AdminDao{

	private final String NAME_SPACE = "com.kitri.admin.model.dao.AdminDao";
	
	private static AdminDao adminDao;
	
	static {
		adminDao = new AdminDaoImpl();
	}
	
	private AdminDaoImpl(){}
	
	public static AdminDao getAdminDao() {
		return adminDao;
	}
	
	@Override
	public List<MemberDetailDto> getmemberList(Map<String, String> map) {
		SqlSession session = MyBatisConfiguration.getSqlSessionFactory().openSession();
		try {
			return session.selectList(NAME_SPACE +".getmemberList", map); // mapper의 id를 설정해주기. mapper의 namespace설정한것 쓰기. 다른 mapper의 이름이 겹칠 수 있기 때문./ 안써도됨.
		} finally {
			session.close();
		}
	}

}
