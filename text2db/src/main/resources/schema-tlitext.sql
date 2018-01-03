DROP TABLE IF EXISTS tlitext.cert;

CREATE TABLE tlitext.cert (
	policyno text,
	certno text,
	appno text,
	reqdate text,
	nameid text,
	age text,
	smi text,
	lifesum text,
	accidentsum text,
	period text,
	loan_term text,
	lifepremium text,
	extrapremium text,
	tpdpremium text,
	extratpdpremium text,
	addpremium text,
	em text,
	tpd text,
	effectivedate text,
	maturedate text,
	premiumdate text,
	certyyyymm text,
	statcer text,
	statcer2 text,
	statdate2 text,
	informdate1 text,
	paydate1 text,
	amount1 text,
	informdate2 text,
	paydate2 text,
	amount2 text,
	deaddate text,
	"endownmentyear " text,
	deadcause text,
	"receiptflag  " text,
	"referenceno " text,
	reserve text
);
DROP TABLE IF EXISTS tlitext.certlinker;

CREATE TABLE tlitext.certlinker (
	policynohp text,
	certnohp text,
	policynocp text,
	certnocp text
);
DROP TABLE IF EXISTS tlitext.certmapping;

CREATE TABLE tlitext.certmapping (
	policyno text,
	certno text,
	rpolicyno text,
	rpolicyn text
);
DROP TABLE IF EXISTS tlitext.certrider;

CREATE TABLE tlitext.certrider (
	policyno text,
	certno text,
	ridertype text,
	"sum" text,
	premium text,
	extrapremium text,
	riderstatus text,
	riderstatusdate text,
	reserve text
);
DROP TABLE IF EXISTS tlitext.compensateid;

CREATE TABLE tlitext.compensateid (
	compensateid text,
	referenceid text
);
DROP TABLE IF EXISTS tlitext.customer;

CREATE TABLE tlitext.customer (
	customerid text,
	referenceid text,
	referencetype text,
	birthdate text,
	sex text,
	contactnameid text,
	contactaddressid text
);
DROP TABLE IF EXISTS tlitext.detcert;

CREATE TABLE tlitext.detcert (
	policyno text,
	certno text,
	code text,
	address1 text,
	address2 text,
	telephoneno text,
	mariagestatus text,
	recname1 text,
	percent1 text,
	relationshipcode1 text,
	recname2 text,
	percent2 text,
	relationshipcode2 text,
	recname3 text,
	percent3 text,
	relationshipcode3 text,
	analist text,
	prmiseno text,
	prmiseno2 text,
	loantype text,
	med text,
	reserve text 
) ;
DROP TABLE IF EXISTS tlitext.mgclaim;
CREATE TABLE tlitext.mgclaim (
	certno text,
	accidentdate text,
	receivedate text,
	claimtype text,
	sectioncode text,
	orderno text,
	referenceno text,
	linkerno text,
	okdate text,
	policyno text
)
WITH (
	OIDS=FALSE
) ;
DROP TABLE IF EXISTS tlitext.mghis;

CREATE TABLE tlitext.mghis (
	certno text,
	accidentdate text,
	receivedate text,
	claimtype text,
	seqno text,
	remarkdate text,
	remarkno text,
	remark text,
	employeeid text,
	rectime text 
) ;
DROP TABLE IF EXISTS tlitext.mginsmemo;

CREATE TABLE tlitext.mginsmemo (
	certno text,
	accidentdate text,
	receivedate text,
	memocode text,
	detail1 text,
	detail2 text,
	savedate text 
) ;
DROP TABLE IF EXISTS tlitext.mginterest;

CREATE TABLE tlitext.mginterest (
	certno text, 
	accidentdate text, 
	receivedate text, 
	ridertype text,
	paytype text, 
	startdate text,
	enddate text,
	"day" text,
	payamount text,
	interestamount text
);
DROP TABLE IF EXISTS tlitext.mgorder;
CREATE TABLE tlitext.mgorder (
	sectioncode text,
	orderno text,
	receivetime text,
	causecode text,
	causedetail text,
	receiverid text,
	considerid text,
	admitdate text,
	admitflag text,
	billingorderno text,
	interimflag text,
	hospitalcode text,
	receivedocdate text
)
WITH (
	OIDS=FALSE
) ;
DROP TABLE IF EXISTS tlitext.mgpay;
CREATE TABLE tlitext.mgpay (
	certno text,
	receivedate text,
	accidentdate text,
	sectioncode text,
	orderno text,
	policystatus text,
	policystatusdate text,
	policystatus2 text,
	policystatusdate2 text,
	branchcode text,
	servicebranch text,
	claimtype text,
	paytype text,
	proofinsuredage text,
	disabilitytype text,
	disnumber text,
	payrate text,
	payamount text,
	accdamount text,
	surrenderamount text,
	returnamount text,
	deductamount text,
	claimokdate text,
	claimpaydate text,
	allowtype text
)
WITH (
	OIDS=FALSE
) ;
DROP TABLE IF EXISTS tlitext.mgpayrider;

CREATE TABLE tlitext.mgpayrider (
	certno text,
	accidentdate text,
	receivedate text,
	sectioncode text,
	orderno text,
	policystatus text,
	policystatusdate text,
	policystatus2 text,
	policystatusdate2 text,
	branchcode text,
	servicebranch text,
	amestartdate text,
	ameday text,
	ameexpense text,
	amepayment text,
	tdday text,
	tdstartdate text,
	tdpayment text,
	returnamount text,
	deductamount text,
	voiddate text,
	claimokdate text,
	claimpaydate text 
) ;
DROP TABLE IF EXISTS tlitext.mgreceiver;

CREATE TABLE tlitext.mgreceiver (
	certno text,
	accidentdate text,
	receivedate text,
	seqno text,
	prename text,
	firstname text,
	lastname text,
	"type" text,
	payamount text,
	address text,
	tumbon text,
	zipcode text,
	mobilephone text,
	citizenid text,
	paytype text,
	banktype text,
	bankcode text,
	bankbranch text,
	bankaccount text,
	guardianbeneficiary text,
	ispay text,
	haveindicia text,
	countrycode text,
	"claimpaydate " text,
	bookstatus text,
	chqdate text,
	chqno text,
	docno text,
	isbeneficiarykilled text,
	birthdate text
);
DROP TABLE IF EXISTS tlitext.name;
CREATE TABLE tlitext.name (
	nameid text,
	personid text,
	prename text,
	firstname text,
	lastname text,
	startdate text
)
WITH (
	OIDS=FALSE
) ;
DROP TABLE IF EXISTS tlitext.person;
CREATE TABLE tlitext.person (
	personid text,
	referenceid text,
	referencetype text,
	birthdate text,
	sex text,
	customerid text,
	bluecard text,
	reserve text
)
WITH (
	OIDS=FALSE
) ;
DROP TABLE IF EXISTS tlitext.policy;
CREATE TABLE tlitext.policy (
	policyno text,
	rate text,
	"name" text,
	"type" text,
	effectivedate text,
	planname text,
	riderplan text,
	tlbranch text
)
WITH (
	OIDS=FALSE
) ;