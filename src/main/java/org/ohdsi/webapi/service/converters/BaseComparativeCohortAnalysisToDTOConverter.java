package org.ohdsi.webapi.service.converters;

import org.ohdsi.webapi.cohortcomparison.ComparativeCohortAnalysis;
import org.ohdsi.webapi.service.dto.ComparativeCohortAnalysisDTO;

public abstract class BaseComparativeCohortAnalysisToDTOConverter<S extends ComparativeCohortAnalysis, T extends ComparativeCohortAnalysisDTO> extends BaseCommonEntityToDTOConverter<S, T> {
  @Override
  protected void doConvert(ComparativeCohortAnalysisDTO target, ComparativeCohortAnalysis source) {

    target.setAddExposureDaysToEnd(source.getAddExposureDaysToEnd());
    target.setAnalysisId(source.getAnalysisId());
    target.setComparatorId(source.getComparatorId());
    target.setDelCovariatesSmallCount(source.getDelCovariatesSmallCount());
    target.setMinimumDaysAtRisk(source.getMinimumDaysAtRisk());
    target.setMinimumWashoutPeriod(source.getMinimumWashoutPeriod());
    target.setModelType(source.getModelType());
    target.setName(source.getName());
    target.setNegativeControlId(source.getNegativeControlId());
    target.setOmConceptCounts(source.getOmConceptCounts());
    target.setOmConditionEra(source.getOmConditionEra());
    target.setOmConditionEraEver(source.getOmConditionEraEver());
    target.setOmConditionEraOverlap(source.getOmConditionEraOverlap());
    target.setOmConditionGroup(source.getOmConditionGroup());
    target.setOmConditionGroupMeddra(source.getOmConditionGroupMeddra());
    target.setOmConditionGroupSnomed(source.getOmConditionGroupSnomed());
    target.setOmConditionOcc(source.getOmConditionOcc());
    target.setOmConditionOcc30d(source.getOmConditionOcc30d());
    target.setOmConditionOcc365d(source.getOmConditionOcc365d());
    target.setOmConditionOccInpt180d(source.getOmConditionOccInpt180d());
    target.setOmCovariates(source.getOmCovariates());
    target.setOmDemographics(source.getOmDemographics());
    target.setOmDemographicsAge(source.getOmDemographicsAge());
    target.setOmDemographicsEthnicity(source.getOmDemographicsEthnicity());
    target.setOmDemographicsGender(source.getOmDemographicsGender());
    target.setOmDemographicsMonth(source.getOmDemographicsMonth());
    target.setOmDemographicsRace(source.getOmDemographicsRace());
    target.setOmDemographicsYear(source.getOmDemographicsYear());
    target.setOmDrugEra(source.getOmDrugEra());
    target.setOmDrugEra30d(source.getOmDrugEra30d());
    target.setOmDrugEra365d(source.getOmDrugEra365d());
    target.setOmDrugEraEver(source.getOmDrugEraEver());
    target.setOmDrugEraOverlap(source.getOmDrugEraOverlap());
    target.setOmDrugExposure(source.getOmDrugExposure());
    target.setOmDrugExposure30d(source.getOmDrugExposure30d());
    target.setOmDrugExposure365d(source.getOmDrugExposure365d());
    target.setOmDrugGroup(source.getOmDrugGroup());
    target.setOmExclusionId(source.getOmExclusionId());
    target.setOmInclusionId(source.getOmInclusionId());
    target.setOmInteractionMonth(source.getOmInteractionMonth());
    target.setOmInteractionYear(source.getOmInteractionYear());
    target.setOmMatch(source.getOmMatch());
    target.setOmMatchMaxRatio(source.getOmMatchMaxRatio());
    target.setOmMeasurement(source.getOmMeasurement());
    target.setOmMeasurement30d(source.getOmMeasurement30d());
    target.setOmMeasurement365d(source.getOmMeasurement365d());
    target.setOmMeasurementAbove(source.getOmMeasurementAbove());
    target.setOmMeasurementBelow(source.getOmMeasurementBelow());
    target.setOmMeasurementCount365d(source.getOmMeasurementCount365d());
    target.setOmObservation(source.getOmObservation());
    target.setOmObservation30d(source.getOmObservation30d());
    target.setOmObservation365d(source.getOmObservation365d());
    target.setOmObservationCount365d(source.getOmObservationCount365d());
    target.setOmProcedureGroup(source.getOmProcedureGroup());
    target.setOmProcedureOcc(source.getOmProcedureOcc());
    target.setOmProcedureOcc30d(source.getOmProcedureOcc30d());
    target.setOmProcedureOcc365d(source.getOmProcedureOcc365d());
    target.setOmRiskScores(source.getOmRiskScores());
    target.setOmRiskScoresChads2(source.getOmRiskScoresChads2());
    target.setOmRiskScoresChads2vasc(source.getOmRiskScoresChads2vasc());
    target.setOmRiskScoresCharlson(source.getOmRiskScoresCharlson());
    target.setOmRiskScoresDcsi(source.getOmRiskScoresDcsi());
    target.setOmStrat(source.getOmStrat());
    target.setOmStratNumStrata(source.getOmStratNumStrata());
    target.setOmTrim(source.getOmTrim());
    target.setOmTrimFraction(source.getOmTrimFraction());
    target.setOutcomeId(source.getOutcomeId());
    target.setPsAdjustment(source.getPsAdjustment());
    target.setPsConceptCounts(source.getPsConceptCounts());
    target.setPsConditionEra(source.getPsConditionEra());
    target.setPsConditionEraEver(source.getPsConditionEraEver());
    target.setPsConditionEraOverlap(source.getPsConditionEraOverlap());
    target.setPsConditionGroup(source.getPsConditionGroup());
    target.setPsConditionGroupMeddra(source.getPsConditionGroupMeddra());
    target.setPsConditionGroupSnomed(source.getPsConditionGroupSnomed());
    target.setPsConditionOcc(source.getPsConditionOcc());
    target.setPsConditionOcc30d(source.getPsConditionOcc30d());
    target.setPsConditionOcc365d(source.getPsConditionOcc365d());
    target.setPsConditionOccInpt180d(source.getPsConditionOccInpt180d());
    target.setPsDemographics(source.getPsDemographics());
    target.setPsDemographicsAge(source.getPsDemographicsAge());
    target.setPsDemographicsEthnicity(source.getPsDemographicsEthnicity());
    target.setPsDemographicsGender(source.getPsDemographicsGender());
    target.setPsDemographicsMonth(source.getPsDemographicsMonth());
    target.setPsDemographicsRace(source.getPsDemographicsRace());
    target.setPsDemographicsYear(source.getPsDemographicsYear());
    target.setPsDrugEra(source.getPsDrugEra());
    target.setPsDrugEra30d(source.getPsDrugEra30d());
    target.setPsDrugEra365d(source.getPsDrugEra365d());
    target.setPsDrugEraEver(source.getPsDrugEraEver());
    target.setPsDrugEraOverlap(source.getPsDrugEraOverlap());
    target.setPsDrugExposure(source.getPsDrugExposure());
    target.setPsDrugExposure30d(source.getPsDrugExposure30d());
    target.setPsDrugExposure365d(source.getPsDrugExposure365d());
    target.setPsDrugGroup(source.getPsDrugGroup());
    target.setPsExclusionId(source.getPsExclusionId());
    target.setPsInclusionId(source.getPsInclusionId());
    target.setPsInteractionMonth(source.getPsInteractionMonth());
    target.setPsInteractionYear(source.getPsInteractionYear());
    target.setPsMatch(source.getPsMatch());
    target.setPsMatchMaxRatio(source.getPsMatchMaxRatio());
    target.setPsMeasurement(source.getPsMeasurement());
    target.setPsMeasurement30d(source.getPsMeasurement30d());
    target.setPsMeasurement365d(source.getPsMeasurement365d());
    target.setPsMeasurementAbove(source.getPsMeasurementAbove());
    target.setPsMeasurementBelow(source.getPsMeasurementBelow());
    target.setPsMeasurementCount365d(source.getPsMeasurementCount365d());
    target.setPsObservation(source.getPsObservation());
    target.setPsObservation30d(source.getPsObservation30d());
    target.setPsObservation365d(source.getPsObservation365d());
    target.setPsObservationCount365d(source.getPsObservationCount365d());
    target.setPsProcedureGroup(source.getPsProcedureGroup());
    target.setPsProcedureOcc(source.getPsProcedureOcc());
    target.setPsProcedureOcc30d(source.getPsProcedureOcc30d());
    target.setPsProcedureOcc365d(source.getPsProcedureOcc365d());
    target.setPsRiskScores(source.getPsRiskScores());
    target.setPsRiskScoresChads2(source.getPsRiskScoresChads2());
    target.setPsRiskScoresChads2vasc(source.getPsRiskScoresChads2vasc());
    target.setPsRiskScoresCharlson(source.getPsRiskScoresCharlson());
    target.setPsRiskScoresDcsi(source.getPsRiskScoresDcsi());
    target.setPsStrat(source.getPsStrat());
    target.setPsStratNumStrata(source.getPsStratNumStrata());
    target.setPsTrim(source.getPsTrim());
    target.setPsTrimFraction(source.getPsTrimFraction());
    target.setRmPriorOutcomes(source.getRmPriorOutcomes());
    target.setRmSubjectsInBothCohorts(source.getRmSubjectsInBothCohorts());
    target.setTimeAtRiskEnd(source.getTimeAtRiskEnd());
    target.setTimeAtRiskStart(source.getTimeAtRiskStart());
    target.setTreatmentId(source.getTreatmentId());
  }
}
