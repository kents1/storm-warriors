package com.stormwarriors.deck.io;

import org.eclipse.persistence.config.DescriptorCustomizer;
import org.eclipse.persistence.descriptors.ClassDescriptor;

public class CardCustomizer implements DescriptorCustomizer {

    @Override
    public void customize(ClassDescriptor classDescriptor) throws Exception {
        classDescriptor.getInheritancePolicy().setClassIndicatorFieldName("@type");
    }

}
