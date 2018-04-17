package common;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.util.PaginatedList;
import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import com.ibatis.sqlmap.client.event.RowHandler;
import com.ibatis.sqlmap.engine.execution.BatchException;

/**
 * <pre>
 *  DAO�̊��N���X�B
 *  �@�\�T�v�@�F�@DB�ɑ��삷��@�\��񋟂���Bibatis�̎����B
 *  ���L�����@�F
 * </pre>
 * @author cuiyi
 * @version 0.1 2006.02.10
 */
public class BaseSqlMapDao extends SqlMapDaoTemplate implements IDao {

	/**
	 * �R���g���N�^�B
	 * @param daoManager Dao�̃}�l�[�W��
	 */
	public BaseSqlMapDao(DaoManager daoManager) {
		super(daoManager);
	}

}
