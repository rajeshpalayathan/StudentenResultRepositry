package com.AC.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AC.BeanAC.BeanAC;
import com.AC.Service.ACService;

@RestController
@RequestMapping(value = "/acRM")
public class ACController {
	@Autowired
	ACService ser;

	@PostMapping(value = "/addvalues")
	public String addallvalues(@RequestBody List<BeanAC> list) {
		return ser.addallvaluesService(list);
	}

	@GetMapping(value = "/showallvalues")
	public List<BeanAC> showallvaluescontroller() {
		return ser.showallvaluesService();
	}

	@GetMapping(value = "/showinputbrandobject/{variable}")
	public List<BeanAC> showallinputbrandobject(@PathVariable String variable) {
		return ser.showallvaluesbybrand(variable);
	}

	@GetMapping(value = "/show/{x}/{y}")
	public List<Integer> getpriceinrange(@PathVariable int x, @PathVariable int y) {
		return ser.getpriceinRangeinService(x, y);
	}

@GetMapping(value="/pricebrandquery")
	public List<Object> getpricebrandQuery()
	{
		return ser.getpricebrandQuery();
	}

@GetMapping(value="/getStart/{b}") 
public List<BeanAC> getStart(@PathVariable char b) {
	return ser.getStart(b); 
}


@GetMapping(value="/getend/{b}") 
public List<BeanAC> getend(@PathVariable char b) {
	return ser.getend(b); 
}
@GetMapping(value="/mapcount")
public List<Object> getcountbrand() {
	return ser.getcountbrand();
}
@GetMapping(value="/getmaxprice")
public int getmax() {
	return ser.getmax();
}

@GetMapping(value="/getmaxpriceobject")
public List<BeanAC> getmaxPobject() {
	return ser.getmaxPobject();
}
@GetMapping(value="/jqueryprice/{p}")
public List<BeanAC> getobjectbyprice(@PathVariable int p){
	return ser.getobjectbyprice(p);
}


}
