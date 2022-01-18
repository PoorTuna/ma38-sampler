package workspace.mil.matmon.data.exercise.sampler.converter.adder.adderExample.xmlAdderExamples;

import com.fasterxml.jackson.databind.MappingIterator;
import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;
import workspace.mil.matmon.data.exercise.sampler.converter.adder.Adder;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.converterExceptionExample.examples.adderExamples.SamplerConverterAdderErrorException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class personXMLAdder extends Adder {

    public List<Map<?, ?>> addPersonData(MappingIterator<Map<?, ?>> mappingIterator) throws SamplerConverterAdderErrorException {
        try {
            List<Map<?, ?>> temp = new ArrayList<>();
            HealthCareInfoProvider healthCareInfoProvider = new HealthCareInfoProvider();

            while (mappingIterator.hasNext()) {
                Map<?, ?> map = mappingIterator.next();
                PersonInsured personInsured = healthCareInfoProvider.fetchInfo((Integer) map.get("IDNum"), (Integer) map.get("IDType"));
                map.put("JOIN_DATE", personInsured.getJoinDate());
                map.put("HEALTH_CARE_ID", personInsured.getHealthCareId());
                map.put("HEALTH_CARE_NAME", personInsured.getHealthCareName());
                temp.add(map);
            }
            return (List<Map<?, ?>>) mappingIterator;
        } catch (IOException | InvalidIdException e) {
            throw new SamplerConverterAdderErrorException();
        }
    }
}
