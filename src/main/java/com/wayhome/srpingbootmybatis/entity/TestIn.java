package com.wayhome.srpingbootmybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "test_in")
public class TestIn implements Cloneable{

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    @Override
    public TestIn clone() throws CloneNotSupportedException {
        return (TestIn) super.clone();
    }

}
