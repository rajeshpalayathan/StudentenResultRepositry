package com.AC.Repositry;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.AC.BeanAC.BeanAC;

public interface ACRepositry extends JpaRepository<BeanAC, Integer> {

	@Query(value = "select * from ac_table where brand= ?", nativeQuery = true)
	public List<BeanAC> getobejectbybrand(String b);

	@Query(value = "select price from ac_table  where price> ? && price<? order by price", nativeQuery = true)
	public List<Integer> getpriceinRange(int a, int b);

	@Query(value = "select brand,price from ac_table  order by price limit 0,1", nativeQuery = true)
	public List<Object> getpricebrandQuery();

	@Query(value = "Select * from ac_table where brand like ?", nativeQuery = true)
	public List<BeanAC> getStart(char b);
	
	
	@Query(value = "Select * from ac_table where brand like ?", nativeQuery = true)
	public List<BeanAC> getend(char b);


@Query(value="Select brand, count(*) from ac_table group by brand", nativeQuery = true)
public List<Object> getcountbrand();

@Query(value="select max(price) from ac_table", nativeQuery = true)
public int getmax();


@Query(value="select * from ac_table where price=(select max(price) from ac_table)", nativeQuery = true)
public List<BeanAC> getmaxPobject();

//@Query(value="select * from ac_table where price like ( (select max(price) from ac_table)<(select max(price) from ac_table))", native)

//J-Query 

@Query(value="select object from BeanAC object where object.price> :p")
public List<BeanAC> getobjectbyprice(@Param("p") int p);





}
