package th.co.ipassion.testtool.processor.tlp;

import org.springframework.batch.item.ItemProcessor;
import th.co.ipassion.testtool.dto.tlp.CustomerInfo;

public class CustomerInfoProcessor  implements ItemProcessor<CustomerInfo, CustomerInfo> {
    
	public CustomerInfo process(CustomerInfo item) {

    	if(item.getAllAsText().matches("(.*)\\u0000(.*)")) {
    		
    		item.setProductname(item.getProductname().trim().replaceAll("\\u0000", ""));
    		item.setPolicyno(item.getPolicyno().trim().replaceAll("\\u0000", ""));
            item.setProductcode(item.getProductcode().trim().replaceAll("\\u0000", ""));
            item.setCertificateno(item.getCertificateno().trim().replaceAll("\\u0000", ""));
            item.setSaledate(item.getSaledate().trim().replaceAll("\\u0000", ""));
            item.setBranchname(item.getBranchname().trim().replaceAll("\\u0000", ""));
            item.setCustomercode(item.getCustomercode().trim().replaceAll("\\u0000", ""));
            item.setAccountno(item.getAccountno().trim().replaceAll("\\u0000", ""));
            item.setLoanno(item.getLoanno().trim().replaceAll("\\u0000", ""));
            item.setTotalofloan(item.getTotalofloan().trim().replaceAll("\\u0000", ""));
            item.setSa(item.getSa().trim().replaceAll("\\u0000", ""));
            item.setPrem(item.getPrem().trim().replaceAll("\\u0000", ""));
            item.setDurationinsurance(item.getDurationinsurance().trim().replaceAll("\\u0000", ""));
            item.setInsurancestatus(item.getInsurancestatus().trim().replaceAll("\\u0000", ""));
            item.setEffectivedate(item.getEffectivedate().trim().replaceAll("\\u0000", ""));
            item.setExpireddate(item.getExpireddate().trim().replaceAll("\\u0000", ""));
            item.setCustomerstatus(item.getCustomerstatus().trim().replaceAll("\\u0000", ""));
            item.setCanceldate(item.getCanceldate().trim().replaceAll("\\u0000", ""));
            item.setCancelreason(item.getCancelreason().trim().replaceAll("\\u0000", ""));
            item.setCanceldescription(item.getCanceldescription().trim().replaceAll("\\u0000", ""));
            item.setChannel(item.getChannel().trim().replaceAll("\\u0000", ""));
            item.setPrefix(item.getPrefix().trim().replaceAll("\\u0000", ""));
            item.setNameth(item.getNameth().trim().replaceAll("\\u0000", ""));
            item.setSurnameth(item.getSurnameth().trim().replaceAll("\\u0000", ""));
            item.setBirthdate(item.getBirthdate().trim().replaceAll("\\u0000", ""));
            item.setAge(item.getAge().trim().replaceAll("\\u0000", ""));
            item.setWeight(item.getWeight().trim().replaceAll("\\u0000", ""));
            item.setHeight(item.getHeight().trim().replaceAll("\\u0000", ""));
            item.setGender(item.getGender().trim().replaceAll("\\u0000", ""));
            item.setStatus(item.getStatus().trim().replaceAll("\\u0000", ""));
            item.setNationid(item.getNationid().trim().replaceAll("\\u0000", ""));
            item.setCreditcardno(item.getCreditcardno().trim().replaceAll("\\u0000", ""));
            item.setExpiredcreditcard(item.getExpiredcreditcard().trim().replaceAll("\\u0000", ""));
            item.setAddress1(item.getAddress1().trim().replaceAll("\\u0000", ""));
            item.setAddress2(item.getAddress2().trim().replaceAll("\\u0000", ""));
            item.setAddressoffice1(item.getAddressoffice1().trim().replaceAll("\\u0000", ""));
            item.setAddressoffice2(item.getAddressoffice2().trim().replaceAll("\\u0000", ""));
            item.setNameofbenefit1(item.getNameofbenefit1().trim().replaceAll("\\u0000", ""));
            item.setNameofbenefit2(item.getNameofbenefit2().trim().replaceAll("\\u0000", ""));
            item.setNameofbenefit3(item.getNameofbenefit3().trim().replaceAll("\\u0000", ""));
            item.setNameofbenefit4(item.getNameofbenefit4().trim().replaceAll("\\u0000", ""));
            item.setRelationship1(item.getRelationship1().trim().replaceAll("\\u0000", ""));
            item.setRelationship2(item.getRelationship2().trim().replaceAll("\\u0000", ""));
            item.setRelationship3(item.getRelationship3().trim().replaceAll("\\u0000", ""));
            item.setRelationship4(item.getRelationship4().trim().replaceAll("\\u0000", ""));
            item.setHometel(item.getHometel().trim().replaceAll("\\u0000", ""));
            item.setMobiletel(item.getMobiletel().trim().replaceAll("\\u0000", ""));
            item.setOfficetel(item.getOfficetel().trim().replaceAll("\\u0000", ""));
            item.setOfficercodesale(item.getOfficercodesale().trim().replaceAll("\\u0000", ""));
            item.setSalenameth(item.getSalenameth().trim().replaceAll("\\u0000", ""));
            item.setManagercode(item.getManagercode().trim().replaceAll("\\u0000", ""));
            item.setDateprintcert(item.getDateprintcert().trim().replaceAll("\\u0000", ""));
            item.setPostbackdate(item.getPostbackdate().trim().replaceAll("\\u0000", ""));
            item.setCancelletterno(item.getCancelletterno().trim().replaceAll("\\u0000", ""));
            item.setPrintcancelletterdate(item.getPrintcancelletterdate().trim().replaceAll("\\u0000", ""));
            item.setPartnercode(item.getPartnercode().trim().replaceAll("\\u0000", ""));
            item.setPartnername(item.getPartnername().trim().replaceAll("\\u0000", ""));
            item.setDatabasesource(item.getDatabasesource().trim().replaceAll("\\u0000", ""));
            item.setRefname(item.getRefname().trim().replaceAll("\\u0000", ""));
            item.setRefnationid(item.getRefnationid().trim().replaceAll("\\u0000", ""));
            item.setRefcreditcardno(item.getRefcreditcardno().trim().replaceAll("\\u0000", ""));
            item.setFacility(item.getFacility().trim().replaceAll("\\u0000", ""));
            item.setUwdescription(item.getUwdescription().trim().replaceAll("\\u0000", ""));
            item.setUwstatus(item.getUwstatus().trim().replaceAll("\\u0000", ""));
            item.setTmksaledate(item.getTmksaledate().trim().replaceAll("\\u0000", ""));
            item.setCoverage(item.getCoverage().trim().replaceAll("\\u0000", ""));
            item.setPaidtodate(item.getPaidtodate().trim().replaceAll("\\u0000", ""));
            item.setExtrarate(item.getExtrarate().trim().replaceAll("\\u0000", ""));
            item.setVoicetag(item.getVoicetag().trim().replaceAll("\\u0000", ""));
            item.setDeathdate(item.getDeathdate().trim().replaceAll("\\u0000", ""));
            item.setCustomerloanapprovedate(item.getCustomerloanapprovedate().trim().replaceAll("\\u0000", ""));
            item.setLob(item.getLob().trim().replaceAll("\\u0000", ""));
            item.setCanceltransactiondate(item.getCanceltransactiondate().trim().replaceAll("\\u0000", ""));
            item.setOldaccountno(item.getOldaccountno().trim().replaceAll("\\u0000", ""));
            item.setCustomeroccupationtext(item.getCustomeroccupationtext().trim().replaceAll("\\u0000", ""));
            item.setLoaninstallment1stdue(item.getLoaninstallment1stdue().trim().replaceAll("\\u0000", ""));
            item.setCustomercontactofficepay(item.getCustomercontactofficepay().trim().replaceAll("\\u0000", ""));
            item.setPercentofbenefitciary1(item.getPercentofbenefitciary1().trim().replaceAll("\\u0000", ""));
            item.setPercentofbenefitciary2(item.getPercentofbenefitciary2().trim().replaceAll("\\u0000", ""));
            item.setPercentofbenefitciary3(item.getPercentofbenefitciary3().trim().replaceAll("\\u0000", ""));
            item.setPercentofbenefitciary4(item.getPercentofbenefitciary4().trim().replaceAll("\\u0000", ""));
            item.setDownplaneffectivedate(item.getDownplaneffectivedate().trim().replaceAll("\\u0000", ""));
            item.setDate_sosover(item.getDate_sosover().trim().replaceAll("\\u0000", ""));
            item.setCustomerduration(item.getCustomerduration().trim().replaceAll("\\u0000", ""));
            item.setMed(item.getMed().trim().replaceAll("\\u0000", ""));
            item.setCustomernation(item.getCustomernation().trim().replaceAll("\\u0000", ""));
            item.setEndorsedate(item.getEndorsedate().trim().replaceAll("\\u0000", ""));
            item.setInformdate1(item.getInformdate1().trim().replaceAll("\\u0000", ""));
            item.setPaydate1(item.getPaydate1().trim().replaceAll("\\u0000", ""));
            item.setAmount1(item.getAmount1().trim().replaceAll("\\u0000", ""));
            item.setInformdate2(item.getInformdate2().trim().replaceAll("\\u0000", ""));
            item.setPaydate2(item.getPaydate2().trim().replaceAll("\\u0000", ""));
            item.setAmount2(item.getAmount2().trim().replaceAll("\\u0000", ""));
            item.setDeaddate(item.getDeaddate().trim().replaceAll("\\u0000", ""));
            item.setLastpaydate(item.getLastpaydate().trim().replaceAll("\\u0000", ""));
            item.setLastreceiptno(item.getLastreceiptno().trim().replaceAll("\\u0000", ""));
            item.setMode(item.getMode().trim().replaceAll("\\u0000", ""));
            item.setLastpayperiod(item.getLastpayperiod().trim().replaceAll("\\u0000", ""));

    		return item;
    	}else {
    		return item;
    	}
    	

    }
}
