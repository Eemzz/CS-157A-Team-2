package com.example.egrocer2;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EGrocer2Command {
    private String action ;
    private String message ;

}
