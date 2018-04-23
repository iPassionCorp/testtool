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
        System.out.println(dc);
        return dc;

    }
}
