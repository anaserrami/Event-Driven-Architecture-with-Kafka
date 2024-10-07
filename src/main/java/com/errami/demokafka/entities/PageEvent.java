package com.errami.demokafka.entities;

import lombok.*;

import java.util.Date;
@Getter @Setter
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;
}