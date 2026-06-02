-- Add show_on_register_page column to app_profile table
-- This column indicates whether a profile should be displayed on the registration page

ALTER TABLE app_profile
ADD COLUMN show_on_register_page BOOLEAN NOT NULL DEFAULT FALSE;

-- Create index for better query performance on show_on_register_page
CREATE INDEX idx_app_profile_show_on_register ON app_profile(show_on_register_page);

