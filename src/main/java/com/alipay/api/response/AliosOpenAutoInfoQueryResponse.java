package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alios.open.auto.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-17 12:20:59
 */
public class AliosOpenAutoInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5272672333637118477L;

	/** 
	 * 发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/** 
	 * 车牌号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/** 
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/** 
	 * 车辆识别号码
	 */
	@ApiField("vin")
	private String vin;

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getEngineNo( ) {
		return this.engineNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getLicenseNo( ) {
		return this.licenseNo;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleType( ) {
		return this.vehicleType;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getVin( ) {
		return this.vin;
	}

}
