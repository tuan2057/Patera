package com.patera.entity.impl;

import java.util.Collection;
import java.util.HashSet;

import com.patera.entity.RBACRole;
import com.patera.entity.RBACUser;

public class AbstractRBACUser implements RBACUser {

	private final Collection<RBACRole> roles = new HashSet<>();

	@Override
	public Collection<RBACRole> getRoles() {
		return this.roles;
	}

}
