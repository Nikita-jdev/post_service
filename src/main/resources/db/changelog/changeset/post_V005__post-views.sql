ALTER TABLE post
ADD COLUMN views bigint,
--ALTER COLUMN views SET DEFAULT 0,
ALTER COLUMN verified SET DEFAULT false,
ALTER COLUMN verified SET NOT NULL;
