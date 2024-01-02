/**
 * Area Class:
 * Represents an area within a pharmaceutical facility, storing information about its name,
 * associated facility, classification, purpose, and access restrictions.
 */

// Accessing Area Class:
Area area = pharma.area();

// Accessing Methods:
String name = area.getName();
String facilityName = area.getFacilityName();
String classification = area.getClassification();
String purpose = area.getPurpose();
String accessRestrictions = area.getAccessRestrictions();


/**
 * Batch Class:
 * Represents a batch of pharmaceutical products, storing information about its batch ID,
 * associated product name, recipe name, start and end dates, status, planned and actual
 * quantities produced, and creation/update timestamps.
 */

// Accessing Batch Class:
Batch batch = pharma.batch();

// Accessing Methods:
String batchId = batch.getBatchId();
String productName = batch.getProductName();
String recipeName = batch.getRecipeName();
Date startDate = batch.getStartDate();
Date endDate = batch.getEndDate();
String status = batch.getStatus();
Integer plannedQuantityProduced = batch.getPlannedQuantityProduced();
Date createdAt = batch.getCreatedAt();
Date updatedAt = batch.getUpdatedAt();
Integer actualQuantityProduced = batch.getActualQuantityProduced();


/**
 * BioReactor Class:
 * Represents a bioreactor used in the cultivation of cell cultures for biologics production,
 * storing relevant details and operational parameters.
 */

// Accessing BioReactor Class:
BioReactor bioreactor = pharma.bioReactor();

// Accessing Methods:
String bioreactorName = bioreactor.getBioreactorName();
String bioreactorType = bioreactor.getBioreactorType();
double volumeCapacity = bioreactor.getVolumeCapacity();
String manufacturer = bioreactor.getManufacturer();
String modelNumber = bioreactor.getModelNumber();
String locationName = bioreactor.getLocationName();
String locationType = bioreactor.getLocationType();
String status = bioreactor.getStatus();
Date lastCalibrationDate = bioreactor.getLastCalibrationDate();
int calibrationFrequency = bioreactor.getCalibrationFrequency();
Date lastMaintenanceDate = bioreactor.getLastMaintenanceDate();
int maintenanceFrequency = bioreactor.getMaintenanceFrequency();
String cellLineName = bioreactor.getCellLineName();
String sourceOrganism = bioreactor.getSourceOrganism();
String operationalParameters = bioreactor.getOperationalParameters();


/**
 * Blender Class:
 * Represents a blender used in pharma manufacturing, storing information about
 * blending volume and blending speed range.
 */

// Accessing Blender Class:
Blender blender = pharma.blender();

// Accessing Methods:
Integer blendingVolume = blender.getBlendingVolume();
String blendingSpeedRange = blender.getBlendingSpeedRange();


/**
 * BufferSolution Class:
 * Represents a buffer solution used in pharma manufacturing, storing information
 * about the buffer's name, pH value, composition, manufacturer, and expiry date.
 */

// Accessing BufferSolution Class:
BufferSolution bufferSolution = pharma.bufferSolution();

// Accessing Methods:
String bufferName = bufferSolution.getBufferName();
double pHValue = bufferSolution.getpHValue();
String composition = bufferSolution.getComposition();
String manufacturer = bufferSolution.getManufacturer();
Date expiryDate = bufferSolution.getExpiryDate();


/**
 * ChemicalsAndReagent Class:
 * Represents a chemical or reagent used in pharma manufacturing, storing
 * information about its name, purity grade, manufacturer, expiration date, and storage condition.
 */

// Accessing ChemicalsAndReagent Class:
ChemicalsAndReagent chemicalOrReagent = pharma.chemicalsAndReagent();

// Accessing Methods:
String name = chemicalOrReagent.getName();
String purityGrade = chemicalOrReagent.getPurityGrade();
String manufacturer = chemicalOrReagent.getManufacturer();
Date expirationDate = chemicalOrReagent.getExpirationDate();
String storageCondition = chemicalOrReagent.getStorageCondition();


/**
 * ChromatographySystem Class:
 * Represents a chromatography system used in pharma manufacturing, storing information
 * about its system name, system type (e.g., Affinity, Ion Exchange, Size Exclusion), manufacturer,
 * model number, column type, resin type, last calibration date, calibration frequency, last
 * maintenance date, maintenance frequency, location name, and location type.
 */

// Accessing ChromatographySystem Class:
ChromatographySystem chromatographySystem = pharma.chromatographySystem();

// Accessing Methods:
String systemName = chromatographySystem.getSystemName();
String systemType = chromatographySystem.getSystemType();
String manufacturer = chromatographySystem.getManufacturer();
String modelNumber = chromatographySystem.getModelNumber();
String columnType = chromatographySystem.getColumnType();
String resinType = chromatographySystem.getResinType();
Date lastCalibrationDate = chromatographySystem.getLastCalibrationDate();
int calibrationFrequency = chromatographySystem.getCalibrationFrequency();
Date lastMaintenanceDate = chromatographySystem.getLastMaintenanceDate();
int maintenanceFrequency = chromatographySystem.getMaintenanceFrequency();
String locationName = chromatographySystem.getLocationName();
String locationType = chromatographySystem.getLocationType();


/**
 * CleaningAgent Class:
 * Represents a cleaning agent used in pharma manufacturing, storing information
 * about its agent name, type, and manufacturer.
 */

// Accessing CleaningAgent Class:
CleaningAgent cleaningAgent = pharma.cleaningAgent();

// Accessing Methods:
String agentName = cleaningAgent.getAgentName();
String type = cleaningAgent.getType();
String manufacturer = cleaningAgent.getManufacturer();

