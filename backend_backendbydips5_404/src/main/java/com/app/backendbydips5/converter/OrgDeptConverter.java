package com.app.backendbydips5.converter;

import com.app.backendbydips5.enums.OrgDept;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class OrgDeptConverter implements AttributeConverter<OrgDept, Integer> {

    @Override
    public Integer convertToDatabaseColumn(OrgDept orgDept) {
        return orgDept != null ? orgDept.ordinal() : null;
    }

    @Override
    public OrgDept convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return OrgDept.getOrgDept(dbData);
    }
}
