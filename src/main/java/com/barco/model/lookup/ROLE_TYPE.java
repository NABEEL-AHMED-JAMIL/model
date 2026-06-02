package com.barco.model.lookup;

/**
 * Enum for application roles.
 * Defines all role types available in the ETL-Barco platform.
 *
 * Roles are grouped into three categories:
 * 1. ETL Roles - For ETL platform management and operations
 * 2. ORG Roles - For organization management
 * 3. HR Portal Roles - For HR portal specific operations
 *
 * @author Nabeel Ahmed
 */
public enum ROLE_TYPE {

    // ============================================
    // ETL ROLES
    // ============================================
    ROLE_ETL_ROOT_ACCOUNT,
    ROLE_ETL_SUPER_ADMIN,
    ROLE_ETL_ADMIN,
    ROLE_ETL_USER,
    ROLE_ETL_DATABASE,
    ROLE_ETL_CUSTOMER,
    ROLE_ETL_GUEST,

    // ============================================
    // ORGANIZATION ROLES
    // ============================================
    ROLE_ORG_ROOT_ACCOUNT,
    ROLE_ORG_SUPER_ADMIN,
    ROLE_ORG_ADMIN,
    ROLE_ORG_USER,
    ROLE_ORG_CUSTOMER,
    ROLE_ORG_GUEST,

    // ============================================
    // HR PORTAL ROLES
    // ============================================
    ROLE_HR_PORTAL_ROOT_ACCOUNT,
    ROLE_HR_PORTAL_SUPER_ADMIN,
    ROLE_HR_PORTAL_ADMIN,
    ROLE_HR_PORTAL_USER,
    ROLE_HR_PORTAL_CANDIDATE

}

