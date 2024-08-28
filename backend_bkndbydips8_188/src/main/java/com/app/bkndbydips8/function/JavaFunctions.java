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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.bkndbydips8.repository.OrganizationRepository;
import com.app.bkndbydips8.repository.EmployeePersonalInfoRepository;
import com.app.bkndbydips8.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
