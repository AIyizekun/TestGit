package com.yzk.mocktest.mocktest.model.entity;

import org.springframework.beans.factory.annotation.Value;

public enum Hobby {
    @Value(value="阅读")
    READ(1),

    @Value(value="足球")
    FOOTBALL(2),

    @Value(value="电影")
    MOVIE(3);

    Integer type;

    Hobby(Integer type){ this.type = type;}

    public Integer getType() {
        return type;
    }


}
