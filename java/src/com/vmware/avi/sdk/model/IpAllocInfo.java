/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vmware.avi.sdk.model.IpAddr;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * IpAllocInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class IpAllocInfo {
  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("mac")
  private String mac = null;

  @JsonProperty("se_uuid")
  private String seUuid = null;

  public IpAllocInfo ip(IpAddr ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(required = true, description = "")
  public IpAddr getIp() {
    return ip;
  }

  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  public IpAllocInfo mac(String mac) {
    this.mac = mac;
    return this;
  }

   /**
   * mac of IpAllocInfo.
   * @return mac
  **/
  @Schema(required = true, description = "mac of IpAllocInfo.")
  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  public IpAllocInfo seUuid(String seUuid) {
    this.seUuid = seUuid;
    return this;
  }

   /**
   * Unique object identifier of se.
   * @return seUuid
  **/
  @Schema(required = true, description = "Unique object identifier of se.")
  public String getSeUuid() {
    return seUuid;
  }

  public void setSeUuid(String seUuid) {
    this.seUuid = seUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAllocInfo ipAllocInfo = (IpAllocInfo) o;
    return Objects.equals(this.ip, ipAllocInfo.ip) &&
        Objects.equals(this.mac, ipAllocInfo.mac) &&
        Objects.equals(this.seUuid, ipAllocInfo.seUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, mac, seUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAllocInfo {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}