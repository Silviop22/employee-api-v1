package com.luarasi.employeeAPIv1.models.fault;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;
import org.springframework.validation.annotation.Validated;

@ApiModel(
        description = "A component that describes individual failures within the fault. This component is used to support multiple causes to the fault; i.e. where the fault is generated from one or more API calls or one or more validation failures."
)
@Validated
public class FaultFailure {
    @JsonProperty("code")
    private String code = null;
    @JsonProperty("text")
    private String text = null;
    @JsonProperty("Severity")
    private String severity = null;

    public FaultFailure() {
    }

    public FaultFailure code(String code) {
        this.code = code;
        return this;
    }

    @ApiModelProperty("The code identifying the specific failure.")
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FaultFailure text(String text) {
        this.text = text;
        return this;
    }

    @ApiModelProperty("The human-readable text of the specific failure.")
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }




    public FaultFailure severity(String severity) {
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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            FaultFailure faultFailure = (FaultFailure)o;
            return Objects.equals(this.code, faultFailure.code) && Objects.equals(this.text, faultFailure.text) && Objects.equals(this.severity, faultFailure.severity);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.code, this.text, this.severity});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaultFailure {\n");
        sb.append("    code: ").append(this.toIndentedString(this.code)).append("\n");
        sb.append("    text: ").append(this.toIndentedString(this.text)).append("\n");
        sb.append("    severity: ").append(this.toIndentedString(this.severity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
