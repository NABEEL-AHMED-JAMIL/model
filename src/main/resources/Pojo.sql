-- Default Access Screen Script
INSERT INTO public.access_screen(id, screen_name, status) VALUES
(1000, 'Dashboard', 1), (1001, 'Jobs', 1),
(1002, 'Tasks', 1), (1003, 'Batch Upload', 1),
(1004, 'Reporting', 1), (1005, 'Users', 1),
(1006, 'Account', 1), (1007, 'Storage Setting', 1),
(1008, 'Service Setting', 1), (1009, 'About', 1);
-- Default Authority Script
INSERT INTO public.authority VALUES
(1000, current_date, 0, 1, current_date,0,'ROLE_SUPER_ADMIN'),
(1001, current_date, 0, 1, current_date,0,'ROLE_ADMIN'),
(1002, current_date, 0, 1, current_date,0,'ROLE_USER');
-- Default Access Service Script
INSERT INTO public.access_service VALUES
(1000, current_date, 0, 1, current_date, 0, 'Service-1', 'WebScraping'),
(1001, current_date, 0, 1, current_date, 0, 'Service-2', 'DataFetch'),
(1002, current_date, 0, 1, current_date, 0, 'Service-3', 'FireStream');
-- Default App Setting Script
INSERT INTO public.app_setting(id, setting_key, setting_value) VALUES
(1000, 'CIPHER', 'AES/CBC/PKCS5PADDING'),
(1001, 'APP_ENCRYPTION_SCREAT', '7B8sjhAFJDuznPv7'),
(1002, 'APP_ENCRYPTION_KEY', '2Fa38BxhVeBDnxJ3'),
(1003, 'CHARSET_NAME', 'UTF-8'),
(1004, 'ALGORITHM', 'AES');
