package ondra.restapi.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Student description
 */
@ApiModel(description = "Student description")
@Validated
public class StudentDto   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("year")
  private Integer year = null;

  public StudentDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the student
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the student")

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public StudentDto year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Year the student currently is in
   * minimum: 1
   * maximum: 7
   * @return year
  **/
  @ApiModelProperty(value = "Year the student currently is in")

@Min(1) @Max(7)   public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDto student = (StudentDto) o;
    return Objects.equals(this.firstName, student.firstName) &&
        Objects.equals(this.year, student.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDto {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
