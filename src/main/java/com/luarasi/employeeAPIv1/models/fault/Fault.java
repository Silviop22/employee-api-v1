package com.luarasi.employeeAPIv1.models.fault;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class Fault {
    @JsonProperty("timestamp")
    private String timestamp = null;
    @JsonProperty("errorCode")
    @Valid
    private List<FaultErrorCode> errorCode = null;
    @JsonProperty("description")
    @Valid
    private List<FaultDescription> description = null;
    @JsonProperty("faultCause")
    private Object faultCause = null;
    @JsonProperty("name")
    private String name = null;
    @JsonProperty("severity")
    private String severity = null;
    @JsonProperty("category")
    private String category = null;
    @JsonProperty("reasonCode")
    private String reasonCode = null;
    @JsonProperty("message")
    private String message = null;
    @JsonProperty("characteristic")
    @Valid
    private List<FaultCharacteristic> characteristic = null;
    @JsonProperty("failure")
    @Valid
    private List<FaultFailure> failure = null;

    public Fault() {
    }

    public Fault timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    @NotNull
    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Fault errorCode(List<FaultErrorCode> errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Fault addErrorCodeItem(FaultErrorCode errorCodeItem) {
        if (this.errorCode == null) {
            this.errorCode = new ArrayList();
        }

        this.errorCode.add(errorCodeItem);
        return this;
    }

    @ApiModelProperty("")
    @Valid
    public List<FaultErrorCode> getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(List<FaultErrorCode> errorCode) {
        this.errorCode = errorCode;
    }

    public Fault description(List<FaultDescription> description) {
        this.description = description;
        return this;
    }

    public Fault addDescriptionItem(FaultDescription descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList();
        }

        this.description.add(descriptionItem);
        return this;
    }

    @ApiModelProperty("")
    @Valid
    public List<FaultDescription> getDescription() {
        return this.description;
    }

    public void setDescription(List<FaultDescription> description) {
        this.description = description;
    }

    public Fault faultCause(Object faultCause) {
        this.faultCause = faultCause;
        return this;
    }

    @ApiModelProperty("The legacy fault from the backend system.")
    public Object getFaultCause() {
        return this.faultCause;
    }

    public void setFaultCause(Object faultCause) {
        this.faultCause = faultCause;
    }

    public Fault name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty("A human readable short text name for the fault. Required if the Error Code >= 100, may be omitted or set to ")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fault severity(String severity) {
        this.severity = severity;
        return this;
    }

    @ApiModelProperty("The degree of severity and impact the fault has inccured, provides an indication of the level that may be used to trigger different behaviours in the consumer. Required if the Error Code >= 100, may be omitted or set to Information if the object is being used to indicate success.")
    public String getSeverity() {
        return this.severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Fault category(String category) {
        this.category = category;
        return this;
    }

    @ApiModelProperty("A classification of the fault indicating whether it has been generated through some technical aspect of the interaction or on account of a failure of business logic, rules or processing. It provides an indication of the type that may be used to trigger different behaviours in the consumer. Required if the Error Code >= 100, may be omitted or set to Business if the object is being used to indicate success.")
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Fault reasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    @ApiModelProperty("An enumeration of the reasons why the fault has been generated by the provider. Currently this is not used.")
    public String getReasonCode() {
        return this.reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public Fault message(String message) {
        this.message = message;
        return this;
    }

    @ApiModelProperty("A human readable description of the fault as identified by the Error Code. Required if the Error Code >= 100, may be omitted or set to ")
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Fault characteristic(List<FaultCharacteristic> characteristic) {
        this.characteristic = characteristic;
        return this;
    }

    public Fault addCharacteristicItem(FaultCharacteristic characteristicItem) {
        if (this.characteristic == null) {
            this.characteristic = new ArrayList();
        }

        this.characteristic.add(characteristicItem);
        return this;
    }

    @ApiModelProperty("")
    @Valid
    public List<FaultCharacteristic> getCharacteristic() {
        return this.characteristic;
    }

    public void setCharacteristic(List<FaultCharacteristic> characteristic) {
        this.characteristic = characteristic;
    }

    public Fault failure(List<FaultFailure> failure) {
        this.failure = failure;
        return this;
    }

    public Fault addFailureItem(FaultFailure failureItem) {
        if (this.failure == null) {
            this.failure = new ArrayList();
        }

        this.failure.add(failureItem);
        return this;
    }

    @ApiModelProperty("")
    @Valid
    public List<FaultFailure> getFailure() {
        return this.failure;
    }

    public void setFailure(List<FaultFailure> failure) {
        this.failure = failure;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Fault fault = (Fault)o;
            return Objects.equals(this.timestamp, fault.timestamp)  && Objects.equals(this.errorCode, fault.errorCode) && Objects.equals(this.description, fault.description) && Objects.equals(this.faultCause, fault.faultCause) && Objects.equals(this.name, fault.name) && Objects.equals(this.severity, fault.severity) && Objects.equals(this.category, fault.category) && Objects.equals(this.reasonCode, fault.reasonCode) && Objects.equals(this.message, fault.message) && Objects.equals(this.characteristic, fault.characteristic) && Objects.equals(this.failure, fault.failure);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.timestamp, this.errorCode, this.description, this.faultCause, this.name, this.severity, this.category, this.reasonCode, this.message, this.characteristic, this.failure});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Fault {\n");
        sb.append("    timestamp: ").append(this.toIndentedString(this.timestamp)).append("\n");
        sb.append("    errorCode: ").append(this.toIndentedString(this.errorCode)).append("\n");
        sb.append("    description: ").append(this.toIndentedString(this.description)).append("\n");
        sb.append("    faultCause: ").append(this.toIndentedString(this.faultCause)).append("\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
        sb.append("    severity: ").append(this.toIndentedString(this.severity)).append("\n");
        sb.append("    category: ").append(this.toIndentedString(this.category)).append("\n");
        sb.append("    reasonCode: ").append(this.toIndentedString(this.reasonCode)).append("\n");
        sb.append("    message: ").append(this.toIndentedString(this.message)).append("\n");
        sb.append("    characteristic: ").append(this.toIndentedString(this.characteristic)).append("\n");
        sb.append("    failure: ").append(this.toIndentedString(this.failure)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}