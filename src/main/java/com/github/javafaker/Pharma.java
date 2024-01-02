package com.github.javafaker;

import java.util.concurrent.TimeUnit;

import com.github.javafaker.pharma.*;

public class Pharma {

	private final Faker faker;

//	public static void main(String[] args) {
//		Faker faker = new Faker();
//		List<String> fetchedList = (List<String>) faker.fakeValuesService().fetchObject("pharma.equipment.name");
//		System.out.println(fetchedList.get(0));
//	}

	protected Pharma(Faker faker) {
		this.faker = faker;
	}

	public AirSampler airSampler() {
		AirSampler airSampler = new AirSampler();
		airSampler.setSamplerType(faker.fakeValuesService().resolve("pharma.AirSampler.SamplerType", this, faker));
		airSampler.setModelNumber(faker.fakeValuesService().resolve("pharma.AirSampler.ModelNumber", this, faker));
		airSampler.setSerialNumber(faker.fakeValuesService().resolve("pharma.AirSampler.SerialNumber", this, faker));
		airSampler.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		airSampler.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		airSampler.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		airSampler.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		airSampler.setLocationName(faker.fakeValuesService().resolve("pharma.AirSampler.LocationName", this, faker));
		airSampler.setLocationType(faker.fakeValuesService().resolve("pharma.AirSampler.LocationType", this, faker));
		airSampler.setStatus(faker.fakeValuesService().resolve("pharma.AirSampler.Status", this, faker));
		return airSampler;
	}

	public Area area() {
		Area area = new Area();
		area.setName(faker.fakeValuesService().resolve("pharma.Area.Name", this, faker));
		area.setFacilityName(faker.fakeValuesService().resolve("pharma.Area.FacilityName", this, faker));
		area.setClassification(faker.fakeValuesService().resolve("pharma.Area.Classification", this, faker));
		area.setPurpose(faker.fakeValuesService().resolve("pharma.Area.Purpose", this, faker));
		area.setAccessRestrictions(faker.fakeValuesService().resolve("pharma.Area.AccessRestrictions", this, faker));
		return area;
	}

	public BioReactor bioReactor() {
		BioReactor bioReactor = new BioReactor();
		bioReactor
				.setBioreactorName(faker.fakeValuesService().resolve("pharma.BioReactor.BioreactorName", this, faker));
		bioReactor
				.setBioreactorType(faker.fakeValuesService().resolve("pharma.BioReactor.BioreactorType", this, faker));
		bioReactor.setVolumeCapacity(faker.number().randomDouble(2, 1, 1000));
		bioReactor.setManufacturer(faker.fakeValuesService().resolve("pharma.BioReactor.Manufacturer", this, faker));
		bioReactor.setModelNumber(faker.fakeValuesService().resolve("pharma.BioReactor.ModelNumber", this, faker));
		bioReactor.setLocationName(faker.fakeValuesService().resolve("pharma.BioReactor.LocationName", this, faker));
		bioReactor.setLocationType(faker.fakeValuesService().resolve("pharma.BioReactor.LocationType", this, faker));
		bioReactor.setStatus(faker.fakeValuesService().resolve("pharma.BioReactor.Status", this, faker));
		bioReactor.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		bioReactor.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		bioReactor.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		bioReactor.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		bioReactor.setCellLineName(faker.fakeValuesService().resolve("pharma.BioReactor.CellLineName", this, faker));
		bioReactor
				.setSourceOrganism(faker.fakeValuesService().resolve("pharma.BioReactor.SourceOrganism", this, faker));
		bioReactor.setOperationalParameters(
				faker.fakeValuesService().resolve("pharma.BioReactor.OperationalParameters", this, faker));
		return bioReactor;
	}

	public BufferSolution bufferSolution() {
		BufferSolution bufferSolution = new BufferSolution();
		bufferSolution
				.setBufferName(faker.fakeValuesService().resolve("pharma.BufferSolution.BufferName", this, faker));
		bufferSolution.setpHValue(faker.number().randomDouble(2, 0, 14));
		bufferSolution
				.setComposition(faker.fakeValuesService().resolve("pharma.BufferSolution.Composition", this, faker));
		bufferSolution
				.setManufacturer(faker.fakeValuesService().resolve("pharma.BufferSolution.Manufacturer", this, faker));
		bufferSolution.setExpiryDate(faker.date().future(365, TimeUnit.DAYS));
		return bufferSolution;
	}

	public ChemicalsAndReagent chemicalsAndReagent() {
		ChemicalsAndReagent chemicalsAndReagent = new ChemicalsAndReagent();
		chemicalsAndReagent.setName(faker.fakeValuesService().resolve("pharma.ChemicalsAndReagent.Name", this, faker));
		chemicalsAndReagent.setPurityGrade(
				faker.fakeValuesService().resolve("pharma.ChemicalsAndReagent.PurityGrade", this, faker));
		chemicalsAndReagent.setManufacturer(
				faker.fakeValuesService().resolve("pharma.ChemicalsAndReagent.Manufacturer", this, faker));
		chemicalsAndReagent.setExpirationDate(faker.date().future(365, TimeUnit.DAYS));
		chemicalsAndReagent.setStorageCondition(
				faker.fakeValuesService().resolve("pharma.ChemicalsAndReagent.StorageCondition", this, faker));
		return chemicalsAndReagent;
	}

	public ChromatographySystem chromatographySystem() {
		ChromatographySystem chromatographySystem = new ChromatographySystem();
		chromatographySystem.setSystemName(
				faker.fakeValuesService().resolve("pharma.ChromatographySystem.SystemName", this, faker));
		chromatographySystem.setSystemType(
				faker.fakeValuesService().resolve("pharma.ChromatographySystem.SystemType", this, faker));
		chromatographySystem.setManufacturer(
				faker.fakeValuesService().resolve("pharma.ChromatographySystem.Manufacturer", this, faker));
		chromatographySystem.setModelNumber(
				faker.fakeValuesService().resolve("pharma.ChromatographySystem.ModelNumber", this, faker));
		chromatographySystem.setColumnType(
				faker.fakeValuesService().resolve("pharma.ChromatographySystem.ColumnType", this, faker));
		chromatographySystem
				.setResinType(faker.fakeValuesService().resolve("pharma.ChromatographySystem.ResinType", this, faker));
		chromatographySystem.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		chromatographySystem.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		chromatographySystem.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		chromatographySystem.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		chromatographySystem.setLocationName(
				faker.fakeValuesService().resolve("pharma.ChromatographySystem.LocationName", this, faker));
		chromatographySystem.setLocationType(
				faker.fakeValuesService().resolve("pharma.ChromatographySystem.LocationType", this, faker));
		return chromatographySystem;
	}

	public CleaningAgent cleaningAgent() {
		CleaningAgent cleaningAgent = new CleaningAgent();
		cleaningAgent.setAgentName(faker.fakeValuesService().resolve("pharma.CleaningAgent.AgentName", this, faker));
		cleaningAgent.setType(faker.fakeValuesService().resolve("pharma.CleaningAgent.Type", this, faker));
		cleaningAgent
				.setManufacturer(faker.fakeValuesService().resolve("pharma.CleaningAgent.Manufacturer", this, faker));
		return cleaningAgent;
	}

	public ContaminantsEquipment contaminantsEquipment() {
		ContaminantsEquipment contaminantsEquipment = new ContaminantsEquipment();
		contaminantsEquipment.setEquipmentType(
				faker.fakeValuesService().resolve("pharma.ContaminantsEquipment.EquipmentType", this, faker));
		contaminantsEquipment
				.setModel(faker.fakeValuesService().resolve("pharma.ContaminantsEquipment.Model", this, faker));
		contaminantsEquipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.ContaminantsEquipment.Manufacturer", this, faker));
		contaminantsEquipment.setSerialNumber(
				faker.fakeValuesService().resolve("pharma.ContaminantsEquipment.SerialNumber", this, faker));
		contaminantsEquipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		contaminantsEquipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		contaminantsEquipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		contaminantsEquipment.setLocationName(
				faker.fakeValuesService().resolve("pharma.ContaminantsEquipment.LocationName", this, faker));
		contaminantsEquipment.setLocationType(
				faker.fakeValuesService().resolve("pharma.ContaminantsEquipment.LocationType", this, faker));
		contaminantsEquipment
				.setStatus(faker.fakeValuesService().resolve("pharma.ContaminantsEquipment.Status", this, faker));
		return contaminantsEquipment;
	}

