package com.kzkt.bssas.model;

import lombok.Data;

@Data
public class MelotResult<T> {

    private boolean success;

    private String errorCode;

    private String msg;

    private T object;
}
