package org.tx.shading.shading.modle;

import lombok.Data;

/**
 * @ClassName : HealthTask
 * @Description :
 * @Author :
 * @Date: 2020-08-06 15:06
 */
@Data
public class HealthTask {
    private int userId;
    private int taskId;
    private int recordId;
    private String taskName;
}
