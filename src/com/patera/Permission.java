package com.patera;

public interface Permission {

	void setUpRequiredPermissions();

	boolean isPermitted(Grantee grantee);

	String getName();
}