	public Equipment equipment() {
		Equipment equipment = new Equipment();
		equipment.setEquipmentType(faker.fakeValuesService().resolve("pharma.Equipment.EquipmentType", this, faker));
		equipment.setModelNumber(faker.fakeValuesService().resolve("pharma.Equipment.ModelNumber", this, faker));
		equipment.setSerialNumber(faker.fakeValuesService().resolve("pharma.Equipment.SerialNumber", this, faker));
		equipment.setManufacturer(faker.fakeValuesService().resolve("pharma.Equipment.Manufacturer", this, faker));
		equipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		equipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		equipment.setLocationName(faker.fakeValuesService().resolve("pharma.Equipment.LocationName", this, faker));
		equipment.setLocationType(faker.fakeValuesService().resolve("pharma.Equipment.LocationType", this, faker));
		equipment.setStatus(faker.fakeValuesService().resolve("pharma.Equipment.Status", this, faker));
		return equipment;
	}

	public EquipmentSensor equipmentSensor() {
		EquipmentSensor equipmentSensor = new EquipmentSensor();
		equipmentSensor
				.setSensorType(faker.fakeValuesService().resolve("pharma.EquipmentSensor.SensorType", this, faker));
		equipmentSensor
				.setModelNumber(faker.fakeValuesService().resolve("pharma.EquipmentSensor.ModelNumber", this, faker));
		equipmentSensor
				.setManufacturer(faker.fakeValuesService().resolve("pharma.EquipmentSensor.Manufacturer", this, faker));
		equipmentSensor.setStatus(faker.fakeValuesService().resolve("pharma.EquipmentSensor.Status", this, faker));
		equipmentSensor.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		equipmentSensor.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		equipmentSensor.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		equipmentSensor.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		equipmentSensor.setOperationalRange(
				faker.fakeValuesService().resolve("pharma.EquipmentSensor.OperationalRange", this, faker));
		equipmentSensor
				.setLocationName(faker.fakeValuesService().resolve("pharma.EquipmentSensor.LocationName", this, faker));
		equipmentSensor
				.setLocationType(faker.fakeValuesService().resolve("pharma.EquipmentSensor.LocationType", this, faker));
		equipmentSensor.setAccuracy(faker.fakeValuesService().resolve("pharma.EquipmentSensor.Accuracy", this, faker));
		return equipmentSensor;
	}

	public Excipient excipient() {
		Excipient excipient = new Excipient();
		excipient.setName(faker.fakeValuesService().resolve("pharma.Excipient.Name", this, faker));
		excipient.setType(faker.fakeValuesService().resolve("pharma.Excipient.Type", this, faker));
		excipient.setManufacturer(faker.fakeValuesService().resolve("pharma.Excipient.Manufacturer", this, faker));
		excipient.setStandardConcentration(
				faker.fakeValuesService().resolve("pharma.Excipient.StandardConcentration", this, faker));
		excipient.setExpiryDate(faker.date().future(365, TimeUnit.DAYS));
		excipient.setStorageCondition(
				faker.fakeValuesService().resolve("pharma.Excipient.StorageCondition", this, faker));
		return excipient;
	}

	public FeedStock feedStock() {
		FeedStock feedStock = new FeedStock();
		feedStock.setFeedStockType(faker.fakeValuesService().resolve("pharma.FeedStock.FeedStockType", this, faker));
		feedStock.setComposition(faker.fakeValuesService().resolve("pharma.FeedStock.Composition", this, faker));
		feedStock.setOptimalUseRate(faker.number().randomDouble(2, 0, 100));
		feedStock.setManufacturer(faker.fakeValuesService().resolve("pharma.FeedStock.Manufacturer", this, faker));
		feedStock.setExpiryDate(faker.date().future(365, TimeUnit.DAYS));
		feedStock.setStorageConditions(
				faker.fakeValuesService().resolve("pharma.FeedStock.StorageConditions", this, faker));
		return feedStock;
	}

	public FillFinishEquipment fillFinishEquipment() {
		FillFinishEquipment fillFinishEquipment = new FillFinishEquipment();
		fillFinishEquipment.setEquipmentName(
				faker.fakeValuesService().resolve("pharma.FillFinishEquipment.EquipmentName", this, faker));
		fillFinishEquipment.setEquipmentType(
				faker.fakeValuesService().resolve("pharma.FillFinishEquipment.EquipmentType", this, faker));
		fillFinishEquipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.FillFinishEquipment.Manufacturer", this, faker));
		fillFinishEquipment.setModelNumber(
				faker.fakeValuesService().resolve("pharma.FillFinishEquipment.ModelNumber", this, faker));
		fillFinishEquipment
				.setStatus(faker.fakeValuesService().resolve("pharma.FillFinishEquipment.Status", this, faker));
		fillFinishEquipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		fillFinishEquipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		fillFinishEquipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		fillFinishEquipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return fillFinishEquipment;
	}

	public FiltersAndMembrane filtersAndMembrane() {
		FiltersAndMembrane filtersAndMembrane = new FiltersAndMembrane();
		filtersAndMembrane
				.setFilterType(faker.fakeValuesService().resolve("pharma.FiltersAndMembrane.FilterType", this, faker));
		filtersAndMembrane.setPoreSize(faker.number().randomDouble(2, 0, 10));
		filtersAndMembrane.setSurfaceArea(faker.number().randomDouble(2, 0, 100));
		filtersAndMembrane.setManufacturer(
				faker.fakeValuesService().resolve("pharma.FiltersAndMembrane.Manufacturer", this, faker));
		filtersAndMembrane.setModelNumber(
				faker.fakeValuesService().resolve("pharma.FiltersAndMembrane.ModelNumber", this, faker));
		filtersAndMembrane.setUsageLimit(faker.number().numberBetween(1, 100));
		filtersAndMembrane
				.setStatus(faker.fakeValuesService().resolve("pharma.FiltersAndMembrane.Status", this, faker));
		filtersAndMembrane.setAssociatedProcessName(
				faker.fakeValuesService().resolve("pharma.FiltersAndMembrane.AssociatedProcessName", this, faker));
		return filtersAndMembrane;
	}

	public FiltrationSystem filtrationSystem() {
		FiltrationSystem filtrationSystem = new FiltrationSystem();
		filtrationSystem.setType(faker.fakeValuesService().resolve("pharma.FiltrationSystem.Type", this, faker));
		filtrationSystem.setManufacturer(
				faker.fakeValuesService().resolve("pharma.FiltrationSystem.Manufacturer", this, faker));
		filtrationSystem
				.setModelNumber(faker.fakeValuesService().resolve("pharma.FiltrationSystem.ModelNumber", this, faker));
		filtrationSystem.setMembraneSpecs(
				faker.fakeValuesService().resolve("pharma.FiltrationSystem.MembraneSpecs", this, faker));
		filtrationSystem.setInstallationDate(faker.date().past(365, TimeUnit.DAYS));
		filtrationSystem.setStatus(faker.fakeValuesService().resolve("pharma.FiltrationSystem.Status", this, faker));
		filtrationSystem.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		filtrationSystem.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		filtrationSystem.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		filtrationSystem.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return filtrationSystem;
	}

	public FormulationEquipment formulationEquipment() {
		FormulationEquipment formulationEquipment = new FormulationEquipment();
		formulationEquipment
				.setType(faker.fakeValuesService().resolve("pharma.FormulationEquipment.Type", this, faker));
		formulationEquipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.FormulationEquipment.Manufacturer", this, faker));
		formulationEquipment.setModelNumber(
				faker.fakeValuesService().resolve("pharma.FormulationEquipment.ModelNumber", this, faker));
		formulationEquipment
				.setCapacity(faker.fakeValuesService().resolve("pharma.FormulationEquipment.Capacity", this, faker));
		formulationEquipment
				.setStatus(faker.fakeValuesService().resolve("pharma.FormulationEquipment.Status", this, faker));
		formulationEquipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		formulationEquipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		formulationEquipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		formulationEquipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return formulationEquipment;
	}

	public FormulationMaterial formulationMaterial() {
		FormulationMaterial formulationMaterial = new FormulationMaterial();
		formulationMaterial.setType(faker.fakeValuesService().resolve("pharma.FormulationMaterial.Type", this, faker));
		formulationMaterial.setManufacturer(
				faker.fakeValuesService().resolve("pharma.FormulationMaterial.Manufacturer", this, faker));
		formulationMaterial.setReceivedDate(faker.date().past(365, TimeUnit.DAYS));
		formulationMaterial.setExpiryDate(faker.date().future(365, TimeUnit.DAYS));
		formulationMaterial.setStorageCondition(
				faker.fakeValuesService().resolve("pharma.FormulationMaterial.StorageCondition", this, faker));
		formulationMaterial.setQuantity(faker.number().randomDouble(2, 0, 1000));
		return formulationMaterial;
	}

