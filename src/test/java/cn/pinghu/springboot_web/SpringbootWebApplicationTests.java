package cn.pinghu.springboot_web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebApplicationTests {

	private Logger LOGGER= LoggerFactory.getLogger(getClass());

	@Test
	public void contextLoads() {
		LOGGER.error("tesr");
	}

}

