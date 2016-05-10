package com.patera.entity;

import java.util.Collection;

import com.patera.Grantee;

public interface RBACUser extends Grantee {

	Collection<RBACRole> getRoles();
}