/**
 * CoatingMachine Class:
 * Represents a coating machine used in pharma manufacturing, storing information
 * about its coating technology and maximum batch size it can handle.
 */

// Accessing CoatingMachine Class:
CoatingMachine coatingMachine = pharma.coatingMachine();

// Accessing Methods:
String coatingTechnology = coatingMachine.getCoatingTechnology();
Integer maxBatchSize = coatingMachine.getMaxBatchSize();


/**
 * ContaminantsEquipment Class:
 * Represents equipment used for contaminants analysis in pharma manufacturing,
 * storing information about its equipment type (e.g., Gas Chromatograph, Mass Spectrometer, Ion Chromatograph),
 * model, manufacturer, serial number, calibration frequency, last maintenance date, maintenance frequency,
 * location name, and status (e.g., Active, In Maintenance, Out of Service).
 */

// Accessing ContaminantsEquipment Class:
ContaminantsEquipment contaminantsEquipment = pharma.contaminantsEquipment();

// Accessing Methods:
String equipmentType = contaminantsEquipment.getEquipmentType();
String model = contaminantsEquipment.getModel();
String manufacturer = contaminantsEquipment.getManufacturer();
String serialNumber = contaminantsEquipment.getSerialNumber();
int calibrationFrequency = contaminantsEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = contaminantsEquipment.getLastMaintenanceDate();
int maintenanceFrequency = contaminantsEquipment.getMaintenanceFrequency();
String locationName = contaminantsEquipment.getLocationName();
String locationType = contaminantsEquipment.getLocationType();
String status = contaminantsEquipment.getStatus();

/**
 * Dryer Class:
 * Represents a drying equipment used in pharma manufacturing, storing information
 * about its drying technology and maximum drying temperature it can achieve.
 */

// Accessing Dryer Class:
Dryer dryer = pharma.dryer();

// Accessing Methods:
String dryingTechnology = dryer.getDryingTechnology();
Integer maxDryingTemperature = dryer.getMaxDryingTemperature();

/**
 * DustExtractor Class:
 * Represents a dust extractor equipment used in pharma manufacturing, storing information
 * about its extraction capacity and filter type.
 */

// Accessing DustExtractor Class:
DustExtractor dustExtractor = pharma.dustExtractor();

// Accessing Methods:
Integer extractionCapacity = dustExtractor.getExtractionCapacity();
String filterType = dustExtractor.getFilterType();


/**
 * Equipment Class:
 * Represents various types of equipment used in pharma manufacturing,
 * storing information about equipment type (e.g., Incubator, Particle Counter, TOC Analyzer),
 * model number, serial number, manufacturer, last calibration date, calibration frequency,
 * last maintenance date, maintenance frequency, location name, and status (e.g., Active, In Maintenance).
 */

// Accessing Equipment Class:
Equipment equipment = pharma.equipment();

// Accessing Methods:
String equipmentType = equipment.getEquipmentType();
String modelNumber = equipment.getModelNumber();
String serialNumber = equipment.getSerialNumber();
String manufacturer = equipment.getManufacturer();
Date lastCalibrationDate = equipment.getLastCalibrationDate();
int calibrationFrequency = equipment.getCalibrationFrequency();
Date lastMaintenanceDate = equipment.getLastMaintenanceDate();
int maintenanceFrequency = equipment.getMaintenanceFrequency();
String locationName = equipment.getLocationName();
String locationType = equipment.getLocationType();
String status = equipment.getStatus();

/**
 * EquipmentSensor Class:
 * Represents a sensor used in pharma manufacturing equipment,
 * storing various attributes such as sensor type, model number, manufacturer,
 * status, calibration and maintenance details, operational range, location, and accuracy.
 */
// Accessing EquipmentSensor Class:
EquipmentSensor equipmentSensor = pharma.equipmentSensor();

// Accessing Methods:
String sensorType = equipmentSensor.getSensorType();
String modelNumber = equipmentSensor.getModelNumber();
String manufacturer = equipmentSensor.getManufacturer();
String status = equipmentSensor.getStatus();
Date lastCalibrationDate = equipmentSensor.getLastCalibrationDate();
int calibrationFrequency = equipmentSensor.getCalibrationFrequency();
Date lastMaintenanceDate = equipmentSensor.getLastMaintenanceDate();
int maintenanceFrequency = equipmentSensor.getMaintenanceFrequency();
String operationalRange = equipmentSensor.getOperationalRange();
String locationName = equipmentSensor.getLocationName();
String locationType = equipmentSensor.getLocationType();
String accuracy = equipmentSensor.getAccuracy();

/**
 * Excipient Class:
 * Represents an excipient used in pharmaceutical formulation, storing information about
 * its name, type (e.g., Adjuvant, Preservative, Stabilizer), manufacturer, standard concentration,
 * expiry date, and storage condition.
 */

// Accessing Excipient Class:
Excipient excipient = pharma.excipient();

// Accessing Methods:
String name = excipient.getName();
String type = excipient.getType();
String manufacturer = excipient.getManufacturer();
String standardConcentration = excipient.getStandardConcentration();
Date expiryDate = excipient.getExpiryDate();
String storageCondition = excipient.getStorageCondition();

/**
 * FeedStock Class:
 * Represents essential raw materials used in pharma manufacturing, providing details
 * about their type (e.g., nutrient, supplement), composition, optimal usage rate, manufacturer,
 * expiry date, and storage conditions.
 */

// Accessing FeedStock Class:
FeedStock feedStock = pharma.feedStock();

