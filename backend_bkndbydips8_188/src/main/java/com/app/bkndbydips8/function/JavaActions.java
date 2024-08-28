package com.app.bkndbydips8.function;

import com.app.bkndbydips8.model.Organization;
import com.app.bkndbydips8.model.EmployeePersonalInfo;
import com.app.bkndbydips8.model.EmlpoyeeProfile;




import com.app.bkndbydips8.enums.EmploymentType;
import com.app.bkndbydips8.enums.OrgDept;
import com.app.bkndbydips8.enums.OrgBranch;
import com.app.bkndbydips8.converter.OrgBranchConverter;
import com.app.bkndbydips8.converter.EmploymentTypeConverter;
import com.app.bkndbydips8.converter.OrgDeptConverter;
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
  