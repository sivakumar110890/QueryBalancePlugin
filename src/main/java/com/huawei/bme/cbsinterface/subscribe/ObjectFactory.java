
package com.huawei.bme.cbsinterface.subscribe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.bme.cbsinterface.subscribe package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServicePropertyCallScreen_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "CallScreen");
    private final static QName _ServicePropertySimploProperties_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "SimploProperties");
    private final static QName _ServicePropertyHomeZone_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "HomeZone");
    private final static QName _ServicePropertyFamilyNo_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "FamilyNo");
    private final static QName _FamilyNoInfoPhoneNoOrder_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "phoneNoOrder");
    private final static QName _FamilyNoInfoExpireDate_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "expireDate");
    private final static QName _FamilyNoInfoEffectiveDate_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "effectiveDate");
    private final static QName _FamilyNoInfoSubGroupType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "subGroupType");
    private final static QName _ExpireModeExpireDate_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "ExpireDate");
    private final static QName _OfferOrderInfoOfferCode_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "OfferCode");
    private final static QName _OfferOrderInfoStatus_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "Status");
    private final static QName _CallScreenCallScreenType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "CallScreenType");
    private final static QName _HomeZoneHomeZonePromptMode_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "HomeZonePromptMode");
    private final static QName _HomeZoneHomeZoneChange_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "HomeZoneChange");
    private final static QName _EffectModeEffectiveDate_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "EffectiveDate");
    private final static QName _ProductFeeAmt_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "FeeAmt");
    private final static QName _CallScreenNoInfoIRRouteFlag_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "IRRouteFlag");
    private final static QName _CallScreenNoInfoRoutingMethod_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "RoutingMethod");
    private final static QName _CallScreenNoInfoRouteNumber_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "routeNumber");
    private final static QName _CallScreenNoInfoWeekStop_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "weekStop");
    private final static QName _CallScreenNoInfoListType_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "ListType");
    private final static QName _CallScreenNoInfoWeekStart_QNAME = new QName("http://www.huawei.com/bme/cbsinterface/subscribe", "weekStart");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.bme.cbsinterface.subscribe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BatchUnSubscribeRequest }
     * 
     */
    public BatchUnSubscribeRequest createBatchUnSubscribeRequest() {
        return new BatchUnSubscribeRequest();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferExtRequest }
     * 
     */
    public ChangeOptionalOfferExtRequest createChangeOptionalOfferExtRequest() {
        return new ChangeOptionalOfferExtRequest();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferExtRequest.OptionalOffer }
     * 
     */
    public ChangeOptionalOfferExtRequest.OptionalOffer createChangeOptionalOfferExtRequestOptionalOffer() {
        return new ChangeOptionalOfferExtRequest.OptionalOffer();
    }

    /**
     * Create an instance of {@link BatchSubscribeRequest }
     * 
     */
    public BatchSubscribeRequest createBatchSubscribeRequest() {
        return new BatchSubscribeRequest();
    }

    /**
     * Create an instance of {@link BatchSubscribeRequest.OptionalOffer }
     * 
     */
    public BatchSubscribeRequest.OptionalOffer createBatchSubscribeRequestOptionalOffer() {
        return new BatchSubscribeRequest.OptionalOffer();
    }

    /**
     * Create an instance of {@link ChangeAccountOfferRequest }
     * 
     */
    public ChangeAccountOfferRequest createChangeAccountOfferRequest() {
        return new ChangeAccountOfferRequest();
    }

    /**
     * Create an instance of {@link ChangeAccountOfferRequest.Offering }
     * 
     */
    public ChangeAccountOfferRequest.Offering createChangeAccountOfferRequestOffering() {
        return new ChangeAccountOfferRequest.Offering();
    }

    /**
     * Create an instance of {@link BundleSubscriber }
     * 
     */
    public BundleSubscriber createBundleSubscriber() {
        return new BundleSubscriber();
    }

    /**
     * Create an instance of {@link BindProductSubscriberNoRequest }
     * 
     */
    public BindProductSubscriberNoRequest createBindProductSubscriberNoRequest() {
        return new BindProductSubscriberNoRequest();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferRequest }
     * 
     */
    public ChangeOptionalOfferRequest createChangeOptionalOfferRequest() {
        return new ChangeOptionalOfferRequest();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Service.Property }
     * 
     */
    public Service.Property createServiceProperty() {
        return new Service.Property();
    }

    /**
     * Create an instance of {@link EffectMode }
     * 
     */
    public EffectMode createEffectMode() {
        return new EffectMode();
    }

    /**
     * Create an instance of {@link OfferOrder }
     * 
     */
    public OfferOrder createOfferOrder() {
        return new OfferOrder();
    }

    /**
     * Create an instance of {@link FamilyNoInfo }
     * 
     */
    public FamilyNoInfo createFamilyNoInfo() {
        return new FamilyNoInfo();
    }

    /**
     * Create an instance of {@link HomeZone }
     * 
     */
    public HomeZone createHomeZone() {
        return new HomeZone();
    }

    /**
     * Create an instance of {@link com.huawei.bme.cbsinterface.subscribe.Product }
     * 
     */
    public com.huawei.bme.cbsinterface.subscribe.Product createProduct() {
        return new com.huawei.bme.cbsinterface.subscribe.Product();
    }

    /**
     * Create an instance of {@link ExpireMode }
     * 
     */
    public ExpireMode createExpireMode() {
        return new ExpireMode();
    }

    /**
     * Create an instance of {@link HomeZoneInfo }
     * 
     */
    public HomeZoneInfo createHomeZoneInfo() {
        return new HomeZoneInfo();
    }

    /**
     * Create an instance of {@link OfferOrderInfo }
     * 
     */
    public OfferOrderInfo createOfferOrderInfo() {
        return new OfferOrderInfo();
    }

    /**
     * Create an instance of {@link OptionalOfferOrder }
     * 
     */
    public OptionalOfferOrder createOptionalOfferOrder() {
        return new OptionalOfferOrder();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferResult }
     * 
     */
    public ChangeOptionalOfferResult createChangeOptionalOfferResult() {
        return new ChangeOptionalOfferResult();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferExtResult }
     * 
     */
    public ChangeOptionalOfferExtResult createChangeOptionalOfferExtResult() {
        return new ChangeOptionalOfferExtResult();
    }

    /**
     * Create an instance of {@link CallScreenNoInfo }
     * 
     */
    public CallScreenNoInfo createCallScreenNoInfo() {
        return new CallScreenNoInfo();
    }

    /**
     * Create an instance of {@link CallScreen }
     * 
     */
    public CallScreen createCallScreen() {
        return new CallScreen();
    }

    /**
     * Create an instance of {@link ChangeAccountOfferResult }
     * 
     */
    public ChangeAccountOfferResult createChangeAccountOfferResult() {
        return new ChangeAccountOfferResult();
    }

    /**
     * Create an instance of {@link BatchUnSubscribeRequest.OptionalOffer }
     * 
     */
    public BatchUnSubscribeRequest.OptionalOffer createBatchUnSubscribeRequestOptionalOffer() {
        return new BatchUnSubscribeRequest.OptionalOffer();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferExtRequest.OptionalOffer.Product }
     * 
     */
    public ChangeOptionalOfferExtRequest.OptionalOffer.Product createChangeOptionalOfferExtRequestOptionalOfferProduct() {
        return new ChangeOptionalOfferExtRequest.OptionalOffer.Product();
    }

    /**
     * Create an instance of {@link BatchSubscribeRequest.OptionalOffer.Product }
     * 
     */
    public BatchSubscribeRequest.OptionalOffer.Product createBatchSubscribeRequestOptionalOfferProduct() {
        return new BatchSubscribeRequest.OptionalOffer.Product();
    }

    /**
     * Create an instance of {@link ChangeAccountOfferRequest.Offering.Product }
     * 
     */
    public ChangeAccountOfferRequest.Offering.Product createChangeAccountOfferRequestOfferingProduct() {
        return new ChangeAccountOfferRequest.Offering.Product();
    }

    /**
     * Create an instance of {@link BundleSubscriber.Product }
     * 
     */
    public BundleSubscriber.Product createBundleSubscriberProduct() {
        return new BundleSubscriber.Product();
    }

    /**
     * Create an instance of {@link BindProductSubscriberNoRequest.BindSubNumber }
     * 
     */
    public BindProductSubscriberNoRequest.BindSubNumber createBindProductSubscriberNoRequestBindSubNumber() {
        return new BindProductSubscriberNoRequest.BindSubNumber();
    }

    /**
     * Create an instance of {@link ChangeOptionalOfferRequest.OptionalOffer }
     * 
     */
    public ChangeOptionalOfferRequest.OptionalOffer createChangeOptionalOfferRequestOptionalOffer() {
        return new ChangeOptionalOfferRequest.OptionalOffer();
    }

    /**
     * Create an instance of {@link Service.Property.FamilyNo }
     * 
     */
    public Service.Property.FamilyNo createServicePropertyFamilyNo() {
        return new Service.Property.FamilyNo();
    }

    /**
     * Create an instance of {@link Service.Property.SimploProperties }
     * 
     */
    public Service.Property.SimploProperties createServicePropertySimploProperties() {
        return new Service.Property.SimploProperties();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallScreen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "CallScreen", scope = Service.Property.class)
    public JAXBElement<CallScreen> createServicePropertyCallScreen(CallScreen value) {
        return new JAXBElement<CallScreen>(_ServicePropertyCallScreen_QNAME, CallScreen.class, Service.Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service.Property.SimploProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "SimploProperties", scope = Service.Property.class)
    public JAXBElement<Service.Property.SimploProperties> createServicePropertySimploProperties(Service.Property.SimploProperties value) {
        return new JAXBElement<Service.Property.SimploProperties>(_ServicePropertySimploProperties_QNAME, Service.Property.SimploProperties.class, Service.Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HomeZone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "HomeZone", scope = Service.Property.class)
    public JAXBElement<HomeZone> createServicePropertyHomeZone(HomeZone value) {
        return new JAXBElement<HomeZone>(_ServicePropertyHomeZone_QNAME, HomeZone.class, Service.Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service.Property.FamilyNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "FamilyNo", scope = Service.Property.class)
    public JAXBElement<Service.Property.FamilyNo> createServicePropertyFamilyNo(Service.Property.FamilyNo value) {
        return new JAXBElement<Service.Property.FamilyNo>(_ServicePropertyFamilyNo_QNAME, Service.Property.FamilyNo.class, Service.Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "phoneNoOrder", scope = FamilyNoInfo.class)
    public JAXBElement<Integer> createFamilyNoInfoPhoneNoOrder(Integer value) {
        return new JAXBElement<Integer>(_FamilyNoInfoPhoneNoOrder_QNAME, Integer.class, FamilyNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "expireDate", scope = FamilyNoInfo.class)
    public JAXBElement<String> createFamilyNoInfoExpireDate(String value) {
        return new JAXBElement<String>(_FamilyNoInfoExpireDate_QNAME, String.class, FamilyNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "effectiveDate", scope = FamilyNoInfo.class)
    public JAXBElement<String> createFamilyNoInfoEffectiveDate(String value) {
        return new JAXBElement<String>(_FamilyNoInfoEffectiveDate_QNAME, String.class, FamilyNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "subGroupType", scope = FamilyNoInfo.class)
    public JAXBElement<Integer> createFamilyNoInfoSubGroupType(Integer value) {
        return new JAXBElement<Integer>(_FamilyNoInfoSubGroupType_QNAME, Integer.class, FamilyNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "ExpireDate", scope = ExpireMode.class)
    public JAXBElement<String> createExpireModeExpireDate(String value) {
        return new JAXBElement<String>(_ExpireModeExpireDate_QNAME, String.class, ExpireMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "OfferCode", scope = OfferOrderInfo.class)
    public JAXBElement<String> createOfferOrderInfoOfferCode(String value) {
        return new JAXBElement<String>(_OfferOrderInfoOfferCode_QNAME, String.class, OfferOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "Status", scope = OfferOrderInfo.class)
    public JAXBElement<String> createOfferOrderInfoStatus(String value) {
        return new JAXBElement<String>(_OfferOrderInfoStatus_QNAME, String.class, OfferOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "CallScreenType", scope = CallScreen.class)
    public JAXBElement<Integer> createCallScreenCallScreenType(Integer value) {
        return new JAXBElement<Integer>(_CallScreenCallScreenType_QNAME, Integer.class, CallScreen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "HomeZonePromptMode", scope = HomeZone.class)
    public JAXBElement<Integer> createHomeZoneHomeZonePromptMode(Integer value) {
        return new JAXBElement<Integer>(_HomeZoneHomeZonePromptMode_QNAME, Integer.class, HomeZone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "HomeZoneChange", scope = HomeZone.class)
    public JAXBElement<Integer> createHomeZoneHomeZoneChange(Integer value) {
        return new JAXBElement<Integer>(_HomeZoneHomeZoneChange_QNAME, Integer.class, HomeZone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "EffectiveDate", scope = EffectMode.class)
    public JAXBElement<String> createEffectModeEffectiveDate(String value) {
        return new JAXBElement<String>(_EffectModeEffectiveDate_QNAME, String.class, EffectMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "ExpireDate", scope = EffectMode.class)
    public JAXBElement<String> createEffectModeExpireDate(String value) {
        return new JAXBElement<String>(_ExpireModeExpireDate_QNAME, String.class, EffectMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "FeeAmt", scope = com.huawei.bme.cbsinterface.subscribe.Product.class)
    public JAXBElement<Long> createProductFeeAmt(Long value) {
        return new JAXBElement<Long>(_ProductFeeAmt_QNAME, Long.class, com.huawei.bme.cbsinterface.subscribe.Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "IRRouteFlag", scope = CallScreenNoInfo.class)
    public JAXBElement<Integer> createCallScreenNoInfoIRRouteFlag(Integer value) {
        return new JAXBElement<Integer>(_CallScreenNoInfoIRRouteFlag_QNAME, Integer.class, CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "expireDate", scope = CallScreenNoInfo.class)
    public JAXBElement<String> createCallScreenNoInfoExpireDate(String value) {
        return new JAXBElement<String>(_FamilyNoInfoExpireDate_QNAME, String.class, CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "effectiveDate", scope = CallScreenNoInfo.class)
    public JAXBElement<String> createCallScreenNoInfoEffectiveDate(String value) {
        return new JAXBElement<String>(_FamilyNoInfoEffectiveDate_QNAME, String.class, CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "RoutingMethod", scope = CallScreenNoInfo.class)
    public JAXBElement<Integer> createCallScreenNoInfoRoutingMethod(Integer value) {
        return new JAXBElement<Integer>(_CallScreenNoInfoRoutingMethod_QNAME, Integer.class, CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "routeNumber", scope = CallScreenNoInfo.class)
    public JAXBElement<String> createCallScreenNoInfoRouteNumber(String value) {
        return new JAXBElement<String>(_CallScreenNoInfoRouteNumber_QNAME, String.class, CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "weekStop", scope = CallScreenNoInfo.class)
    public JAXBElement<String> createCallScreenNoInfoWeekStop(String value) {
        return new JAXBElement<String>(_CallScreenNoInfoWeekStop_QNAME, String.class, CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "ListType", scope = CallScreenNoInfo.class)
    public JAXBElement<Integer> createCallScreenNoInfoListType(Integer value) {
        return new JAXBElement<Integer>(_CallScreenNoInfoListType_QNAME, Integer.class, CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "weekStart", scope = CallScreenNoInfo.class)
    public JAXBElement<String> createCallScreenNoInfoWeekStart(String value) {
        return new JAXBElement<String>(_CallScreenNoInfoWeekStart_QNAME, String.class, CallScreenNoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "expireDate", scope = HomeZoneInfo.class)
    public JAXBElement<String> createHomeZoneInfoExpireDate(String value) {
        return new JAXBElement<String>(_FamilyNoInfoExpireDate_QNAME, String.class, HomeZoneInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.huawei.com/bme/cbsinterface/subscribe", name = "effectiveDate", scope = HomeZoneInfo.class)
    public JAXBElement<String> createHomeZoneInfoEffectiveDate(String value) {
        return new JAXBElement<String>(_FamilyNoInfoEffectiveDate_QNAME, String.class, HomeZoneInfo.class, value);
    }

}
