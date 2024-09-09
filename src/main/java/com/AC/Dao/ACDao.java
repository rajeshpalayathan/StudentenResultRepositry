package com.AC.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.AC.BeanAC.BeanAC;
import com.AC.Repositry.ACRepositry;

@Repository
public class ACDao {
	@Autowired
	ACRepositry rep;

	public String addallvalues(List<BeanAC> list) {
		rep.saveAll(list);
		return "All values added Successfully";
	}

	public List<BeanAC> ShowAllValues() {
		return rep.findAll();
	}

	public List<BeanAC> getobejectbybrand(String b) {

		return rep.getobejectbybrand(b);

	}

	public List<Integer> getpriceinRangeDao(int x, int y) {
		return rep.getpriceinRange(x, y);
	}

	public List<Object> getpricebrandQuery()
	{
		return rep.getpricebrandQuery();
	}
	
	public List<BeanAC> getStart(char b) {
		return rep.getStart(b);
	}
	
	public List<BeanAC> getend(char b) {
		return rep.getend(b);
	}

	public List<Object> getcountbrand() {
		return rep.getcountbrand();
	}

	public int getmax() {
		return rep.getmax();
	}

	public List<BeanAC> getmaxPobject() {
		return rep.getmaxPobject();
	}

public List<BeanAC> getobjectbyprice( int p){
	return rep.getobjectbyprice(p);
}

}
