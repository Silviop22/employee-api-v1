package com.luarasi.employeeAPIv1.models.fault;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class FaultErrorCode {
    @JsonProperty("value")
    private String value = null;
    @JsonProperty("dialect")
    private String dialect = null;

    public FaultErrorCode() {
    }

    public FaultErrorCode value(String value) {
        this.value = value;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    @NotNull
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public FaultErrorCode dialect(String dialect) {
        this.dialect = dialect;
        return this;
    }

    @ApiModelProperty("")
    public String getDialect() {
        return this.dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            FaultErrorCode faultErrorCode = (FaultErrorCode)o;
            return Objects.equals(this.value, faultErrorCode.value) && Objects.equals(this.dialect, faultErrorCode.dialect);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.value, this.dialect});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaultErrorCode {\n");
        sb.append("    value: ").append(this.toIndentedString(this.value)).append("\n");
        sb.append("    dialect: ").append(this.toIndentedString(this.dialect)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
