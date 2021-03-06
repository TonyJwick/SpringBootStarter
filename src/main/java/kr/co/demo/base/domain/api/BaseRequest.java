package kr.co.demo.base.domain.api;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BaseRequest<T> implements Serializable {

    private String apiName;
    private T apiParam;
}
