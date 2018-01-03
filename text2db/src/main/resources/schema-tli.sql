DROP TABLE IF EXISTS tli.cert;

CREATE TABLE tli.cert
(
    "policyno" varchar (4) ,
    "certno" varchar (8) ,
    "appno" varchar (12) ,
    "reqdate" varchar (8) ,
    "nameid" varchar (13) ,
    age int4 ,
    smi int4 ,
    "lifesum" int4 ,
    "accidentsum" int4 ,
    period varchar (2) ,
    loan_term varchar (2) ,
    "lifepremium" numeric (10,2) ,
    "extrapremium" numeric (10,2) ,
    "tpdpremium" numeric (10,2) ,
    "extratpdpremium" numeric (10,2) ,
    "addpremium" numeric (10,2) ,
    em int4 ,
    tpd numeric (4,2) ,
    "effectivedate" varchar (8) ,
    "maturedate" varchar (8) ,
    "premiumdate" varchar (8) ,
    "certyyyymm" varchar (6) ,
    "statcer" varchar (1) ,
    "statcer2" varchar (1) ,
    "statdate2" varchar (8) ,
    "informdate1" varchar (8) ,
    "paydate1" varchar (8) ,
    "amount1" numeric (10,2) ,
    "informdate2" varchar (8) ,
    "paydate2" varchar (8) ,
    "amount2" numeric (10,2) ,
    "deaddate" varchar (8) ,
    "endownmentyear" varchar (7) ,
    "deadcause" varchar (4) ,
    "receiptflag" varchar (1) ,
    "referenceno" varchar (20) ,
    "reserve" varchar (2),
	PRIMARY KEY (policyno)	
);
DROP TABLE IF EXISTS tli.certlinker;

CREATE TABLE tli.certlinker
(
    "policynohp" varchar (4) ,
    "certnohp" varchar (8) ,
    "policynocp" varchar (4) ,
    certnocp  varchar (8),
	PRIMARY KEY (policynohp,certnohp,policynocp,certnocp)
);
DROP TABLE IF EXISTS tli.certmapping;

CREATE TABLE tli.certmapping
(
    "policyno"  varchar (4) ,
    "certno"  varchar (8) ,
    "rpolicyno"  varchar (8) ,
    "rcertno"  varchar (15),
	PRIMARY KEY (policyno,certno,rpolicyno,rcertno)
);
DROP TABLE IF EXISTS tli.certrider;

CREATE TABLE tli.certrider
(
    "policyno" varchar (4) ,
    "certno" varchar (8) ,
    "ridertype" varchar (3) ,
    sum int4 ,
    premium numeric (10,2) ,
    "extrapremium" numeric (10,2) ,
    "riderstatus" varchar (8) ,
    "riderstatusdate" varchar (1) ,
	PRIMARY KEY (policyno,certno,ridertype)
	
);
DROP TABLE IF EXISTS tli.compensateid;

CREATE TABLE tli.compensateid (
	compensateid text,
	referenceid text
);
DROP TABLE IF EXISTS tli.customer;

CREATE TABLE tli.customer (
	customerid text,
	referenceid text,
	referencetype text,
	birthdate text,
	sex text,
	contactnameid text,
	contactaddressid text
);
DROP TABLE IF EXISTS tli.detcert;

CREATE TABLE tli.detcert
(
    "policyno" varchar (4),
    "certno" varchar (8),
    code varchar (10),
    address1 varchar (70),
    address2 varchar (70),
    "telephoneno" varchar (60),
    "mariagestatus" varchar (1),
    "recname1" varchar (100),
    percent1 numeric (5,2),
    "relationshipcode1" int4,
    "recname2" varchar (100),
    percent2 numeric (5,2),
    "relationshipcode2" int4,
    "recname3" varchar (100),
    percent3 numeric (5,2),
    "relationshipcode3" int4,
    analist varchar (10),
    "prmiseno" varchar (12),
    "prmiseno2" varchar (12),
    "loantype" varchar (1),
    "med" varchar (1),
    "reserve" varchar (1),
	PRIMARY KEY (policyno,certno)	
)
;
DROP TABLE IF EXISTS tli.mgclaim;

CREATE TABLE tli.mgclaim (
	certno varchar(8) NOT NULL,
	accidentdate varchar(8) NOT NULL,
	receivedate varchar(8) NOT NULL,
	claimtype varchar(1) NOT NULL,
	sectioncode varchar(2),
	orderno varchar(8),
	referenceno varchar(10) NOT NULL,
	linkerno varchar(7),
	okdate varchar(8),
	policyno varchar(4),
	PRIMARY KEY (certno,accidentdate,receivedate,claimtype,referenceno)
);
DROP TABLE IF EXISTS tli.mghis;

CREATE TABLE tli.mghis (
	certno varchar(8) NOT NULL,
	accidentdate varchar(8) NOT NULL,
	receivedate varchar(8) NOT NULL,
	claimtype varchar(1) NOT NULL,
	seqno int4 NOT NULL,
	remarkdate varchar(8),
	remarkno varchar(2),
	remark varchar(100),
	employeeid varchar(7),
	rectime varchar(6),
	PRIMARY KEY (certno,accidentdate,receivedate,claimtype,seqno)
);
DROP TABLE IF EXISTS tli.mginsmemo;

CREATE TABLE tli.mginsmemo (
	certno varchar(8) NOT NULL,
	accidentdate varchar(8) NOT NULL,
	receivedate varchar(8) NOT NULL,
	memocode varchar(3) NOT NULL,
	detail1 varchar(100),
	detail2 varchar(100),
	savedate varchar(8),
	PRIMARY KEY (certno,accidentdate,receivedate,memocode)
);
DROP TABLE IF EXISTS tli.mginterest;

