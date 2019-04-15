package com.dao.Impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.common.DBConnector;
import com.dao.AddrDAO;

public class AddrDAOImpl implements AddrDAO {

	private static final String SELECTADDRLIST = "select * from address";
	private static final String SELECTADDR = "select * from address where ad_num=?";

	@Override
	public List<Map<String, String>> selectAddrList(Map<String, String> map) {
		try {
			PreparedStatement ps = DBConnector.getCon().prepareStatement(SELECTADDRLIST);
			ResultSet rs = ps.executeQuery();
			List<Map<String, String>> sList = new ArrayList<>();
			while (rs.next()) {
				if (sList.size() <= 100) {
					Map<String, String> sMap = new HashMap<>();
					sMap.put("ad_num", rs.getString("ad_num"));
					sMap.put("ad_code", rs.getString("ad_code"));
					sMap.put("ad_sido", rs.getString("ad_sido"));
					sMap.put("ad_gugun", rs.getString("ad_gugun"));
					sMap.put("ad_dong", rs.getString("ad_dong"));
					sMap.put("ad_lee", rs.getString("ad_lee"));
					sMap.put("ad_bunji", rs.getString("ad_bunji"));
					sMap.put("ad_ho", rs.getString("ad_ho"));
					sMap.put("ad_roadcode", rs.getString("ad_roadcode"));
					sMap.put("ad_isbase", rs.getString("ad_isbase"));
					sMap.put("ad_orgnum", rs.getString("ad_orgnum"));
					sMap.put("ad_subnum", rs.getString("ad_subnum"));
					sMap.put("ad_jinum", rs.getString("ad_jinum"));
					sList.add(sMap);
				}
				
			}
			return sList;
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Map<String, String> selectAddr(Map<String, String> map) {
		
		return null;
	}

	@Override
	public int insertAddr(Map<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAddr(Map<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAddr(Map<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args){
		AddrDAO ado = new AddrDAOImpl();
		System.out.println(ado.selectAddrList(null));
	}
}
