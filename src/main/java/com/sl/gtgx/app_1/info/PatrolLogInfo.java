package com.sl.gtgx.app_1.info;

import com.sl.gtgx.app_1.entity.PatrolLog;
import lombok.Data;

@Data
public class PatrolLogInfo extends PatrolLog {
    private Long startTime;
    private long endTime;
}
