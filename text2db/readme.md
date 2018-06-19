# TEXT2DB
This is the Text2DB program. The main focus has on MASIC file and this program work with MASIC file read and write into Database
## Getting Started
These instruction will get you a copy the project up running on your local machine and testing.

### How to run this program
First thing you must have Java IDE to run this program (e.g Eclipse, IntelliJ, NetBean) 

1) Change property file on your program go to `/src/main/resources/` `text2db.cloud.properties` for cloud profile and `text2db.sit.properties` for SIT profile.
    
    dataSource 
    ```
    dataSource.jdbcUrl=jdbc:postgresql://<url>:5432/<database>
    dataSource.driverClass=org.postgresql.Driver
    dataSource.user=<username>
    dataSource.password=<password>
    ```
    
    targetSource for replicate job this target source for writing data from datasource to targetsource
    ```
    targetSource.jdbcUrl=jdbc:postgresql://<url>:5432/<database>
    targetSource.driverClass=org.postgresql.Driver
    targetSource.user=<username>
    targetSource.password=<password>
    ```

2) Set resource path 
   ```
   tlp.source.file.path=<path>
   tlitext.source.file.path=<path>
   dm.source.file.path=file:<path>
   ktc.source.file.path=file:<path>
   billing.source.file.path=file:<path>
    ``` 

3) Run maven for build this program 
    ```
    mvn clean install <args>
    ``` 
    if you want to run this program for SIT environment 
    ```
    mvn clean install -Psit
    ``` 
    and cloud enviroment 
    ```
    mvn clean install -Pcloud
    ```
    