	public GasSamplingPoint gasSamplingPoint() {
		GasSamplingPoint gasSamplingPoint = new GasSamplingPoint();
		gasSamplingPoint.setGasSystemName(
				faker.fakeValuesService().resolve("pharma.GasSamplingPoint.GasSystemName", this, faker));
		gasSamplingPoint.setGasSystemType(
				faker.fakeValuesService().resolve("pharma.GasSamplingPoint.GasSystemType", this, faker));
		gasSamplingPoint
				.setPointName(faker.fakeValuesService().resolve("pharma.GasSamplingPoint.PointName", this, faker));
		gasSamplingPoint.setLocationDescription(
				faker.fakeValuesService().resolve("pharma.GasSamplingPoint.LocationDescription", this, faker));
		gasSamplingPoint.setSamplingFrequency(faker.number().numberBetween(1, 365));
		gasSamplingPoint.setSamplingMethod(
				faker.fakeValuesService().resolve("pharma.GasSamplingPoint.SamplingMethod", this, faker));
		return gasSamplingPoint;
	}

	public GasSystem gasSystem() {
		GasSystem gasSystem = new GasSystem();
		gasSystem.setSystemName(faker.fakeValuesService().resolve("pharma.GasSystem.SystemName", this, faker));
		gasSystem.setSystemType(faker.fakeValuesService().resolve("pharma.GasSystem.SystemType", this, faker));
		gasSystem.setDescription(faker.fakeValuesService().resolve("pharma.GasSystem.Description", this, faker));
		gasSystem.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		gasSystem.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		gasSystem.setMonitoringPoints(
				faker.fakeValuesService().resolve("pharma.GasSystem.MonitoringPoints", this, faker));
		return gasSystem;
	}

	public GrowthMedia growthMedia() {
		GrowthMedia growthMedia = new GrowthMedia();
		growthMedia.setMediaName(faker.fakeValuesService().resolve("pharma.GrowthMedia.MediaName", this, faker));
		growthMedia.setMediaType(faker.fakeValuesService().resolve("pharma.GrowthMedia.MediaType", this, faker));
		growthMedia.setManufacturer(faker.fakeValuesService().resolve("pharma.GrowthMedia.Manufacturer", this, faker));
		growthMedia.setExpirationDate(faker.date().future(365, TimeUnit.DAYS));
		return growthMedia;
	}

	public HarvestingEquipment harvestingEquipment() {
		HarvestingEquipment harvestingEquipment = new HarvestingEquipment();
		harvestingEquipment.setEquipmentName(
				faker.fakeValuesService().resolve("pharma.HarvestingEquipment.EquipmentName", this, faker));
		harvestingEquipment.setEquipmentType(
				faker.fakeValuesService().resolve("pharma.HarvestingEquipment.EquipmentType", this, faker));
		harvestingEquipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.HarvestingEquipment.Manufacturer", this, faker));
		harvestingEquipment.setModelNumber(
				faker.fakeValuesService().resolve("pharma.HarvestingEquipment.ModelNumber", this, faker));
		harvestingEquipment
				.setStatus(faker.fakeValuesService().resolve("pharma.HarvestingEquipment.Status", this, faker));
		harvestingEquipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		harvestingEquipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		harvestingEquipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		harvestingEquipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		harvestingEquipment.setLocationName(
				faker.fakeValuesService().resolve("pharma.HarvestingEquipment.LocationName", this, faker));
		harvestingEquipment.setLocationType(
				faker.fakeValuesService().resolve("pharma.HarvestingEquipment.LocationType", this, faker));
		harvestingEquipment.setOperationalParameters(
				faker.fakeValuesService().resolve("pharma.HarvestingEquipment.OperationalParameters", this, faker));
		return harvestingEquipment;
	}

	public Incubator incubator() {
		Incubator incubator = new Incubator();
		incubator.setIncubatorType(faker.fakeValuesService().resolve("pharma.Incubator.IncubatorType", this, faker));
		incubator.setManufacturer(faker.fakeValuesService().resolve("pharma.Incubator.Manufacturer", this, faker));
		incubator.setModelNumber(faker.fakeValuesService().resolve("pharma.Incubator.ModelNumber", this, faker));
		incubator.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		incubator.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		incubator.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		incubator.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		incubator.setLocationName(faker.fakeValuesService().resolve("pharma.Incubator.LocationName", this, faker));
		incubator.setLocationType(faker.fakeValuesService().resolve("pharma.Incubator.LocationType", this, faker));
		incubator.setStatus(faker.fakeValuesService().resolve("pharma.Incubator.Status", this, faker));
		return incubator;
	}

	public InspectionEquipment inspectionEquipment() {
		InspectionEquipment inspectionEquipment = new InspectionEquipment();
		inspectionEquipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.InspectionEquipment.Manufacturer", this, faker));
		inspectionEquipment.setModelNumber(
				faker.fakeValuesService().resolve("pharma.InspectionEquipment.ModelNumber", this, faker));
		inspectionEquipment.setInspectionType(
				faker.fakeValuesService().resolve("pharma.InspectionEquipment.InspectionType", this, faker));
		inspectionEquipment
				.setStatus(faker.fakeValuesService().resolve("pharma.InspectionEquipment.Status", this, faker));
		inspectionEquipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		inspectionEquipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		inspectionEquipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		inspectionEquipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return inspectionEquipment;
	}

	public LabelingEquipment labelingEquipment() {
		LabelingEquipment equipment = new LabelingEquipment();
		equipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.LabelingEquipment.Manufacturer", this, faker));
		equipment
				.setModelNumber(faker.fakeValuesService().resolve("pharma.LabelingEquipment.ModelNumber", this, faker));
		equipment.setLabelType(faker.fakeValuesService().resolve("pharma.LabelingEquipment.LabelType", this, faker));
		equipment.setStatus(faker.fakeValuesService().resolve("pharma.LabelingEquipment.Status", this, faker));
		equipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		equipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return equipment;
	}

	public LaboratoryEquipment laboratoryEquipment() {
		LaboratoryEquipment equipment = new LaboratoryEquipment();
		equipment.setType(faker.fakeValuesService().resolve("pharma.LaboratoryEquipment.Type", this, faker));
		equipment.setModelNumber(
				faker.fakeValuesService().resolve("pharma.LaboratoryEquipment.ModelNumber", this, faker));
		equipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.LaboratoryEquipment.Manufacturer", this, faker));
		equipment.setStatus(faker.fakeValuesService().resolve("pharma.LaboratoryEquipment.Status", this, faker));
		equipment.setLocationName(
				faker.fakeValuesService().resolve("pharma.LaboratoryEquipment.LocationName", this, faker));
		equipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		equipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		return equipment;
	}

	public LaboratoryLocation laboratoryLocation() {
		LaboratoryLocation location = new LaboratoryLocation();
		location.setLocationName(
				faker.fakeValuesService().resolve("pharma.LaboratoryLocation.LocationName", this, faker));
		location.setLocationType(
				faker.fakeValuesService().resolve("pharma.LaboratoryLocation.LocationType", this, faker));
		return location;
	}

	public LyophilizationEquipment lyophilizationEquipment() {
		LyophilizationEquipment equipment = new LyophilizationEquipment();
		equipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.LyophilizationEquipment.Manufacturer", this, faker));
		equipment.setModelNumber(
				faker.fakeValuesService().resolve("pharma.LyophilizationEquipment.ModelNumber", this, faker));
		equipment
				.setCapacity(faker.fakeValuesService().resolve("pharma.LyophilizationEquipment.Capacity", this, faker));
		equipment.setShelfArea(
				faker.fakeValuesService().resolve("pharma.LyophilizationEquipment.ShelfArea", this, faker));
		equipment.setCondenserTempRange(
				faker.fakeValuesService().resolve("pharma.LyophilizationEquipment.CondenserTempRange", this, faker));
		equipment.setVacuumRange(
				faker.fakeValuesService().resolve("pharma.LyophilizationEquipment.VacuumRange", this, faker));
		equipment.setStatus(faker.fakeValuesService().resolve("pharma.LyophilizationEquipment.Status", this, faker));
		equipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		equipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return equipment;
	}

	public LyophilizationVial lyophilizationVial() {
		LyophilizationVial vial = new LyophilizationVial();
		vial.setVialType(faker.fakeValuesService().resolve("pharma.LyophilizationVial.VialType", this, faker));
		vial.setVolumeCapacity(faker.number().randomDouble(2, 0, 100)); // Adjust range and precision as needed
		vial.setManufacturer(faker.fakeValuesService().resolve("pharma.LyophilizationVial.Manufacturer", this, faker));
		vial.setSterilizationDate(faker.date().future(30, TimeUnit.DAYS)); // Sterilization date within the next 30 days
		vial.setExpiryDate(faker.date().future(365, TimeUnit.DAYS)); // Expiry date within the next year
		return vial;
	}

