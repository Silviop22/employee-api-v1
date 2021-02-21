package com.luarasi.employeeAPIv1.models.fault;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class FaultDescription {
    @JsonProperty("value")
    private String value = null;
    @JsonProperty("lang")
    private String lang = null;

    public FaultDescription() {
    }

    public FaultDescription value(String value) {
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

    public FaultDescription lang(String lang) {
        this.lang = lang;
        return this;
    }

    @ApiModelProperty("")
    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            FaultDescription faultDescription = (FaultDescription)o;
            return Objects.equals(this.value, faultDescription.value) && Objects.equals(this.lang, faultDescription.lang);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.value, this.lang});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaultDescription {\n");
        sb.append("    value: ").append(this.toIndentedString(this.value)).append("\n");
        sb.append("    lang: ").append(this.toIndentedString(this.lang)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
