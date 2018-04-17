package common2;

import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;

public class CustomSqlSessionManager implements SqlSessionFactory, CustomSqlSession {

	private final SqlSessionFactory sqlSessionFactory;
	private final CustomSqlSession sqlSessionProxy;
	private final ThreadLocal<SqlSession> localSqlSession = new ThreadLocal();
	private final SqlSessionTemplate sessionTemplate;

	private CustomSqlSessionManager(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
		sessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
		this.sqlSessionProxy = (CustomSqlSession) Proxy.newProxyInstance(SqlSessionFactory.class.getClassLoader(),
				new Class[] { CustomSqlSession.class }, sessionTemplate.new SqlSessionInterceptor());
	}

	public Object queryForObject(String statement, Object parameter) {
		return this.sqlSessionProxy.selectList(statement, parameter);
	}

	@Override
	public Object queryForObject(String statement) {
		return this.sqlSessionProxy.queryForObject(statement);
	}

	public static CustomSqlSessionManager newInstance(Reader reader) {
		return new CustomSqlSessionManager(new SqlSessionFactoryBuilder().build(reader, (String) null, (Properties) null));
	}

	public static CustomSqlSessionManager newInstance(Reader reader, String environment) {
		return new CustomSqlSessionManager(new SqlSessionFactoryBuilder().build(reader, environment, (Properties) null));
	}

	public static CustomSqlSessionManager newInstance(Reader reader, Properties properties) {
		return new CustomSqlSessionManager(new SqlSessionFactoryBuilder().build(reader, (String) null, properties));
	}

	public static CustomSqlSessionManager newInstance(InputStream inputStream) {
		return new CustomSqlSessionManager(new SqlSessionFactoryBuilder().build(inputStream, (String) null, (Properties) null));
	}

	public static CustomSqlSessionManager newInstance(InputStream inputStream, String environment) {
		return new CustomSqlSessionManager(new SqlSessionFactoryBuilder().build(inputStream, environment, (Properties) null));
	}

	public static CustomSqlSessionManager newInstance(InputStream inputStream, Properties properties) {
		return new CustomSqlSessionManager(new SqlSessionFactoryBuilder().build(inputStream, (String) null, properties));
	}

	public static CustomSqlSessionManager newInstance(SqlSessionFactory sqlSessionFactory) {
		return new CustomSqlSessionManager(sqlSessionFactory);
	}

	public void startManagedSession() {
		this.localSqlSession.set(this.openSession());
	}

	public void startManagedSession(boolean autoCommit) {
		this.localSqlSession.set(this.openSession(autoCommit));
	}

	public void startManagedSession(Connection connection) {
		this.localSqlSession.set(this.openSession(connection));
	}

	public void startManagedSession(TransactionIsolationLevel level) {
		this.localSqlSession.set(this.openSession(level));
	}

	public void startManagedSession(ExecutorType execType) {
		this.localSqlSession.set(this.openSession(execType));
	}

	public void startManagedSession(ExecutorType execType, boolean autoCommit) {
		this.localSqlSession.set(this.openSession(execType, autoCommit));
	}

	public void startManagedSession(ExecutorType execType, TransactionIsolationLevel level) {
		this.localSqlSession.set(this.openSession(execType, level));
	}

	public void startManagedSession(ExecutorType execType, Connection connection) {
		this.localSqlSession.set(this.openSession(execType, connection));
	}

	public boolean isManagedSessionStarted() {
		return this.localSqlSession.get() != null;
	}

	@Override
	public SqlSession openSession() {
		return this.sqlSessionFactory.openSession();
	}

	@Override
	public SqlSession openSession(boolean autoCommit) {
		return this.sqlSessionFactory.openSession(autoCommit);
	}

	@Override
	public SqlSession openSession(Connection connection) {
		return this.sqlSessionFactory.openSession(connection);
	}

	@Override
	public SqlSession openSession(TransactionIsolationLevel level) {
		return this.sqlSessionFactory.openSession(level);
	}

	@Override
	public SqlSession openSession(ExecutorType execType) {
		return this.sqlSessionFactory.openSession(execType);
	}

	@Override
	public SqlSession openSession(ExecutorType execType, boolean autoCommit) {
		return this.sqlSessionFactory.openSession(execType, autoCommit);
	}

	@Override
	public SqlSession openSession(ExecutorType execType, TransactionIsolationLevel level) {
		return this.sqlSessionFactory.openSession(execType, level);
	}

	@Override
	public SqlSession openSession(ExecutorType execType, Connection connection) {
		return this.sqlSessionFactory.openSession(execType, connection);
	}

	@Override
	public Configuration getConfiguration() {
		return this.sqlSessionFactory.getConfiguration();
	}

	@Override
	public <T> T selectOne(String statement) {
		return this.sqlSessionProxy.selectOne(statement);
	}

	@Override
	public <T> T selectOne(String statement, Object parameter) {
		return this.sqlSessionProxy.selectOne(statement, parameter);
	}

