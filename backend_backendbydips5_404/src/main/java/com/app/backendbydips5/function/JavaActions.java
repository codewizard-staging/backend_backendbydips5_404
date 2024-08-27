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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  