	public Material material() {
		Material material = new Material();
		material.setMaterialCode(faker.fakeValuesService().resolve("pharma.Material.MaterialCode", this, faker));
		material.setName(faker.fakeValuesService().resolve("pharma.Material.Name", this, faker));
		material.setClassification(faker.fakeValuesService().resolve("pharma.Material.Classification", this, faker));
		material.setQualityAttributes(
				faker.fakeValuesService().resolve("pharma.Material.QualityAttributes", this, faker));
		material.setSupplier(faker.fakeValuesService().resolve("pharma.Material.Supplier", this, faker));
		material.setInventoryLevel(faker.number().numberBetween(1, 1000)); // Adjust the range as needed
		material.setStorageCondition(
				faker.fakeValuesService().resolve("pharma.Material.StorageCondition", this, faker));
		return material;
	}

	public MonitoringLocation monitoringLocation() {
		MonitoringLocation location = new MonitoringLocation();
		location.setLocationName(
				faker.fakeValuesService().resolve("pharma.MonitoringLocation.LocationName", this, faker));
		location.setLocationType(
				faker.fakeValuesService().resolve("pharma.MonitoringLocation.LocationType", this, faker));
		location.setClassification(
				faker.fakeValuesService().resolve("pharma.MonitoringLocation.Classification", this, faker));
		location.setDescription(
				faker.fakeValuesService().resolve("pharma.MonitoringLocation.Description", this, faker));
		return location;
	}

	public PackagingEquipment packagingEquipment() {
		PackagingEquipment equipment = new PackagingEquipment();
		equipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.PackagingEquipment.Manufacturer", this, faker));
		equipment.setModelNumber(
				faker.fakeValuesService().resolve("pharma.PackagingEquipment.ModelNumber", this, faker));
		equipment.setPackagingType(
				faker.fakeValuesService().resolve("pharma.PackagingEquipment.PackagingType", this, faker));
		equipment.setStatus(faker.fakeValuesService().resolve("pharma.PackagingEquipment.Status", this, faker));
		equipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		equipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return equipment;
	}

	public ParticulateMonitoringEquipment particulateMonitoringEquipment() {
		ParticulateMonitoringEquipment equipment = new ParticulateMonitoringEquipment();
		equipment.setEquipmentType(
				faker.fakeValuesService().resolve("pharma.ParticulateMonitoringEquipment.EquipmentType", this, faker));
		equipment.setModel(
				faker.fakeValuesService().resolve("pharma.ParticulateMonitoringEquipment.Model", this, faker));
		equipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.ParticulateMonitoringEquipment.Manufacturer", this, faker));
		equipment.setSerialNumber(
				faker.fakeValuesService().resolve("pharma.ParticulateMonitoringEquipment.SerialNumber", this, faker));
		equipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		equipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		equipment.setLocationName(
				faker.fakeValuesService().resolve("pharma.ParticulateMonitoringEquipment.LocationName", this, faker));
		equipment.setLocationType(
				faker.fakeValuesService().resolve("pharma.ParticulateMonitoringEquipment.LocationType", this, faker));
		equipment.setStatus(
				faker.fakeValuesService().resolve("pharma.ParticulateMonitoringEquipment.Status", this, faker));
		return equipment;
	}

	public PreparedSolution preparedSolution() {
		PreparedSolution solution = new PreparedSolution();
		solution.setChemicalName(
				faker.fakeValuesService().resolve("pharma.PreparedSolution.ChemicalName", this, faker));
		solution.setConcentration(
				faker.fakeValuesService().resolve("pharma.PreparedSolution.Concentration", this, faker));
		solution.setVolumePrepared(faker.number().randomDouble(2, 0, 1000)); // Adjust the range and precision as needed
		solution.setPreparedBy(faker.fakeValuesService().resolve("pharma.PreparedSolution.PreparedBy", this, faker));
		solution.setPreparationDate(faker.date().past(30, TimeUnit.DAYS)); // Preparation date within the last 30 days
		solution.setExpiryDate(faker.date().future(365, TimeUnit.DAYS)); // Expiry date within the next year
		solution.setSolutionParameters(
				faker.fakeValuesService().resolve("pharma.PreparedSolution.SolutionParameters", this, faker));
		return solution;
	}

	public PrimaryPackagingComponent primaryPackagingComponent() {
		PrimaryPackagingComponent component = new PrimaryPackagingComponent();
		component.setComponentType(
				faker.fakeValuesService().resolve("pharma.PrimaryPackagingComponent.ComponentType", this, faker));
		component.setManufacturer(
				faker.fakeValuesService().resolve("pharma.PrimaryPackagingComponent.Manufacturer", this, faker));
		component.setMaterialSpecs(
				faker.fakeValuesService().resolve("pharma.PrimaryPackagingComponent.MaterialSpecs", this, faker));
		component.setStorageConditions(
				faker.fakeValuesService().resolve("pharma.PrimaryPackagingComponent.StorageConditions", this, faker));
		return component;
	}

	public Product product() {
		Product product = new Product();
		product.setDescription(faker.fakeValuesService().resolve("pharma.Product.Description", this, faker));
		product.setProductCode(faker.fakeValuesService().resolve("pharma.Product.ProductCode", this, faker));
		product.setFormula(faker.fakeValuesService().resolve("pharma.Product.Formula", this, faker));
		product.setDosageForm(faker.fakeValuesService().resolve("pharma.Product.DosageForm", this, faker));
		product.setStrength(faker.fakeValuesService().resolve("pharma.Product.Strength", this, faker));
		return product;
	}

	public ProtectiveEquipment protectiveEquipment() {
		ProtectiveEquipment equipment = new ProtectiveEquipment();
		equipment.setEquipmentName(
				faker.fakeValuesService().resolve("pharma.ProtectiveEquipment.EquipmentName", this, faker));
		equipment.setType(faker.fakeValuesService().resolve("pharma.ProtectiveEquipment.Type", this, faker));
		equipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.ProtectiveEquipment.Manufacturer", this, faker));
		equipment.setExpiryDate(faker.date().future(365, TimeUnit.DAYS)); // Expiry date within the next year
		return equipment;
	}

	public PurificationConsumable purificationConsumable() {
		PurificationConsumable consumable = new PurificationConsumable();
		consumable.setConsumableName(
				faker.fakeValuesService().resolve("pharma.PurificationConsumable.ConsumableName", this, faker));
		consumable.setType(faker.fakeValuesService().resolve("pharma.PurificationConsumable.Type", this, faker));
		consumable.setManufacturer(
				faker.fakeValuesService().resolve("pharma.PurificationConsumable.Manufacturer", this, faker));
		consumable.setExpiryDate(faker.date().future(365, TimeUnit.DAYS)); // Expiry date within the next year
		consumable.setAssociatedProcessName(
				faker.fakeValuesService().resolve("pharma.PurificationConsumable.AssociatedProcessName", this, faker));
		return consumable;
	}

	public PurificationEquipment purificationEquipment() {
		PurificationEquipment equipment = new PurificationEquipment();
		equipment.setType(faker.fakeValuesService().resolve("pharma.PurificationEquipment.Type", this, faker));
		equipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.PurificationEquipment.Manufacturer", this, faker));
		equipment.setModelNumber(
				faker.fakeValuesService().resolve("pharma.PurificationEquipment.ModelNumber", this, faker));
		equipment.setCapacity(faker.fakeValuesService().resolve("pharma.PurificationEquipment.Capacity", this, faker));
		equipment.setInstallationDate(faker.date().past(365, TimeUnit.DAYS)); // Installation date within the last year
		equipment.setStatus(faker.fakeValuesService().resolve("pharma.PurificationEquipment.Status", this, faker));
		equipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		equipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return equipment;
	}

	public RawMaterial rawMaterial() {
		RawMaterial material = new RawMaterial();
		material.setMaterialName(faker.fakeValuesService().resolve("pharma.RawMaterial.MaterialName", this, faker));
		material.setManufacturer(faker.fakeValuesService().resolve("pharma.RawMaterial.Manufacturer", this, faker));
		material.setReceivedDate(faker.date().past(365, TimeUnit.DAYS)); // Received date within the last year
		material.setExpiryDate(faker.date().future(365, TimeUnit.DAYS)); // Expiry date within the next year
		material.setQcStatus(faker.fakeValuesService().resolve("pharma.RawMaterial.QcStatus", this, faker));
		return material;
	}

