package com.example.rabitmqsample.consumer;

import com.example.rabitmqsample.config.MessageConfig;
import com.example.rabitmqsample.dto.LikeData;
import com.example.rabitmqsample.dto.LikeStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*
  @Author kalhara@bowsin
  @Created 6/6/2021 3:41 AM  
*/
@Component
public class TestConsumer {

    @RabbitListener(queues = MessageConfig.queue)
    public void consume(LikeData likeStatus) {
        System.out.println("likeStatus = " + likeStatus);
    }

    @RabbitListener(queues = MessageConfig.queue)
    public void consume1(LikeData likeStatus) {
        System.out.println("likeStatus1 = " + likeStatus);
    }

    @RabbitListener(queues = MessageConfig.queue)
    public void consume2(LikeData likeStatus) {
        System.out.println("likeStatus2 = " + likeStatus);
    }


}
