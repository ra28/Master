package businesslogic;

import db.IDBManager;
import db.DBManager;

public class BusinessLogic implements IBusinessLogic{

	public BusinessLogic() {
		super();
		IDBManager db = new DBManager();
	}

}