// Accessing Methods:
String feedStockType = feedStock.getFeedStockType();
String composition = feedStock.getComposition();
double optimalUseRate = feedStock.getOptimalUseRate();
String manufacturer = feedStock.getManufacturer();
Date expiryDate = feedStock.getExpiryDate();
String storageConditions = feedStock.getStorageConditions();

/**
 * FillFinishEquipment Class:
 * Represents equipment used in the final stages of pharma manufacturing.
 */

// Accessing FillFinishEquipment Class:
FillFinishEquipment fillFinishEquipment = pharma.fillFinishEquipment();

// Accessing Methods:
String equipmentName = fillFinishEquipment.getEquipmentName();
String equipmentType = fillFinishEquipment.getEquipmentType();
String manufacturer = fillFinishEquipment.getManufacturer();
String modelNumber = fillFinishEquipment.getModelNumber();
String status = fillFinishEquipment.getStatus();
Date lastCalibrationDate = fillFinishEquipment.getLastCalibrationDate();
int calibrationFrequency = fillFinishEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = fillFinishEquipment.getLastMaintenanceDate();
int maintenanceFrequency = fillFinishEquipment.getMaintenanceFrequency();

/**
 * FiltersAndMembrane Class:
 * Represents filters and membranes used in pharma manufacturing.
 */

// Accessing FiltersAndMembrane Class:
FiltersAndMembrane filtersAndMembrane = pharma.filtersAndMembrane();

// Accessing Methods:
String filterType = filtersAndMembrane.getFilterType();
double poreSize = filtersAndMembrane.getPoreSize();
double surfaceArea = filtersAndMembrane.getSurfaceArea();
String manufacturer = filtersAndMembrane.getManufacturer();
String modelNumber = filtersAndMembrane.getModelNumber();
Number usageLimit = filtersAndMembrane.getUsageLimit();
String status = filtersAndMembrane.getStatus();
String associatedProcessName = filtersAndMembrane.getAssociatedProcessName();

/**
 * FiltrationSystem Class:
 * Represents filtration systems used in pharma manufacturing.
 */

// Accessing FiltrationSystem Class:
FiltrationSystem filtrationSystem = pharma.filtrationSystem();

// Accessing Methods:
String type = filtrationSystem.getType();
String manufacturer = filtrationSystem.getManufacturer();
String modelNumber = filtrationSystem.getModelNumber();
String membraneSpecs = filtrationSystem.getMembraneSpecs();
Date installationDate = filtrationSystem.getInstallationDate();
String status = filtrationSystem.getStatus();
Date lastCalibrationDate = filtrationSystem.getLastCalibrationDate();
int calibrationFrequency = filtrationSystem.getCalibrationFrequency();
Date lastMaintenanceDate = filtrationSystem.getLastMaintenanceDate();
int maintenanceFrequency = filtrationSystem.getMaintenanceFrequency();

/**
 * FormulationEquipment Class:
 * Represents equipment used in pharmaceutical formulation processes.
 */

// Accessing FormulationEquipment Class:
FormulationEquipment formulationEquipment = pharma.formulationEquipment();

// Accessing Methods:
String type = formulationEquipment.getType();
String manufacturer = formulationEquipment.getManufacturer();
String modelNumber = formulationEquipment.getModelNumber();
String capacity = formulationEquipment.getCapacity();
String status = formulationEquipment.getStatus();
Date lastCalibrationDate = formulationEquipment.getLastCalibrationDate();
int calibrationFrequency = formulationEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = formulationEquipment.getLastMaintenanceDate();
int maintenanceFrequency = formulationEquipment.getMaintenanceFrequency();

/**
 * FormulationMaterial Class:
 * Represents materials used in pharmaceutical formulation processes, including types
 * such as Adjuvants, Preservatives, and Stabilizers.
 */

// Accessing FormulationMaterial Class:
FormulationMaterial formulationMaterial = pharma.formulationMaterial();

// Accessing Methods:
String type = formulationMaterial.getType();
String manufacturer = formulationMaterial.getManufacturer();
Date receivedDate = formulationMaterial.getReceivedDate();
Date expiryDate = formulationMaterial.getExpiryDate();
String storageCondition = formulationMaterial.getStorageCondition();
double quantity = formulationMaterial.getQuantity();

/**
 * GasSamplingPoint Class:
 * Represents sampling points for gases in pharma manufacturing, providing details
 * about the gas system name, gas system type (e.g., Compressed Air, Nitrogen, CO2),
 * point name, location description, sampling frequency, and sampling method.
 */

// Accessing GasSamplingPoint Class:
GasSamplingPoint gasSamplingPoint = pharma.gasSamplingPoint();

// Accessing Methods:
String gasSystemName = gasSamplingPoint.getGasSystemName();
String gasSystemType = gasSamplingPoint.getGasSystemType();
String pointName = gasSamplingPoint.getPointName();
String locationDescription = gasSamplingPoint.getLocationDescription();
int samplingFrequency = gasSamplingPoint.getSamplingFrequency();
String samplingMethod = gasSamplingPoint.getSamplingMethod();

/**
 * GasSystem Class:
 * Represents gas systems used in pharma manufacturing, including details about
 * the system name, system type (e.g., Compressed Air, Nitrogen, CO2), description,
 * last maintenance date, maintenance frequency, and monitoring points.
 */

// Accessing GasSystem Class:
GasSystem gasSystem = pharma.gasSystem();

// Accessing Methods:
String systemName = gasSystem.getSystemName();
String systemType = gasSystem.getSystemType();
String description = gasSystem.getDescription();
Date lastMaintenanceDate = gasSystem.getLastMaintenanceDate();
int maintenanceFrequency = gasSystem.getMaintenanceFrequency();
String monitoringPoints = gasSystem.getMonitoringPoints();

