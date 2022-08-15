-- Table: public.giitaccount

-- DROP TABLE IF EXISTS public.giitaccount;

CREATE TABLE IF NOT EXISTS public.giitaccount
(
    accountno integer NOT NULL,
    balance integer NOT NULL,
    CONSTRAINT giitaccount_pkey PRIMARY KEY (accountno)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.giitaccount
    OWNER to postgres;