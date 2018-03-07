package testjavaproject;

public class Client {
	private int clientNo; //시퀀스를 부여하여 자동으로 고객번호를 생성하도록 한다.
	private String clientName;
	private String clientId;
	private String clientPassword;
	private String clientPasswordConfirm;
	private String clientPhone;
	private String clientaddress;
	private String clientEmail;
	
	public Client() { }

	public Client(int clientNo, String clientId, String clientPassword, String clientPasswordConfirm, 
			String clientPhone, String clientaddress, String clientEmail) {		
	}

	public int getClientNo() {
		return clientNo;
	}

	public void setClientNo(int clientNo) {
		this.clientNo = clientNo;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientPassword() {
		return clientPassword;
	}

	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
	}

	public String getClientPasswordConfirm() {
		return clientPasswordConfirm;
	}

	public void setClientPasswordConfirm(String clientPasswordConfirm) {
		this.clientPasswordConfirm = clientPasswordConfirm;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getClientaddress() {
		return clientaddress;
	}

	public void setClientaddress(String clientaddress) {
		this.clientaddress = clientaddress;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	
	
	
	
}
