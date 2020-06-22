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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * RateLimiter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class RateLimiter {
  @JsonProperty("burst_sz")
  private Integer burstSz = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("period")
  private Integer period = null;

  public RateLimiter burstSz(Integer burstSz) {
    this.burstSz = burstSz;
    return this;
  }

   /**
   * Maximum number of connections or requests or packets to be let through instantaneously. Allowed values are 0-1000000000. Field introduced in 20.1.1.
   * @return burstSz
  **/
  @Schema(description = "Maximum number of connections or requests or packets to be let through instantaneously. Allowed values are 0-1000000000. Field introduced in 20.1.1.")
  public Integer getBurstSz() {
    return burstSz;
  }

  public void setBurstSz(Integer burstSz) {
    this.burstSz = burstSz;
  }

  public RateLimiter count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Maximum number of connections, requests or packets, should be less than burst size. Allowed values are 1-1000000000. Field introduced in 20.1.1.
   * @return count
  **/
  @Schema(required = true, description = "Maximum number of connections, requests or packets, should be less than burst size. Allowed values are 1-1000000000. Field introduced in 20.1.1.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RateLimiter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Identifier for Rate Limit. Constructed according to context. Field introduced in 20.1.1.
   * @return name
  **/
  @Schema(description = "Identifier for Rate Limit. Constructed according to context. Field introduced in 20.1.1.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RateLimiter period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Time value in seconds to enforce rate count. Allowed values are 1-1000000000. Field introduced in 20.1.1.
   * @return period
  **/
  @Schema(required = true, description = "Time value in seconds to enforce rate count. Allowed values are 1-1000000000. Field introduced in 20.1.1.")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimiter rateLimiter = (RateLimiter) o;
    return Objects.equals(this.burstSz, rateLimiter.burstSz) &&
        Objects.equals(this.count, rateLimiter.count) &&
        Objects.equals(this.name, rateLimiter.name) &&
        Objects.equals(this.period, rateLimiter.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burstSz, count, name, period);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimiter {\n");
    
    sb.append("    burstSz: ").append(toIndentedString(burstSz)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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