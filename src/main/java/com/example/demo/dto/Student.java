package com.example.demo.dto;

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
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-21T07:39:59.895Z[GMT]")


public class Student   {
  @JsonProperty("stuName")
  private String stuName = null;

  @JsonProperty("stuId")
  private Integer stuId = null;

  @JsonProperty("sex")
  private String sex = null;

  @JsonProperty("birth")
  private String birth = null;

  @JsonProperty("department")
  private String department = null;

  @JsonProperty("address")
  private String address = null;

  public Student stuName(String stuName) {
    this.stuName = stuName;
    return this;
  }

  /**
   * Get stuName
   * @return stuName
  **/
  @ApiModelProperty(example = "Jack", required = true, value = "")
      @NotNull

    public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public Student stuId(Integer stuId) {
    this.stuId = stuId;
    return this;
  }

  /**
   * Get stuId
   * @return stuId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getStuId() {
    return stuId;
  }

  public void setStuId(Integer stuId) {
    this.stuId = stuId;
  }

  public Student sex(String sex) {
    this.sex = sex;
    return this;
  }

  /**
   * Get sex
   * @return sex
  **/
  @ApiModelProperty(example = "f", value = "")
  
    public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Student birth(String birth) {
    this.birth = birth;
    return this;
  }

  /**
   * Get birth
   * @return birth
  **/
  @ApiModelProperty(example = "1997", value = "")
  
    public String getBirth() {
    return birth;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

  public Student department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(example = "计算机", value = "")
  
    public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Student address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "北京市海淀区", value = "")
  
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.stuName, student.stuName) &&
        Objects.equals(this.stuId, student.stuId) &&
        Objects.equals(this.sex, student.sex) &&
        Objects.equals(this.birth, student.birth) &&
        Objects.equals(this.department, student.department) &&
        Objects.equals(this.address, student.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stuName, stuId, sex, birth, department, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    stuName: ").append(toIndentedString(stuName)).append("\n");
    sb.append("    stuId: ").append(toIndentedString(stuId)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