/**
 * Granulator Class:
 * Represents granulation equipment used in pharma manufacturing.
 */

// Accessing Granulator Class:
Granulator granulator = pharma.granulator();

// Accessing Methods:
Integer granulationCapacity = granulator.getGranulationCapacity();
Integer maxOperatingSpeed = granulator.getMaxOperatingSpeed();

/**
 * GrowthMedia Class:
 * Represents growth media used in pharmaceutical microbiology, including information
 * about media name, media type (e.g., Tryptic Soy Agar, Sabouraud Dextrose Agar),
 * manufacturer, and expiration date.
 */

// Accessing GrowthMedia Class:
GrowthMedia growthMedia = pharma.growthMedia();

// Accessing Methods:
String mediaName = growthMedia.getMediaName();
String mediaType = growthMedia.getMediaType();
String manufacturer = growthMedia.getManufacturer();
Date expirationDate = growthMedia.getExpirationDate();

/**
 * HarvestingEquipment Class:
 * Represents equipment used in the harvesting process of pharma manufacturing.
 */

// Accessing HarvestingEquipment Class:
HarvestingEquipment harvestingEquipment = pharma.harvestingEquipment();

// Accessing Methods:
String equipmentName = harvestingEquipment.getEquipmentName();
String equipmentType = harvestingEquipment.getEquipmentType();
String manufacturer = harvestingEquipment.getManufacturer();
String modelNumber = harvestingEquipment.getModelNumber();
String status = harvestingEquipment.getStatus();
Date lastCalibrationDate = harvestingEquipment.getLastCalibrationDate();
int calibrationFrequency = harvestingEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = harvestingEquipment.getLastMaintenanceDate();
int maintenanceFrequency = harvestingEquipment.getMaintenanceFrequency();
String locationName = harvestingEquipment.getLocationName();
String locationType = harvestingEquipment.getLocationType();
String operationalParameters = harvestingEquipment.getOperationalParameters();

/**
 * IBCBin Class:
 * Represents Intermediate Bulk Containers (IBCs) used in pharma manufacturing.
 */

// Accessing IBCBin Class:
IBCBin ibcBin = pharma.ibcBin();

// Accessing Method:
Integer volumeCapacity = ibcBin.getVolumeCapacity();

/**
 * Incubator Class:
 * Represents incubators used in pharmaceutical laboratories and manufacturing,
 * including details about incubator type (e.g., CO2 Incubator, Refrigerated Incubator),
 * manufacturer, model number, calibration frequency, last maintenance date,
 * maintenance frequency, last calibration date, location name, location type, and status.
 */

// Accessing Incubator Class:
Incubator incubator = pharma.incubator();

// Accessing Methods:
String incubatorType = incubator.getIncubatorType();
String manufacturer = incubator.getManufacturer();
String modelNumber = incubator.getModelNumber();
int calibrationFrequency = incubator.getCalibrationFrequency();
Date lastMaintenanceDate = incubator.getLastMaintenanceDate();
int maintenanceFrequency = incubator.getMaintenanceFrequency();
Date lastCalibrationDate = incubator.getLastCalibrationDate();
String locationName = incubator.getLocationName();
String locationType = incubator.getLocationType();
String status = incubator.getStatus();

/**
 * InspectionEquipment Class:
 * Represents equipment used for inspection in pharma manufacturing,
 * including details about manufacturer, model number, inspection type (e.g., Visual, Weight Check),
 * status (e.g., Operational, Under Maintenance), last calibration date, calibration frequency,
 * last maintenance date, and maintenance frequency.
 */

// Accessing InspectionEquipment Class:
InspectionEquipment inspectionEquipment = pharma.inspectionEquipment();

// Accessing Methods:
String manufacturer = inspectionEquipment.getManufacturer();
String modelNumber = inspectionEquipment.getModelNumber();
String inspectionType = inspectionEquipment.getInspectionType();
String status = inspectionEquipment.getStatus();
Date lastCalibrationDate = inspectionEquipment.getLastCalibrationDate();
int calibrationFrequency = inspectionEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = inspectionEquipment.getLastMaintenanceDate();
int maintenanceFrequency = inspectionEquipment.getMaintenanceFrequency();

/**
 * InspectionMachine Class:
 * Represents machines used for inspection processes in pharma manufacturing,
 * including details about inspection speed and the technology used.
 */

// Accessing InspectionMachine Class:
InspectionMachine inspectionMachine = pharma.inspectionMachine();

// Accessing Methods:
Integer inspectionSpeed = inspectionMachine.getInspectionSpeed();
String technologyUsed = inspectionMachine.getTechnologyUsed();


/**
 * LabelingEquipment Class:
 * Represents equipment used for labeling processes in pharma manufacturing,
 * including details about manufacturer, model number, label type, status (e.g., Operational, Under Maintenance),
 * last calibration date, calibration frequency, last maintenance date, and maintenance frequency.
 */

// Accessing LabelingEquipment Class:
LabelingEquipment labelingEquipment = pharma.labelingEquipment();

// Accessing Methods:
String manufacturer = labelingEquipment.getManufacturer();
String modelNumber = labelingEquipment.getModelNumber();
String labelType = labelingEquipment.getLabelType();
String status = labelingEquipment.getStatus();
Date lastCalibrationDate = labelingEquipment.getLastCalibrationDate();
int calibrationFrequency = labelingEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = labelingEquipment.getLastMaintenanceDate();
int maintenanceFrequency = labelingEquipment.getMaintenanceFrequency();


