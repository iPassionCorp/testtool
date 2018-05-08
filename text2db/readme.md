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
    ```
    ```
    dataSource.driverClass=org.postgresql.Driver
    ```
    ```
    dataSource.user=<username>
    ```
    ```
    dataSource.password=<password>
    ```
    
    targetSource for replicate job this target source for writing data from datasource to targetsource
    ```
    targetSource.jdbcUrl=jdbc:postgresql://<url>:5432/<database>
    ```
    ```
    targetSource.driverClass=org.postgresql.Driver
    ```
    ```
    targetSource.user=<username>
    ```
    ```
    targetSource.password=<password>
    ```

2) Run maven for build this program 
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

3) Open IDE Program and change Run configurations for running about job you want to run 
![picture](https://i.imgur.com/TwmirWf.png)
Main class `th.co.ipassion.testtool.MainApplication`
Program arguments `<see other arguments below this as you want>`

### Schema 
* Dm
* Tlitext
* Tlp

### Program Arguments 

#### Import Text to Database
##### Schema Dm
* dmAddressJob
* dmBeneficiaryJob
* dmCertJob
* dmCertLinkerJob
* dmCertMappingJob
* dmCertRider
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

##### schema Tlp
* tlpAppCustomerJob
* tlpAppCustomerAddressJob
* tlpClaimPaymentJob
* tlpClaimPaymentDetailJob
* tlpClaimRegisterDetailJob
* tlpClaimRegisterHeader
* tlpCustomerBalloonJob
* tlpCustomerInfoJob
* tlpCustomerSaJob
* tlpHistoryStatusJob
* tlpMasProductJob
* tlpMasProductCoverageJob
* tlpMasProductCoverageClaimJob
* tlpPaymentJob
* tlpPolicyBeneficiaryJob
* tlpPolicyMasterJob
* tlpPolicyPaidJob
* tlpPolicyRiderJob
* tlpSplitPremiumAmountJob

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

##### Schema Tlitext 
* repTlitextAddressJob
* repTlitextBeneficiaryJob
* repTlitextCertJob
* repTlitextCertLinkerJob
* repTlitextCertMappingJob
* repTlitextCertRider
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

##### Schema Tlp 
* repTlpAppCustomerJob
* repTlpAppCustomerAddressJob
* repTlpClaimPaymentJob
* repTlpClaimPaymentDetailJob
* repTlpClaimRegisterDetailJob
* repTlpClaimRegisterHeader
* repTlpCustomerBalloonJob
* repTlpCustomerInfoJob
* repTlpCustomerSaJob
* repTlpHistoryStatusJob
* repTlpMasProductJob
* repTlpMasProductCoverageJob
* repTlpMasProductCoverageClaimJob
* repTlpPaymentJob
* repTlpPolicyBeneficiaryJob
* repTlpPolicyMasterJob
* repTlpPolicyPaidJob
* repTlpPolicyRiderJob
* repTlpSplitPremiumAmountJob
