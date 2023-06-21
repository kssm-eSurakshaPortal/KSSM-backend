package org.egov.kssmSamaswasamScheme1.web.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCodes {

    // // Applicant Personal
    // APPLICANT_PERSONAL_REQUIRED("REQUIRED"),
    // APPLICANT_PERSONAL_NOT_FOUND("NOT_FOUND"),
    // APPLICANT_PERSONAL_INVALID_SEARCH_CRITERIA("INVALID_CRITERIA"),
    // APPLICANT_PERSONAL_INVALID_CREATE("INVALID_CREATE"),
    // APPLICANT_PERSONAL_INVALID_UPDATE("INVALID_UPDATE"),

    // // Applicant Service
    // APPLICANT_SERVICE_REQUIRED("REQUIRED"),
    // APPLICANT_SERVICEL_NOT_FOUND("NOT_FOUND"),
    // APPLICANT_SERVICE_INVALID_SEARCH_CRITERIA("INVALID_CRITERIA"),
    // APPLICANT_SERVICE_INVALID_UPDATE("INVALID_UPDATE"),

    // // Idgen Service
    // IDGEN_ERROR("IDGEN_ERROR"),

    // // Mdms Service
    // MDMS_DATA_ERROR("MDMS_DATA_ERROR"),
    // MDMS_INVALID_TENANT_ID("INVALID_TENANTID"),

    // Search
    INVALID_SEARCH("INVALID_SEARCH"),

    // Communication File
    COMUNICATION_FILE_REQUIRED("REQUIRED");

    private String code;
}