/**
 * LaboratoryEquipment Class:
 * Represents laboratory equipment used in pharmaceutical research and testing,
 * including details about equipment type (e.g., Balance, pH Meter), model number,
 * manufacturer, status (e.g., Operational, Under Maintenance), location name,
 * last calibration date, calibration frequency, and last maintenance date.
 */

// Accessing LaboratoryEquipment Class:
LaboratoryEquipment laboratoryEquipment = pharma.laboratoryEquipment();

// Accessing Methods:
String type = laboratoryEquipment.getType();
String modelNumber = laboratoryEquipment.getModelNumber();
String manufacturer = laboratoryEquipment.getManufacturer();
String status = laboratoryEquipment.getStatus();
String locationName = laboratoryEquipment.getLocationName();
Date lastCalibrationDate = laboratoryEquipment.getLastCalibrationDate();
int calibrationFrequency = laboratoryEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = laboratoryEquipment.getLastMaintenanceDate();


/**
 * LaboratoryLocation Class:
 * Represents locations within a pharmaceutical laboratory, providing details about
 * location names and location types.
 */

// Accessing LaboratoryLocation Class:
LaboratoryLocation laboratoryLocation = pharma.laboratoryLocation();

// Accessing Methods:
String locationName = laboratoryLocation.getLocationName();
String locationType = laboratoryLocation.getLocationType();


/**
 * LyophilizationEquipment Class:
 * Represents lyophilization equipment used in pharma manufacturing,
 * including details about manufacturer, model number, capacity, shelf area,
 * condenser temperature range, vacuum range, status (e.g., Operational, Under Maintenance),
 * last calibration date, calibration frequency, last maintenance date, and maintenance frequency.
 */

// Accessing LyophilizationEquipment Class:
LyophilizationEquipment lyophilizationEquipment = pharma.lyophilizationEquipment();

// Accessing Methods:
String manufacturer = lyophilizationEquipment.getManufacturer();
String modelNumber = lyophilizationEquipment.getModelNumber();
String capacity = lyophilizationEquipment.getCapacity();
String shelfArea = lyophilizationEquipment.getShelfArea();
String condenserTempRange = lyophilizationEquipment.getCondenserTempRange();
String vacuumRange = lyophilizationEquipment.getVacuumRange();
String status = lyophilizationEquipment.getStatus();
Date lastCalibrationDate = lyophilizationEquipment.getLastCalibrationDate();
int calibrationFrequency = lyophilizationEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = lyophilizationEquipment.getLastMaintenanceDate();
int maintenanceFrequency = lyophilizationEquipment.getMaintenanceFrequency();


/**
 * LyophilizationVial Class:
 * Represents vials used in lyophilization processes in pharma manufacturing,
 * including details about vial type, volume capacity, manufacturer, sterilization date,
 * and expiry date.
 */

// Accessing LyophilizationVial Class:
LyophilizationVial lyophilizationVial = pharma.lyophilizationVial();

// Accessing Methods:
String vialType = lyophilizationVial.getVialType();
double volumeCapacity = lyophilizationVial.getVolumeCapacity();
String manufacturer = lyophilizationVial.getManufacturer();
Date sterilizationDate = lyophilizationVial.getSterilizationDate();
Date expiryDate = lyophilizationVial.getExpiryDate();


/**
 * Material Class:
 * Represents materials used in pharma manufacturing, including details about
 * material code, name, classification, quality attributes, supplier, inventory level,
 * and storage condition.
 */

// Accessing Material Class:
Material material = pharma.material();

// Accessing Methods:
String materialCode = material.getMaterialCode();
String name = material.getName();
String classification = material.getClassification();
String qualityAttributes = material.getQualityAttributes();
String supplier = material.getSupplier();
int inventoryLevel = material.getInventoryLevel();
String storageCondition = material.getStorageCondition();


/**
 * MillingMachine Class:
 * Represents milling machines used in pharma manufacturing.
 */

// Accessing MillingMachine Class:
MillingMachine millingMachine = pharma.millingMachine();

// Accessing Method:
Integer millingCapacity = millingMachine.getMillingCapacity();


/**
 * Mixer Class:
 * Represents mixers used in pharma manufacturing, providing details about
 * mixing capacity and mixer type.
 */

// Accessing Mixer Class:
Mixer mixer = pharma.mixer();

// Accessing Methods:
Integer mixingCapacity = mixer.getMixingCapacity();
String mixerType = mixer.getMixerType();


/**
 * MonitoringLocation Class:
 * Represents monitoring locations in pharma manufacturing facilities,
 * including details about location name, location type (e.g., Cleanroom, Warehouse, Lab),
 * classification (e.g., ISO Class 5, Class 7), and description.
 */

// Accessing MonitoringLocation Class:
MonitoringLocation monitoringLocation = pharma.monitoringLocation();

// Accessing Methods:
String locationName = monitoringLocation.getLocationName();
String locationType = monitoringLocation.getLocationType();
String classification = monitoringLocation.getClassification();
String description = monitoringLocation.getDescription();

/**
 * PackagingEquipment Class:
 * Represents equipment used for packaging processes in pharma manufacturing,
 * including details about manufacturer, model number, packaging type (e.g., Blister Pack, Carton),
 * status (e.g., Operational, Under Maintenance), last calibration date, calibration frequency,
 * last maintenance date, and maintenance frequency.
 */

// Accessing PackagingEquipment Class:
PackagingEquipment packagingEquipment = pharma.packagingEquipment();

