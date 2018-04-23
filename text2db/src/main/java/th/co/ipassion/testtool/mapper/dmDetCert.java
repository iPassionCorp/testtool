package main.java.th.co.ipassion.testtool.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import th.co.ipassion.testtool.dto.dm.DetCert;

public class dmDetCert implements RowMapper<DetCert>{

    @Override
    public DetCert mapRow(ResultSet rs, int rowNum) throws SQLException {
        DetCert dc = new DetCert();
        dc.setPolicyno(rs.getString("policyno"));
        dc.setCertno(rs.getString("certno"));
        dc.setCode(rs.getString("code"));
        dc.setAddress1(rs.getString("address1"));
        dc.setAddress2(rs.getString("address2"));
        dc.setTelephoneno(rs.getString("telephoneno"));
        dc.setMariagestatus(rs.getString("mariagestatus"));
        dc.setRecname1(rs.getString("recname1"));
        dc.setPercent1(rs.getString("percent1"));
        dc.setRelationshipcode1(rs.getString("relationshipcode1"));
        dc.setRecname1(rs.getString("recname2"));
        dc.setPercent1(rs.getString("percent2"));
        dc.setRelationshipcode1(rs.getString("relationshipcode2"));
        dc.setRecname1(rs.getString("recname3"));
        dc.setPercent1(rs.getString("percent3"));
        dc.setRelationshipcode1(rs.getString("relationshipcode3"));
        dc.setAnalist(rs.getString("analist"));
        dc.setPrmiseno(rs.getString("prmiseno"));
        dc.setPrmiseno2(rs.getString("prmiseno2"));
        dc.setLoantype(rs.getString("loantype"));
        dc.setMed(rs.getString("med"));
        dc.setReserve(rs.getString("reserve"));
        return dc;

    }
}
