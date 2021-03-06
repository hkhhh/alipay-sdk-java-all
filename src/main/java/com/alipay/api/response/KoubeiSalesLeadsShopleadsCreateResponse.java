package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.leads.shopleads.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-26 20:16:10
 */
public class KoubeiSalesLeadsShopleadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5183555832961244914L;

	/** 
	 * 导入成功的LeadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

}
