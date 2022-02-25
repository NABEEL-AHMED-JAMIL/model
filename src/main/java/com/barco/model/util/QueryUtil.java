package com.barco.model.util;

import com.barco.model.dto.SearchTextDto;
import org.springframework.stereotype.Component;

/**
 * @author Nabeel Ahmed
 */
@Component
public class QueryUtil {

    public String findAllAppSettingByAppUserIdInPagination(boolean isCount, Long appUserId,
        String startDate, String endDate, SearchTextDto searchTextDto) {
        String selectPortion = "";
        if (isCount) {
            selectPortion = "select count(*) as result";
        } else {
            selectPortion = "select app_setting_id, created_at, created_by_id, " +
                "modified_at, modified_by_id, status, description, setting_key, setting_value";
        }
        String query = selectPortion + String.format(" from app_setting where created_by_id = %d and status not in ('Pending', 'Delete')", appUserId);
        if ((startDate != null && !startDate.isEmpty()) || (endDate != null && !endDate.isEmpty())) {
            if ((startDate != null && !startDate.isEmpty()) && (endDate != null && !endDate.isEmpty())) {
                query += String.format(" and cast(created_at as date) between '%s' and '%s'", startDate, endDate);
            } else if (startDate != null && !startDate.isEmpty()) {
                query += String.format(" and cast(created_at as date) >= '%s'", startDate);
            } else if (endDate != null && !endDate.isEmpty()) {
                query += String.format(" and cast(created_at as date) <= '%s'", endDate);
            }
        }
        if (searchTextDto != null && (searchTextDto.getItemName() != null && searchTextDto.getItemValue() != null)) {
            if (searchTextDto.getItemName().equalsIgnoreCase("app_setting_id")) {
                query += " and cast(app_setting_id as varchar) like ('%" + searchTextDto.getItemValue() + "%')";
            } else if (searchTextDto.getItemName().equalsIgnoreCase("setting_key")) {
                query += " and upper(setting_key) like upper('%" + searchTextDto.getItemValue() + "%')";
            }
        }
        return query;
    }

    public static void main(String[] args) {
        QueryUtil queryUtil = new QueryUtil();
        SearchTextDto searchTextDto = new SearchTextDto();
        searchTextDto.setItemName("app_setting_id");
        searchTextDto.setItemValue("1000");
        System.out.println(queryUtil.findAllAppSettingByAppUserIdInPagination(true, 0L,
                "2021-12-30 11:07:38", "2021-12-30 11:07:38", searchTextDto));
    }

}
