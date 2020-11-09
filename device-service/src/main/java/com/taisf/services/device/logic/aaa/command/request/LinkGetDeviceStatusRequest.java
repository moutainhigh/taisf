package com.taisf.services.device.logic.aaa.command.request;


import com.taisf.services.device.logic.aaa.command.base.LinkRequest;
import com.taisf.services.device.logic.aaa.command.response.LinkGetDeviceStatusResponse;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2019/4/1.
 * @version 1.0
 * @since 1.0
 */
public class LinkGetDeviceStatusRequest  extends LinkBaseRequest implements LinkRequest<LinkGetDeviceStatusResponse> {


    @JsonProperty("DeviceId")
    private String deviceId;

    public LinkGetDeviceStatusRequest() {
    }

    @Override
    public String getUri() {
        return "/api/open/device/status";
    }

    @Override
    public Class getResponseClass() {
        return LinkGetDeviceStatusResponse.class;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
