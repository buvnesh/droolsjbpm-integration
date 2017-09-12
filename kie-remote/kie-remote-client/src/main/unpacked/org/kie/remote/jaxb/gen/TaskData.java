//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 12:40:13 PM CEST 
//


package org.kie.remote.jaxb.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.kie.api.task.model.Status;


/**
 * <p>Java class for task-data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="task-data"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}abstractJaxbTaskObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{}status" minOccurs="0"/&gt;
 *         &lt;element name="previousStatus" type="{}status" minOccurs="0"/&gt;
 *         &lt;element name="actual-owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created-by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created-on" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="activation-time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="expiration-time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="skipable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="work-item-id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="process-instance-id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="document-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="document-access-type" type="{}accessType" minOccurs="0"/&gt;
 *         &lt;element name="document-content-id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="output-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="output-access-type" type="{}accessType" minOccurs="0"/&gt;
 *         &lt;element name="output-content-id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fault-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fault-access-type" type="{}accessType" minOccurs="0"/&gt;
 *         &lt;element name="fault-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fault-content-id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="parent-id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="process-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="process-session-id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{}jaxbComment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attachments" type="{}attachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deployment-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "task-data", propOrder = {
    "status",
    "previousStatus",
    "actualOwner",
    "createdBy",
    "createdOn",
    "activationTime",
    "expirationTime",
    "skipable",
    "workItemId",
    "processInstanceId",
    "documentType",
    "documentAccessType",
    "documentContentId",
    "outputType",
    "outputAccessType",
    "outputContentId",
    "faultName",
    "faultAccessType",
    "faultType",
    "faultContentId",
    "parentId",
    "processId",
    "processSessionId",
    "comments",
    "attachments",
    "deploymentId"
})
public class TaskData
    extends AbstractJaxbTaskObject
{

    protected Status status;
    protected Status previousStatus;
    @XmlElement(name = "actual-owner")
    protected String actualOwner;
    @XmlElement(name = "created-by")
    protected String createdBy;
    @XmlElement(name = "created-on")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOn;
    @XmlElement(name = "activation-time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationTime;
    @XmlElement(name = "expiration-time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationTime;
    protected Boolean skipable;
    @XmlElement(name = "work-item-id")
    protected Long workItemId;
    @XmlElement(name = "process-instance-id")
    protected Long processInstanceId;
    @XmlElement(name = "document-type")
    protected String documentType;
    @XmlElement(name = "document-access-type")
    @XmlSchemaType(name = "string")
    protected AccessType documentAccessType;
    @XmlElement(name = "document-content-id")
    protected Long documentContentId;
    @XmlElement(name = "output-type")
    protected String outputType;
    @XmlElement(name = "output-access-type")
    @XmlSchemaType(name = "string")
    protected AccessType outputAccessType;
    @XmlElement(name = "output-content-id")
    protected Long outputContentId;
    @XmlElement(name = "fault-name")
    protected String faultName;
    @XmlElement(name = "fault-access-type")
    @XmlSchemaType(name = "string")
    protected AccessType faultAccessType;
    @XmlElement(name = "fault-type")
    protected String faultType;
    @XmlElement(name = "fault-content-id")
    protected Long faultContentId;
    @XmlElement(name = "parent-id")
    protected Long parentId;
    @XmlElement(name = "process-id")
    protected String processId;
    @XmlElement(name = "process-session-id")
    protected Long processSessionId;
    protected List<Comment> comments;
    protected List<Attachment> attachments;
    @XmlElement(name = "deployment-id")
    protected String deploymentId;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the previousStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getPreviousStatus() {
        return previousStatus;
    }

    /**
     * Sets the value of the previousStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setPreviousStatus(Status value) {
        this.previousStatus = value;
    }

    /**
     * Gets the value of the actualOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualOwner() {
        return actualOwner;
    }

    /**
     * Sets the value of the actualOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualOwner(String value) {
        this.actualOwner = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOn(XMLGregorianCalendar value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the activationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationTime() {
        return activationTime;
    }

    /**
     * Sets the value of the activationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationTime(XMLGregorianCalendar value) {
        this.activationTime = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationTime(XMLGregorianCalendar value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the skipable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipable() {
        return skipable;
    }

    /**
     * Sets the value of the skipable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipable(Boolean value) {
        this.skipable = value;
    }

    /**
     * Gets the value of the workItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkItemId() {
        return workItemId;
    }

    /**
     * Sets the value of the workItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkItemId(Long value) {
        this.workItemId = value;
    }

    /**
     * Gets the value of the processInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * Sets the value of the processInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcessInstanceId(Long value) {
        this.processInstanceId = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link AccessType }
     *     
     */
    public AccessType getDocumentAccessType() {
        return documentAccessType;
    }

    /**
     * Sets the value of the documentAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessType }
     *     
     */
    public void setDocumentAccessType(AccessType value) {
        this.documentAccessType = value;
    }

    /**
     * Gets the value of the documentContentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentContentId() {
        return documentContentId;
    }

    /**
     * Sets the value of the documentContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentContentId(Long value) {
        this.documentContentId = value;
    }

    /**
     * Gets the value of the outputType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputType() {
        return outputType;
    }

    /**
     * Sets the value of the outputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputType(String value) {
        this.outputType = value;
    }

    /**
     * Gets the value of the outputAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link AccessType }
     *     
     */
    public AccessType getOutputAccessType() {
        return outputAccessType;
    }

    /**
     * Sets the value of the outputAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessType }
     *     
     */
    public void setOutputAccessType(AccessType value) {
        this.outputAccessType = value;
    }

    /**
     * Gets the value of the outputContentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutputContentId() {
        return outputContentId;
    }

    /**
     * Sets the value of the outputContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutputContentId(Long value) {
        this.outputContentId = value;
    }

    /**
     * Gets the value of the faultName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultName() {
        return faultName;
    }

    /**
     * Sets the value of the faultName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultName(String value) {
        this.faultName = value;
    }

    /**
     * Gets the value of the faultAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link AccessType }
     *     
     */
    public AccessType getFaultAccessType() {
        return faultAccessType;
    }

    /**
     * Sets the value of the faultAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessType }
     *     
     */
    public void setFaultAccessType(AccessType value) {
        this.faultAccessType = value;
    }

    /**
     * Gets the value of the faultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultType() {
        return faultType;
    }

    /**
     * Sets the value of the faultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultType(String value) {
        this.faultType = value;
    }

    /**
     * Gets the value of the faultContentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFaultContentId() {
        return faultContentId;
    }

    /**
     * Sets the value of the faultContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFaultContentId(Long value) {
        this.faultContentId = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentId(Long value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * Gets the value of the processSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcessSessionId() {
        return processSessionId;
    }

    /**
     * Sets the value of the processSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcessSessionId(Long value) {
        this.processSessionId = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComments() {
        if (comments == null) {
            comments = new ArrayList<Comment>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<Attachment>();
        }
        return this.attachments;
    }

    /**
     * Gets the value of the deploymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * Sets the value of the deploymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentId(String value) {
        this.deploymentId = value;
    }

}