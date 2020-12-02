package com.barco.model.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Nabeel Ahmed
 */
@Component
@Scope("prototype")
public class QueryUtil {

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


    public static void main(String args[]) {
        QueryUtil queryUtil = new QueryUtil();
        System.out.println(String.format(queryUtil.fetchSuperAdminUserListQuery(), 1026, 1026));
    }

    public static String adminUsersList(boolean isCount) {
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
            query +=" group by ap_us.id, auth.role   limit ? OFFSET ?";
        }
        return query;
    }
}
