-- Table: tlp.claimpayment

-- DROP TABLE tlp.claimpayment;

CREATE TABLE tlp.claimpayment
(
    payment_id text COLLATE pg_catalog."default",
    registerseq text COLLATE pg_catalog."default",
    claimno text COLLATE pg_catalog."default",
    printdate text COLLATE pg_catalog."default",
    requestby text COLLATE pg_catalog."default",
    approveby1 text COLLATE pg_catalog."default",
    approveby2 text COLLATE pg_catalog."default",
    authorizedby1 text COLLATE pg_catalog."default",
    authorizedby2 text COLLATE pg_catalog."default",
    totalamt text COLLATE pg_catalog."default",
    paid_date text COLLATE pg_catalog."default",
    createdate text COLLATE pg_catalog."default",
    createuser text COLLATE pg_catalog."default",
    updateuser text COLLATE pg_catalog."default",
    updatedate text COLLATE pg_catalog."default",
    sysprintstatus text COLLATE pg_catalog."default",
    canceldate text COLLATE pg_catalog."default",
    lettertype text COLLATE pg_catalog."default",
    reqdate text COLLATE pg_catalog."default",
    financedate text COLLATE pg_catalog."default",
    respdate text COLLATE pg_catalog."default",
    deadlinedate text COLLATE pg_catalog."default",
    payrate text COLLATE pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.claimpayment
    OWNER to postgres;
	
-- Table: tlp.claimpaymentdetail

-- DROP TABLE tlp.claimpaymentdetail;

CREATE TABLE tlp.claimpaymentdetail
(
    paymentdt_id text COLLATE pg_catalog."default",
    payment_id text COLLATE pg_catalog."default",
    paymenttype text COLLATE pg_catalog."default",
    payeename text COLLATE pg_catalog."default",
    pamentamt text COLLATE pg_catalog."default",
    method text COLLATE pg_catalog."default",
    relation text COLLATE pg_catalog."default",
    receipt_name text COLLATE pg_catalog."default",
    address1 text COLLATE pg_catalog."default",
    address2 text COLLATE pg_catalog."default",
    tumbon text COLLATE pg_catalog."default",
    amphor text COLLATE pg_catalog."default",
    province text COLLATE pg_catalog."default",
    zipcode text COLLATE pg_catalog."default",
    claimbenefit text COLLATE pg_catalog."default",
    bankid text COLLATE pg_catalog."default",
    bankname text COLLATE pg_catalog."default",
    accno text COLLATE pg_catalog."default",
    returncheque text COLLATE pg_catalog."default",
    returndate text COLLATE pg_catalog."default",
    payee_no text COLLATE pg_catalog."default",
    createdate text COLLATE pg_catalog."default",
    createuser text COLLATE pg_catalog."default",
    updatedate text COLLATE pg_catalog."default",
    updateuser text COLLATE pg_catalog."default",
    printref text COLLATE pg_catalog."default",
    printref_runno text COLLATE pg_catalog."default",
    chequeno text COLLATE pg_catalog."default",
    receivechequedate text COLLATE pg_catalog."default",
    remarkpayment text COLLATE pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.claimpaymentdetail
    OWNER to postgres;
	
-- Table: tlp.claimregisterdetail

-- DROP TABLE tlp.claimregisterdetail;

CREATE TABLE tlp.claimregisterdetail
(
    regdtlseq text COLLATE pg_catalog."default",
regdtlregisterno text COLLATE pg_catalog."default",
regdtlclaimrunno text COLLATE pg_catalog."default",
regdtlclaimno text COLLATE pg_catalog."default",
regdtlletterrunno text COLLATE pg_catalog."default",
regdtlletterno text COLLATE pg_catalog."default",
regdtlclaimgroup text COLLATE pg_catalog."default",
regdtlclaimcausecode text COLLATE pg_catalog."default",
regdtlclaimcauseen text COLLATE pg_catalog."default",
regdtlclaimcauseth text COLLATE pg_catalog."default",
regdtldateofmedicalreceive text COLLATE pg_catalog."default",
regdtldateofmedicalreport text COLLATE pg_catalog."default",
regdtldateofcompletedoc text COLLATE pg_catalog."default",
regdtlhospitalcode text COLLATE pg_catalog."default",
regdtlhospitalname text COLLATE pg_catalog."default",
regdtlpatientdeptcode text COLLATE pg_catalog."default",
regdtlpatientdept text COLLATE pg_catalog."default",
regdtldateofopd text COLLATE pg_catalog."default",
regdtldateofaccident text COLLATE pg_catalog."default",
regdtldateofdeath text COLLATE pg_catalog."default",
regdtldateofadmission text COLLATE pg_catalog."default",
regdtldateofdischarge text COLLATE pg_catalog."default",
regdtldateofoccurred text COLLATE pg_catalog."default",
regdtldurationfrom text COLLATE pg_catalog."default",
regdtldurationto text COLLATE pg_catalog."default",
regdtldurationdays text COLLATE pg_catalog."default",
regdtlestimateclaim text COLLATE pg_catalog."default",
regdtlclaimexpense text COLLATE pg_catalog."default",
regdtlcoinsurancecode text COLLATE pg_catalog."default",
regdtldeclinestatus text COLLATE pg_catalog."default",
regdtltotalclaim text COLLATE pg_catalog."default",
regdtltotalttdpercentage text COLLATE pg_catalog."default",
regdtltotalttdamount text COLLATE pg_catalog."default",
regdtltotaltpdpercentage text COLLATE pg_catalog."default",
regdtltotaltpdamount text COLLATE pg_catalog."default",
regdtladjustcode text COLLATE pg_catalog."default",
regdtladjustpayment text COLLATE pg_catalog."default",
regdtlinterest text COLLATE pg_catalog."default",
regdtltotalamount text COLLATE pg_catalog."default",
regdtltotalexgratiaamount text COLLATE pg_catalog."default",
regdtlvoidamount text COLLATE pg_catalog."default",
regdtlsavedenyamount text COLLATE pg_catalog."default",
regdtlpartialpayment text COLLATE pg_catalog."default",
regdtlchequeno text COLLATE pg_catalog."default",
regdtlpaidtopartner text COLLATE pg_catalog."default",
regdtlpaidtobeneficiary text COLLATE pg_catalog."default",
regdtlclaimfollowup text COLLATE pg_catalog."default",
regdtlclaimremark text COLLATE pg_catalog."default",
regdtlclaimflag text COLLATE pg_catalog."default",
regdtlregisterdate text COLLATE pg_catalog."default",
regdtlregister text COLLATE pg_catalog."default",
regdtlapprovestatus text COLLATE pg_catalog."default",
regdtlapprovedate text COLLATE pg_catalog."default",
regdtlapproval text COLLATE pg_catalog."default",
regdtlpolicystatus text COLLATE pg_catalog."default",
regdtlhbcflag text COLLATE pg_catalog."default",
registerseq text COLLATE pg_catalog."default",
claimtypeseq text COLLATE pg_catalog."default",
coinsuranceseq text COLLATE pg_catalog."default",
risktypeseq text COLLATE pg_catalog."default",
datatype text COLLATE pg_catalog."default",
payment_id text COLLATE pg_catalog."default",
sysuseclaim text COLLATE pg_catalog."default",
regdtldblindemnity text COLLATE pg_catalog."default",
regdtlclaimnoteapprove text COLLATE pg_catalog."default",
regdtlcleanstatus text COLLATE pg_catalog."default",
regdtlnote text COLLATE pg_catalog."default",
regdtlcaseno text COLLATE pg_catalog."default",
regdtlfaxclaim text COLLATE pg_catalog."default",
regdtlbatchno text COLLATE pg_catalog."default",
regdtlicdten1 text COLLATE pg_catalog."default",
regdtlicdteneng1 text COLLATE pg_catalog."default",
regdtlicdtenth1 text COLLATE pg_catalog."default",
regdtlicdten2 text COLLATE pg_catalog."default",
regdtlicdteneng2 text COLLATE pg_catalog."default",
regdtlicdtenth2 text COLLATE pg_catalog."default",
regdtlicdten3 text COLLATE pg_catalog."default",
regdtlicdteneng3 text COLLATE pg_catalog."default",
regdtlicdtenth3 text COLLATE pg_catalog."default",
regdtltpaclaimtype text COLLATE pg_catalog."default",
regdtllettermemocreatedate text COLLATE pg_catalog."default",
regdtllettermemouser text COLLATE pg_catalog."default",
regdtllettermemostatus text COLLATE pg_catalog."default",
regdtllos text COLLATE pg_catalog."default",
regdtlbenefitday text COLLATE pg_catalog."default",
regdtlclonestatus text COLLATE pg_catalog."default",
regdtlseqtpa text COLLATE pg_catalog."default",
regdtlhismaprpt text COLLATE pg_catalog."default",
regdtlclaimstatus text COLLATE pg_catalog."default",
regdtlletterdate text COLLATE pg_catalog."default",
regdtlletterpendingdate text COLLATE pg_catalog."default",
regdtlletterdelaydate text COLLATE pg_catalog."default",
regdtlletterreminddate text COLLATE pg_catalog."default",
regdtlletterclosedate text COLLATE pg_catalog."default",
regdtlletterpaymentdate text COLLATE pg_catalog."default",
regdtllettervoiddate text COLLATE pg_catalog."default",
regdtlletterdenydate text COLLATE pg_catalog."default",
regdtlcalsa text COLLATE pg_catalog."default",
regdtlestimateclaimamt text COLLATE pg_catalog."default",
regdtlperproposal text COLLATE pg_catalog."default",
claimtypesubseq text COLLATE pg_catalog."default",
claimtypesubcode text COLLATE pg_catalog."default",
regdtlclaimcausecancel text COLLATE pg_catalog."default",
paytype text COLLATE pg_catalog."default",
partnercode text COLLATE pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.claimregisterdetail
    OWNER to postgres;
	
-- Table: tlp.claimregisterheader

-- DROP TABLE tlp.claimregisterheader;

CREATE TABLE tlp.claimregisterheader
(
    registerseq text COLLATE pg_catalog."default",
    regcustomerbranchname text COLLATE pg_catalog."default",
    regcustomercode text COLLATE pg_catalog."default",
    regcustomercertificateno text COLLATE pg_catalog."default",
	regcustomerloanno text COLLATE pg_catalog."default",
    regcustomeracctno text COLLATE pg_catalog."default",
	regcustomeridcard text COLLATE pg_catalog."default",
	regcustomerprefix text COLLATE pg_catalog."default",
	regcustomername text COLLATE pg_catalog."default",
	regcustomerfname text COLLATE pg_catalog."default",
    regcustomerlname text COLLATE pg_catalog."default",
	regcustomerdob text COLLATE pg_catalog."default",
	regcustomerage text COLLATE pg_catalog."default",
	regcustomergender text COLLATE pg_catalog."default",
	regcustomerstatus text COLLATE pg_catalog."default",
	regcustomercardtype text COLLATE pg_catalog."default",
	regcustomercardno text COLLATE pg_catalog."default",
	regcustomercardlimit text COLLATE pg_catalog."default",
	regcustomercardinstl text COLLATE pg_catalog."default",
	regcustomeraddr01 text COLLATE pg_catalog."default",
	regcustomeraddr02 text COLLATE pg_catalog."default",
	regcustomeraddr03 text COLLATE pg_catalog."default",
	regcustomerprovince text COLLATE pg_catalog."default",
	regcustomerzipcode text COLLATE pg_catalog."default",
	regcustomertelephone text COLLATE pg_catalog."default",
	regcustomerloanamount text COLLATE pg_catalog."default",
	regcustomersumassured text COLLATE pg_catalog."default",
	regcustomerpremium text COLLATE pg_catalog."default",
	regcustomerdurationinsurance text COLLATE pg_catalog."default",
	regcustomermodeofpayment text COLLATE pg_catalog."default",
	regcustomersaledate text COLLATE pg_catalog."default",
	regcustomeruwstatuscode text COLLATE pg_catalog."default",
	regcustomeruwstatusdesc text COLLATE pg_catalog."default",
	regcustomercontractdate text COLLATE pg_catalog."default",
	regcustomerissuedate text COLLATE pg_catalog."default",
	regcustomereffectivedate text COLLATE pg_catalog."default",
	regcustomerexpiredate text COLLATE pg_catalog."default",
	regcustomervehreceivedate text COLLATE pg_catalog."default",
	regcustomerfirstpaymentdate text COLLATE pg_catalog."default",
	regcustomerlastpaymentdate text COLLATE pg_catalog."default",
	regcustomerpaidtodate text COLLATE pg_catalog."default",
	regcustomerpolicystatuscode text COLLATE pg_catalog."default",
	regcustomerpolicystatusdesc text COLLATE pg_catalog."default",
	regcustomercanceldate text COLLATE pg_catalog."default",
	regcustomercancelreason text COLLATE pg_catalog."default",
	regcustomercanceldescription text COLLATE pg_catalog."default",
	regcustomercancelletterno text COLLATE pg_catalog."default",
	claimno text COLLATE pg_catalog."default",
	productseq text COLLATE pg_catalog."default",
	datatype text COLLATE pg_catalog."default",
	regcustomerchannel text COLLATE pg_catalog."default",
	regcustomerrefid text COLLATE pg_catalog."default",
	age text COLLATE pg_catalog."default"

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.claimregisterheader
    OWNER to postgres;
-- Table: tlp.customerballoon

DROP TABLE IF EXISTS tlp.customerballoon;

CREATE TABLE tlp.customerballoon
(
    "policyno" text collate pg_catalog."default",
    "certno" text collate pg_catalog."default",
    "policynoballoon" text collate pg_catalog."default",
    "certnobolloon" text collate pg_catalog."default",
    "loancontractno" text collate pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.customerballoon
    OWNER to postgres;
-- Table: tlp.customerinfo

DROP TABLE IF EXISTS tlp.customerinfo;

CREATE TABLE tlp.customerinfo
(
    "productname" text collate pg_catalog."default",
    "policyno" text collate pg_catalog."default",
    "productcode" text collate pg_catalog."default",
    "certificateno" text collate pg_catalog."default",
    "saledate" text collate pg_catalog."default",
    "branchname" text collate pg_catalog."default",
    "customercode" text collate pg_catalog."default",
    "accountno" text collate pg_catalog."default",
    "loanno" text collate pg_catalog."default",
    "totalofloan" text collate pg_catalog."default",
    "sa" text collate pg_catalog."default",
    "prem" text collate pg_catalog."default",
    "durationinsurance" text collate pg_catalog."default",
    "insurancestatus" text collate pg_catalog."default",
    "effectivedate" text collate pg_catalog."default",
    "expireddate" text collate pg_catalog."default",
    "customerstatus" text collate pg_catalog."default",
    "canceldate" text collate pg_catalog."default",
    "cancelreason" text collate pg_catalog."default",
    "canceldescription" text collate pg_catalog."default",
    "channel" text collate pg_catalog."default",
    "prefix" text collate pg_catalog."default",
    "nameth" text collate pg_catalog."default",
    "surnameth" text collate pg_catalog."default",
    "birthdate" text collate pg_catalog."default",
    "age" text collate pg_catalog."default",
    "weight" text collate pg_catalog."default",
    "height" text collate pg_catalog."default",
    "gender" text collate pg_catalog."default",
    "status" text collate pg_catalog."default",
    "nationid" text collate pg_catalog."default",
    "creditcardno" text collate pg_catalog."default",
    "expiredcreditcard" text collate pg_catalog."default",
    "address1" text collate pg_catalog."default",
    "address2" text collate pg_catalog."default",
    "addressoffice1" text collate pg_catalog."default",
    "addressoffice2" text collate pg_catalog."default",
    "nameofbenefit1" text collate pg_catalog."default",
    "nameofbenefit2" text collate pg_catalog."default",
    "nameofbenefit3" text collate pg_catalog."default",
    "nameofbenefit4" text collate pg_catalog."default",
    "relationship1" text collate pg_catalog."default",
    "relationship2" text collate pg_catalog."default",
    "relationship3" text collate pg_catalog."default",
    "relationship4" text collate pg_catalog."default",
    "hometel" text collate pg_catalog."default",
    "mobiletel" text collate pg_catalog."default",
    "officetel" text collate pg_catalog."default",
    "officercodesale" text collate pg_catalog."default",
    "salenameth" text collate pg_catalog."default",
    "managercode" text collate pg_catalog."default",
    "dateprintcert" text collate pg_catalog."default",
    "postbackdate" text collate pg_catalog."default",
    "cancelletterno" text collate pg_catalog."default",
    "printcancelletterdate" text collate pg_catalog."default",
    "partnercode" text collate pg_catalog."default",
    "partnername" text collate pg_catalog."default",
    "databasesource" text collate pg_catalog."default",
    "refname" text collate pg_catalog."default",
    "refnationid" text collate pg_catalog."default",
    "refcreditcardno" text collate pg_catalog."default",
    "facility" text collate pg_catalog."default",
    "uwdescription" text collate pg_catalog."default",
    "uwstatus" text collate pg_catalog."default",
    "tmksaledate" text collate pg_catalog."default",
    "coverage" text collate pg_catalog."default",
    "paidtodate" text collate pg_catalog."default",
    "extrarate" text collate pg_catalog."default",
    "voicetag" text collate pg_catalog."default",
    "deathdate" text collate pg_catalog."default",
    "customerloanapprovedate" text collate pg_catalog."default",
    "lob" text collate pg_catalog."default",
    "canceltransactiondate" text collate pg_catalog."default",
    "oldaccountno" text collate pg_catalog."default",
    "customeroccupationtext" text collate pg_catalog."default",
    "loaninstallment1stdue" text collate pg_catalog."default",
    "customercontactofficepay" text collate pg_catalog."default",
    "percentofbenefitciary1" text collate pg_catalog."default",
    "percentofbenefitciary2" text collate pg_catalog."default",
    "percentofbenefitciary3" text collate pg_catalog."default",
    "percentofbenefitciary4" text collate pg_catalog."default",
    "downplaneffectivedate" text collate pg_catalog."default",
    "date_sosover" text collate pg_catalog."default",
    "customerduration" text collate pg_catalog."default",
    "med" text collate pg_catalog."default",
    "customernation" text collate pg_catalog."default",
    "endorsedate" text collate pg_catalog."default",
    "informdate1" text collate pg_catalog."default",
    "paydate1" text collate pg_catalog."default",
    amount1 text collate pg_catalog."default",
    "informdate2" text collate pg_catalog."default",
    "paydate2" text collate pg_catalog."default",
    amount2 text collate pg_catalog."default",
    "deaddate" text collate pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.customerinfo
    OWNER to postgres;
﻿-- Table: "TLP"."CustomerSA"

DROP TABLE IF EXISTS tlp.customersa;

CREATE TABLE tlp.customersa
(
    "customercode" text collate pg_catalog."default",
    "policyno" text collate pg_catalog."default",
    "sa_lifetpd" text collate pg_catalog."default",
    "sa_life" text collate pg_catalog."default",
    "sa_tpd" text collate pg_catalog."default",
    "sa_td" text collate pg_catalog."default",
    "sa_add" text collate pg_catalog."default",
    "sa_adb" text collate pg_catalog."default",
    "sa_ha" text collate pg_catalog."default",
    "sa_hb" text collate pg_catalog."default",
    "sa_me" text collate pg_catalog."default",
    "sa_pa" text collate pg_catalog."default",
    "sa_ph" text collate pg_catalog."default",
    "sa_ci" text collate pg_catalog."default",
    "flaglife" text collate pg_catalog."default",
    "flaglifetpd" text collate pg_catalog."default",
    "ia" text collate pg_catalog."default",
    "sa" text collate pg_catalog."default",
    "transdate" text collate pg_catalog."default",
    "mi_amount" text collate pg_catalog."default",
    "expiry_life" text collate pg_catalog."default",
    "expiry_tpd" text collate pg_catalog."default",
    "expiry_td" text collate pg_catalog."default",
    "expiry_add" text collate pg_catalog."default",
    "expiry_adb" text collate pg_catalog."default",
    "expiry_ha" text collate pg_catalog."default",
    "expiry_hb" text collate pg_catalog."default",
    "expiry_me" text collate pg_catalog."default",
    "expiry_pa" text collate pg_catalog."default",
    "expiry_ph" text collate pg_catalog."default",
    "expiry_ci" text collate pg_catalog."default",
    "sa_ma" text collate pg_catalog."default",
    "expiry_ma" text collate pg_catalog."default",
    "sa_mc" text collate pg_catalog."default",
    "expiry_mc" text collate pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.customersa
    OWNER to postgres;
﻿-- Table: tlp.masproduct

-- DROP TABLE tlp.masproduct;

CREATE TABLE tlp.masproduct
(
    productseq text COLLATE pg_catalog."default",
    policyno text COLLATE pg_catalog."default",
    productcode text COLLATE pg_catalog."default",
    productplan text COLLATE pg_catalog."default",
    productnameen text COLLATE pg_catalog."default",
    productnameth text COLLATE pg_catalog."default",
    productgroup text COLLATE pg_catalog."default",
    productstatus text COLLATE pg_catalog."default",
    partnerseq text COLLATE pg_catalog."default",
    producttype text COLLATE pg_catalog."default",
    partnerlettername text COLLATE pg_catalog."default",
    percent_life text COLLATE pg_catalog."default",
    percent_tpd text COLLATE pg_catalog."default",
    percent_add text COLLATE pg_catalog."default",
    percent_adb text COLLATE pg_catalog."default",
    percent_pa text COLLATE pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.masproduct
    OWNER to postgres;
﻿-- Table: tlp.masproductcoverage

-- DROP TABLE tlp.masproductcoverage;

CREATE TABLE tlp.masproductcoverage
(
    productcoverageseq text COLLATE pg_catalog."default",
    productcoveragepaymentmode text COLLATE pg_catalog."default",
    productcoveragesa text COLLATE pg_catalog."default",
    productcoverageamount text COLLATE pg_catalog."default",
    productcoveragewaitingperiod text COLLATE pg_catalog."default",
    productcoverageexcludeperiod text COLLATE pg_catalog."default",
    productcoveragedesc text COLLATE pg_catalog."default",
    productseq text COLLATE pg_catalog."default",
    riskcoverageseq text COLLATE pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.masproductcoverage
    OWNER to postgres;
﻿-- Table: tlp.masproductcoverageclaim

-- DROP TABLE tlp.masproductcoverageclaim;

CREATE TABLE tlp.masproductcoverageclaim
(
    productcoverageclaimseq text COLLATE pg_catalog."default",
    productcoverageclaimonetime text COLLATE pg_catalog."default",
    productcoverageseq text COLLATE pg_catalog."default",
    claimtypeseq text COLLATE pg_catalog."default",
    risktypeseq text COLLATE pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.masproductcoverageclaim
    OWNER to postgres;
-- Table: tlp.payment

DROP TABLE IF EXISTS tlp.payment;

CREATE TABLE tlp.payment
(
    "partnercode" text collate pg_catalog."default",
    "policyno" text collate pg_catalog."default",
    "productcode" text collate pg_catalog."default",
    "customercode" text collate pg_catalog."default",
    "duedate" text collate pg_catalog."default",
    "senddate" text collate pg_catalog."default",
    "ob" text collate pg_catalog."default",
    "paymentdate" text collate pg_catalog."default",
    "premiumamt" text collate pg_catalog."default",
    "adjustpremium" text collate pg_catalog."default",
    "typeofpayment" text collate pg_catalog."default",
    "accno" text collate pg_catalog."default",
    "refund" text collate pg_catalog."default",
    "dateofrefund" text collate pg_catalog."default",
    "invoiceno" text collate pg_catalog."default",
    "monthenddate" text collate pg_catalog."default",
    "pay_date" text collate pg_catalog."default",
    "refund_amount" text collate pg_catalog."default",
    "collecteddate" text collate pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.payment
    OWNER to postgres;
-- Table: "TLP"."SplitPremiumAmount"

DROP TABLE IF EXISTS tlp.splitpremiumamount;

CREATE TABLE tlp.splitpremiumamount
(
    "productid" text collate pg_catalog."default",
    "grouppolicyno" text collate pg_catalog."default",
    "customercode" text collate pg_catalog."default",
    "totpremium" text collate pg_catalog."default",
    "lifepremium" text collate pg_catalog."default",
    "deathpremium" text collate pg_catalog."default",
    "tpdpremium" text collate pg_catalog."default",
    "ttdpremium" text collate pg_catalog."default",
    "tdpremium" text collate pg_catalog."default",
    "papremium" text collate pg_catalog."default",
    "adbpremium" text collate pg_catalog."default",
    "addpremium" text collate pg_catalog."default",
    "rccpremium" text collate pg_catalog."default",
    "mapremium" text collate pg_catalog."default",
    "mcpremium" text collate pg_catalog."default",
    "mepremium" text collate pg_catalog."default",
    "hbpremium" text collate pg_catalog."default",
    "hapremium" text collate pg_catalog."default",
    "hspremium" text collate pg_catalog."default",
    "ddpremium" text collate pg_catalog."default",
    "lifetpdpremium" text collate pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE tlp.splitpremiumamount
    OWNER to postgres;