	public Room room() {
		Room room = new Room();
		room.setAreaName(faker.fakeValuesService().resolve("pharma.Room.AreaName", this, faker));
		room.setName(faker.fakeValuesService().resolve("pharma.Room.Name", this, faker));
		room.setPurpose(faker.fakeValuesService().resolve("pharma.Room.Purpose", this, faker));
		room.setLastSanitationDate(faker.date().past(365, TimeUnit.DAYS)); // Last sanitation date within the last year
		room.setSanitationFrequency(faker.number().numberBetween(1, 30)); // Sanitation frequency between 1 to 30 days
		return room;
	}

	public SamplingKit samplingKit() {
		SamplingKit kit = new SamplingKit();
		kit.setKitType(faker.fakeValuesService().resolve("pharma.SamplingKit.KitType", this, faker));
		kit.setManufacturer(faker.fakeValuesService().resolve("pharma.SamplingKit.Manufacturer", this, faker));
		kit.setExpiryDate(faker.date().future(365, TimeUnit.DAYS)); // Expiry date within the next year
		return kit;
	}

	public SamplingLocation samplingLocation() {
		SamplingLocation location = new SamplingLocation();
		location.setLocationName(
				faker.fakeValuesService().resolve("pharma.SamplingLocation.LocationName", this, faker));
		location.setLocationType(
				faker.fakeValuesService().resolve("pharma.SamplingLocation.LocationType", this, faker));
		location.setLocationClassification(
				faker.fakeValuesService().resolve("pharma.SamplingLocation.LocationClassification", this, faker));
		location.setDescription(faker.fakeValuesService().resolve("pharma.SamplingLocation.Description", this, faker));
		return location;
	}

	public SamplingSurface samplingSurface() {
		SamplingSurface surface = new SamplingSurface();
		surface.setSurfaceType(faker.fakeValuesService().resolve("pharma.SamplingSurface.SurfaceType", this, faker));
		surface.setLocationName(faker.fakeValuesService().resolve("pharma.SamplingSurface.LocationName", this, faker));
		surface.setLocationType(faker.fakeValuesService().resolve("pharma.SamplingSurface.LocationType", this, faker));
		surface.setDescription(faker.fakeValuesService().resolve("pharma.SamplingSurface.Description", this, faker));
		return surface;
	}

	public SanitationEquipment sanitationEquipment() {
		SanitationEquipment equipment = new SanitationEquipment();
		equipment.setEquipmentName(
				faker.fakeValuesService().resolve("pharma.SanitationEquipment.EquipmentName", this, faker));
		equipment.setType(faker.fakeValuesService().resolve("pharma.SanitationEquipment.Type", this, faker));
		equipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.SanitationEquipment.Manufacturer", this, faker));
		return equipment;
	}

	public Sensor sensor() {
		Sensor sensor = new Sensor();
		sensor.setSensorType(faker.fakeValuesService().resolve("pharma.Sensor.SensorType", this, faker));
		sensor.setModelNumber(faker.fakeValuesService().resolve("pharma.Sensor.ModelNumber", this, faker));
		sensor.setSerialNumber(faker.fakeValuesService().resolve("pharma.Sensor.SerialNumber", this, faker));
		sensor.setLocationName(faker.fakeValuesService().resolve("pharma.Sensor.LocationName", this, faker));
		sensor.setLocationType(faker.fakeValuesService().resolve("pharma.Sensor.LocationType", this, faker));
		sensor.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		sensor.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		sensor.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		sensor.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		sensor.setStatus(faker.fakeValuesService().resolve("pharma.Sensor.Status", this, faker));
		return sensor;
	}

	public StorageContainer storageContainer() {
		StorageContainer container = new StorageContainer();
		container.setContainerType(
				faker.fakeValuesService().resolve("pharma.StorageContainer.ContainerType", this, faker));
		container.setVolumeWithUnit(
				faker.fakeValuesService().resolve("pharma.StorageContainer.VolumeWithUnit", this, faker));
		return container;
	}

	public SurfaceSamplingDevice surfaceSamplingDevice() {
		SurfaceSamplingDevice device = new SurfaceSamplingDevice();
		device.setDeviceType(faker.fakeValuesService().resolve("pharma.SurfaceSamplingDevice.DeviceType", this, faker));
		device.setManufacturer(
				faker.fakeValuesService().resolve("pharma.SurfaceSamplingDevice.Manufacturer", this, faker));
		device.setExpirationDate(faker.date().future(365, TimeUnit.DAYS)); // Expiration date within the next year
		return device;
	}

	public ViralInactivationEquipment viralInactivationEquipment() {
		ViralInactivationEquipment equipment = new ViralInactivationEquipment();
		equipment.setEquipmentName(
				faker.fakeValuesService().resolve("pharma.ViralInactivationEquipment.EquipmentName", this, faker));
		equipment.setInactivationMethod(
				faker.fakeValuesService().resolve("pharma.ViralInactivationEquipment.InactivationMethod", this, faker));
		equipment.setManufacturer(
				faker.fakeValuesService().resolve("pharma.ViralInactivationEquipment.Manufacturer", this, faker));
		equipment.setModelNumber(
				faker.fakeValuesService().resolve("pharma.ViralInactivationEquipment.ModelNumber", this, faker));
		equipment.setLocationName(
				faker.fakeValuesService().resolve("pharma.ViralInactivationEquipment.LocationName", this, faker));
		equipment.setLocationType(
				faker.fakeValuesService().resolve("pharma.ViralInactivationEquipment.LocationType", this, faker));
		equipment.setStatus(faker.fakeValuesService().resolve("pharma.ViralInactivationEquipment.Status", this, faker));
		equipment.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		equipment.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		equipment.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		equipment.setOperationalParameters(faker.fakeValuesService()
				.resolve("pharma.ViralInactivationEquipment.OperationalParameters", this, faker));
		return equipment;
	}

	public WaterSystem waterSystem() {
		WaterSystem system = new WaterSystem();
		system.setSystemName(faker.fakeValuesService().resolve("pharma.WaterSystem.SystemName", this, faker));
		system.setSystemType(faker.fakeValuesService().resolve("pharma.WaterSystem.SystemType", this, faker));
		system.setDescription(faker.fakeValuesService().resolve("pharma.WaterSystem.Description", this, faker));
		system.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		system.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		system.setMonitoringPoints(
				faker.fakeValuesService().resolve("pharma.WaterSystem.MonitoringPoints", this, faker));
		return system;
	}

	public User user() {
		User user = new User();
		user.setFirstName(faker.name().firstName());
		user.setLastName(faker.name().lastName());
		user.setEmail(faker.internet().emailAddress());
		user.setUserhandle(faker.name().username());
		user.setRole(faker.fakeValuesService().resolve("pharma.User.Role", this, faker));
		return user;
	}

	public Blender blender() {
		Blender blender = new Blender();
		blender.setBlendingVolume(faker.number().numberBetween(100, 1000));
		blender.setBlendingSpeedRange(faker.number().numberBetween(100, 1000) + " RPM - "
				+ faker.number().numberBetween(1000, 5000) + " RPM");
		return blender;
	}

	public CoatingMachine coatingMachine() {
		CoatingMachine coatingMachine = new CoatingMachine();
		Faker faker = new Faker();
		coatingMachine.setCoatingTechnology(
				faker.fakeValuesService().resolve("pharma.CoatingMachine.CoatingTechnology", this, faker));
		;
		coatingMachine.setMaxBatchSize(faker.number().numberBetween(1, 1000));
		;
		return coatingMachine;
	}

	public Dryer dryer() {
		Dryer dryer = new Dryer();
		Faker faker = new Faker();
		dryer.setDryingTechnology(faker.fakeValuesService().resolve("pharma.Dryer.DryingTechnology", this, faker));
		dryer.setMaxDryingTemperature(faker.number().numberBetween(25, 200));
		return dryer;
	}

	public DustExtractor dustExtractor() {
		DustExtractor dustExtractor = new DustExtractor();
		Faker faker = new Faker();
		dustExtractor.setExtractionCapacity(faker.number().numberBetween(100, 1000));
		dustExtractor.setFilterType(faker.fakeValuesService().resolve("pharma.DustExtractor.FilterType", this, faker));
		return dustExtractor;
	}

	public Granulator granulator() {
		Granulator granulator = new Granulator();
		Faker faker = new Faker();
		granulator.setGranulationCapacity(faker.number().numberBetween(100, 1000));
		granulator.setMaxOperatingSpeed(faker.number().numberBetween(1000, 5000));
		return granulator;
	}

	public IBCBin ibcBin() {
		IBCBin ibcBin = new IBCBin();
		Faker faker = new Faker();
		ibcBin.setVolumeCapacity(faker.number().numberBetween(100, 1000));
		return ibcBin;
	}

