package com.barco.model.util;

/**
 * @author Nabeel Ahmed
 */
public interface MessageUtil {

    String ACCOUNT_TYPE_NOT_FOUND = "No account type found.";
    String IS_DEFAULT_NOT_FOUND = "No default found.";
    String FETCH_LIMIT_NOT_FOUND = "No fetch limit found.";
    String CREDENTIAL_TYPE_NOT_FOUND = "No credential type found.";
    String FILED_TYPE_NOT_FOUND = "No filed type found";
    String FORM_TYPE_NOT_FOUND = "No form type found";
    String REQUEST_METHOD_NOT_FOUND = "No request method found.";
    String UI_LOOKUP_NOT_FOUND = "No ui lookup found.";
    String TASK_TYPE_NOT_FOUND = "No task type found.";
    String NOTIFICATION_TYPE_NOT_FOUND = "No notification type found.";
    String NOTIFICATION_STATUS_NOT_FOUND = "No notification status found.";
    String FREQUENCY_STATUS_NOT_FOUND = "No frequency status found.";
    String EVENT_BRIDGE_TYPE_NOT_FOUND = "No event bridge type found.";
    String JOB_STATUS_STATUS_NOT_FOUND = "No job status found.";
    String EXECUTION_STATUS_NOT_FOUND = "No execution status found.";
    String EMAIL_TEMPLATE_NOT_FOUND = "No email template status found.";
    String CONDITION_TYPE_NOT_FOUND = "No condition type found.";
    String DASHBOARD_TYPE_NOT_FOUND = "No dashboard status found.";
    String PAYLOAD_REF_NOT_FOUND = "No payload ref found.";
    String PAYLOAD_TYPE_NOT_FOUND = "No payload type found.";
    String APPLICATION_STATUS_NOT_FOUND = "No application status found.";
    String LOGICAL_OPERATORS_NOT_FOUND = "No logical operator found.";
    String DYNAMIC_CONDITION_NOT_FOUND = "No dynamic condition found.";
    String COMPARISON_OPERATORS_NOT_FOUND = "No comparison operator found.";
    String USER_NOT_FOUND = "User not found with username : %s .";
    String REFRESH_TOKEN_EXPIRED = "Refresh token expired. Please make a new signing request.";
    String REFRESH_TOKEN_VALID = "Token valid and can be use.";
    String REFRESH_TOKEN_DELETED = "Token deleted.";
    String REFRESH_TOKEN_NOT_FOUND = "Refresh token not found.";
    String USER_SUCCESSFULLY_AUTHENTICATE = "User successfully authenticate.";
    String USER_SUCCESSFULLY_REGISTER = "User successfully register %s.";
    String WRONG_INPUT = "Wrong Input.";
    String DYNAMIC_PAYLOAD = "Dynamic payload fetch.";
    String ONLY_SELECT_QUERY_EXECUTE = "Only select query execute.";
    String QUERY_MISSING = "Query missing.";
    String DATA_FETCH_SUCCESSFULLY = "Data fetch successfully.";
    String OLD_PASSWORD_NOT_MATCH = "Old password not match.";
    String OLD_PASSWORD_MISSING = "OldPassword missing.";
    String NEW_PASSWORD_MISSING = "NewPassword missing.";
    String USERNAME_MISSING = "Username missing.";
    String EMAIL_MISSING = "Email missing.";
    String IP_ADDRESS_MISSING = "IP address missing.";
    String PASSWORD_MISSING = "Password missing.";
    String FIRST_NAME_MISSING = "Firstname missing";
    String LAST_NAME_MISSING = "Lastname missing";
    String APPUSER_NOT_FOUND = "AppUser not found.";
    String IDS_MISSING = "Ids missing.";
    String ID_MISSING = "Id missing.";
    String APP_USER_ID_MISSING = "AppUser Id missing.";
    String TEMPLATE_NAME_MISSING = "Template name missing.";
    String TEMPLATE_DESCRIPTION_MISSING = "Template description missing.";
    String TEMPLATE_CONTENT_MISSING = "Template content missing.";
    String TEMPLATE_REG_NOT_FOUND = "Template reg not found.";
    String TEMPLATE_REG_ALREADY_EXIST = "Template reg already exist.";
    String DATA_SAVED = "Data save with %s.";
    String DATA_UPDATE = "Data update with %s.";
    String DATA_DELETED = "Data deleted with %s.";
    String DATA_DELETED_ALL = "Data deleted with all ids.";
    String DATA_NOT_FOUND = "Data not found with %s.";
    String LOOKUP_DATA_LOOKUP_CODE_MISSING = "LookupData lookupCode missing.";
    String LOOKUP_DATA_LOOKUP_VALUE_MISSING = "LookupData lookupValue missing.";
    String LOOKUP_DATA_LOOKUP_TYPE_MISSING = "LookupData lookupType missing.";
    String LOOKUP_DATA_DESCRIPTION_MISSING = "LookupData description missing.";
    String LOOKUP_DATA_UI_LOOKUP_MISSING = "LookupData ui lookup missing.";
    String LOOKUP_NOT_FOUND = "Lookup not found.";
    String LOOKUP_DATA_ALREADY_EXIST = "LookupData already exist.";
    String XLSX_FILE_ONLY = "You can upload only .xlsx extension file.";
    String REFRESH_TOKEN = "Refresh token.";
    String ACCOUNT_NOT_EXIST = "Account not exist.";
    String EMAIL_NOT_SEND_CONTACT_WITH_SUPPORT = "Email not send contact with support.";
    String EMAIL_SEND_SUCCESSFULLY = "Email send successfully.";
    String PASSWORD_RESET_SUCCESSFULLY = "Dear user, your password successfully reset.";
    String YOU_UPLOAD_EMPTY_FILE = "You uploaded empty file.";
    String SHEET_NOT_FOUND = "Sheet not found with %s.";
    String YOU_CANT_UPLOAD_EMPTY_FILE = "You can't upload empty file.";
    String FILE_SUPPORT_ROW_AT_TIME = "File support %s rows at a time.";
    String UPLOAD_FILE_TYPE = "Upload File Type %s";
    String WRONG_UPLOAD_TYPE_DEFINE = "Wrong upload type define.";
    String LOOKUP_TYPE_ALREADY_USE_AT_ROW = "LookupType %s already in use at row %s.<br>";
    String ROLE_TYPE_ALREADY_USE_AT_ROW = "Role %s already in use at row %s.<br>";
    String PROFILE_TYPE_ALREADY_USE_AT_ROW = "Profile %s already in use at row %s.<br>";
    String PERMISSION_TYPE_ALREADY_USE_AT_ROW = "Permission %s already in use at row %s.<br>";
    String EVARIABLE_TYPE_ALREADY_USE_AT_ROW = "EVariable %s already in use at row %s.<br>";
    String TOTAL_INVALID = "Total %d invalid.";
    String ROLE_MISSING = "Role missing.";
    String ROLE_ID_MISSING = "Role id missing.";
    String ROLE_NAME_MISSING = "Role name missing.";
    String ROLE_DESCRIPTION_MISSING = "Role description missing.";
    String ROLE_ALREADY_EXIST = "Role already exist.";
    String ROLE_NOT_FOUND_WITH_ID = "Role not found with id %s.";
    String PROFILE_MISSING = "Profile missing.";
    String PROFILE_ID_MISSING = "Profile id missing.";
    String PROFILE_NAME_MISSING = "Profile name missing.";
    String PROFILE_ALREADY_EXIST = "Profile already exist.";
    String PROFILE_DESCRIPTION_MISSING = "Profile description missing.";
    String PROFILE_NOT_FOUND_WITH_ID = "Profile not found with id %s.";
    String PERMISSION_ID_MISSING = "Permission id missing.";
    String PERMISSION_NAME_MISSING = "Permission name missing.";
    String PERMISSION_ALREADY_EXIST = "Permission already exist.";
    String PERMISSION_DESCRIPTION_MISSING = "Permission description missing.";
    String PERMISSION_NOT_FOUND_WITH_ID = "Permission not found with id %s.";
    String LINKED_MISSING = "Linked missing.";
    String USERNAME_ALREADY_TAKEN = "Username is already taken.";
    String EMAIL_ALREADY_IN_USE = "Email is already in use.";
    String ENV_KEYID_REQUIRED = "Env keyId required.";
    String ENV_ENVKEY_REQUIRED = "Env envKey required.";
    String ENV_ENVKEY_ALREADY_EXIST = "Env envKey already exist.";
    String ENV_NOT_FOUND_WITH_ID = "Env not found with id %s.";
    String CREDENTIAL_ID_MISSING = "Credential id missing.";
    String CREDENTIAL_NAME_MISSING = "Credential name missing.";
    String CREDENTIAL_DESCRIPTION_MISSING = "Credential description missing.";
    String CREDENTIAL_TYPE_MISSING = "Credential type missing.";
    String CREDENTIAL_CONTENT_MISSING = "Credential content missing.";
    String CREDENTIAL_NOT_FOUND = "Credential not found.";
    String CREDENTIAL_NOT_ACTIVE = "Credential not active.";
    String REFRESH_TOKEN_IDS_MISSING = "Refresh token ids missing.";
    String NOTIFY_ID_MISSING = "NotifyId missing.";
    String NOTIFICATION_AUDIT_NOT_FOUND = "Notification audit not found.";
    String FORM_ID_MISSING = "Form id missing.";
    String FORM_NAME_MISSING = "Form name missing.";
    String FORM_DESCRIPTION_MISSING = "Form description missing.";
    String FORM_TYPE_MISSING = "Form type missing.";
    String HOME_PAGE_NOT_FOUND = "Home age not found.";
    String FORM_NOT_FOUND = "Form not found.";
    String ACTION_MISSING = "Action missing.";
    String CONTROL_LINK_SECTION_MISSING = "Control link section missing.";
    String SECTION_LINK_CONTROL_MISSING = "Section link control missing.";
    String SECTION_LINK_FORM_MISSING = "Section link form missing.";
    String FORM_LINK_SECTION_MISSING = "Form link Section missing.";
    String FORM_LINK_STT_MISSING = "Form link Stt missing.";
    String CONTROL_LINK_SECTION_ORDER_MISSING = "Control link section order missing.";
    String SECTION_LINK_FORM_ORDER_MISSING = "Section link form order missing.";
    String SECTION_ID_MISSING = "Section id missing.";
    String SECTION_NAME_MISSING = "Section name missing.";
    String SECTION_DESCRIPTION_MISSING = "Section description missing.";
    String SECTION_NOT_FOUND = "Section not found.";
    String CONTROL_ID_MISSING = "Control id missing.";
    String CONTROL_FIELD_TYPE_MISSING = "Control field type missing.";
    String CONTROL_NAME_MISSING = "Control name missing.";
    String CONTROL_DESCRIPTION_MISSING = "Control description missing.";
    String CONTROL_FIELD_NAME_MISSING = "Control field name missing.";
    String CONTROL_FIELD_TITLE_MISSING = "Control field title missing.";
    String CONTROL_FIELD_WIDTH_MISSING = "Control field width missing.";
    String CONTROL_MANDATORY_MISSING = "Control mandatory missing.";
    String CONTROL_NOT_FOUND = "Control not found.";
    String SOURCE_TASK_TYPE_NOT_FOUND = "Stt not found.";
    String SOURCE_TASK_TYPE_CANNOT_CHANGE_TO_DIFFERENT_TASK_TYPE = "Stt cannot change to different taskType.";
    String SOURCE_TASK_TYPE_ID_MISSING = "STT id missing.";
    String SOURCE_TASK_TYPE_SERVICE_ID_MISSING = "STT service id missing.";
    String SOURCE_TASK_TYPE_SERVICE_NAME_MISSING = "STT service name missing.";
    String SOURCE_TASK_TYPE_DESCRIPTION_MISSING = "STT description missing.";
    String SOURCE_TASK_TYPE_MISSING = "STT task type missing.";
    String SOURCE_TASK_TYPE_WITH_API_TYPE_MISSING = "TaskType with api type missing.";
    String SOURCE_TASK_TYPE_WITH_KAFKA_TYPE_MISSING = "TaskType with kafka type missing.";
    String SOURCE_TASK_ID_MISSING = "Source task id missing";
    String SOURCE_TASK_NAME_MISSING = "Source task name missing";
    String SOURCE_TASK_DESCRIPTION_MISSING = "Source task description missing";
    String SOURCE_TASK_NOT_FOUND = "Source Task not found.";
    String API_URL_MISSING = "Api url missing.";
    String HTTP_METHOD_MISSING = "Http method missing.";
    String KAFKA_NUM_PARTITIONS = "Kafka num partitions";
    String KAFKA_SERVICE_URL_MISSING = "Kafka service url missing.";
    String KAFKA_TOPIC_NAME_MISSING = "Kafka topic name missing.";
    String KAFKA_TOPIC_PATTERN_MISSING = "Kafka topic pattern missing.";
    String APP_USER_ENV_NOT_FOUND = "AppUserEnv not found.";
    String ACCOUNT_STATUS = "Account status";
    String ACCOUNT_ENABLED = "Account enabled for %s user";
    String ACCOUNT_DISABLED = "Account disabled for %s user";
    String ACCOUNT_CLOSE_DETAIL = "Account closed for %s user.";
    String NEW_ACCOUNT_ADDED = "New account added";
    String FORGOT_PASSWORD = "Forgot password";
    String RESET_PASSWORD = "Reset password";
    String RESET_EMAIL_SEND_TO_YOUR_EMAIL = "Reset email send to your email";
    String FORGOT_EMAIL_SEND_TO_YOUR_EMAIL = "Forgot email send to your email";
    String REQUESTED_FOR_NEW_ACCOUNT = "Requested for new account";
    String NEW_USER_REGISTER_WITH_ID = "New user register with id(%d).";
    String PASSWORD_UPDATED = "Password updated.";
    String PASSWORD_UPDATE_MESSAGE = "Dear user, your password update successfully.";
    String DOWNLOAD_TYPE_MISSING = "Download type missing.";
    String DATA_NOT_FOUND_XLSX = "Date not found.";
    String UPLOAD_TYPE_MISSING = "Upload type missing.";
    String TOTAL_STTF_INVALID = "Total %d sttf invalid.";
    String TOTAL_STTS_INVALID = "Total %d stts invalid.";
    String TOTAL_STTC_INVALID = "Total %d sttc invalid.";
    String DASHBOARD_ID_MISSING = "Dashboard field id missing.";
    String DASHBOARD_NAME_MISSING = "Dashboard field name missing.";
    String DASHBOARD_GROUP_TYPE_MISSING = "Dashboard field groupType missing.";
    String DASHBOARD_DESCRIPTION_MISSING = "Dashboard field description missing.";
    String DASHBOARD_BOARD_TYPE_MISSING = "Dashboard field board type missing.";
    String DASHBOARD_DASHBOARD_URL_MISSING = "Dashboard field dashboard url missing.";
    String DASHBOARD_IFRAME_MISSING = "Dashboard field Iframe url missing.";
    String DASHBOARD_NOT_FOUND = "Dashboard not found.";
    String REPORT_SETTING_ID_MISSING = "Report Setting field id missing.";
    String REPORT_SETTING_NAME_MISSING = "Report Setting field name missing.";
    String REPORT_SETTING_GROUP_MISSING = "Report Setting field groupType missing.";
    String REPORT_SETTING_DESCRIPTION_MISSING = "Report Setting field description missing.";
    String REPORT_SETTING_DATA_FILTER_MISSING = "Report Setting data filter missing.";
    String REPORT_SETTING_RECORD_REPORT_MISSING = "Report Setting data record report missing.";
    String REPORT_SETTING_FETCH_RATE_MISSING = "Report Setting fetch rate missing.";
    String REPORT_SETTING_PAYLOAD_REF_MISSING = "Report Setting field payload ref missing.";
    String REPORT_SETTING_PDF_MISSING = "Report Setting field pdf missing.";
    String REPORT_SETTING_CSV_MISSING = "Report Setting field csv missing.";
    String REPORT_SETTING_XLSX_MISSING = "Report Setting field xlsx missing.";
    String REPORT_SETTING_DATA_MISSING = "Report Setting field data missing.";
    String REPORT_SETTING_FIRST_DIMENSION_MISSING = "Report Setting field first dimension missing.";
    String REPORT_SETTING_SECOND_DIMENSION_MISSING = "Report Setting field second dimension missing.";
    String REPORT_NOT_FOUND = "Report not found.";
    String EVENT_BRIDGE_ID_MISSING = "EventBridge id missing.";
    String EVENT_BRIDGE_URL_MISSING = "EventBridge url missing.";
    String EVENT_BRIDGE_NAME_MISSING = "EventBridge name missing.";
    String EVENT_BRIDGE_DESCRIPTION_MISSING = "EventBridge description missing.";
    String EVENT_BRIDGE_TYPE_MISSING = "EventBridge type missing.";
    String EVENT_BRIDGE_CREDENTIAL_MISSING = "EventBridge credential missing.";
    String EVENT_BRIDGE_NOT_FOUND = "EventBridge not found.";
    String EVENT_BRIDGE_NOT_FOUND_WITH_ID = "EventBridge not found with id %s.";
    String EVENT_BRIDGE_NOT_FOUND_LINK_CREDENTIAL_WITH_ID = "EventBridge not found linked credential with id %s.";
    String EVENT_BRIDGE_GEN_TOKEN_MISSING = "EventBridge tokenId missing.";
    String EVENT_BRIDGE_NOT_FOUND_WITH_GEN_TOKEN = "EventBridge not found with tokenId %d.";
    String DYNAMIC_PAYLOAD_ID_MISSING = "Dynamic payload id missing.";
    String DYNAMIC_PAYLOAD_NAME_MISSING = "Dynamic payload name missing.";
    String DYNAMIC_PAYLOAD_DESCRIPTION_MISSING = "Dynamic payload description missing.";
    String DYNAMIC_PAYLOAD_TYPE_MISSING = "Dynamic payload xml|json missing.";
    String DYNAMIC_NOT_FOUND = "Dynamic payload not found.";
    // error message
    String SQL_GRAMMAR_EXCEPTION = "Query not valid.";

}