package common2;

import org.apache.ibatis.session.SqlSession;

public interface CustomSqlSession extends SqlSession {

	Object queryForObject(String arg0);

}