4) Open IDE Program and change Run configurations for running about job you want to run 
![picture](https://i.imgur.com/TwmirWf.png)
Main class `th.co.ipassion.testtool.MainApplication`
Program arguments `<see other arguments below this as you want>`

### Schema 
* Dm
* Tlitext
* Tlp
* billing
* ktc

### Program Arguments 

#### Import Text to Database
##### Schema Dm
* dmAddressJob
* dmBeneficiaryJob
* dmCertJob
* dmCertLinkerJob
* dmCertMappingJob
* dmCertRiderJob
* dmCompensateIdJob
* dmCustomerJob
* dmDetCertJob
* dmExtrapremiumJob
* dmMgClaimJob
* dmMgHisJob
* dmMgInsMemoJob
* dmMgInterestJob
* dmMgOrderJob
* dmMgPayJob
* dmMgPayRiderJob
* dmMgReceiverJob
* dmNameJob
* dmOrctrlJob
* dmOrdmastJob
* dmPersonJob
* dmPolicyJob
* dmQueueJob
* dmRemarkJob
* dmRiderJob
* dmRpriderJob
* dmBnfordoJob
* dmClaimJob
* dmCmemJob
* dmDhsordoJob
* dmDthordJob
* dmEclmJob
* dmHordodsJob
* dmIcd10Job
* dmInsmemoJob
* dmHopitalJob
* dmOacmJob
* dmOdisJob
* dmOrsdJob
* dmPayJob
* dmQueueJob
* dmRidordoJob
* dmVoiordoJob

##### schema Tlitext
* tlitextAddressJob
* tlitextBeneficiaryJob
* tlitextCertJob
* tlitextCertLinkerJob
* tlitextCertMappingJob
* tlitextCertRider
* tlitextCompensateIdJob
* tlitextCustomerJob
* tlitextDetCertJob
* tlitextExtrapremiumJob
* tlitextMgClaimJob
* tlitextMgHisJob
* tlitextMgInsMemoJob
* tlitextMgInterestJob
* tlitextMgOrderJob
* tlitextMgPayJob
* tlitextMgPayRiderJob
* tlitextMgReceiverJob
* tlitextNameJob
* tlitextOrctrlJob
* tlitextOrdmastJob
* tlitextPersonJob
* tlitextPolicyJob
* tlitextQueueJob
* tlitextRemarkJob
* tlitextRiderJob
* tlitextRpriderJob
* tlitextBnfordoJob
* tlitextClaimJob
* tlitextCmemJob
* tlitextDhsordoJob
* tlitextDthordJob
* tlitextEclmJob
* tlitextHordodsJob
* tlitextIcd10Job
* tlitextInsmemoJob
* tlitextHopitalJob
* tlitextOacmJob
* tlitextOdisJob
* tlitextOrsdJob
* tlitextPayJob
* tlitextQueueJob
* tlitextRidordoJob
* tlitextVoiordoJob


##### schema Tlp
* tlpAppCustomerJob
* tlpAppCustomerAddressJob
* tlpClaimPaymentJob
* tlpClaimPaymentDetailJob
* tlpClaimRegisterDetailJob
* tlpClaimRegisterHeaderJob
* tlpCustomerBalloonJob
* tlpCustomerInfoJob
* tlpCustomerSaJob
* tlpHistoryStatusJob
* tlpMasProductJob
* tlpMasProductCoverageJob
* tlpMasProductCoverageClaimJob
* tlpMasRiskTypeJob
* tlpPaymentJob
* tlpPolicyBeneficiaryJob
* tlpPolicyMasterJob
* tlpPolicyPaidJob
* tlpPolicyRiderJob
* tlpSplitPremiumAmountJob
* tlpRpRiderJob

##### schema Billing

* billingSplitPremiumAmount2Job
* billingHistoryExportJob
* billingHistoryDownPlanJob
* billingMemberMasterJob
* billingSplitPremiumAmount2Job
* billingPaidHistoryJob
* billingCancelRefundJob

##### schema Ktc
* soon

#### Replicate data from Database to another Database
##### Schema dm
* repDmAddressJob
* repDmBeneficiaryJob
* repDmCertJob
* repDmCertLinkerJob
* repDmCertMappingJob
* repDmCertRider
* repDmCompensateIdJob
* repDmCustomerJob
* repDmDetCertJob
* repDmExtrapremiumJob
* repDmMgClaimJob
* repDmMgHisJob
* repDmMgInsMemoJob
* repDmMgInterestJob
* repDmMgOrderJob
* repDmMgPayJob
* repDmMgPayRiderJob
* repDmMgReceiverJob
* repDmNameJob
* repDmOrctrlJob
* repDmOrdmastJob
* repDmPersonJob
* repDmPolicyJob
* repDmQueueJob
* repDmRemarkJob
* repDmRiderJob
* repDmRpriderJob
* repDmBnfordoJob
* repDmClaimJob
* repDmCmemJob
* repDmDhsordoJob
* repDmDthordJob
* repDmEclmJob
* repDmHordodsJob
* repDmIcd10Job
* repDmInsmemoJob
* repDmHopitalJob
* repDmOacmJob
* repDmOdisJob
* repDmOrsdJob
* repDmPayJob
* repDmQueueJob
* repDmRidordoJob
* repDmVoiordoJob

##### Schema Tlitext 
* repTlitextAddressJob
* repTlitextBeneficiaryJob
* repTlitextCertJob
* repTlitextCertLinkerJob
* repTlitextCertMappingJob
* repTlitextCertRiderJob
* repTlitextCompensateIdJob
* repTlitextCustomerJob
* repTlitextDetCertJob
* repTlitextExtrapremiumJob
* repTlitextMgClaimJob
* repTlitextMgHisJob
* repTlitextMgInsMemoJob
* repTlitextMgInterestJob
* repTlitextMgOrderJob
* repTlitextMgPayJob
* repTlitextMgPayRiderJob
* repTlitextMgReceiverJob
* repTlitextNameJob
* repTlitextOrctrlJob
* repTlitextOrdmastJob
* repTlitextPersonJob
* repTlitextPolicyJob
* repTlitextQueueJob
* repTlitextRemarkJob
* repTlitextRiderJob
* repTlitextRpriderJob
* repTlitextBnfordoJob
* repTlitextClaimJob
* repTlitextCmemJob
* repTlitextDhsordoJob
* repTlitextDthordJob
* repTlitextEclmJob
* repTlitextHordodsJob
* repTlitextIcd10Job
* repTlitextInsmemoJob
* repTlitextHopitalJob
* repTlitextOacmJob
* repTlitextOdisJob
* repTlitextOrsdJob
* repTlitextPayJob
* repTlitextQueueJob
* repTlitextRidordoJob
* repTlitextVoiordoJob

##### Schema Tlp 
* repTlpAppCustomerJob
* repTlpAppCustomerAddressJob
* repTlpClaimPaymentJob
* repTlpClaimPaymentDetailJob
* repTlpClaimRegisterDetailJob
* repTlpClaimRegisterHeaderJob
* repTlpCustomerBalloonJob
* repTlpCustomerInfoJob
* repTlpCustomerSaJob
* repTlpHistoryStatusJob
* repTlpMasProductJob
* repTlpMasProductCoverageJob
* repTlpMasProductCoverageClaimJob
* repTlpMasRiskTypeJob
* repTlpPaymentJob
* repTlpPolicyBeneficiaryJob
* repTlpPolicyMasterJob
* repTlpPolicyPaidJob
* repTlpPolicyRiderJob
* repTlpSplitPremiumAmountJob

##### schema Billing

* repBillingSplitPremiumAmount2Job
* repBillingHistoryExportJob
* repBillingHistoryDownPlanJob
* repBillingMemberMasterJob

##### schema Ktc
* soon
