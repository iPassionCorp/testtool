package th.co.ipassion.testtool.entity.tlitext;
// Generated Dec 29, 2017 9:15:09 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Mginterest generated by hbm2java
 */
@Entity
@Table(name="mginterest"
)
public class Mginterest  implements java.io.Serializable {


     private MginterestId id;

    public Mginterest() {
    }

    public Mginterest(MginterestId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="certno", column=@Column(name="certno") ), 
        @AttributeOverride(name="accidentdate", column=@Column(name="accidentdate") ), 
        @AttributeOverride(name="receivedate", column=@Column(name="receivedate") ), 
        @AttributeOverride(name="ridertype", column=@Column(name="ridertype") ), 
        @AttributeOverride(name="paytype", column=@Column(name="paytype") ), 
        @AttributeOverride(name="startdate", column=@Column(name="startdate") ), 
        @AttributeOverride(name="enddate", column=@Column(name="enddate") ), 
        @AttributeOverride(name="day", column=@Column(name="day") ), 
        @AttributeOverride(name="payamount", column=@Column(name="payamount") ), 
        @AttributeOverride(name="interestamount", column=@Column(name="interestamount") ) } )
    public MginterestId getId() {
        return this.id;
    }
    
    public void setId(MginterestId id) {
        this.id = id;
    }




}


