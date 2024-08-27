package com.app.backendbydips5.function;

import com.app.backendbydips5.model.Organization;
import com.app.backendbydips5.model.EmployeePersonalInfo;
import com.app.backendbydips5.model.EmlpoyeeProfile;
import com.app.backendbydips5.enums.EmploymentType;
import com.app.backendbydips5.enums.OrgDept;
import com.app.backendbydips5.enums.OrgBranch;
import com.app.backendbydips5.converter.OrgBranchConverter;
import com.app.backendbydips5.converter.EmploymentTypeConverter;
import com.app.backendbydips5.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.backendbydips5.repository.OrganizationRepository;
import com.app.backendbydips5.repository.EmployeePersonalInfoRepository;
import com.app.backendbydips5.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
