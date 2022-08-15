-- Table: public.giitaddress

-- DROP TABLE IF EXISTS public.giitaddress;

CREATE TABLE IF NOT EXISTS public.giitaddress
(
    addressid SERIAL,
    houseno integer,
    street character varying(200),
    city character varying(50),
    state character varying(50)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.giitaddress
    OWNER to postgres;