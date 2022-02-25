package com.barco.model.service;

import com.barco.model.dto.AppSettingDto;
import com.barco.model.enums.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Service
public class QueryResultMapper {

    public Logger logger = LogManager.getLogger(QueryResultMapper.class);

    public List<AppSettingDto> findAllAppSettingByAppUserIdInPagination(List<Object[]> response) {
        List<AppSettingDto> appSettingList = new ArrayList<>();
        for (Object[] entity : response) {
            AppSettingDto appSettingDto = new AppSettingDto();
            appSettingDto.setAppSettingId(Long.valueOf(String.valueOf(entity[0])));
            appSettingDto.setCreatedAt(Timestamp.valueOf(String.valueOf(entity[1])));
            appSettingDto.setCreatedBy(Long.valueOf(String.valueOf(entity[2])));
            appSettingDto.setModifiedAt(Timestamp.valueOf(String.valueOf(entity[3])));
            appSettingDto.setModifiedBy(Long.valueOf(String.valueOf(entity[4])));
            appSettingDto.setStatus(Status.valueOf(String.valueOf(entity[5])));
            appSettingDto.setDescription(String.valueOf(entity[6]));
            appSettingDto.setSettingKey(String.valueOf(entity[7]));
            appSettingDto.setSettingValue(String.valueOf(entity[8]));
            appSettingList.add(appSettingDto);
        }
        return appSettingList;
    }

}