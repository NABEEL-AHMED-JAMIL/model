INSERT INTO public.template_reg (date_created,date_updated,status,template_content,template_name,created_by_id,updated_by_id,description,"uuid") VALUES
	 ('2024-03-24 15:27:50.426','2024-07-16 08:48:43.339',1,'<!DOCTYPE html>
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
</html>','ACTIVE_USER_ACCOUNT',1,1,'ACTIVE_USER_ACCOUNT','fd1bcd6e-30cd-4103-8016-2558f9af434f'),
	 ('2024-03-24 15:26:22.539','2024-07-16 08:47:50.912',1,'<!DOCTYPE html>
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
','FORGOT_USER_PASSWORD',1,1,'FORGOT_USER_PASSWORD','44c44e8e-7367-4a00-9848-78faea12c73c'),
	 ('2024-03-24 15:27:16.505','2024-07-16 08:48:37.876',1,'<!DOCTYPE html>
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
</html>','RESET_USER_PASSWORD',1,1,'RESET_USER_PASSWORD','1f625055-0404-490c-b502-c4bc5a87cb6d'),
	 ('2024-03-24 15:28:10.322','2024-07-16 08:47:24.889',1,'JOB_QUEUE_TEMPLATE','JOB_QUEUE_TEMPLATE',1,1,'JOB_QUEUE_TEMPLATE','29265209-9253-4030-b0b4-b2878df344fe'),
	 ('2024-03-24 15:27:01.185','2024-08-08 12:25:06.733',1,'<!DOCTYPE html>
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
','DELETE_USER_ACCOUNT',1,1,'DELETE_USER_ACCOUNT','65c5f5c1-0756-44e1-8e28-faf97006ed3b'),
	 ('2024-03-24 14:44:44.03','2024-08-08 12:19:16.605',1,'<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Welcome to [Your Web Application Name]!</title>
</head>
<body style="font-family: Arial, sans-serif;">
  <h3>Dear User,</h3>

  <p>Congratulations on successfully registering with ETLSource 2023! Your journey with us begins now.</p>

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
','REGISTER_USER',1,1,'REGISTER_USER','757b8e1f-45ea-457d-8e2e-46dee9bd7f06'),
	 ('2024-03-24 15:28:54.475','2024-09-05 18:29:19.261',1,'JOB_FAILED_TEMPLATE','JOB_FAILED_TEMPLATE',1,1,'JOB_FAILED_TEMPLATE','4eaebf86-f0e6-479b-9e2d-4966b7f6435c'),
	 ('2024-03-24 15:28:00.546','2024-09-05 18:29:23.343',1,'<!DOCTYPE html>
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
</html>','BLOCK_USER_ACCOUNT',1,1,'BLOCK_USER_ACCOUNT','85cdb535-28ef-4007-a310-7ec9b9a485b3'),
	 ('2024-03-24 15:29:04.025','2024-07-16 08:47:02.294',1,'JOB_COMPLETED_TEMPLATE','JOB_COMPLETED_TEMPLATE',1,1,'JOB_COMPLETED_TEMPLATE','2be49c6d-f7f9-44b4-936b-a1a66157b995'),
	 ('2024-03-24 15:28:44.534','2024-07-16 08:47:13.856',1,'JOB_RUNNING_TEMPLATE','JOB_RUNNING_TEMPLATE',1,1,'JOB_RUNNING_TEMPLATE','a5f8d9c9-8781-4187-88c7-1b94cb223ce0');
INSERT INTO public.template_reg (date_created,date_updated,status,template_content,template_name,created_by_id,updated_by_id,description,"uuid") VALUES
	 ('2024-03-24 15:29:21.959','2024-09-05 18:29:16.462',1,'JOB_INTERRUPT_TEMPLATE','JOB_INTERRUPT_TEMPLATE',1,1,'JOB_INTERRUPT_TEMPLATE','4db09a46-fba3-4630-8120-d48217b6076d'),
	 ('2024-03-24 15:29:13.407','2024-09-09 10:34:21.883',1,'JOB_SKIP_TEMPLATE','JOB_SKIP_TEMPLATE',1,1,'JOB_SKIP_TEMPLATE','ee362396-d74a-4697-b69f-67b383d107b5'),
	 ('2024-09-22 14:44:18.016','2024-09-22 14:44:18.016',1,'ACTIVE_ORG_ACCOUNT','ACTIVE_ORG_ACCOUNT',1,1,'ACTIVE_ORG_ACCOUNT','8324b122-ceb6-40da-9076-57152891a1dc'),
	 ('2024-09-22 14:44:38.401','2024-09-22 14:44:38.401',1,'BLOCK_ORG_ACCOUNT','BLOCK_ORG_ACCOUNT',1,1,'BLOCK_ORG_ACCOUNT','bd4f2475-7dce-4cae-921d-3dd98c72e0af'),
	 ('2024-09-22 14:45:01.231','2024-09-22 14:45:01.231',1,'DELETE_ORG_ACCOUNT','DELETE_ORG_ACCOUNT',1,1,'DELETE_ORG_ACCOUNT','8aacd75e-958c-4fdd-bf95-b84c817822fb'),
	 ('2024-09-22 14:45:58.166','2024-09-22 20:34:43.314',1,'<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Welcome to ETLSource 2023!</title>
</head>
<body style="font-family: Arial, sans-serif;">
  <h3>Dear User,</h3>

  <p>Congratulations on successfully registering with ETLSource 2023! Your journey with us begins now.</p>

  <p>Your login details are:</p>
  <ul>
    <li><strong>Name:</strong> ${fullName}</li>
    <li><strong>Username:</strong> ${username}</li>
    <li><strong>Role:</strong> ${role}</li>
    <li><strong>Profile:</strong> ${profile}</li>
    <li><strong>Organization Name:</strong> ${orgName}</li>
    <li><strong>Organization Address:</strong> ${orgAddress}</li>
  </ul>

  <p>Best Regards,<br>
    Team ETL 2023<br>
  </p>

</body>
</html>','REGISTER_ORG',1,1,'REGISTER_ORG','2d7abdba-c935-4650-89c0-7646a62d5d34'),
	 ('2024-03-24 15:26:40.239','2024-07-16 08:48:24.387',2,'<!DOCTYPE html>
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
','UPDATE_USER_ACCOUNT_PROFILE',1,1,'UPDATE_USER_ACCOUNT_PROFILE','4e74b15d-929e-4ad5-bc83-7e629f31bdc5');
