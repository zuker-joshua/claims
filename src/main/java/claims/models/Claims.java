package claims.models;

import java.time.LocalDate;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Claims {
	
	private final IntegerProperty claimID, clientID; //Identification for the claim and client.
	private final IntegerProperty advisorID, policyID;
	private final ObjectProperty<LocalDate> dateFilled; //Identification for the advisor and the policy.
	private final StringProperty claimStatus, accidentTime, damage, description, payInfo, closureCond; /*Description of the claim status, date claim was opened,
 													time of accident, description of damages, description of accident details,
	      												payment info, description of closure(if closed)*/
	private BooleanProperty atFault, totalled, closed; //Boolean for whether or not client is at fault, the vehicle is totaled, if claim is closed.
     /**
     * Constructs an empty Claim object.
     */

     /**
     * @param claimID identification of claim
     * @param clientID identification of client
     * @param advisorID identification of advisor
     * @param policyID identification of policy
     * @param claimStatus description of claim status
     * @param dateFilled date claim info was filled
     * @param accidentTime time of accident
     * @param damage description of damages
     * @param description description of accident
     * @param payInfo payment information
     * @param closureCond conditions of closure
     * @param atFault whether or not client is at fault
     * @param totalled whether or not vehicle is totalled
     * @param closed whether or not claim is closed
     */
	public Claims(int claimID, int clientID, int advisorID, int policyID, String claimStatus,
			LocalDate dateFilled, String accidentTime, String damage, String description, String payInfo,
			String closureCond, boolean atFault, boolean totalled, boolean closed) {
		
		this.claimID = new SimpleIntegerProperty(this,"ClaimID",claimID);
		this.clientID = new SimpleIntegerProperty(this,"ClientID",clientID);
		this.advisorID = new SimpleIntegerProperty(this,"AdvisorID",advisorID);
		this.policyID = new SimpleIntegerProperty(this,"PolicyID",policyID);
		this.claimStatus = new SimpleStringProperty(this,"ClaimStatus",claimStatus);
		this.dateFilled = new SimpleObjectProperty<>(this, "DateFilled", dateFilled);
		this.accidentTime = new SimpleStringProperty(this,"AccidentTime",accidentTime);
		this.damage = new SimpleStringProperty(this,"Damage",damage);
		this.description = new SimpleStringProperty(this,"Description",description);
		this.payInfo = new SimpleStringProperty(this,"PayInfo",payInfo);
		this.closureCond = new SimpleStringProperty(this,"ClosureCond",closureCond);
		this.atFault = new SimpleBooleanProperty(this,"AtFault",atFault);
		this.totalled = new SimpleBooleanProperty(this,"Totalled",totalled);
		this.closed = new SimpleBooleanProperty(this,"Closed",closed);
		
	}
	//Gets claim ID
	public int getClaimID() {
		return claimID.get();
	}
	//Sets claim id
	public void setClaimID(int claimID) {
		this.claimID.set(claimID);
	}
	//gets client id
	public int getClientID() {
		return clientID.get();
	}
	//Sets client id
	public void setClientID(int clientID) {
		this.clientID.set(clientID);
	}
	//Gets advisor id
	public int getAdvisorID() {
		return advisorID.get();
	}
	//Sets advisor id
	public void setAdvisorID(int advisorID) {
		this.advisorID.set(advisorID);
	}
	//Gets policy id
	public int getPolicyID() {
		return policyID.get();
	}
	//Sets policy id
	public void setPolicyID(int policyID) {
		this.policyID.set(policyID);
	}
	//Gets claims status
	public String getClaimStatus() {
		return claimStatus.get();
	}
	//Sets claims status
	public void setClaimStatus(String claimStatus) {
		this.claimStatus.set(claimStatus);
	}
	//Gets date filled
	public LocalDate getDateFilled() {
		return dateFilled.get();
	}
	//Sets date filled
	public void setDateFilled(LocalDate dateFilled) {
		this.dateFilled.set(dateFilled);
	}
	//Gets time of accident
	public String getAccidentTime() {
		return accidentTime.get();
	}
	//Sets time of accident
	public void setAccidentTime(String accidentTime) {
		this.accidentTime.set(accidentTime);
	}
	//Gets damage description
	public String getDamage() {
		return damage.get();
	}
	//Sets damage description
	public void setDamage(String damage) {
		this.damage.set(damage);
	}
	//Gets accident description
	public String getDescription() {
		return description.get();
	}
	//Sets accident description
	public void setDescription(String description) {
		this.description.set(description);
	}
	//Gets payment info
	public String getPayInfo() {
		return payInfo.get();
	}
	//Sets payment info
	public void setPayInfo(String payInfo) {
		this.payInfo.set(payInfo);
	}
	//Gets condition of closure
	public String getClosureCond() {
		return closureCond.get();
	}
	//Sets condition of closure
	public void setClosureCond(String closureCond) {
		this.closureCond.set(closureCond);
	}
	//Gets whether client is at fault
	public boolean isAtFault() {
		return atFault.get();
	}
	//Sets fault status
	public void setAtFault(boolean atFault) {
		this.atFault.set(atFault);;
	}
	//Gets whether the vehicle is totalled
	public boolean isTotalled() {
		return totalled.get();
	}
	//Sets totalled status
	public void setTotalled(boolean totalled) {
		this.totalled.set(totalled);;
	}
	//Gets closure status of claim
	public boolean isClosed() {
		return closed.get();
	}
	//Sets closure status of claim
	public void setClosed(boolean closed) {
		this.closed.set(closed);
	}

}
