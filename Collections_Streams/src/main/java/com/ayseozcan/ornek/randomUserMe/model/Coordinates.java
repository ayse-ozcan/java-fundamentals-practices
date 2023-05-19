package com.ayseozcan.ornek.randomUserMe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Coordinates{
    public String latitude;
    public String longitude;
}