	public InspectionMachine inspectionMachine() {
		InspectionMachine inspectionMachine = new InspectionMachine();
		Faker faker = new Faker();
		inspectionMachine.setInspectionSpeed(faker.number().numberBetween(100, 1000));
		inspectionMachine.setTechnologyUsed(
				faker.fakeValuesService().resolve("pharma.InspectionMachine.TechnologyUsed", this, faker));
		return inspectionMachine;
	}

	public MillingMachine millingMachine() {
		MillingMachine millingMachine = new MillingMachine();
		Faker faker = new Faker();
		millingMachine.setMillingCapacity(faker.number().numberBetween(100, 1000));
		return millingMachine;
	}

	public Mixer mixer() {
		Mixer mixer = new Mixer();
		Faker faker = new Faker();
		mixer.setMixingCapacity(faker.number().numberBetween(100, 1000));
		mixer.setMixerType(faker.fakeValuesService().resolve("pharma.Mixer.MixerType", this, faker));
		return mixer;
	}

	public Recipe recipe() {
		Recipe recipe = new Recipe();
		Faker faker = new Faker();
		recipe.setProductName(faker.food().ingredient());
		recipe.setRecipeName(faker.food().dish());
		recipe.setFormula(faker.lorem().sentence());
		recipe.setCreatedAt(faker.date().past(365, TimeUnit.DAYS));
		recipe.setUpdatedAt(faker.date().past(365, TimeUnit.DAYS));
		return recipe;
	}

	public Sifter sifter() {
		Sifter sifter = new Sifter();
		Faker faker = new Faker();
		sifter.setMeshSizeRange(faker.fakeValuesService().resolve("pharma.Sifter.MeshSizeRange", this, faker));
		sifter.setSiftingSpeed(faker.number().numberBetween(100, 1000));
		return sifter;
	}

	public Stirrer stirrer() {
		Stirrer stirrer = new Stirrer();
		Faker faker = new Faker();
		stirrer.setStirringSpeedRange(
				faker.fakeValuesService().resolve("pharma.Stirrer.StirringSpeedRange", this, faker));
		return stirrer;
	}

	public TabletDeduster tabletDeduster() {
		TabletDeduster tabletDeduster = new TabletDeduster();
		Faker faker = new Faker();
		tabletDeduster.setDedustingEfficiency(faker.number().numberBetween(90, 100));
		tabletDeduster.setDedustingSpeed(faker.number().numberBetween(1000, 5000));
		return tabletDeduster;
	}

	public TabletPress tabletPress() {
		TabletPress tabletPress = new TabletPress();
		Faker faker = new Faker();
		tabletPress.setMaxTabletOutput(faker.number().numberBetween(1000, 10000));
		tabletPress.setCompressionForceRange(
				faker.fakeValuesService().resolve("pharma.TabletPress.CompressionForceRange", this, faker));
		return tabletPress;
	}

	public TabletTooling tabletTooling() {
		TabletTooling tabletTooling = new TabletTooling();
		Faker faker = new Faker();
		tabletTooling
				.setToolingSize(faker.fakeValuesService().resolve("pharma.TabletTooling.ToolingSize", this, faker));
		tabletTooling
				.setToolingShape(faker.fakeValuesService().resolve("pharma.TabletTooling.ToolingShape", this, faker));
		return tabletTooling;
	}

	public Batch batch() {
		Batch batch = new Batch();
		Faker faker = new Faker();
		batch.setBatchId(faker.idNumber().valid());
		batch.setProductName(faker.food().ingredient());
		batch.setRecipeName(faker.food().dish());
		batch.setStartDate(faker.date().past(365, TimeUnit.DAYS));
		batch.setEndDate(faker.date().past(365, TimeUnit.DAYS));
		batch.setStatus(faker.random().nextBoolean() ? "In Progress" : "Completed");
		batch.setPlannedQuantityProduced(faker.number().numberBetween(100, 1000));
		batch.setCreatedAt(faker.date().past(365, TimeUnit.DAYS));
		batch.setUpdatedAt(faker.date().past(365, TimeUnit.DAYS));
		batch.setActualQuantityProduced(faker.number().numberBetween(100, 1000));
		return batch;
	}

	public Disperser disperser() {
		Disperser disperser = new Disperser();
		disperser.setModelSerialNumber(faker.idNumber().valid());
		disperser.setCapacity(faker.number().randomDouble(2, 1, 1000));
		disperser.setSpeedControlRange(faker.number().randomDouble(2, 1, 1000));
		disperser.setPowerConsumption(faker.number().randomDouble(2, 1, 1000));
		disperser.setViscosityRange(faker.fakeValuesService().resolve("pharma.Disperser.ViscosityRange", this, faker));
		disperser.setImpellerType(faker.fakeValuesService().resolve("pharma.Disperser.ImpellerType", this, faker));
		disperser.setOperationalStatus(
				faker.fakeValuesService().resolve("pharma.Disperser.OperationalStatus", this, faker));
		disperser.setLocationName(faker.fakeValuesService().resolve("pharma.Disperser.LocationName", this, faker));
		disperser.setLocationType(faker.fakeValuesService().resolve("pharma.Disperser.LocationType", this, faker));
		disperser.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		disperser.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		disperser.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		disperser.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return disperser;
	}

	public WeighingSystem weighingSystem() {
		WeighingSystem weighingSystem = new WeighingSystem();
		weighingSystem.setModelSerialNumber(faker.idNumber().valid());
		weighingSystem.setCapacity(faker.number().randomDouble(2, 1, 1000));
		weighingSystem.setReadability(faker.number().randomDouble(2, 0, 1) * 0.001);
		weighingSystem.setPrecision(faker.number().randomDouble(2, 0, 1) * 0.001);
		weighingSystem
				.setBalanceType(faker.fakeValuesService().resolve("pharma.WeighingSystem.BalanceType", this, faker));
		weighingSystem.setOperationalStatus(
				faker.fakeValuesService().resolve("pharma.WeighingSystem.OperationalStatus", this, faker));
		weighingSystem
				.setLocationName(faker.fakeValuesService().resolve("pharma.WeighingSystem.LocationName", this, faker));
		weighingSystem
				.setLocationType(faker.fakeValuesService().resolve("pharma.WeighingSystem.LocationType", this, faker));
		weighingSystem.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		weighingSystem.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		weighingSystem.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		weighingSystem.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return weighingSystem;
	}

	public CompressionPress compressionPress() {
		CompressionPress compressionPress = new CompressionPress();
		compressionPress.setModelSerialNumber(faker.idNumber().valid());
		compressionPress.setMaxTabletDiameter(faker.number().randomDouble(2, 1, 10));
		compressionPress.setMaxCompressionForce(faker.number().randomDouble(2, 10, 500));
		compressionPress.setTurretSpeed(faker.number().randomDouble(2, 10, 100));
		compressionPress.setNumberOfStations(faker.number().numberBetween(1, 10));
		compressionPress.setOutputCapacity(faker.number().numberBetween(1000, 10000));
		compressionPress.setControlSystemType(
				faker.fakeValuesService().resolve("pharma.CompressionPress.ControlSystemType", this, faker));
		compressionPress.setLocationPlant(
				faker.fakeValuesService().resolve("pharma.CompressionPress.LocationPlant", this, faker));
		compressionPress.setOperationalStatus(
				faker.fakeValuesService().resolve("pharma.CompressionPress.OperationalStatus", this, faker));
		compressionPress.setLocationName(
				faker.fakeValuesService().resolve("pharma.CompressionPress.LocationName", this, faker));
		compressionPress.setLocationType(
				faker.fakeValuesService().resolve("pharma.CompressionPress.LocationType", this, faker));
		compressionPress.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		compressionPress.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		compressionPress.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		compressionPress.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return compressionPress;
	}

	public PackagingLine packagingLine() {
		PackagingLine packagingLine = new PackagingLine();
		packagingLine.setModelSerialNumber(faker.idNumber().valid());
		packagingLine.setLineCapacity(faker.number().numberBetween(1, 100));
		packagingLine
				.setPackagingType(faker.fakeValuesService().resolve("pharma.PackagingLine.PackagingType", this, faker));
		packagingLine.setComponentCompatibility(
				faker.fakeValuesService().resolve("pharma.PackagingLine.ComponentCompatibility", this, faker));
		packagingLine.setAutomationLevel(
				faker.fakeValuesService().resolve("pharma.PackagingLine.AutomationLevel", this, faker));
		packagingLine.setOperationalStatus(
				faker.fakeValuesService().resolve("pharma.PackagingLine.OperationalStatus", this, faker));
		packagingLine
				.setLocationName(faker.fakeValuesService().resolve("pharma.PackagingLine.LocationName", this, faker));
		packagingLine
				.setLocationType(faker.fakeValuesService().resolve("pharma.PackagingLine.LocationType", this, faker));
		packagingLine.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		packagingLine.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		packagingLine.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		packagingLine.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return packagingLine;
	}

