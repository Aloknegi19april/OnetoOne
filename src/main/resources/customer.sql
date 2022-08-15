-- Table: public.giitcustomer

-- DROP TABLE IF EXISTS public.giitcustomer;

CREATE TABLE IF NOT EXISTS public.giitcustomer
(
    customerid integer NOT NULL DEFAULT nextval('giitcustomer_customerid_seq'::regclass),
    customername character varying(200) COLLATE pg_catalog."default" NOT NULL,
    addressid integer NOT NULL,
    accountno integer NOT NULL,
    CONSTRAINT giitcustomer_pkey PRIMARY KEY (customerid)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.giitcustomer
    OWNER to postgres;