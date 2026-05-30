CREATE EXTENSION IF NOT EXISTS pgcrypto;

INSERT INTO app_role (
    date_created,
    date_updated,
    status,
    uuid,
    description,
    name,
    token
) VALUES

-- ETL Roles
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides complete root-level access to the ETL platform and all administrative operations.', 'ETL Root Account', 'ROLE_ETL_ROOT_ACCOUNT'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides full administrative privileges for managing ETL users, jobs, and configurations.', 'ETL Super Admin', 'ROLE_ETL_SUPER_ADMIN'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides administrative access for managing ETL operations and monitoring processes.', 'ETL Admin', 'ROLE_ETL_ADMIN'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides standard access for executing and monitoring ETL jobs.', 'ETL User', 'ROLE_ETL_USER'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides access for managing ETL database-related operations and configurations.', 'ETL Database', 'ROLE_ETL_DATABASE'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides customer-level access to ETL services and reports.', 'ETL Customer', 'ROLE_ETL_CUSTOMER'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides limited guest access to ETL resources.', 'ETL Guest', 'ROLE_ETL_GUEST'),

-- ORG Roles
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides complete root-level access to organization management and settings.', 'Organization Root Account', 'ROLE_ORG_ROOT_ACCOUNT'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides full administrative privileges for organization management.', 'Organization Super Admin', 'ROLE_ORG_SUPER_ADMIN'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides administrative access for managing organization users and operations.', 'Organization Admin', 'ROLE_ORG_ADMIN'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides standard user access within the organization.', 'Organization User', 'ROLE_ORG_USER'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides customer-level access within the organization portal.', 'Organization Customer', 'ROLE_ORG_CUSTOMER'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides limited guest access within the organization.', 'Organization Guest', 'ROLE_ORG_GUEST'),

-- Portal Roles
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides full root-level access to HR portal including system configuration, user management, and global settings.', 'ROLE_HR_PORTAL_ROOT_ACCOUNT', 'ROLE_HR_PORTAL_ROOT_ACCOUNT'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides full administrative control over HR portal including roles, users, workflows, and configurations.', 'ROLE_HR_PORTAL_SUPER_ADMIN', 'ROLE_HR_PORTAL_SUPER_ADMIN'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides administrative access to manage HR portal users, roles, and operational activities.', 'ROLE_HR_PORTAL_ADMIN', 'ROLE_HR_PORTAL_ADMIN'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides standard user access to HR portal features such as profile management and basic services.', 'ROLE_HR_PORTAL_USER', 'ROLE_HR_PORTAL_USER'),
(NOW(), NOW(), 1, gen_random_uuid(), 'Provides candidate-level access for job applications, profile submission, and recruitment tracking.', 'ROLE_HR_PORTAL_CANDIDATE', 'ROLE_HR_PORTAL_CANDIDATE');