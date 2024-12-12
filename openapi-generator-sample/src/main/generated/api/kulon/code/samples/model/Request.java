package kulon.code.samples.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Request
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", comments = "Generator version: 7.8.0")
public class Request implements Serializable {

  private static final long serialVersionUID = 1L;

  private String referenceNumber = null;

  private String documentNumber = null;

  private String stockNumber = null;

  public Request referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Get referenceNumber
   * @return referenceNumber
   */
  
  @Schema(name = "referenceNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceNumber")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public Request documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
   */
  
  @Schema(name = "documentNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentNumber")
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public Request stockNumber(String stockNumber) {
    this.stockNumber = stockNumber;
    return this;
  }

  /**
   * Get stockNumber
   * @return stockNumber
   */
  
  @Schema(name = "stockNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stockNumber")
  public String getStockNumber() {
    return stockNumber;
  }

  public void setStockNumber(String stockNumber) {
    this.stockNumber = stockNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Request request = (Request) o;
    return Objects.equals(this.referenceNumber, request.referenceNumber) &&
        Objects.equals(this.documentNumber, request.documentNumber) &&
        Objects.equals(this.stockNumber, request.stockNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNumber, documentNumber, stockNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    stockNumber: ").append(toIndentedString(stockNumber)).append("\n");
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

