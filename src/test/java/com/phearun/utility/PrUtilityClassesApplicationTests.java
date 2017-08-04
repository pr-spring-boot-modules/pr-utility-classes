package com.phearun.utility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phearun.utility.pagable.Pagable;
import com.phearun.utility.pagable.WebPagable;
import com.phearun.utility.response.MonoResponse;
import com.phearun.utility.response.PagableResponse;
import com.phearun.utility.response.Response;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrUtilityClassesApplicationTests {

	@Test
	public void contextLoads() {
		WebPagable w = new WebPagable();
		w.setRecordsTotal(30);
		w.setRecordsFiltered(20);
		System.out.println(w);
	}

	@Test
	public void test1() {
		Response response = new Response(false);
		System.out.println(response);
	}
	
	@Test
	public void test2() {
		MonoResponse n = new MonoResponse();
		n.setStatus(false);
		n.setData("Hello");
		System.out.println(n);
	}
	
	@Test
	public void test3() {
		Pagable a = new Pagable();
		a.setRecordsTotal(10);
		a.setRecordsFiltered(5);
		PagableResponse p = new PagableResponse("Hello", a);
		System.out.println(p);
	}
	
	
	
}
