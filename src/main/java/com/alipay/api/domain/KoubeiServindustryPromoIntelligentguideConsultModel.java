package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv咨询智能导购项目推荐
 *
 * @author auto create
 * @since 1.0, 2020-03-10 10:32:56
 */
public class KoubeiServindustryPromoIntelligentguideConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1876319624747896262L;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 口碑shopId
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
