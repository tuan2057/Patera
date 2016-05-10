import com.patera.Grantee;
import com.patera.PermissionManager;
import com.patera.action.impl.AbstractAction;
import com.patera.anotaion.RequiredPermission;

@RequiredPermission({ "view_user_info", "" })
public class ViewUserInfoAction extends AbstractAction {

	public ViewUserInfoAction(PermissionManager manager, Object data) {
		super(manager);
	}

	@Override
	protected void _execute(Grantee grantee) {
		Object user = null;
		create(user);
	}

	public void create(Object user) {

	}
}
