package com.barco.model.util;

import com.barco.model.dto.SearchTextDto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Nabeel Ahmed
 */
@Component
@Scope("prototype")
public class QueryUtil {

    private String ID = "id";
    private String CREATED_AT = "created_at";
    private String STORAGE_KEY_NAME = "storage_key_name";
    private String KEY_TYPE = "key_type";
    private String SERVICE_NAME = "service_name";
    private String TASK_NAME = "task_name";

    public String fetchSuperAdminUserListQuery() {
        return "select id,username,role from (\n" +
                "select ap_us.id, ap_us.username, auth.role from app_user as ap_us\n" +
                "inner join user_authority as us_auth on ap_us.id = us_auth.user_id\n" +
                "inner join authority as auth on auth.id = us_auth.authority_id\n" +
                "where ap_us.id = %d and ap_us.status not in(0,2,3)\n" +
                "union\n" +
                "select ap_us.id, ap_us.username, auth.role from app_user as ap_us\n" +
                "inner join user_authority as us_auth on ap_us.id = us_auth.user_id\n" +
                "inner join authority as auth on auth.id = us_auth.authority_id\n" +
                "inner join app_sub_user as ap_su on ap_su.parent_user_id = ap_us.created_by_id\n" +
                "where ap_su.parent_user_id = %d and ap_us.status not in(0,2,3) and auth.role not in ('ROLE_USER')\n" +
                "group by ap_us.id, auth.role)\n" +
                "as result order by id asc;\n";
    }

    public String fetchSuperAdminAccessService() {
        return "select ass.id, ass.service_name from access_service as ass\n" +
                "inner join user_access_service as us_as on us_as.service_id = ass.id\n" +
                "where us_as.user_id = %d";
    }

    public String adminStoreList(boolean isCount, Long adminId, String startDate, String endDate,
        SearchTextDto searchTextDto) {
        String selectPortion = "";
        if (isCount) {
            selectPortion = "select count(*) as result";
        } else {
            selectPortion = "select id, created_at, storage_key_name, key_type, status";
        }
        String query = selectPortion + String.format(" from storage_detail where created_by_id = %d and status not in (2,3,4,5,6)", adminId);
        if ((startDate  != null && !startDate.isEmpty()) || (endDate != null && !endDate.isEmpty())) {
            if ((startDate != null && !startDate.isEmpty()) && (endDate != null && !endDate.isEmpty())) {
                query += String.format(" and cast(created_at as date) between '%s' and '%s'", startDate, endDate);
            } else if (startDate != null && !startDate.isEmpty()) {
                query += String.format(" and cast(created_at as date) >= '%s'", startDate);
            } else if (endDate != null && !endDate.isEmpty()) {
                query += String.format(" and cast(created_at as date) <= '%s'", endDate);
            }
        }
        if (searchTextDto != null && (searchTextDto.getItemName() != null && searchTextDto.getItemValue() != null)) {
            if (searchTextDto.getItemName().equalsIgnoreCase(ID)) {
                query += String.format(" and cast(id as as char) like ('%%s%')", searchTextDto.getItemValue());
            } else if (searchTextDto.getItemName().equalsIgnoreCase(STORAGE_KEY_NAME)) {
                query += String.format(" and upper(storage_key_name) like upper('%%s%')", searchTextDto.getItemValue());
            }
        }
        return query;
    }

    public String taskList(boolean isCount, Long adminId, String startDate, String endDate, SearchTextDto searchTextDto) {
        String selectPortion = "";
        if (isCount) {
            selectPortion = "select count(*) as result";
        } else {
            selectPortion = "select task.id, task.created_at, task.task_name, task.status, access_service.id as service_id, " +
            "access_service.service_name, storage_detail.id as store_id, storage_detail.storage_key_name";
        }
        String query = selectPortion + String.format(" from task inner join access_service on access_service.id = task.access_service_id " +
        "left join storage_detail on storage_detail.id = task.storage_id where task.created_by_id = %d and task.status not in (2,3,4,5,6)", adminId);
        if ((startDate  != null && !startDate.isEmpty()) || (endDate != null && !endDate.isEmpty())) {
            if ((startDate != null && !startDate.isEmpty()) && (endDate != null && !endDate.isEmpty())) {
                query += String.format(" and cast(task.created_at as date) between '%s' and '%s'", startDate, endDate);
            } else if (startDate != null && !startDate.isEmpty()) {
                query += String.format(" and cast(task.created_at as date) >= '%s'", startDate);
            } else if (endDate != null && !endDate.isEmpty()) {
                query += String.format(" and cast(task.created_at as date) <= '%s'", endDate);
            }
        }
        if (searchTextDto != null && (searchTextDto.getItemName() != null && searchTextDto.getItemValue() != null)) {
            if (searchTextDto.getItemName().equalsIgnoreCase(ID)) {
                query += String.format(" and cast(task.id as as char) like ('%%s%')", searchTextDto.getItemValue());
            } else if (searchTextDto.getItemName().equalsIgnoreCase(TASK_NAME)) {
                query += String.format(" and upper(task.task_name) like upper('%%s%')", searchTextDto.getItemValue());
            } else if (searchTextDto.getItemName().equalsIgnoreCase(SERVICE_NAME)) {
                query += String.format(" and upper(access_service.service_name) like upper('%%s%')", searchTextDto.getItemValue());
            } else if (searchTextDto.getItemName().equalsIgnoreCase(STORAGE_KEY_NAME)) {
                query += String.format(" and upper(storage_detail.storage_key_name) like upper('%%s%')", searchTextDto.getItemValue());
            }
        }
        return query;
    }

    public String adminUsersList(boolean isCount) {
        String selectPortion = "";
        if(isCount) {
            selectPortion = "select count(*), 'count' as result\n";
        } else {
            selectPortion = "select ap_us.id, ap_us.first_name || ' ' || ap_us.last_name as full_name, ap_us.username, ap_us.last_login_at,\n" +
                    " auth.role, ap_us.status, ap_us.user_type";
        }
        String query  = selectPortion + " from app_user as ap_us\n" +
                "  inner join user_authority as us_auth on ap_us.id = us_auth.user_id\n" +
                "  inner join authority as auth on auth.id = us_auth.authority_id\n" +
                "  inner join app_sub_user as ap_su on ap_su.parent_user_id = ap_us.created_by_id\n" +
                "where ap_su.parent_user_id = ? ";
        if(!isCount) {
            query +=" group by ap_us.id, auth.role limit ? OFFSET ?";
        }
        return query;
    }

}
