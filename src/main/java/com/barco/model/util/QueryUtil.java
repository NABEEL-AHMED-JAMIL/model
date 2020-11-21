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
        return "select ap_us.id,  ap_us.username from app_user as ap_us\n" +
                "inner join user_authority as us_auth on ap_us.id = us_auth.user_id\n" +
                "inner join app_sub_user as ap_su on ap_su.parent_user_id = ap_us.created_by_id\n" +
                "where ap_su.parent_user_id = 1018 and ap_us.status not in(3) group by ap_us.id;";
    }
}
