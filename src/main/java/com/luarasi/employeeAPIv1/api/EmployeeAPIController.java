package com.luarasi.employeeAPIv1.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luarasi.employeeAPIv1.Utils.OracleUCPConfiguration;
import com.luarasi.employeeAPIv1.models.Employee;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Patch;
import javax.sql.DataSource;
import javax.validation.Valid;
import java.sql.SQLException;
import java.util.HashMap;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-28T14:04:36.877+02:00")

@Controller
public class EmployeeAPIController implements EmployeeAPI {
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EmployeeAPIController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public ResponseEntity<Object> create(@Valid Employee employee, String xSourceOperator, String xSourceSystem, String xSourceTimestamp, String accept, String acceptLanguage, String uuid, MultiValueMap<String, String> headers, MultiValueMap<String, String> queryParameters) {
        return null;
    }

    @Override
    public ResponseEntity<Employee> delete(String id, @Valid Patch employee) {
        return null;
    }

    @Override
    public ResponseEntity<Object> get(String xSourceOperator, String xSourceSystem, String xSourceTimestamp, String accept, String acceptLanguage, String uuid, HttpEntity httpEntity, MultiValueMap<String, String> uriParameters, HashMap<String, String> uriVariables) throws SQLException {
        DataSource ds = new OracleUCPConfiguration().dataSource();
        ds.getConnection();

        return null;
    }

    @Override
    public ResponseEntity<Object> getList(@Valid String id, String category, @Valid String type, @Valid String status, @Valid String created, @Valid String hierarchyId, @Valid String field, @Valid Integer limit, @Valid Integer count, @Valid String sort, String xSourceOperator, String xSourceSystem, String xSourceTimestamp, String accept, String acceptLanguage, String uuid, HttpEntity httpEntity, MultiValueMap<String, String> uriParameters) {
        return null;
    }

    @Override
    public ResponseEntity<Object> updatePartial(String id, @Valid Employee productOffering, String xSourceOperator, String xSourceSystem, String xSourceTimestamp, String acceptLanguage, String uuid, MultiValueMap<String, String> headers, MultiValueMap<String, String> uriParameters, HashMap<String, String> uriVariables) {
        return null;
    }
}
