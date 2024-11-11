package com.abdul.sample.adapter.out.persistence.entitylistener;

import org.springframework.stereotype.Component;

@Component
public class SampleListener {

    /*
        private static final Integer PADDING_SIZE = 8;

        public static String prepareDisplayableId(String prefix, Long id) {
            String format = "%0" + PADDING_SIZE + "d";
            var formattedNumber = String.format(format, id);
            return prefix + formattedNumber;
        }

        @PostPersist
        @PostUpdate
        public void setVersionNumber(Sample sample) {
            if (smartContract.getId() != null) {
                String displayableId = prepareDisplayableId("V", sample.getId());
                sample.setVersion(displayableId);
            }
        }
    */
}
