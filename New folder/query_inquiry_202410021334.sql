INSERT INTO public.query_inquiry (date_created,date_updated,status,description,"name",query,created_by_id,updated_by_id,"uuid") VALUES
	 ('2024-09-22 14:41:04.807','2024-09-22 14:41:04.807',1,'User Link Query','User Link Query','select
	distinct AU.ID,
	AU.EMAIL,
	AU.USERNAME,
	AU.FIRST_NAME || '' '' || AU.LAST_NAME as FULL_NAME,
	AU.IMG as PROFILE_IMG,
	PRO.ID as PROFILE_ID,
	PRO.PROFILE_NAME,
	PRO.DESCRIPTION,
	AUE.ID as LINK_ID,
	AUE.DATE_CREATED as LINK_DATA,
	case
		when AUE.DATE_CREATED is null then false
		else true
	end LINKED,
	AUE.ENV_VALUE,
	case
		when AUE.STATUS is not null then AUE.STATUS
		when AU.STATUS = 0
		or AUE.STATUS = 0 then 0
		else 1
	end as LINK_STATUS
from
	APP_USER AU
inner join PROFILE PRO on
	PRO.ID = AU.PROFILE_ID
left join APP_USER_ENV AUE on
	AUE.APP_USER_ID = AU.ID
	and AUE.ENV_KEY_ID = 58
where
	AU.STATUS != 2
	and AU.DATE_CREATED between ''2024-07-30 00:00:00'' and ''2024-08-28 23:59:59''
order by
	AU.ID desc',1,1,'f9af92de-6a49-4b2a-ba0c-857c91196806');
