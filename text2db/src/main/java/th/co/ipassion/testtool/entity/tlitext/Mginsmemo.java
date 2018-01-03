package th.co.ipassion.testtool.entity.tlitext;
// Generated Dec 29, 2017 9:15:09 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Mginsmemo generated by hbm2java
 */
@Entity
@Table(name="mginsmemo"
)
public class Mginsmemo  implements java.io.Serializable {


     private MginsmemoId id;

    public Mginsmemo() {
    }

    public Mginsmemo(MginsmemoId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="certno", column=@Column(name="certno") ), 
        @AttributeOverride(name="accidentdate", column=@Column(name="accidentdate") ), 
        @AttributeOverride(name="receivedate", column=@Column(name="receivedate") ), 
        @AttributeOverride(name="memocode", column=@Column(name="memocode") ), 
        @AttributeOverride(name="detail1", column=@Column(name="detail1") ), 
        @AttributeOverride(name="detail2", column=@Column(name="detail2") ), 
        @AttributeOverride(name="savedate", column=@Column(name="savedate") ) } )
    public MginsmemoId getId() {
        return this.id;
    }
    
    public void setId(MginsmemoId id) {
        this.id = id;
    }




}


