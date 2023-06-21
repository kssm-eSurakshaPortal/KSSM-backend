package org.egov.kssmSamaswasamScheme1.service;


import java.util.List;
import javax.validation.Valid;

import org.egov.kssmSamaswasamScheme1.config.SamaswasamConfig;
import org.egov.kssmSamaswasamScheme1.kafka.Producer;
import org.egov.kssmSamaswasamScheme1.repository.SamaswasamRepository;
import org.egov.kssmSamaswasamScheme1.validators.SamaswasamSearchValidator;
import org.egov.kssmSamaswasamScheme1.web.models.Samaswasam.SamaswasamRequest;
import org.egov.kssmSamaswasamScheme1.web.models.Samaswasam.SamaswasamSearchCriteria;
import org.egov.kssmSamaswasamScheme1.web.models.Samaswasam.m_Samaswasam;
import org.egov.kssmSamaswasamScheme1.web.models.Samaswasam.m_SamaswasamSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SamaswasamService {

    private final Producer producer;
    private final SamaswasamConfig samaswasamConfig;
    private final SamaswasamRepository repository;
    private final SamaswasamSearchValidator validator;

    @Autowired
    SamaswasamService(Producer producer, SamaswasamConfig samaswasamConfig, SamaswasamRepository repository, SamaswasamSearchValidator validator ) {
        this.producer = producer;
        this.samaswasamConfig = samaswasamConfig;
        this.validator = validator;
        this.repository = repository;
    }

    public List<m_Samaswasam> create(SamaswasamRequest request) {
        producer.push(samaswasamConfig.getSaveSamaswasamTopic(), request);
        return request.getM_Samaswasam();
    }

    public List<m_Samaswasam> Update(SamaswasamRequest request) {
        producer.push(samaswasamConfig.getUpdateSamaswasamTopic(),request);
        return request.getM_Samaswasam();
    }

    public List<m_SamaswasamSearchResponse> Search(@Valid SamaswasamSearchCriteria searchCriteria) {

        validator.validateSearch(searchCriteria);
        List<m_SamaswasamSearchResponse> result = repository.getDetails(searchCriteria);
        return result;
    }
}