	public Capper capper() {
		Capper capper = new Capper();
		capper.setModelSerialNumber(faker.idNumber().valid());
		capper.setCappingSpeed(faker.number().numberBetween(1, 100));
		capper.setCapTypeCompatibility(
				faker.fakeValuesService().resolve("pharma.Capper.CapTypeCompatibility", this, faker));
		capper.setContainerCompatibility(
				faker.fakeValuesService().resolve("pharma.Capper.ContainerCompatibility", this, faker));
		capper.setTorqueControlRange(faker.number().randomDouble(2, 1, 100));
		capper.setChangeoverFlexibility(
				faker.fakeValuesService().resolve("pharma.Capper.ChangeoverFlexibility", this, faker));
		capper.setOperationalStatus(faker.fakeValuesService().resolve("pharma.Capper.OperationalStatus", this, faker));
		capper.setLocationName(faker.fakeValuesService().resolve("pharma.Capper.LocationName", this, faker));
		capper.setLocationType(faker.fakeValuesService().resolve("pharma.Capper.LocationType", this, faker));
		capper.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		capper.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		capper.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		capper.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return capper;
	}

	public Sealer sealer() {
		Sealer sealer = new Sealer();
		sealer.setModelSerialNumber(faker.idNumber().valid());
		sealer.setSealingSpeed(faker.number().numberBetween(1, 100));
		sealer.setSealType(faker.fakeValuesService().resolve("pharma.Sealer.SealType", this, faker));
		sealer.setSealWidth(faker.number().randomDouble(2, 0, 10));
		sealer.setMaterialCompatibility(
				faker.fakeValuesService().resolve("pharma.Sealer.MaterialCompatibility", this, faker));
		sealer.setTemperatureControl(faker.random().nextBoolean());
		sealer.setSealingPressureRange(faker.number().randomDouble(2, 1, 100));
		sealer.setLocationName(faker.fakeValuesService().resolve("pharma.Sealer.LocationName", this, faker));
		sealer.setLocationType(faker.fakeValuesService().resolve("pharma.Sealer.LocationType", this, faker));
		sealer.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		sealer.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		sealer.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		sealer.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		sealer.setOperationalStatus(faker.fakeValuesService().resolve("pharma.Sealer.OperationalStatus", this, faker));
		return sealer;
	}

	public Fermenter fermenter() {
		Fermenter fermenter = new Fermenter();
		fermenter.setVesselVolume(faker.number().randomDouble(2, 10, 1000));
		fermenter.setVesselMaterial(faker.fakeValuesService().resolve("pharma.Fermenter.VesselMaterial", this, faker));
		fermenter.setAgitationType(faker.fakeValuesService().resolve("pharma.Fermenter.AgitationType", this, faker));
		fermenter.setAgitationSpeedRange(
				faker.fakeValuesService().resolve("pharma.Fermenter.AgitationSpeedRange", this, faker));
		fermenter.setTemperatureControlRange(
				faker.fakeValuesService().resolve("pharma.Fermenter.TemperatureControlRange", this, faker));
		fermenter.setpHControlRange(faker.fakeValuesService().resolve("pharma.Fermenter.pHControlRange", this, faker));
		fermenter.setNumberOfSamplingPorts(faker.number().numberBetween(1, 10));
		fermenter.setInoculationMethod(
				faker.fakeValuesService().resolve("pharma.Fermenter.InoculationMethod", this, faker));
		fermenter.setHarvestMethod(faker.fakeValuesService().resolve("pharma.Fermenter.HarvestMethod", this, faker));
		fermenter.setCleaningInPlaceSystem(faker.random().nextBoolean());
		fermenter.setSterilizationInPlaceSystem(faker.random().nextBoolean());
		fermenter.setControlSystemType(
				faker.fakeValuesService().resolve("pharma.Fermenter.ControlSystemType", this, faker));
		return fermenter;
	}

	public Centrifuge centrifuge() {
		Centrifuge centrifuge = new Centrifuge();
		centrifuge.setMaximumSpeed(faker.number().numberBetween(1000, 10000));
		centrifuge.setCapacity(faker.number().randomDouble(2, 1, 100));
		centrifuge.setTemperatureControlRange(
				faker.fakeValuesService().resolve("pharma.Centrifuge.TemperatureControlRange", this, faker));
		centrifuge.setRotorTypes(faker.fakeValuesService().resolve("pharma.Centrifuge.RotorTypes", this, faker));
		centrifuge
				.setSafetyFeatures(faker.fakeValuesService().resolve("pharma.Centrifuge.SafetyFeatures", this, faker));
		centrifuge.setLocationName(faker.fakeValuesService().resolve("pharma.Centrifuge.LocationName", this, faker));
		centrifuge.setLocationType(faker.fakeValuesService().resolve("pharma.Centrifuge.LocationType", this, faker));
		centrifuge.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		centrifuge.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		centrifuge.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		centrifuge.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		centrifuge.setStatus(faker.fakeValuesService().resolve("pharma.Centrifuge.Status", this, faker));
		return centrifuge;
	}

	public Autoclave autoclave() {
		Autoclave autoclave = new Autoclave();
		autoclave.setChamberSize(faker.fakeValuesService().resolve("pharma.Autoclave.ChamberSize", this, faker));
		autoclave.setTemperatureRange(
				faker.fakeValuesService().resolve("pharma.Autoclave.TemperatureRange", this, faker));
		autoclave.setPressureRange(faker.fakeValuesService().resolve("pharma.Autoclave.PressureRange", this, faker));
		autoclave.setCycleTypes(faker.fakeValuesService().resolve("pharma.Autoclave.CycleTypes", this, faker));
		autoclave.setValidationFeatures(
				faker.fakeValuesService().resolve("pharma.Autoclave.ValidationFeatures", this, faker));
		autoclave.setLocationName(faker.fakeValuesService().resolve("pharma.Autoclave.LocationName", this, faker));
		autoclave.setLocationType(faker.fakeValuesService().resolve("pharma.Autoclave.LocationType", this, faker));
		autoclave.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		autoclave.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		autoclave.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		autoclave.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		autoclave.setStatus(faker.fakeValuesService().resolve("pharma.Autoclave.Status", this, faker));
		return autoclave;
	}

	public ParticleCounter particleCounter() {
		ParticleCounter particleCounter = new ParticleCounter();
		particleCounter.setParticleSizeRange(
				faker.fakeValuesService().resolve("pharma.ParticleCounter.ParticleSizeRange", this, faker));
		particleCounter.setFlowRate(faker.fakeValuesService().resolve("pharma.ParticleCounter.FlowRate", this, faker));
		particleCounter
				.setSamplingRate(faker.fakeValuesService().resolve("pharma.ParticleCounter.SamplingRate", this, faker));
		particleCounter.setCommunicationProtocol(
				faker.fakeValuesService().resolve("pharma.ParticleCounter.CommunicationProtocol", this, faker));
		particleCounter
				.setLocationName(faker.fakeValuesService().resolve("pharma.ParticleCounter.LocationName", this, faker));
		particleCounter
				.setLocationType(faker.fakeValuesService().resolve("pharma.ParticleCounter.LocationType", this, faker));
		particleCounter.setLastCalibrationDate(faker.date().past(365, TimeUnit.DAYS));
		particleCounter.setCalibrationFrequency(faker.number().numberBetween(1, 365));
		particleCounter.setLastMaintenanceDate(faker.date().past(365, TimeUnit.DAYS));
		particleCounter.setMaintenanceFrequency(faker.number().numberBetween(1, 365));
		return particleCounter;
	}

	public HVACSystem hvacSystem() {
		HVACSystem hvacSystem = new HVACSystem();
		hvacSystem.setAirflowRate(faker.fakeValuesService().resolve("pharma.HVACSystem.AirflowRate", this, faker));
		hvacSystem.setTemperatureControl(faker.random().nextBoolean());
		hvacSystem.setHumidityControl(faker.random().nextBoolean());
		hvacSystem.setFiltrationLevels(
				faker.fakeValuesService().resolve("pharma.HVACSystem.FiltrationLevels", this, faker));
		hvacSystem.setBackupSystems(faker.random().nextBoolean());
		return hvacSystem;
	}

