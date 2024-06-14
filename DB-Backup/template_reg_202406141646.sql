INSERT INTO public.template_reg (date_created,date_updated,status,template_content,template_name,created_by_id,updated_by_id,date_deleted) VALUES
	 ('2024-03-24 15:28:10.322','2024-03-24 15:28:10.322',1,'JOB_QUEUE_TEMPLATE','JOB_QUEUE_TEMPLATE',1,1,NULL),
	 ('2024-03-24 15:28:35.535','2024-03-24 15:28:35.535',1,'JOB_START_TEMPLATE','JOB_START_TEMPLATE',1,1,NULL),
	 ('2024-03-24 15:28:44.534','2024-03-24 15:28:44.534',1,'JOB_RUNNING_TEMPLATE','JOB_RUNNING_TEMPLATE',1,1,NULL),
	 ('2024-03-24 15:28:54.475','2024-03-24 15:28:54.475',1,'JOB_FAILED_TEMPLATE','JOB_FAILED_TEMPLATE',1,1,NULL),
	 ('2024-03-24 15:29:04.025','2024-03-24 15:29:04.025',1,'JOB_COMPLETED_TEMPLATE','JOB_COMPLETED_TEMPLATE',1,1,NULL),
	 ('2024-03-24 15:29:13.407','2024-03-24 15:29:13.407',1,'JOB_SKIP_TEMPLATE','JOB_SKIP_TEMPLATE',1,1,NULL),
	 ('2024-03-24 15:29:21.959','2024-03-24 15:29:21.959',1,'JOB_INTERRUPT_TEMPLATE','JOB_INTERRUPT_TEMPLATE',1,1,NULL),
	 ('2024-03-24 15:26:40.239','2024-03-28 13:48:48.9',1,'<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Account Profile Updated Successfully</title>
</head>
<body style="font-family: Arial, sans-serif;">

  <h3>Dear User,</h3>

<p>We''re writing to inform you that your account profile has been successfully updated.
<br>If you have any further questions or require assistance, please don''t hesitate to contact us at ${support_email}.</p>

Thank you for being a part of our community.

  <p>Your login detail are:</p>
  <ul>
    <li><strong>Name:</strong> ${fullName}</li>
    <li><strong>Username:</strong> ${username}</li>
    <li><strong>Role:</strong> ${role}</li>
    <li><strong>Profile:</strong> ${profile}</li>
  </ul>

  <p>Best Regards,<br>
    Team ETL 2023<br>
  </p>

</body>
</html>
','UPDATE_USER_ACCOUNT_PROFILE',1,1,NULL),
	 ('2024-03-24 15:26:22.539','2024-03-24 19:40:00.868',1,'<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Welcome to [Your Web Application Name]!</title>
</head>
<body style="font-family: Arial, sans-serif;">

  <h3>Dear User,</h3>

  <p>Please check the below link to reset your password.</p>

  <p>Your login detail are:</p>
  <ul>
    <li><strong>Name:</strong> ${fullName}</li>
    <li><strong>Username:</strong> ${username}</li>
    <li><strong>Reset Password Link:</strong><a href="${forgotPasswordPageUrl}" class="link">Click here.</a></li>
  </ul>
  <p>Best Regards,<br>
    Team ETL 2023<br>
  </p>

</body>
</html>
','FORGOT_USER_PASSWORD',1,1,NULL),
	 ('2024-03-24 15:27:16.505','2024-03-24 20:27:29.329',1,'<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body style="font-family: Arial, sans-serif;">

  <h3>Dear User,</h3>
	<p>Your account password has been successfully reset. If you have any further questions or need assistance, feel free to contact us.</p>
  <p>Your login detail are:</p>
  <ul>
    <li><strong>Name:</strong> ${fullName}</li>
    <li><strong>Username:</strong> ${username}</li>
   </ul>
  <p>Best Regards,<br>
    Team ETL 2023<br>
  </p>
</body>
</html>','RESET_USER_PASSWORD',1,1,NULL);
INSERT INTO public.template_reg (date_created,date_updated,status,template_content,template_name,created_by_id,updated_by_id,date_deleted) VALUES
	 ('2024-03-24 15:27:50.426','2024-03-28 13:35:00.784',1,'<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Your Account is Now Active!</title>
</head>
<body style="font-family: Arial, sans-serif;">
  <h3>Dear User,</h3>
  <p>We''re thrilled to inform you that your account has been successfully activated by our admin team.<br>You can now access all features and benefits available to our valued users.</p>

  <p>Your login detail are:</p>
  <ul>
    <li><strong>Name:</strong> ${fullName}</li>
    <li><strong>Username:</strong> ${username}</li>
    <li><strong>Role:</strong> ${role}</li>
    <li><strong>Profile:</strong> ${profile}</li>
  </ul>

  <p>Best Regards,<br>
    Team ETL 2023<br>
  </p>

</body>
</html>','ACTIVE_USER_ACCOUNT',1,1,NULL),
	 ('2024-03-24 15:28:00.546','2024-04-05 14:33:23.823',1,'<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Your Account Has Been Blocked</title>
</head>
<body style="font-family: Arial, sans-serif;">

  <h3>Dear User,</h3>

<p>We regret to inform you that your account has been blocked by our administration team. 
If you have any questions or wish to discuss this further, please contact our support team.
<p>

Thank you for your cooperation.

  <p>Your login detail are:</p>
  <ul>
    <li><strong>Name:</strong> ${fullName}</li>
    <li><strong>Username:</strong> ${username}</li>
    <li><strong>Role:</strong> ${role}</li>
    <li><strong>Profile:</strong> ${profile}</li>
  </ul>

  <p>Best Regards,<br>
    Team ETL 2023<br>
  </p>

</body>
</html>','BLOCK_USER_ACCOUNT',1,1,NULL),
	 ('2024-03-24 14:44:44.03','2024-03-28 13:45:08.833',1,'<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Welcome to [Your Web Application Name]!</title>
</head>
<body style="font-family: Arial, sans-serif;">
  <h3>Dear User,</h3>

  <p>Congratulations on successfully registering with ETLSource 2024! Your journey with us begins now.</p>

  <p>Your login detail are:</p>
  <ul>
    <li><strong>Name:</strong> ${fullName}</li>
    <li><strong>Username:</strong> ${username}</li>
    <li><strong>Role:</strong> ${role}</li>
    <li><strong>Profile:</strong> ${profile}</li>
  </ul>

  <p>Best Regards,<br>
    Team ETL 2023<br>
  </p>

</body>
</html>
','REGISTER_USER',1,1,NULL),
	 ('2024-03-24 15:27:01.185','2024-04-18 19:36:42.282',1,'<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Account Closure Confirmation</title>
</head>
<body style="font-family: Arial, sans-serif;">

  <h3>Dear User,</h3>

<p>This is to confirm that your account has been successfully closed. Should you require any assistance or have further inquiries, please don''t hesitate to contact us. Thank you for your patronage.</p>

Thank you for being a part of our community.

  <p>Your login detail are:</p>
  <ul>
    <li><strong>Name:</strong> ${fullName}</li>
    <li><strong>Username:</strong> ${username}</li>
  </ul>

  <p>Best Regards,<br>
    Team ETL 2023<br>
  </p>

</body>
</html>
','CLOSE_USER_ACCOUNT',1,1,NULL);
