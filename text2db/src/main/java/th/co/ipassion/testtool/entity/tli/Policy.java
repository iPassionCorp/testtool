package th.co.ipassion.testtool.entity.tli;
// Generated Dec 29, 2017 9:15:36 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Policy generated by hbm2java
 */
@Entity
@Table(name="policy"
)
public class Policy  implements java.io.Serializable {


     private String policyno;
     private String rate;
     private String name;
     private String type;
     private String effectivedate;
     private String planname;
     private String riderplan;
     private String tlbranch;

    public Policy() {
    }

	
    public Policy(String policyno) {
        this.policyno = policyno;
    }
    public Policy(String policyno, String rate, String name, String type, String effectivedate, String planname, String riderplan, String tlbranch) {
       this.policyno = policyno;
       this.rate = rate;
       this.name = name;
       this.type = type;
       this.effectivedate = effectivedate;
       this.planname = planname;
       this.riderplan = riderplan;
       this.tlbranch = tlbranch;
    }
   
     @Id 
    
    @Column(name="policyno", unique=true, nullable=false, length=4)
    public String getPolicyno() {
        return this.policyno;
    }
    
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }
    
    @Column(name="rate", length=2)
    public String getRate() {
        return this.rate;
    }
    
    public void setRate(String rate) {
        this.rate = rate;
    }
    
    @Column(name="name", length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="type", length=1)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="effectivedate", length=8)
    public String getEffectivedate() {
        return this.effectivedate;
    }
    
    public void setEffectivedate(String effectivedate) {
        this.effectivedate = effectivedate;
    }
    
    @Column(name="planname", length=60)
    public String getPlanname() {
        return this.planname;
    }
    
    public void setPlanname(String planname) {
        this.planname = planname;
    }
    
    @Column(name="riderplan", length=8)
    public String getRiderplan() {
        return this.riderplan;
    }
    
    public void setRiderplan(String riderplan) {
        this.riderplan = riderplan;
    }
    
    @Column(name="tlbranch", length=60)
    public String getTlbranch() {
        return this.tlbranch;
    }
    
    public void setTlbranch(String tlbranch) {
        this.tlbranch = tlbranch;
    }




}


