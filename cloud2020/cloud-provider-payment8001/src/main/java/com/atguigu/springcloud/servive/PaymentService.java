package com.atguigu.springcloud.servive;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: PaymentService
 * Created 2020/9/21 23:53
 * @auther JYH
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
