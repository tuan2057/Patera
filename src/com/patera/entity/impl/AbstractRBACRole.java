package com.patera.entity.impl;

import java.util.Collection;
import java.util.HashSet;

import com.patera.Permission;
import com.patera.entity.RBACRole;

public abstract class AbstractRBACRole implements RBACRole {

	private final Collection<Permission> permissions = new HashSet<>();

	@Override
	public Collection<Permission> getPermissions() {
		return this.permissions;
	}

}
