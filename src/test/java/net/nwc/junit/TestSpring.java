package net.nwc.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.nwc.aop.Laobaixing;
import net.nwc.aop.Maicaidi;
import net.nwc.p.ConditionSpringBean;
import net.nwc.p.SpringJavaBean;
import net.nwc.p.TestJava;
import net.nwc.p1.BestSon;
import net.nwc.spring.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(classes = SpringConfig.class)
@ActiveProfiles("prod")
public class TestSpring {

//	@Autowired(required=false)
//	TestJava testJava;
//	
//	@Test
//	public void TestJavaJunit() {
//		assertEquals("XML", testJava.test());
//	}
//	
//	@Autowired(required=false)
//	SpringJavaBean springJavaBean;
//	
//	@Test
//	public void TestSpringJavaBean() {
//		assertNotNull(springJavaBean);
//	}
//	@Autowired(required=false)
//	ConditionSpringBean conditionSpringBean;
//	
//	@Test
//	public void TestConditionSpringBean() {
//		assertNotNull(conditionSpringBean);
//	}
//	@Autowired(required=false)
//	BestSon bestSon;
//	
//	@Test
//	public void TestBestSonBean() {
//		System.out.println(bestSon.getSon().outSon());
//		System.out.println(bestSon.getQualifierSon().outSon());
//	}
//	
	@Autowired(required = false)
	Laobaixing maicaidi;

	@Test
	public void TestMaicaidi() {
		maicaidi.zuoshengyi();
	}

}
