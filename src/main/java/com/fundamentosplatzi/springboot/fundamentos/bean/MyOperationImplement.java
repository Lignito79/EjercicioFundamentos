package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.springframework.context.annotation.Bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int sum(int number) {
        return number + 1;
    }
}
