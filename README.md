# yoti-ws

invoke sequence:
### VC layer
request <---> com.yoti.rest.RestApplication(configed in /web/WEB-INF/web.xml) <---> com.yoti.rest.resource.RestService

### M layer
<---> com.yoti.biz.ActionBiz <---> com.yoti.service.CleanOperation (facade) ---> com.yoti.service.move.Move & com.yoti.service.clean.Clean
