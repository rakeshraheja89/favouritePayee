package com.bank.favorite.payee.model;

public class FavoritePayee   {
    /**
	 * 
	 */
    private String customerName;
    
    private String payeeName;
    
    private String ibanCode;
    
    private String bankName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getIbanCode() {
		return ibanCode;
	}

	public void setIbanCode(String ibanCode) {
		this.ibanCode = ibanCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((ibanCode == null) ? 0 : ibanCode.hashCode());
		result = prime * result + ((payeeName == null) ? 0 : payeeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FavoritePayee other = (FavoritePayee) obj;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (ibanCode == null) {
			if (other.ibanCode != null)
				return false;
		} else if (!ibanCode.equals(other.ibanCode))
			return false;
		if (payeeName == null) {
			if (other.payeeName != null)
				return false;
		} else if (!payeeName.equals(other.payeeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FavoritePayee [customerName=" + customerName + ", payeeName=" + payeeName + ", ibanCode=" + ibanCode
				+ ", bankName=" + bankName + "]";
	}
    

}
