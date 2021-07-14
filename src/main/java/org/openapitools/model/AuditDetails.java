package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Collection of audit related fields used by most models
 */
@ApiModel(description = "Collection of audit related fields used by most models")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class AuditDetails   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("lastModifiedBy")
  private String lastModifiedBy;

  @JsonProperty("createdTime")
  private Long createdTime;

  @JsonProperty("lastModifiedTime")
  private Long lastModifiedTime;

  public AuditDetails createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * UUID (preferred) or userid of the user that created the object
   * @return createdBy
  */
  @ApiModelProperty(readOnly = true, value = "UUID (preferred) or userid of the user that created the object")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public AuditDetails lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * UUID (preferred) or userid of the user that last modified the object
   * @return lastModifiedBy
  */
  @ApiModelProperty(readOnly = true, value = "UUID (preferred) or userid of the user that last modified the object")


  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public AuditDetails createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * epoch of the time object is created
   * @return createdTime
  */
  @ApiModelProperty(readOnly = true, value = "epoch of the time object is created")


  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public AuditDetails lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * epoch of the time object is last modified
   * @return lastModifiedTime
  */
  @ApiModelProperty(readOnly = true, value = "epoch of the time object is last modified")


  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditDetails auditDetails = (AuditDetails) o;
    return Objects.equals(this.createdBy, auditDetails.createdBy) &&
        Objects.equals(this.lastModifiedBy, auditDetails.lastModifiedBy) &&
        Objects.equals(this.createdTime, auditDetails.createdTime) &&
        Objects.equals(this.lastModifiedTime, auditDetails.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, lastModifiedBy, createdTime, lastModifiedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditDetails {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

