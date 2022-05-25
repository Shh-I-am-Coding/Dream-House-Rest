package com.ssafy.happy.deal.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class DealAvg {
    private int dealYear;
    private String avgAmount;
    private String pricePerArea;
}
