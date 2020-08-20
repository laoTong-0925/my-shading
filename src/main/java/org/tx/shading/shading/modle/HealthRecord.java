package org.tx.shading.shading.modle;

import lombok.Data;

/**
 * @ClassName : HealthRecord
 * @Description :
 * @Author :
 * @Date: 2020-08-06 15:06
 */
@Data
public class HealthRecord {

    private int recordId;
    private int userId;
    private int levelId;
    private String remarkId;
}
