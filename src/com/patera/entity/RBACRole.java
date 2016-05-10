package com.patera.entity;

import java.util.Collection;

import com.patera.Grantee;
import com.patera.Permission;

public interface RBACRole extends Grantee {

	Collection<Permission> getPermissions();
}