	public TOCAnalyzer tocAnalyzer() {
		TOCAnalyzer tocAnalyzer = new TOCAnalyzer();
		tocAnalyzer
				.setDetectionRange(faker.fakeValuesService().resolve("pharma.TOCAnalyzer.DetectionRange", this, faker));
		tocAnalyzer.setDetectionMethod(
				faker.fakeValuesService().resolve("pharma.TOCAnalyzer.DetectionMethod", this, faker));
		tocAnalyzer
				.setSamplingMethod(faker.fakeValuesService().resolve("pharma.TOCAnalyzer.SamplingMethod", this, faker));
		tocAnalyzer.setAnalysisTime(faker.fakeValuesService().resolve("pharma.TOCAnalyzer.AnalysisTime", this, faker));
		return tocAnalyzer;
	}

	public Titrator titrator() {
		Titrator titrator = new Titrator();
		titrator.setTitrationMethod(faker.fakeValuesService().resolve("pharma.Titrator.TitrationMethod", this, faker));
		titrator.setDetectionChannels(faker.number().numberBetween(1, 5));
		titrator.setSampleThroughput(faker.number().numberBetween(10, 100));
		titrator.setAutomationLevel(faker.fakeValuesService().resolve("pharma.Titrator.AutomationLevel", this, faker));
		return titrator;
	}

	public BiologicalSafetyCabinet biologicalSafetyCabinet() {
		BiologicalSafetyCabinet biosafetyCabinet = new BiologicalSafetyCabinet();
		biosafetyCabinet.setClassType(
				faker.fakeValuesService().resolve("pharma.BiologicalSafetyCabinet.ClassType", this, faker));
		biosafetyCabinet.setHepaFiltrationEfficiency(faker.fakeValuesService()
				.resolve("pharma.BiologicalSafetyCabinet.HEPAFiltrationEfficiency", this, faker));
		biosafetyCabinet.setAirflowPattern(
				faker.fakeValuesService().resolve("pharma.BiologicalSafetyCabinet.AirflowPattern", this, faker));
		biosafetyCabinet.setSashHeight(faker.number().randomDouble(2, 30, 90));
		return biosafetyCabinet;
	}

	public Spectrophotometer spectrophotometer() {
		Spectrophotometer spectrophotometer = new Spectrophotometer();
		spectrophotometer.setWavelengthRange(
				faker.fakeValuesService().resolve("pharma.Spectrophotometer.WavelengthRange", this, faker));
		spectrophotometer
				.setBandwidth(faker.fakeValuesService().resolve("pharma.Spectrophotometer.Bandwidth", this, faker));
		spectrophotometer.setSampleCapacity(faker.number().numberBetween(10, 100));
		spectrophotometer.setPhotometricAccuracy(
				faker.fakeValuesService().resolve("pharma.Spectrophotometer.PhotometricAccuracy", this, faker));
		return spectrophotometer;
	}

	public Microscope microscope() {
		Microscope microscope = new Microscope();
		microscope
				.setMicroscopeType(faker.fakeValuesService().resolve("pharma.Microscope.MicroscopeType", this, faker));
		microscope.setMagnificationRange(
				faker.fakeValuesService().resolve("pharma.Microscope.MagnificationRange", this, faker));
		return microscope;
	}

	public VacuumOven vacuumOven() {
		VacuumOven vacuumOven = new VacuumOven();
		vacuumOven.setTemperatureRange(
				faker.fakeValuesService().resolve("pharma.VacuumOven.TemperatureRange", this, faker));
		vacuumOven.setVacuumLevel(faker.fakeValuesService().resolve("pharma.VacuumOven.VacuumLevel", this, faker));
		vacuumOven.setChamberVolume(faker.number().randomDouble(2, 1, 1000));
		vacuumOven
				.setHeatingOptions(faker.fakeValuesService().resolve("pharma.VacuumOven.HeatingOptions", this, faker));
		return vacuumOven;
	}

	public StabilityChamber stabilityChamber() {
		StabilityChamber stabilityChamber = new StabilityChamber();
		stabilityChamber.setTemperatureRange(
				faker.fakeValuesService().resolve("pharma.StabilityChamber.TemperatureRange", this, faker));
		stabilityChamber.setHumidityRange(
				faker.fakeValuesService().resolve("pharma.StabilityChamber.HumidityRange", this, faker));
		stabilityChamber.setLightControl(
				faker.fakeValuesService().resolve("pharma.StabilityChamber.LightControl", this, faker));
		stabilityChamber
				.setChamberSize(faker.fakeValuesService().resolve("pharma.StabilityChamber.ChamberSize", this, faker));
		return stabilityChamber;
	}

	public RotaryEvaporator rotaryEvaporator() {
		RotaryEvaporator rotaryEvaporator = new RotaryEvaporator();
		rotaryEvaporator.setEvaporationFlaskVolume(faker.number().randomDouble(2, 100, 1000));
		rotaryEvaporator.setTemperatureRange(
				faker.fakeValuesService().resolve("pharma.RotaryEvaporator.TemperatureRange", this, faker));
		rotaryEvaporator.setRotationSpeed(faker.number().numberBetween(100, 1000));
		rotaryEvaporator.setCondenserType(
				faker.fakeValuesService().resolve("pharma.RotaryEvaporator.CondenserType", this, faker));
		return rotaryEvaporator;
	}

	public CapsuleFillingMachine capsuleFillingMachine() {
		CapsuleFillingMachine capsuleFillingMachine = new CapsuleFillingMachine();
		capsuleFillingMachine.setFillingAccuracy(
				faker.fakeValuesService().resolve("pharma.CapsuleFillingMachine.FillingAccuracy", this, faker));
		capsuleFillingMachine.setDosageForms(
				faker.fakeValuesService().resolve("pharma.CapsuleFillingMachine.DosageForms", this, faker));
		capsuleFillingMachine.setProductionCapacity(faker.number().numberBetween(5000, 50000));
		return capsuleFillingMachine;
	}

	public ScaleAndBalance scaleAndBalance() {
		ScaleAndBalance scaleAndBalance = new ScaleAndBalance();
		scaleAndBalance.setCapacity(faker.number().numberBetween(100, 10000));
		scaleAndBalance.setCalibrationOptions(
				faker.fakeValuesService().resolve("pharma.ScaleAndBalance.CalibrationOptions", this, faker));
		return scaleAndBalance;
	}

	public FlowCytometer flowCytometer() {
		FlowCytometer flowCytometer = new FlowCytometer();
		flowCytometer.setLaserTypes(faker.fakeValuesService().resolve("pharma.FlowCytometer.LaserTypes", this, faker));
		flowCytometer.setDetectionChannels(faker.number().numberBetween(1, 10));
		flowCytometer.setSampleThroughput(faker.number().numberBetween(10, 1000));
		return flowCytometer;
	}

	public DissolutionTester dissolutionTester() {
		DissolutionTester dissolutionTester = new DissolutionTester();
		dissolutionTester.setTestStations(faker.number().numberBetween(1, 10));
		dissolutionTester.setSpeedRange(faker.number().randomDouble(2, 10, 100));
		dissolutionTester.setTemperatureRange(faker.number().randomDouble(2, 20, 50));
		dissolutionTester.setMediaVolumeRange(faker.number().randomDouble(2, 100, 1000));
		dissolutionTester.setSamplingAutomation(faker.random().nextBoolean());
		dissolutionTester.setOperationalStatus(
				faker.fakeValuesService().resolve("pharma.DissolutionTester.OperationalStatus", this, faker));
		return dissolutionTester;
	}

	public HardnessTester hardnessTester() {
		HardnessTester hardnessTester = new HardnessTester();
		hardnessTester.setTestRange(faker.number().randomDouble(2, 0, 100));
		hardnessTester.setMeasurementUnits(
				faker.fakeValuesService().resolve("pharma.HardnessTester.MeasurementUnits", this, faker));
		hardnessTester.setTestSpeed(faker.number().randomDouble(2, 0, 10));
		hardnessTester.setSampleCapacity(faker.number().numberBetween(1, 1000));
		hardnessTester.setOperationalStatus(
				faker.fakeValuesService().resolve("pharma.HardnessTester.OperationalStatus", this, faker));
		return hardnessTester;
	}

	public FriabilityTester friabilityTester() {
		FriabilityTester friabilityTester = new FriabilityTester();
		friabilityTester.setTestRange(faker.number().randomDouble(2, 0, 100));
		friabilityTester.setDrumSize(faker.number().randomDouble(2, 0, 1000));
		friabilityTester.setTimerRange(faker.number().randomDouble(2, 0, 100));
		friabilityTester.setAutomationLevel(
				faker.fakeValuesService().resolve("pharma.FriabilityTester.AutomationLevel", this, faker));
		friabilityTester.setSampleCapacity(faker.number().numberBetween(1, 1000));
		friabilityTester.setOperationalStatus(
				faker.fakeValuesService().resolve("pharma.FriabilityTester.OperationalStatus", this, faker));
		return friabilityTester;
	}

}
