package com.AC.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AC.BeanAC.BeanAC;
import com.AC.Dao.ACDao;

@Service
public class ACService {
	@Autowired
	ACDao dao;

	public String addallvaluesService(List<BeanAC> list) {
		return dao.addallvalues(list);
	}

	public List<BeanAC> showallvaluesService() {
		return dao.ShowAllValues();
	}

	public List<BeanAC> showallvaluesbybrand(String x) {
		return dao.getobejectbybrand(x);
	}

	public List<Integer> getpriceinRangeinService(int m, int n) {
		return dao.getpriceinRangeDao(m, n);
	}

	public List<Object> getpricebrandQuery() {
		return dao.getpricebrandQuery();
	}

	public List<BeanAC> getStart(char b) {
		return dao.getStart(b);
	}

	public List<BeanAC> getend(char b) {
		return dao.getend(b);
	}

	public List<Object> getcountbrand() {

		List<BeanAC> alllist = dao.ShowAllValues();

		return dao.getcountbrand();
	}
	

	public int getmax() {
		return dao.getmax();
	}
	
	public List<BeanAC> getmaxPobject() {
		return dao.getmaxPobject();
	}

	public List<BeanAC> getobjectbyprice( int p){
		return dao.getobjectbyprice(p);
	}
	
	
}