// Accessing Methods:
String manufacturer = packagingEquipment.getManufacturer();
String modelNumber = packagingEquipment.getModelNumber();
String packagingType = packagingEquipment.getPackagingType();
String status = packagingEquipment.getStatus();
Date lastCalibrationDate = packagingEquipment.getLastCalibrationDate();
int calibrationFrequency = packagingEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = packagingEquipment.getLastMaintenanceDate();
int maintenanceFrequency = packagingEquipment.getMaintenanceFrequency();

/**
 * ParticulateMonitoringEquipment Class:
 * Represents equipment used for monitoring particulate matter in pharma manufacturing,
 * including details about equipment type (e.g., Optical Particle Counter), model, manufacturer,
 * serial number, last calibration date, calibration frequency, last maintenance date,
 * maintenance frequency, location name, location type, and status.
 */

// Accessing ParticulateMonitoringEquipment Class:
ParticulateMonitoringEquipment particulateMonitoringEquipment = pharma.particulateMonitoringEquipment();

// Accessing Methods:
String equipmentType = particulateMonitoringEquipment.getEquipmentType();
String model = particulateMonitoringEquipment.getModel();
String manufacturer = particulateMonitoringEquipment.getManufacturer();
String serialNumber = particulateMonitoringEquipment.getSerialNumber();
Date lastCalibrationDate = particulateMonitoringEquipment.getLastCalibrationDate();
int calibrationFrequency = particulateMonitoringEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = particulateMonitoringEquipment.getLastMaintenanceDate();
int maintenanceFrequency = particulateMonitoringEquipment.getMaintenanceFrequency();
String locationName = particulateMonitoringEquipment.getLocationName();
String locationType = particulateMonitoringEquipment.getLocationType();
String status = particulateMonitoringEquipment.getStatus();

/**
 * PreparedSolution Class:
 * Represents solutions prepared for pharma manufacturing,
 * including details about chemical name, concentration, volume prepared, prepared by,
 * preparation date, expiry date, and solution parameters.
 */

// Accessing PreparedSolution Class:
PreparedSolution preparedSolution = pharma.preparedSolution();

// Accessing Methods:
String chemicalName = preparedSolution.getChemicalName();
String concentration = preparedSolution.getConcentration();
double volumePrepared = preparedSolution.getVolumePrepared();
String preparedBy = preparedSolution.getPreparedBy();
Date preparationDate = preparedSolution.getPreparationDate();
Date expiryDate = preparedSolution.getExpiryDate();
String solutionParameters = preparedSolution.getSolutionParameters();

/**
 * PrimaryPackagingComponent Class:
 * Represents primary packaging components used in pharma manufacturing,
 * including details about component type (e.g., Vial, Syringe, Stopper), manufacturer,
 * material specifications (e.g., Type I Glass, HDPE, Rubber), and storage conditions.
 */

// Accessing PrimaryPackagingComponent Class:
PrimaryPackagingComponent primaryPackagingComponent = pharma.primaryPackagingComponent();

// Accessing Methods:
String componentType = primaryPackagingComponent.getComponentType();
String manufacturer = primaryPackagingComponent.getManufacturer();
String materialSpecs = primaryPackagingComponent.getMaterialSpecs();
String storageConditions = primaryPackagingComponent.getStorageConditions();

/**
 * Product Class:
 * Represents pharmaceutical products, providing details about product description,
 * product code, formula, dosage form, and strength.
 */

// Accessing Product Class:
Product product = pharma.product();

// Accessing Methods:
String description = product.getDescription();
String productCode = product.getProductCode();
String formula = product.getFormula();
String dosageForm = product.getDosageForm();
String strength = product.getStrength();


/**
 * ProtectiveEquipment Class:
 * Represents protective equipment used in pharma manufacturing facilities,
 * including details about equipment name, type, manufacturer, and expiry date.
 */

// Accessing ProtectiveEquipment Class:
ProtectiveEquipment protectiveEquipment = pharma.protectiveEquipment();

// Accessing Methods:
String equipmentName = protectiveEquipment.getEquipmentName();
String type = protectiveEquipment.getType();
String manufacturer = protectiveEquipment.getManufacturer();
Date expiryDate = protectiveEquipment.getExpiryDate();


/**
 * PurificationConsumable Class:
 * Represents consumable materials used in purification processes in pharma manufacturing,
 * including details about consumable name, type (e.g., Resin, Filter, Solvent, Buffer), manufacturer,
 * expiry date, and associated process name.
 */

// Accessing PurificationConsumable Class:
PurificationConsumable purificationConsumable = pharma.purificationConsumable();

// Accessing Methods:
String consumableName = purificationConsumable.getConsumableName();
String type = purificationConsumable.getType();
String manufacturer = purificationConsumable.getManufacturer();
Date expiryDate = purificationConsumable.getExpiryDate();
String associatedProcessName = purificationConsumable.getAssociatedProcessName();


/**
 * PurificationEquipment Class:
 * Represents equipment used in purification processes in pharma manufacturing,
 * including details about equipment type (e.g., Chromatography System, Filtration Unit),
 * manufacturer, model number, capacity, installation date, status (e.g., Operational, Maintenance Due, Decommissioned),
 * last calibration date, calibration frequency, last maintenance date, and maintenance frequency.
 */

// Accessing PurificationEquipment Class:
PurificationEquipment purificationEquipment = pharma.purificationEquipment();

