package com.pgdetails.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PGListing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String pgName;
	private String fullAddress;
	private String city;
	private String locality;
	private String pinCode;
	private String googleMapLink;
	private String nearbyLandmarks;
	private String coverImageUrl;

	@ElementCollection
	private List<String> galleryImages;

	private String virtualTourLink;
	private String videoLink;

	private String occupancyType;
	private Double roomSizeSqFt;
	private Boolean furnished;
	private Boolean attachedWashroom;
	private Boolean balconyAvailable;
	private Boolean airConditioned;
	private String bedType;
	private Boolean mattressProvided;
	private Boolean studyTableAvailable;

	private Boolean foodProvided;
	private String mealTypes;
	private String foodOptions;
	private Boolean cookingAllowed;
	private Boolean commonKitchenAccess;
	private Boolean fridgeAvailable;
	private Boolean microwaveAvailable;

	private Boolean wifiAvailable;
	private Boolean powerBackupAvailable;
	private Boolean geyserAvailable;
	private Boolean washingMachineAvailable;
	private String housekeepingFrequency;
	private Boolean cctvSurveillance;
	private Boolean securityGuardAvailable;
	private Boolean liftAvailable;
	private Boolean twoWheelerParking;
	private Boolean fourWheelerParking;
	private Boolean loungeAvailable;
	private Boolean recreationAreaAvailable;

	private Boolean dailyCleaning;
	private Boolean laundryService;
	private Boolean maintenanceOnCall;
	private Boolean waterPurifierAvailable;

	private String entryExitTimings;
	private Boolean visitorsAllowed;
	private Double securityDepositAmount;
	private Boolean idVerificationRequired;
	private Boolean fireSafetyAvailable;

	private Double monthlyRent;
	private Double depositAmount;
	private Integer noticePeriodDays;
	private Integer lockInPeriodMonths;
	private String additionalChargesInfo;

	private String ownerName;
	private String contactNumber;
	private String whatsappNumber;
	private String email;
	private String visitingHours;
	private String availabilityFor;

	private String agreementType;
	private Integer minimumStayMonths;
	private Integer noticePeriodToLeaveDays;
	private String refundPolicy;
	private String houseRulesDocumentUrl;

	private String specialOffers;
	private String earlyBirdDiscounts;
	private String referralBonuses;

	private Boolean immediatePossession;
	private String availableFromDate;
	private Boolean waitingList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPgName() {
		return pgName;
	}

	public void setPgName(String pgName) {
		this.pgName = pgName;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getGoogleMapLink() {
		return googleMapLink;
	}

	public void setGoogleMapLink(String googleMapLink) {
		this.googleMapLink = googleMapLink;
	}

	public String getNearbyLandmarks() {
		return nearbyLandmarks;
	}

	public void setNearbyLandmarks(String nearbyLandmarks) {
		this.nearbyLandmarks = nearbyLandmarks;
	}

	public String getCoverImageUrl() {
		return coverImageUrl;
	}

	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}

	public List<String> getGalleryImages() {
		return galleryImages;
	}

	public void setGalleryImages(List<String> galleryImages) {
		this.galleryImages = galleryImages;
	}

	public String getVirtualTourLink() {
		return virtualTourLink;
	}

	public void setVirtualTourLink(String virtualTourLink) {
		this.virtualTourLink = virtualTourLink;
	}

	public String getVideoLink() {
		return videoLink;
	}

	public void setVideoLink(String videoLink) {
		this.videoLink = videoLink;
	}

	public String getOccupancyType() {
		return occupancyType;
	}

	public void setOccupancyType(String occupancyType) {
		this.occupancyType = occupancyType;
	}

	public Double getRoomSizeSqFt() {
		return roomSizeSqFt;
	}

	public void setRoomSizeSqFt(Double roomSizeSqFt) {
		this.roomSizeSqFt = roomSizeSqFt;
	}

	public Boolean getFurnished() {
		return furnished;
	}

	public void setFurnished(Boolean furnished) {
		this.furnished = furnished;
	}

	public Boolean getAttachedWashroom() {
		return attachedWashroom;
	}

	public void setAttachedWashroom(Boolean attachedWashroom) {
		this.attachedWashroom = attachedWashroom;
	}

	public Boolean getBalconyAvailable() {
		return balconyAvailable;
	}

	public void setBalconyAvailable(Boolean balconyAvailable) {
		this.balconyAvailable = balconyAvailable;
	}

	public Boolean getAirConditioned() {
		return airConditioned;
	}

	public void setAirConditioned(Boolean airConditioned) {
		this.airConditioned = airConditioned;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public Boolean getMattressProvided() {
		return mattressProvided;
	}

	public void setMattressProvided(Boolean mattressProvided) {
		this.mattressProvided = mattressProvided;
	}

	public Boolean getStudyTableAvailable() {
		return studyTableAvailable;
	}

	public void setStudyTableAvailable(Boolean studyTableAvailable) {
		this.studyTableAvailable = studyTableAvailable;
	}

	public Boolean getFoodProvided() {
		return foodProvided;
	}

	public void setFoodProvided(Boolean foodProvided) {
		this.foodProvided = foodProvided;
	}

	public String getMealTypes() {
		return mealTypes;
	}

	public void setMealTypes(String mealTypes) {
		this.mealTypes = mealTypes;
	}

	public String getFoodOptions() {
		return foodOptions;
	}

	public void setFoodOptions(String foodOptions) {
		this.foodOptions = foodOptions;
	}

	public Boolean getCookingAllowed() {
		return cookingAllowed;
	}

	public void setCookingAllowed(Boolean cookingAllowed) {
		this.cookingAllowed = cookingAllowed;
	}

	public Boolean getCommonKitchenAccess() {
		return commonKitchenAccess;
	}

	public void setCommonKitchenAccess(Boolean commonKitchenAccess) {
		this.commonKitchenAccess = commonKitchenAccess;
	}

	public Boolean getFridgeAvailable() {
		return fridgeAvailable;
	}

	public void setFridgeAvailable(Boolean fridgeAvailable) {
		this.fridgeAvailable = fridgeAvailable;
	}

	public Boolean getMicrowaveAvailable() {
		return microwaveAvailable;
	}

	public void setMicrowaveAvailable(Boolean microwaveAvailable) {
		this.microwaveAvailable = microwaveAvailable;
	}

	public Boolean getWifiAvailable() {
		return wifiAvailable;
	}

	public void setWifiAvailable(Boolean wifiAvailable) {
		this.wifiAvailable = wifiAvailable;
	}

	public Boolean getPowerBackupAvailable() {
		return powerBackupAvailable;
	}

	public void setPowerBackupAvailable(Boolean powerBackupAvailable) {
		this.powerBackupAvailable = powerBackupAvailable;
	}

	public Boolean getGeyserAvailable() {
		return geyserAvailable;
	}

	public void setGeyserAvailable(Boolean geyserAvailable) {
		this.geyserAvailable = geyserAvailable;
	}

	public Boolean getWashingMachineAvailable() {
		return washingMachineAvailable;
	}

	public void setWashingMachineAvailable(Boolean washingMachineAvailable) {
		this.washingMachineAvailable = washingMachineAvailable;
	}

	public String getHousekeepingFrequency() {
		return housekeepingFrequency;
	}

	public void setHousekeepingFrequency(String housekeepingFrequency) {
		this.housekeepingFrequency = housekeepingFrequency;
	}

	public Boolean getCctvSurveillance() {
		return cctvSurveillance;
	}

	public void setCctvSurveillance(Boolean cctvSurveillance) {
		this.cctvSurveillance = cctvSurveillance;
	}

	public Boolean getSecurityGuardAvailable() {
		return securityGuardAvailable;
	}

	public void setSecurityGuardAvailable(Boolean securityGuardAvailable) {
		this.securityGuardAvailable = securityGuardAvailable;
	}

	public Boolean getLiftAvailable() {
		return liftAvailable;
	}

	public void setLiftAvailable(Boolean liftAvailable) {
		this.liftAvailable = liftAvailable;
	}

	public Boolean getTwoWheelerParking() {
		return twoWheelerParking;
	}

	public void setTwoWheelerParking(Boolean twoWheelerParking) {
		this.twoWheelerParking = twoWheelerParking;
	}

	public Boolean getFourWheelerParking() {
		return fourWheelerParking;
	}

	public void setFourWheelerParking(Boolean fourWheelerParking) {
		this.fourWheelerParking = fourWheelerParking;
	}

	public Boolean getLoungeAvailable() {
		return loungeAvailable;
	}

	public void setLoungeAvailable(Boolean loungeAvailable) {
		this.loungeAvailable = loungeAvailable;
	}

	public Boolean getRecreationAreaAvailable() {
		return recreationAreaAvailable;
	}

	public void setRecreationAreaAvailable(Boolean recreationAreaAvailable) {
		this.recreationAreaAvailable = recreationAreaAvailable;
	}

	public Boolean getDailyCleaning() {
		return dailyCleaning;
	}

	public void setDailyCleaning(Boolean dailyCleaning) {
		this.dailyCleaning = dailyCleaning;
	}

	public Boolean getLaundryService() {
		return laundryService;
	}

	public void setLaundryService(Boolean laundryService) {
		this.laundryService = laundryService;
	}

	public Boolean getMaintenanceOnCall() {
		return maintenanceOnCall;
	}

	public void setMaintenanceOnCall(Boolean maintenanceOnCall) {
		this.maintenanceOnCall = maintenanceOnCall;
	}

	public Boolean getWaterPurifierAvailable() {
		return waterPurifierAvailable;
	}

	public void setWaterPurifierAvailable(Boolean waterPurifierAvailable) {
		this.waterPurifierAvailable = waterPurifierAvailable;
	}

	public String getEntryExitTimings() {
		return entryExitTimings;
	}

	public void setEntryExitTimings(String entryExitTimings) {
		this.entryExitTimings = entryExitTimings;
	}

	public Boolean getVisitorsAllowed() {
		return visitorsAllowed;
	}

	public void setVisitorsAllowed(Boolean visitorsAllowed) {
		this.visitorsAllowed = visitorsAllowed;
	}

	public Double getSecurityDepositAmount() {
		return securityDepositAmount;
	}

	public void setSecurityDepositAmount(Double securityDepositAmount) {
		this.securityDepositAmount = securityDepositAmount;
	}

	public Boolean getIdVerificationRequired() {
		return idVerificationRequired;
	}

	public void setIdVerificationRequired(Boolean idVerificationRequired) {
		this.idVerificationRequired = idVerificationRequired;
	}

	public Boolean getFireSafetyAvailable() {
		return fireSafetyAvailable;
	}

	public void setFireSafetyAvailable(Boolean fireSafetyAvailable) {
		this.fireSafetyAvailable = fireSafetyAvailable;
	}

	public Double getMonthlyRent() {
		return monthlyRent;
	}

	public void setMonthlyRent(Double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

	public Double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Integer getNoticePeriodDays() {
		return noticePeriodDays;
	}

	public void setNoticePeriodDays(Integer noticePeriodDays) {
		this.noticePeriodDays = noticePeriodDays;
	}

	public Integer getLockInPeriodMonths() {
		return lockInPeriodMonths;
	}

	public void setLockInPeriodMonths(Integer lockInPeriodMonths) {
		this.lockInPeriodMonths = lockInPeriodMonths;
	}

	public String getAdditionalChargesInfo() {
		return additionalChargesInfo;
	}

	public void setAdditionalChargesInfo(String additionalChargesInfo) {
		this.additionalChargesInfo = additionalChargesInfo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getWhatsappNumber() {
		return whatsappNumber;
	}

	public void setWhatsappNumber(String whatsappNumber) {
		this.whatsappNumber = whatsappNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVisitingHours() {
		return visitingHours;
	}

	public void setVisitingHours(String visitingHours) {
		this.visitingHours = visitingHours;
	}

	public String getAvailabilityFor() {
		return availabilityFor;
	}

	public void setAvailabilityFor(String availabilityFor) {
		this.availabilityFor = availabilityFor;
	}

	public String getAgreementType() {
		return agreementType;
	}

	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public Integer getMinimumStayMonths() {
		return minimumStayMonths;
	}

	public void setMinimumStayMonths(Integer minimumStayMonths) {
		this.minimumStayMonths = minimumStayMonths;
	}

	public Integer getNoticePeriodToLeaveDays() {
		return noticePeriodToLeaveDays;
	}

	public void setNoticePeriodToLeaveDays(Integer noticePeriodToLeaveDays) {
		this.noticePeriodToLeaveDays = noticePeriodToLeaveDays;
	}

	public String getRefundPolicy() {
		return refundPolicy;
	}

	public void setRefundPolicy(String refundPolicy) {
		this.refundPolicy = refundPolicy;
	}

	public String getHouseRulesDocumentUrl() {
		return houseRulesDocumentUrl;
	}

	public void setHouseRulesDocumentUrl(String houseRulesDocumentUrl) {
		this.houseRulesDocumentUrl = houseRulesDocumentUrl;
	}

	public String getSpecialOffers() {
		return specialOffers;
	}

	public void setSpecialOffers(String specialOffers) {
		this.specialOffers = specialOffers;
	}

	public String getEarlyBirdDiscounts() {
		return earlyBirdDiscounts;
	}

	public void setEarlyBirdDiscounts(String earlyBirdDiscounts) {
		this.earlyBirdDiscounts = earlyBirdDiscounts;
	}

	public String getReferralBonuses() {
		return referralBonuses;
	}

	public void setReferralBonuses(String referralBonuses) {
		this.referralBonuses = referralBonuses;
	}

	public Boolean getImmediatePossession() {
		return immediatePossession;
	}

	public void setImmediatePossession(Boolean immediatePossession) {
		this.immediatePossession = immediatePossession;
	}

	public String getAvailableFromDate() {
		return availableFromDate;
	}

	public void setAvailableFromDate(String availableFromDate) {
		this.availableFromDate = availableFromDate;
	}

	public Boolean getWaitingList() {
		return waitingList;
	}

	public void setWaitingList(Boolean waitingList) {
		this.waitingList = waitingList;
	}

	public PGListing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PGListing(Long id, String pgName, String fullAddress, String city, String locality, String pinCode,
			String googleMapLink, String nearbyLandmarks, String coverImageUrl, List<String> galleryImages,
			String virtualTourLink, String videoLink, String occupancyType, Double roomSizeSqFt, Boolean furnished,
			Boolean attachedWashroom, Boolean balconyAvailable, Boolean airConditioned, String bedType,
			Boolean mattressProvided, Boolean studyTableAvailable, Boolean foodProvided, String mealTypes,
			String foodOptions, Boolean cookingAllowed, Boolean commonKitchenAccess, Boolean fridgeAvailable,
			Boolean microwaveAvailable, Boolean wifiAvailable, Boolean powerBackupAvailable, Boolean geyserAvailable,
			Boolean washingMachineAvailable, String housekeepingFrequency, Boolean cctvSurveillance,
			Boolean securityGuardAvailable, Boolean liftAvailable, Boolean twoWheelerParking,
			Boolean fourWheelerParking, Boolean loungeAvailable, Boolean recreationAreaAvailable, Boolean dailyCleaning,
			Boolean laundryService, Boolean maintenanceOnCall, Boolean waterPurifierAvailable, String entryExitTimings,
			Boolean visitorsAllowed, Double securityDepositAmount, Boolean idVerificationRequired,
			Boolean fireSafetyAvailable, Double monthlyRent, Double depositAmount, Integer noticePeriodDays,
			Integer lockInPeriodMonths, String additionalChargesInfo, String ownerName, String contactNumber,
			String whatsappNumber, String email, String visitingHours, String availabilityFor, String agreementType,
			Integer minimumStayMonths, Integer noticePeriodToLeaveDays, String refundPolicy,
			String houseRulesDocumentUrl, String specialOffers, String earlyBirdDiscounts, String referralBonuses,
			Boolean immediatePossession, String availableFromDate, Boolean waitingList) {
		super();
		this.id = id;
		this.pgName = pgName;
		this.fullAddress = fullAddress;
		this.city = city;
		this.locality = locality;
		this.pinCode = pinCode;
		this.googleMapLink = googleMapLink;
		this.nearbyLandmarks = nearbyLandmarks;
		this.coverImageUrl = coverImageUrl;
		this.galleryImages = galleryImages;
		this.virtualTourLink = virtualTourLink;
		this.videoLink = videoLink;
		this.occupancyType = occupancyType;
		this.roomSizeSqFt = roomSizeSqFt;
		this.furnished = furnished;
		this.attachedWashroom = attachedWashroom;
		this.balconyAvailable = balconyAvailable;
		this.airConditioned = airConditioned;
		this.bedType = bedType;
		this.mattressProvided = mattressProvided;
		this.studyTableAvailable = studyTableAvailable;
		this.foodProvided = foodProvided;
		this.mealTypes = mealTypes;
		this.foodOptions = foodOptions;
		this.cookingAllowed = cookingAllowed;
		this.commonKitchenAccess = commonKitchenAccess;
		this.fridgeAvailable = fridgeAvailable;
		this.microwaveAvailable = microwaveAvailable;
		this.wifiAvailable = wifiAvailable;
		this.powerBackupAvailable = powerBackupAvailable;
		this.geyserAvailable = geyserAvailable;
		this.washingMachineAvailable = washingMachineAvailable;
		this.housekeepingFrequency = housekeepingFrequency;
		this.cctvSurveillance = cctvSurveillance;
		this.securityGuardAvailable = securityGuardAvailable;
		this.liftAvailable = liftAvailable;
		this.twoWheelerParking = twoWheelerParking;
		this.fourWheelerParking = fourWheelerParking;
		this.loungeAvailable = loungeAvailable;
		this.recreationAreaAvailable = recreationAreaAvailable;
		this.dailyCleaning = dailyCleaning;
		this.laundryService = laundryService;
		this.maintenanceOnCall = maintenanceOnCall;
		this.waterPurifierAvailable = waterPurifierAvailable;
		this.entryExitTimings = entryExitTimings;
		this.visitorsAllowed = visitorsAllowed;
		this.securityDepositAmount = securityDepositAmount;
		this.idVerificationRequired = idVerificationRequired;
		this.fireSafetyAvailable = fireSafetyAvailable;
		this.monthlyRent = monthlyRent;
		this.depositAmount = depositAmount;
		this.noticePeriodDays = noticePeriodDays;
		this.lockInPeriodMonths = lockInPeriodMonths;
		this.additionalChargesInfo = additionalChargesInfo;
		this.ownerName = ownerName;
		this.contactNumber = contactNumber;
		this.whatsappNumber = whatsappNumber;
		this.email = email;
		this.visitingHours = visitingHours;
		this.availabilityFor = availabilityFor;
		this.agreementType = agreementType;
		this.minimumStayMonths = minimumStayMonths;
		this.noticePeriodToLeaveDays = noticePeriodToLeaveDays;
		this.refundPolicy = refundPolicy;
		this.houseRulesDocumentUrl = houseRulesDocumentUrl;
		this.specialOffers = specialOffers;
		this.earlyBirdDiscounts = earlyBirdDiscounts;
		this.referralBonuses = referralBonuses;
		this.immediatePossession = immediatePossession;
		this.availableFromDate = availableFromDate;
		this.waitingList = waitingList;
	}

}