	@Override
	public <K, V> Map<K, V> selectMap(String statement, String mapKey) {
		return this.sqlSessionProxy.selectMap(statement, mapKey);
	}

	@Override
	public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey) {
		return this.sqlSessionProxy.selectMap(statement, parameter, mapKey);
	}

	@Override
	public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey, RowBounds rowBounds) {
		return this.sqlSessionProxy.selectMap(statement, parameter, mapKey, rowBounds);
	}

	@Override
	public <T> Cursor<T> selectCursor(String statement) {
		return this.sqlSessionProxy.selectCursor(statement);
	}

	@Override
	public <T> Cursor<T> selectCursor(String statement, Object parameter) {
		return this.sqlSessionProxy.selectCursor(statement, parameter);
	}

	@Override
	public <T> Cursor<T> selectCursor(String statement, Object parameter, RowBounds rowBounds) {
		return this.sqlSessionProxy.selectCursor(statement, parameter, rowBounds);
	}

	@Override
	public <E> List<E> selectList(String statement) {
		return this.sqlSessionProxy.selectList(statement);
	}

	@Override
	public <E> List<E> selectList(String statement, Object parameter) {
		return this.sqlSessionProxy.selectList(statement, parameter);
	}

	@Override
	public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
		return this.sqlSessionProxy.selectList(statement, parameter, rowBounds);
	}

	@Override
	public void select(String statement, ResultHandler handler) {
		this.sqlSessionProxy.select(statement, handler);
	}

	@Override
	public void select(String statement, Object parameter, ResultHandler handler) {
		this.sqlSessionProxy.select(statement, parameter, handler);
	}

	@Override
	public void select(String statement, Object parameter, RowBounds rowBounds, ResultHandler handler) {
		this.sqlSessionProxy.select(statement, parameter, rowBounds, handler);
	}

	@Override
	public int insert(String statement) {
		return this.sqlSessionProxy.insert(statement);
	}

	@Override
	public int insert(String statement, Object parameter) {
		return this.sqlSessionProxy.insert(statement, parameter);
	}

	@Override
	public int update(String statement) {
		return this.sqlSessionProxy.update(statement);
	}

	@Override
	public int update(String statement, Object parameter) {
		return this.sqlSessionProxy.update(statement, parameter);
	}

	@Override
	public int delete(String statement) {
		return this.sqlSessionProxy.delete(statement);
	}

	@Override
	public int delete(String statement, Object parameter) {
		return this.sqlSessionProxy.delete(statement, parameter);
	}

	@Override
	public <T> T getMapper(Class<T> type) {
		return this.getConfiguration().getMapper(type, this);
	}

	@Override
	public Connection getConnection() {
		SqlSession sqlSession = this.localSqlSession.get();
		if (sqlSession == null) {
			throw new SqlSessionException("Error:  Cannot get connection.  No managed session is started.");
		} else {
			return sqlSession.getConnection();
		}
	}

	@Override
	public void clearCache() {
		SqlSession sqlSession = this.localSqlSession.get();
		if (sqlSession == null) {
			throw new SqlSessionException("Error:  Cannot clear the cache.  No managed session is started.");
		} else {
			sqlSession.clearCache();
		}
	}

	@Override
	public void commit() {
		SqlSession sqlSession = this.localSqlSession.get();
		if (sqlSession == null) {
			throw new SqlSessionException("Error:  Cannot commit.  No managed session is started.");
		} else {
			sqlSession.commit();
		}
	}

	@Override
	public void commit(boolean force) {
		SqlSession sqlSession = this.localSqlSession.get();
		if (sqlSession == null) {
			throw new SqlSessionException("Error:  Cannot commit.  No managed session is started.");
		} else {
			sqlSession.commit(force);
		}
	}

	@Override
	public void rollback() {
		SqlSession sqlSession = this.localSqlSession.get();
		if (sqlSession == null) {
			throw new SqlSessionException("Error:  Cannot rollback.  No managed session is started.");
		} else {
			sqlSession.rollback();
		}
	}

	@Override
	public void rollback(boolean force) {
		SqlSession sqlSession = this.localSqlSession.get();
		if (sqlSession == null) {
			throw new SqlSessionException("Error:  Cannot rollback.  No managed session is started.");
		} else {
			sqlSession.rollback(force);
		}
	}

	@Override
	public List<BatchResult> flushStatements() {
		SqlSession sqlSession = this.localSqlSession.get();
		if (sqlSession == null) {
			throw new SqlSessionException("Error:  Cannot rollback.  No managed session is started.");
		} else {
			return sqlSession.flushStatements();
		}
	}

	@Override
	public void close() {
		SqlSession sqlSession = this.localSqlSession.get();
		if (sqlSession == null) {
			throw new SqlSessionException("Error:  Cannot close.  No managed session is started.");
		} else {
			try {
				sqlSession.close();
				sessionTemplate.close();
			} finally {
				this.localSqlSession.set((SqlSession) null);
			}
		}
	}
}
