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
 * Student
 */
@ApiModel(description = "Student")
@Validated

public class StudentDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("year")
  private Integer year = null;

  public StudentDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StudentDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the student
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "First name of the student")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public StudentDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the student
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Last name of the student")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
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
  @ApiModelProperty(required = true, value = "Year the student currently is in")
  @NotNull

@Min(1) @Max(7) 
  public Integer getYear() {
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
    return Objects.equals(this.id, student.id) &&
        Objects.equals(this.firstName, student.firstName) &&
        Objects.equals(this.lastName, student.lastName) &&
        Objects.equals(this.year, student.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