// Accessing Methods:
String type = purificationEquipment.getType();
String manufacturer = purificationEquipment.getManufacturer();
String modelNumber = purificationEquipment.getModelNumber();
String capacity = purificationEquipment.getCapacity();
Date installationDate = purificationEquipment.getInstallationDate();
String status = purificationEquipment.getStatus();
Date lastCalibrationDate = purificationEquipment.getLastCalibrationDate();
int calibrationFrequency = purificationEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = purificationEquipment.getLastMaintenanceDate();
int maintenanceFrequency = purificationEquipment.getMaintenanceFrequency();


/**
 * RawMaterial Class:
 * Represents raw materials used in pharma manufacturing,
 * including details about material name, manufacturer, received date, expiry date, and quality control (QC) status.
 */

// Accessing RawMaterial Class:
RawMaterial rawMaterial = pharma.rawMaterial();

// Accessing Methods:
String materialName = rawMaterial.getMaterialName();
String manufacturer = rawMaterial.getManufacturer();
Date receivedDate = rawMaterial.getReceivedDate();
Date expiryDate = rawMaterial.getExpiryDate();
String qcStatus = rawMaterial.getQcStatus();


/**
 * Recipe Class:
 * Represents recipes used in pharma manufacturing,
 * including details about product name, recipe name, formula, creation date (createdAt),
 * and last update date (updatedAt).
 */

// Accessing Recipe Class:
Recipe recipe = pharma.recipe();

// Accessing Methods:
String productName = recipe.getProductName();
String recipeName = recipe.getRecipeName();
String formula = recipe.getFormula();
Date createdAt = recipe.getCreatedAt();
Date updatedAt = recipe.getUpdatedAt();


/**
 * Room Class:
 * Represents rooms in pharma manufacturing facilities,
 * including details about area name, room name, purpose, last sanitation date,
 * and sanitation frequency.
 */

// Accessing Room Class:
Room room = pharma.room();

// Accessing Methods:
String areaName = room.getAreaName();
String name = room.getName();
String purpose = room.getPurpose();
Date lastSanitationDate = room.getLastSanitationDate();
int sanitationFrequency = room.getSanitationFrequency();


/**
 * SamplingKit Class:
 * Represents sampling kits used in pharma manufacturing,
 * including details about kit type (e.g., Glove Fingertip Samplers, Garment Samplers),
 * manufacturer, and expiry date.
 */

// Accessing SamplingKit Class:
SamplingKit samplingKit = pharma.samplingKit();

// Accessing Methods:
String kitType = samplingKit.getKitType();
String manufacturer = samplingKit.getManufacturer();
Date expiryDate = samplingKit.getExpiryDate();


/**
 * SamplingLocation Class:
 * Represents sampling locations in pharma manufacturing facilities,
 * including details about location name, location type (e.g., Cleanroom, Warehouse, Lab),
 * location classification (e.g., ISO Class 5, Class 7), and description.
 */

// Accessing SamplingLocation Class:
SamplingLocation samplingLocation = pharma.samplingLocation();

// Accessing Methods:
String locationName = samplingLocation.getLocationName();
String locationType = samplingLocation.getLocationType();
String locationClassification = samplingLocation.getLocationClassification();
String description = samplingLocation.getDescription();

/**
 * SamplingSurface Class:
 * Represents sampling surfaces in pharma manufacturing facilities,
 * including details about surface type (e.g., Stainless Steel, Glass, Plastic),
 * location name, location type, and description.
 */

// Accessing SamplingSurface Class:
SamplingSurface samplingSurface = pharma.samplingSurface();

// Accessing Methods:
String surfaceType = samplingSurface.getSurfaceType();
String locationName = samplingSurface.getLocationName();
String locationType = samplingSurface.getLocationType();
String description = samplingSurface.getDescription();


/**
 * SanitationEquipment Class:
 * Represents sanitation equipment used in pharma manufacturing facilities,
 * including details about equipment name, type, and manufacturer.
 */

// Accessing SanitationEquipment Class:
SanitationEquipment sanitationEquipment = pharma.sanitationEquipment();

// Accessing Methods:
String equipmentName = sanitationEquipment.getEquipmentName();
String type = sanitationEquipment.getType();
String manufacturer = sanitationEquipment.getManufacturer();


/**
 * Sensor Class:
 * Represents sensors used in pharma manufacturing facilities for various purposes,
 * including details about sensor type (e.g., Particle Counter, Temperature Sensor),
 * model number, serial number, location name, location type, last calibration date,
 * calibration frequency, last maintenance date, maintenance frequency, and status.
 */

// Accessing Sensor Class:
Sensor sensor = pharma.sensor();

// Accessing Methods:
String sensorType = sensor.getSensorType();
String modelNumber = sensor.getModelNumber();
String serialNumber = sensor.getSerialNumber();
String locationName = sensor.getLocationName();
String locationType = sensor.getLocationType();
Date lastCalibrationDate = sensor.getLastCalibrationDate();
int calibrationFrequency = sensor.getCalibrationFrequency();
Date lastMaintenanceDate = sensor.getLastMaintenanceDate();
int maintenanceFrequency = sensor.getMaintenanceFrequency();
String status = sensor.getStatus();


/**
 * Sifter Class:
 * Represents sifters used in pharma manufacturing,
 * including details about mesh size range and sifting speed.
 */

// Accessing Sifter Class:
Sifter sifter = pharma.sifter();

// Accessing Methods:
String meshSizeRange = sifter.getMeshSizeRange();
Integer siftingSpeed = sifter.getSiftingSpeed();


/**
 * Stirrer Class:
 * Represents stirrers used in pharma manufacturing,
 * including details about the stirring speed range.
 */

// Accessing Stirrer Class:
Stirrer stirrer = pharma.stirrer();

// Accessing Methods:
String stirringSpeedRange = stirrer.getStirringSpeedRange();

