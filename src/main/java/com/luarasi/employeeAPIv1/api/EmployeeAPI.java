package com.luarasi.employeeAPIv1.api;

import com.luarasi.employeeAPIv1.models.Employee;
import com.luarasi.employeeAPIv1.models.fault.Fault;
import io.swagger.annotations.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Patch;
import javax.validation.Valid;
import java.sql.SQLException;
import java.util.HashMap;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-28T14:04:36.877+02:00")
@Api(value = "employee", description = "the employee API")
public interface EmployeeAPI {
    @ApiOperation(value = "", nickname = "create", notes = "A method that allows a consumer of the API to create a Employee representation", response = Employee.class, tags = {"Employee",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200, OK.", response = Employee.class),
            @ApiResponse(code = 201, message = "201, Created.", response = Employee.class),
            @ApiResponse(code = 202, message = "202, Accepted."),
            @ApiResponse(code = 204, message = "204, No Content."),
            @ApiResponse(code = 400, message = "400, Bad Request.", response = Fault.class),
            @ApiResponse(code = 404, message = "404, Not Found.", response = Fault.class),
            @ApiResponse(code = 405, message = "405, Method Not Allowed. If the method is not implemented then this fault should be returned.", response = Fault.class),
            @ApiResponse(code = 500, message = "500, Internal Server Error."),
            @ApiResponse(code = 200, message = "An unexpected fault occurred.", response = Fault.class)})
    @RequestMapping(value = "/public/employeeAPI/v1/employee",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Object> create(@ApiParam(value = "", required = true)
                                  @Valid @RequestBody Employee employee,
                                  @ApiParam(value = "The Organisation of the client/consuming system.") @RequestHeader(value = "x-channel", required = false) String xSourceOperator,
                                  @ApiParam(value = "The Logical System Name (COBRA) of the client/consuming system.") @RequestHeader(value = "x-system", required = false) String xSourceSystem,
                                  @ApiParam(value = "The ISO8601 Date and Time from the client/consuming system.") @RequestHeader(value = "X-Source-Timestamp", required = false) String xSourceTimestamp,
                                  @ApiParam(value = "The Accept request-header field can be used to specify certain media types which are acceptable for the response") @RequestHeader(value = "Accept", required = false) String accept,
                                  @ApiParam(value = "The Accept-Language request-header field is similar to Accept, but restricts the set of natural languages that are preferred as a response to the request") @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
                                  @RequestHeader(value = "x-uuid", required = false) String uuid,
                                  @RequestHeader MultiValueMap<String, String> headers,
                                  @RequestParam MultiValueMap<String, String> queryParameters);


    @ApiOperation(value = "", nickname = "delete", notes = "A method that allows a consumer of the API to delete a Employee representation.", response = Employee.class, tags = {"Employee",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200, OK.", response = Employee.class),
            @ApiResponse(code = 202, message = "202, Accepted."),
            @ApiResponse(code = 204, message = "204, No Content."),
            @ApiResponse(code = 400, message = "400, Bad Request.", response = Fault.class),
            @ApiResponse(code = 404, message = "404, Not Found.", response = Fault.class),
            @ApiResponse(code = 405, message = "405, Method Not Allowed. If the method is not implemented then this fault should be returned.", response = Fault.class),
            @ApiResponse(code = 500, message = "500, Internal Server Error."),
            @ApiResponse(code = 200, message = "An unexpected fault occurred.", response = Fault.class)})
    @RequestMapping(value = "/public/employeeAPI/v1/employee/{id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<Employee> delete(
            @ApiParam(value = "The primary ID for the resource", required = true) @PathVariable("id") String id,
            @ApiParam(value = "", required = true) @Valid @RequestBody Patch employee);


    @ApiOperation(value = "", nickname = "get", notes = "A method that allows a consumer of the API to get a employee by id.", response = Employee.class, tags = {"Employee",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200, OK.", response = Employee.class),
            @ApiResponse(code = 206, message = "206, Partial Content.", response = Employee.class),
            @ApiResponse(code = 400, message = "400, Bad Request.", response = Fault.class),
            @ApiResponse(code = 404, message = "404, Not Found.", response = Fault.class),
            @ApiResponse(code = 405, message = "405, Method Not Allowed. If the method is not implemented then this fault should be returned.", response = Fault.class),
            @ApiResponse(code = 500, message = "500, Internal Server Error."),
            @ApiResponse(code = 200, message = "An unexpected fault occurred.", response = Fault.class)})
    @RequestMapping(value = "/public/employeeAPI/v1/employee/{id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Object> get(
            @ApiParam(value = "The Organisation of the client/consuming system.") @RequestHeader(value = "x-channel", required = false) String xSourceOperator,
            @ApiParam(value = "The Logical System Name (COBRA) of the client/consuming system.") @RequestHeader(value = "x-system", required = false) String xSourceSystem,
            @ApiParam(value = "The ISO8601 Date and Time from the client/consuming system.") @RequestHeader(value = "X-Source-Timestamp", required = false) String xSourceTimestamp,
            @ApiParam(value = "The Accept request-header field can be used to specify certain media types which are acceptable for the response") @RequestHeader(value = "Accept", required = false) String accept,
            @ApiParam(value = "The Accept-Language request-header field is similar to Accept, but restricts the set of natural languages that are preferred as a response to the request") @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
            @RequestHeader(value = "x-uuid", required = false) String uuid,
            HttpEntity httpEntity,
            @RequestParam MultiValueMap<String, String> uriParameters,
            @PathVariable HashMap<String, String> uriVariables
    ) throws SQLException;

    @ApiOperation(value = "", nickname = "getList", notes = "A method that allows a consumer of the API to get-list a employee representation.", response = Employee.class, responseContainer = "List", tags = {"ProductOffering",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200, OK.", response = Employee.class, responseContainer = "List"),
            @ApiResponse(code = 204, message = "204, No Content."),
            @ApiResponse(code = 206, message = "206, Partial Content.", response = Employee.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "400, Bad Request.", response = Fault.class),
            @ApiResponse(code = 404, message = "404, Not Found.", response = Fault.class),
            @ApiResponse(code = 405, message = "405, Method Not Allowed. If the method is not implemented then this fault should be returned.", response = Fault.class),
            @ApiResponse(code = 500, message = "500, Internal Server Error."),
            @ApiResponse(code = 200, message = "An unexpected fault occurred.", response = Fault.class)})
    @RequestMapping(value = "/public/employeeAPI/v1/employee",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Object> getList(@ApiParam(value = "The identifier of the Product offering to search for, configured as the $.ids[0].$ value in the business object.") @Valid @RequestParam(value = "id", required = false) String id,
                                   @RequestParam(value = "categoryId", required = false) String category,
                                   @ApiParam(value = "A classification of the business object or component. This identifies the sub-type of the instance of object or component.") @Valid @RequestParam(value = "type", required = false) String type,
                                   @ApiParam(value = "Identifies the Product offering based on its current status.") @Valid @RequestParam(value = "status", required = false) String status,
                                   @ApiParam(value = "Identifies the Product offering based on the creation Date/Time.") @Valid @RequestParam(value = "created", required = false) String created,
                                   @ApiParam(value = "Unique identifier describes the hierarchy to identify the parent and child of a employee.") @Valid @RequestParam(value = "hierarchyId", required = false) String hierarchyId,
                                   @ApiParam(value = "The field filters on the response attributes is enabled on all attributes, specified by ?fields=id,name,desc. Always the first query parameter.") @Valid @RequestParam(value = "field", required = false) String field,
                                   @ApiParam(value = "This limits the queries allowed to supporting AND only, equality matching for the operator code and simple naming of the parameters themselves.") @Valid @RequestParam(value = "limit", required = false) Integer limit,
                                   @ApiParam(value = "Support pagination. The size of the page to return.") @Valid @RequestParam(value = "count", required = false) Integer count,
                                   @ApiParam(value = "Supports sorting. The field and direction on which to sort the returned set of Network Access Profiles. ") @Valid @RequestParam(value = "sort", required = false) String sort,
                                   @ApiParam(value = "The Organisation of the client/consuming system.") @RequestHeader(value = "x-channel", required = false) String xSourceOperator,
                                   @ApiParam(value = "The Logical System Name (COBRA) of the client/consuming system.") @RequestHeader(value = "x-system", required = false) String xSourceSystem,
                                   @ApiParam(value = "The ISO8601 Date and Time from the client/consuming system.") @RequestHeader(value = "X-Source-Timestamp", required = false) String xSourceTimestamp,
                                   @ApiParam(value = "The Accept request-header field can be used to specify certain media types which are acceptable for the response") @RequestHeader(value = "Accept", required = false) String accept,
                                   @ApiParam(value = "The Accept-Language request-header field is similar to Accept, but restricts the set of natural languages that are preferred as a response to the request") @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
                                   @RequestHeader(value = "x-uuid", required = false) String uuid,
                                   HttpEntity httpEntity,
                                   @RequestParam MultiValueMap<String, String> uriParameters);

    @ApiOperation(value = "", nickname = "updatePartial", notes = "A method that allows a consumer of the API to update a Employee representation.", response = Employee.class, tags = {"Employee",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200, OK.", response = Employee.class),
            @ApiResponse(code = 202, message = "202, Accepted."),
            @ApiResponse(code = 204, message = "204, No Content."),
            @ApiResponse(code = 400, message = "400, Bad Request.", response = Fault.class),
            @ApiResponse(code = 404, message = "404, Not Found.", response = Fault.class),
            @ApiResponse(code = 405, message = "405, Method Not Allowed. If the method is not implemented then this fault should be returned.", response = Fault.class),
            @ApiResponse(code = 409, message = "409, Conflict.", response = Fault.class),
            @ApiResponse(code = 412, message = "412, Precondition Failed.", response = Fault.class),
            @ApiResponse(code = 500, message = "500, Internal Server Error."),
            @ApiResponse(code = 200, message = "An unexpected fault occurred.", response = Fault.class)})
    @RequestMapping(value = "/public/employeeAPI/v1/employee/{id}",
            produces = {"application/json"},
            consumes = {"application/json-patch"},
            method = RequestMethod.PATCH)
    ResponseEntity<Object> updatePartial(@ApiParam(value = "The primary ID for the resource", required = true) @PathVariable("id") String id, @ApiParam(value = "", required = true) @Valid @RequestBody Employee productOffering,
                                         @ApiParam(value = "The Organisation of the client/consuming system.") @RequestHeader(value = "x-channel", required = false) String xSourceOperator,
                                         @ApiParam(value = "The Logical System Name (COBRA) of the client/consuming system.") @RequestHeader(value = "x-system", required = false) String xSourceSystem,
                                         @ApiParam(value = "The ISO8601 Date and Time from the client/consuming system.") @RequestHeader(value = "X-Source-Timestamp", required = false) String xSourceTimestamp,
                                         @ApiParam(value = "The Accept-Language request-header field is similar to Accept, but restricts the set of natural languages that are preferred as a response to the request") @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
                                         @RequestHeader(value = "x-uuid", required = false) String uuid,
                                         @RequestHeader MultiValueMap<String, String> headers,
                                         @RequestParam MultiValueMap<String, String> uriParameters,
                                         @PathVariable HashMap<String, String> uriVariables);
}
