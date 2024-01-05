package cn.bugstack.springframework.beans.factory;

public interface DisposableBean {

    void destroy() throws Exception;

}

