package com.example.rabitmqsample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
  @Author kalhara@bowsin
  @Created 6/6/2021 2:55 AM  
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikeStatus {
    private LikeData likeData;
    private Boolean isProceed;
}
