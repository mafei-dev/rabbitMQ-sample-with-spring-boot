package com.example.rabitmqsample.publisher;

import com.example.rabitmqsample.config.MessageConfig;
import com.example.rabitmqsample.dto.LikeData;
import com.example.rabitmqsample.dto.LikeStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/*
  @Author kalhara@bowsin
  @Created 6/6/2021 2:57 AM  
*/
@RestController
@RequestMapping("/like")
public class LikePublisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping
    public ResponseEntity<?> like() {
        LikeData likeData = new LikeData();
        likeData.setUserId(UUID.randomUUID().toString());
        likeData.setPostId(UUID.randomUUID().toString());
        likeData.setIsLike(true);
        rabbitTemplate.convertAndSend(MessageConfig.test_exchange, MessageConfig.text_exchange_routing_key, likeData);
        return ResponseEntity.ok().body(new LikeStatus(likeData, true));
    }

}