/**
 * StorageContainer Class:
 * Represents storage containers used in pharma manufacturing,
 * including details about container type and volume with units.
 */

// Accessing StorageContainer Class:
StorageContainer storageContainer = pharma.storageContainer();

// Accessing Methods:
String containerType = storageContainer.getContainerType();
String volumeWithUnit = storageContainer.getVolumeWithUnit();


/**
 * SurfaceSamplingDevice Class:
 * Represents surface sampling devices used in pharma manufacturing,
 * including details about device type (e.g., Swab, Contact Plate, Rodac Plate),
 * manufacturer, and expiration date.
 */

// Accessing SurfaceSamplingDevice Class:
SurfaceSamplingDevice surfaceSamplingDevice = pharma.surfaceSamplingDevice();

// Accessing Methods:
String deviceType = surfaceSamplingDevice.getDeviceType();
String manufacturer = surfaceSamplingDevice.getManufacturer();
Date expirationDate = surfaceSamplingDevice.getExpirationDate();


/**
 * TabletDeduster Class:
 * Represents tablet dedusters used in pharma manufacturing,
 * including details about dedusting efficiency and dedusting speed.
 */

// Accessing TabletDeduster Class:
TabletDeduster tabletDeduster = pharma.tabletDeduster();

// Accessing Methods:
Integer dedustingEfficiency = tabletDeduster.getDedustingEfficiency();
Integer dedustingSpeed = tabletDeduster.getDedustingSpeed();


/**
 * TabletPress Class:
 * Represents tablet presses used in pharma manufacturing,
 * including details about the maximum tablet output and compression force range.
 */

// Accessing TabletPress Class:
TabletPress tabletPress = pharma.tabletPress();

// Accessing Methods:
Integer maxTabletOutput = tabletPress.getMaxTabletOutput();
String compressionForceRange = tabletPress.getCompressionForceRange();


/**
 * TabletTooling Class:
 * Represents tablet tooling used in pharma manufacturing,
 * including details about tooling size and shape.
 */

// Accessing TabletTooling Class:
TabletTooling tabletTooling = pharma.tabletTooling();

// Accessing Methods:
String toolingSize = tabletTooling.getToolingSize();
String toolingShape = tabletTooling.getToolingShape();


/**
 * User Class:
 * Represents user information in a pharmaceutical system,
 * including details such as first name, last name, email, user handle,
 * password, and role.
 */

// Accessing User Class:
User user = pharma.user();

// Accessing Methods:
String firstName = user.getFirstName();
String lastName = user.getLastName();
String email = user.getEmail();
String userhandle = user.getUserhandle();
String password = user.getPassword();
String role = user.getRole();


/**
 * ViralInactivationEquipment Class:
 * Represents equipment used for viral inactivation in pharma manufacturing,
 * storing details about equipment name, inactivation method, manufacturer, model number,
 * location, status, calibration, maintenance, and operational parameters.
 */

// Accessing ViralInactivationEquipment Class:
ViralInactivationEquipment viralInactivationEquipment = pharma.viralInactivationEquipment();

// Accessing Methods:
String equipmentName = viralInactivationEquipment.getEquipmentName();
String inactivationMethod = viralInactivationEquipment.getInactivationMethod();
String manufacturer = viralInactivationEquipment.getManufacturer();
String modelNumber = viralInactivationEquipment.getModelNumber();
String locationName = viralInactivationEquipment.getLocationName();
String locationType = viralInactivationEquipment.getLocationType();
String status = viralInactivationEquipment.getStatus();
Date lastCalibrationDate = viralInactivationEquipment.getLastCalibrationDate();
int calibrationFrequency = viralInactivationEquipment.getCalibrationFrequency();
Date lastMaintenanceDate = viralInactivationEquipment.getLastMaintenanceDate();
int maintenanceFrequency = viralInactivationEquipment.getMaintenanceFrequency();
String operationalParameters = viralInactivationEquipment.getOperationalParameters();


/**
 * WaterSystem Class:
 * Represents water systems used in pharma manufacturing,
 * including details about the system name, system type (e.g., WFI - Water for Injection, Purified Water),
 * description, last maintenance date, maintenance frequency, and monitoring points.
 */

// Accessing WaterSystem Class:
WaterSystem waterSystem = pharma.waterSystem();

// Accessing Methods:
String systemName = waterSystem.getSystemName();
String systemType = waterSystem.getSystemType();
String description = waterSystem.getDescription();
Date lastMaintenanceDate = waterSystem.getLastMaintenanceDate();
int maintenanceFrequency = waterSystem.getMaintenanceFrequency();
String monitoringPoints = waterSystem.getMonitoringPoints();

/**
 * Disperser Class:
 * Represents a disperser used in pharmaceutical manufacturing. 
 */

// Accessing Disperser Class:
Disperser disperser = pharma.disperser();

// Accessing Methods:
String modelSerialNumber = disperser.getModelSerialNumber();
double capacity = disperser.getCapacity();
double speedControlRange = disperser.getSpeedControlRange();
double powerConsumption = disperser.getPowerConsumption();
String viscosityRange = disperser.getViscosityRange();
String impellerType = disperser.getImpellerType();
String operationalStatus = disperser.getOperationalStatus();
String locationName = disperser.getLocationName();
String locationType = disperser.getLocationType();
Date lastCalibrationDate = disperser.getLastCalibrationDate();
int calibrationFrequency = disperser.getCalibrationFrequency();
Date lastMaintenanceDate = disperser.getLastMaintenanceDate();
int maintenanceFrequency = disperser.getMaintenanceFrequency();


