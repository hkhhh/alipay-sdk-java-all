package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业订单经营环境信息，包括从商城、mall、门店、收银台和操作员等信息。
 *
 * @author auto create
 * @since 1.0, 2019-02-27 20:49:04
 */
public class EnvInfo extends AlipayObject {

	private static final long serialVersionUID = 2639275991387645612L;

	/**
	 * 商户的操作员编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户门店Id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 商户的终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

}