package cn.bugstack.springframework.beans.factory;

/**
 * 实现此接口，既能感知到所属的 BeanName
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}

