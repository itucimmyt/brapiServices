package org.cimmyt.api.brapi.conversion;

import org.cimmyt.api.brapi.to.BrVariableTO;
import org.cimmyt.model.Variable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VariableToBrVariableTOConverter implements Converter<Variable, BrVariableTO>{

	private PropertyToBrTraitTOConverter propertyConverter;
	private MethodToBrMethodTOConverter methodConverter;
	private ScaleToBrScaleTOConverter scaleConverter;

	@Autowired
	public VariableToBrVariableTOConverter(PropertyToBrTraitTOConverter propertyConverter,
			MethodToBrMethodTOConverter methodConverter, ScaleToBrScaleTOConverter scaleConverter) {
		super();
		this.propertyConverter = propertyConverter;
		this.methodConverter = methodConverter;
		this.scaleConverter = scaleConverter;
	}
	
	@Override
	public BrVariableTO convert(Variable source) {
		BrVariableTO target = new BrVariableTO();
		
		target.setDbId(source.getId().toString());
		target.setClazz(source.getVariableSet());
		target.setName(source.getName());
		target.setOntologyDbId(source.getOntologyReference());
		target.setOntologyName(source.getName());
		target.setDefaultValue("");
		
		target.setTrait(propertyConverter.convert(source.getProperty()));
		target.setMethod(methodConverter.convert(source.getMethod()));
		target.setScale(scaleConverter.convert(source.getScale()));
		
		return target;
	}

}
