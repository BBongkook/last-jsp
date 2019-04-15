package com.dao;

import java.util.List;
import java.util.Map;

public interface AddrDAO {

	public List<Map<String,String>> selectAddrList(Map<String,String> map);
	public Map<String,String> selectAddr(Map<String,String> map);
	public int insertAddr(Map<String,String> map);
	public int updateAddr(Map<String,String> map);
	public int deleteAddr(Map<String,String> map);
}
