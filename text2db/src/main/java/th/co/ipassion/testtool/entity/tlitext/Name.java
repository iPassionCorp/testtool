package th.co.ipassion.testtool.entity.tlitext;
// Generated Dec 29, 2017 9:15:09 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Name generated by hbm2java
 */
@Entity
@Table(name="name"
)
public class Name  implements java.io.Serializable {


     private NameId id;

    public Name() {
    }

    public Name(NameId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="nameid", column=@Column(name="nameid") ), 
        @AttributeOverride(name="personid", column=@Column(name="personid") ), 
        @AttributeOverride(name="prename", column=@Column(name="prename") ), 
        @AttributeOverride(name="firstname", column=@Column(name="firstname") ), 
        @AttributeOverride(name="lastname", column=@Column(name="lastname") ), 
        @AttributeOverride(name="startdate", column=@Column(name="startdate") ) } )
    public NameId getId() {
        return this.id;
    }
    
    public void setId(NameId id) {
        this.id = id;
    }




}


