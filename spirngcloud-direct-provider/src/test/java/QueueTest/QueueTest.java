package QueueTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bjsxt.Sender;
import com.bjsxt.SpringbootServiceApplication;

/**
 * 消息队列测试类
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootServiceApplication.class)
public class QueueTest {
	@Autowired
	private Sender sender;
	/*
	 * 测试消息队列
	 */
	@Test
	public void test1() throws InterruptedException{
		while(true){
			Thread.sleep(2000);
			this.sender.send("Hello RabbitMQ");
		}
		
		
	}

}
