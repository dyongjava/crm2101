package org.hopesoft.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@TableName("yuan")
public class Yuan implements Serializable {
    private Integer id;
    private String name;
    private String address;

}