CREATE TABLE tli.mginterest (
	certno varchar(8) NOT NULL,
	accidentdate varchar(8) NOT NULL,
	receivedate varchar(8) NOT NULL,
	ridertype varchar(3) NOT NULL,
	paytype varchar(1) NOT NULL,
	startdate varchar(8),
	enddate varchar(8),
	"day" varchar(4),
	payamount numeric(12,2),
	interestamount numeric(11,2),
	PRIMARY KEY (certno,accidentdate,receivedate,ridertype,paytype)
);
DROP TABLE IF EXISTS tli.mgorder;

CREATE TABLE tli.mgorder (
	sectioncode varchar(2) NOT NULL,
	orderno varchar(8) NOT NULL,
	receivetime varchar(6),
	causecode varchar(6),
	causedetail varchar(50),
	receiverid varchar(7),
	considerid varchar(7),
	admitdate varchar(8),
	admitflag varchar(1),
	billingorderno varchar(10),
	interimflag varchar(1),
	hospitalcode varchar(4),
	receivedocdate varchar(8),
	PRIMARY KEY (sectioncode,orderno)
);
DROP TABLE IF EXISTS tli.mgpay;

CREATE TABLE tli.mgpay (
	certno varchar(8) NOT NULL,
	receivedate varchar(8) NOT NULL,
	accidentdate varchar(8) NOT NULL,
	sectioncode varchar(2) NOT NULL,
	orderno varchar(8) NOT NULL,
	policystatus varchar(1),
	policystatusdate varchar(8),
	policystatus2 varchar(1),
	policystatusdate2 varchar(8),
	branchcode varchar(3),
	servicebranch varchar(3),
	claimtype varchar(1),
	paytype varchar(1),
	proofinsuredage int4,
	disabilitytype varchar(1),
	disnumber varchar(1),
	payrate varchar(3),
	payamount int4,
	accdamount int4,
	surrenderamount int4,
	returnamount int4,
	deductamount int4,
	claimokdate varchar(8),
	claimpaydate varchar(8),
	allowtype varchar(1),
	PRIMARY KEY (certno,receivedate,accidentdate,sectioncode,orderno)
);
DROP TABLE IF EXISTS tli.mgpayrider;

CREATE TABLE tli.mgpayrider (
	certno varchar(8) NOT NULL,
	accidentdate varchar(8) NOT NULL,
	receivedate varchar(8) NOT NULL,
	sectioncode varchar(2) NOT NULL,
	orderno varchar(8) NOT NULL,
	policystatus varchar(1),
	policystatusdate varchar(8),
	policystatus2 varchar(1),
	policystatusdate2 varchar(8),
	branchcode varchar(3),
	servicebranch varchar(3),
	amestartdate varchar(8),
	ameday numeric(3),
	ameexpense numeric(9,2),
	amepayment numeric(9,2),
	tdday int4,
	tdstartdate varchar(8),
	tdpayment numeric(9,2),
	returnamount numeric(12,2),
	deductamount numeric(12,2),
	voiddate varchar(8),
	claimokdate varchar(8),
	claimpaydate varchar(8),
	PRIMARY KEY (certno,accidentdate,receivedate,sectioncode,orderno)
);
DROP TABLE IF EXISTS tli.mgreceiver;

CREATE TABLE tli.mgreceiver (
	certno varchar(8) NOT NULL,
	accidentdate varchar(8) NOT NULL,
	receivedate varchar(8) NOT NULL,
	seqno int4 NOT NULL,
	prename varchar(30),
	firstname varchar(60),
	lastname varchar(60),
	"type" varchar(1),
	payamount numeric(12,2),
	address varchar(128),
	tumbon varchar(5),
	zipcode varchar(5),
	mobilephone varchar(10),
	citizenid varchar(13),
	paytype varchar(1),
	banktype varchar(1),
	bankcode varchar(10),
	bankbranch varchar(35),
	bankaccount varchar(15),
	guardianbeneficiary varchar(80),
	ispay varchar(1),
	haveindicia varchar(1),
	countrycode varchar(3),
	claimpaydate varchar(8),
	bookstatus varchar(1),
	chqdate varchar(8),
	chqno varchar(10),
	docno varchar(5),
	isbeneficiarykilled varchar(1),
	birthdate varchar(8),
	PRIMARY KEY (certno,accidentdate,receivedate,seqno)
);
-- Table: tli.name

DROP TABLE IF EXISTS tli.name;

CREATE TABLE tli.name
(
    "nameid" varchar (13),
    "personid" varchar (13) ,
    "prename" varchar (30) ,
    "firstname" varchar (30) ,
    "lastname" varchar (30) ,
    "startdate" varchar (8) ,
	PRIMARY KEY (nameid)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tli.name
    OWNER to postgres;
-- Table: tli.person

DROP TABLE IF EXISTS tli.person;

CREATE TABLE tli.person
(
    "personid" varchar (13) ,
    "referenceid" varchar (13) ,
    "referencetype" varchar (2) ,
    "birthdate" varchar (8) ,
    sex varchar (1) ,
    "customerid" varchar (13) ,
    "bluecard" varchar (1) ,
    reserve varchar (6) ,
	PRIMARY KEY (personid,referenceid)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tli.person
    OWNER to postgres;
﻿-- Table: tli.policy

DROP TABLE IF EXISTS tli.policy;

CREATE TABLE tli.policy
(
    "policyno" varchar (4) ,
    rate varchar (2) ,
    name varchar (50) ,
    type varchar (1) ,
    "effectivedate" varchar (8) ,
    "planname" varchar (60) ,
	"riderplan" varchar (8) ,
    "tlbranch" varchar (60) ,
	PRIMARY KEY (policyno)

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tli.policy
    OWNER to postgres;