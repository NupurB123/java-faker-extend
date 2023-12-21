package com.github.javafaker;

public class Pharma {

	private final Faker faker;

	protected Pharma(Faker faker) {
		this.faker = faker;
	}

	public User user() {
		Faker faker = new Faker();
		User user = new User();
		user.setFirstName(faker.name().firstName());
		user.setLastName(faker.name().lastName());
		user.setEmail(null);
		user.setPassword(null);
		user.setUserhandle(null);
		return user;
	}

	public MonitoringDevice monitoringDevice() {
		MonitoringDevice monitoringDevice = new MonitoringDevice();
		monitoringDevice.setModel(faker.fakeValuesService().resolve("pharma.monitoringDevice.model", this, faker));
		monitoringDevice.setType(faker.fakeValuesService().resolve("pharma.monitoringDevice.type", this, faker));
		monitoringDevice.setLocation(faker.fakeValuesService().resolve("pharma.facilityRoom.name", this, faker));
		monitoringDevice.setStatus(faker.fakeValuesService().resolve("pharma.monitoringDevice.status", this, faker));
		return monitoringDevice;
	}

	public FacilityRoom facilityRoom() {
		FacilityRoom facilityRoom = new FacilityRoom();
		facilityRoom.setName(faker.fakeValuesService().resolve("pharma.facilityRoom.name", this, faker));
		return facilityRoom;
	}

	public Product product() {
		Product product = new Product();
		product.setName(faker.fakeValuesService().resolve("pharma.product.name", this, faker));
		product.setDescription(faker.fakeValuesService().resolve("pharma.product.description", this, faker));
		product.setProductType(faker.fakeValuesService().resolve("pharma.product.type", this, faker));
		return product;
	}

	public Equipment equipment() {
		Equipment equipment = new Equipment();
		equipment.setName(faker.fakeValuesService().resolve("pharma.equipment.name", this, faker));
		equipment.setLocation(faker.fakeValuesService().resolve("pharma.facilityRoom.name", this, faker));
		equipment.setType(faker.fakeValuesService().resolve("pharma.equipment.type", this, faker));
		equipment.setStatus(faker.fakeValuesService().resolve("pharma.equipment.status", this, faker));
		return equipment;
	}

	public ManufacturingProcess manufacturingProcess() {
		ManufacturingProcess manufacturingProcess = new ManufacturingProcess();
		manufacturingProcess
				.setName(faker.fakeValuesService().resolve("pharma.manufacturingProcess.name", this, faker));
		manufacturingProcess.setDescription(
				faker.fakeValuesService().resolve("pharma.manufacturingProcess.description", this, faker));
		return manufacturingProcess;
	}

	public Batch batch() {
		Batch batch = new Batch();
		batch.setProduct(faker.fakeValuesService().resolve("pharma.product.name", this, faker));
		batch.setStartDate(null);
		batch.setEndDate(null);
		return batch;
	}

	public QualityControlTest qualityControlTest() {
		QualityControlTest qualityControlTest = new QualityControlTest();
		qualityControlTest.setName(faker.fakeValuesService().resolve("pharma.qualityControlTest.name", this, faker));
		qualityControlTest.setMethodology(faker.fakeValuesService().resolve("pharma.qualityControlTest.methodology", this, faker));
		return qualityControlTest;
	}
}
