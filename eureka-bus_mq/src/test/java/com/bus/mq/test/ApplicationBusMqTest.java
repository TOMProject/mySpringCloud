package com.bus.mq.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bus.mq.EurekaBusMqApplication;
import com.bus.mq.send.Sender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EurekaBusMqApplication.class)
public class ApplicationBusMqTest {
	
	@Autowired
    private Sender sender;
 
    @Test
    public void hello(){
        sender.send();
    }

}
