INSERT INTO app_profile (
    date_created,
    date_updated,
    status,
    uuid,
    description,
    name,
    token,
    role_id
)
VALUES

-- ================= ETL =================
(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for ETL root account with full system-level access.',
 'Etl Root Account Profile',
 'ETL_ROOT_ACCOUNT_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ETL_ROOT_ACCOUNT' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for ETL super admin with full administrative control.',
 'Etl Super Admin Profile',
 'ETL_SUPER_ADMIN_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ETL_SUPER_ADMIN' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for ETL admin responsible for managing ETL operations.',
 'Etl Admin Profile',
 'ETL_ADMIN_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ETL_ADMIN' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for ETL user with standard access to ETL workflows.',
 'Etl User Profile',
 'ETL_USER_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ETL_USER' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for ETL database operations and management access.',
 'Etl Database Profile',
 'ETL_DATABASE_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ETL_DATABASE' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for ETL customer-level access to services and reports.',
 'Etl Customer Profile',
 'ETL_CUSTOMER_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ETL_CUSTOMER' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for ETL guest with limited access permissions.',
 'Etl Guest Profile',
 'ETL_GUEST_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ETL_GUEST' AND status = 1)),

-- ================= ORG =================
(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for organization root account with full access.',
 'Organization Root Account Profile',
 'ORG_ROOT_ACCOUNT_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ORG_ROOT_ACCOUNT' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for organization super admin with full control.',
 'Organization Super Admin Profile',
 'ORG_SUPER_ADMIN_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ORG_SUPER_ADMIN' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for organization admin managing users and operations.',
 'Organization Admin Profile',
 'ORG_ADMIN_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ORG_ADMIN' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for organization user with standard access.',
 'Organization User Profile',
 'ORG_USER_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ORG_USER' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for organization customer access.',
 'Organization Customer Profile',
 'ORG_CUSTOMER_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ORG_CUSTOMER' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for organization guest with limited access.',
 'Organization Guest Profile',
 'ORG_GUEST_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_ORG_GUEST' AND status = 1)),

-- ================= HR PORTAL =================
(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for HR portal root account with full system access.',
 'Hr Portal Root Account Profile',
 'HR_PORTAL_ROOT_ACCOUNT_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_HR_PORTAL_ROOT_ACCOUNT' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for HR portal super admin with full administrative control.',
 'Hr Portal Super Admin Profile',
 'HR_PORTAL_SUPER_ADMIN_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_HR_PORTAL_SUPER_ADMIN' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for HR portal admin managing users and workflows.',
 'Hr Portal Admin Profile',
 'HR_PORTAL_ADMIN_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_HR_PORTAL_ADMIN' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for HR portal user with standard access.',
 'Hr Portal User Profile',
 'HR_PORTAL_USER_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_HR_PORTAL_USER' AND status = 1)),

(NOW(), NOW(), 1, gen_random_uuid(),
 'Profile for HR portal candidate accessing recruitment features.',
 'Hr Portal Candidate Profile',
 'HR_PORTAL_CANDIDATE_PROFILE',
 (SELECT id FROM app_role WHERE token = 'ROLE_HR_PORTAL_CANDIDATE' AND status = 1));