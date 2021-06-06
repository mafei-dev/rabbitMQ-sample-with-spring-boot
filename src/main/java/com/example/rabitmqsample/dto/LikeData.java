package com.example.rabitmqsample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
  @Author kalhara@bowsin
  @Created 6/6/2021 2:52 AM  
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikeData {
    private String userId;
    private String postId;
    private Boolean isLike;
}
