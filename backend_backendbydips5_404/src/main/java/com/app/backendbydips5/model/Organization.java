package com.app.backendbydips5.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.backendbydips5.model.Organization;
import com.app.backendbydips5.model.EmployeePersonalInfo;
import com.app.backendbydips5.model.EmlpoyeeProfile;
import com.app.backendbydips5.enums.EmploymentType;
import com.app.backendbydips5.enums.OrgDept;
import com.app.backendbydips5.enums.OrgBranch;
import com.app.backendbydips5.converter.OrgBranchConverter;
import com.app.backendbydips5.converter.EmploymentTypeConverter;
import com.app.backendbydips5.converter.OrgDeptConverter;
import com.app.backendbydips5.converter.DurationConverter;
import com.app.backendbydips5.converter.UUIDToByteConverter;
import com.app.backendbydips5.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Organization")
@Table(name = "\"Organization\"", schema =  "\"backendbydips5\"")
@Data
                        
public class Organization {
	public Organization () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"OrganizationID\"", nullable = true )
  private Integer organizationID;
	  
  @Column(name = "\"OrganizationName\"", nullable = true )
  private String organizationName;
  
	  
  @Column(name = "\"OrganzationMissionVision\"", nullable = true )
  private String organzationMissionVision;
  
	  
  @Column(name = "\"OrganizationValues\"", nullable = true )
  private String organizationValues;
  
	  
  @Column(name = "\"OrgBranch\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = OrgBranchConverter.class)
  private OrgBranch orgBranch;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"OrganizationEmployees\"", referencedColumnName = "\"EmpID\"", insertable = false, updatable = false)
	private EmlpoyeeProfile employees;
	
	@Column(name = "\"OrganizationEmployees\"")
	private Integer organizationEmployees;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Organization [" 
  + "OrganizationID= " + organizationID  + ", " 
  + "OrganizationName= " + organizationName  + ", " 
  + "OrganzationMissionVision= " + organzationMissionVision  + ", " 
  + "OrganizationValues= " + organizationValues  + ", " 
  + "OrgBranch= " + orgBranch 
 + "]";
	}
	
}