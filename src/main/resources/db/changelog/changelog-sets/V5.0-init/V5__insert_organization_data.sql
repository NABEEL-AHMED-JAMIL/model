CREATE EXTENSION IF NOT EXISTS pgcrypto;

INSERT INTO organization (
    date_created,
    date_updated,
    status,
    uuid,
    address,
    email,
    img_url,
    name,
    phone,
    country_id
)
VALUES
(
    NOW(),
    NOW(),
    1,
    gen_random_uuid(),
    '934 Plum Grove Rd, Greenup, KY 41144',
    'info@etl.com',
    'https://example.com/images/org1.png',
    'Barco ETL',
    '+1-630-259-6984',
    'USA'
);