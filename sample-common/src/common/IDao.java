package common;

import java.util.*;

/**
 * <pre>
 * DAO�̊��C���^�t�F�[�X�B
 * �@�\�T�v�@�F�@��{�I�ȑ}���A�X�V�A�폜�y�ь����@�\��񋟂���B
 * ���L�����@�F
 * </pre>
 * @author cuiyi
 * @version 0.1 2006.02.10
 */
public interface IDao {

	/**
     * <pre>
     * �}��SQL�������s����B
     * �}�������I�u�W�F�N�g��Ԃ��B
     * </pre>
     *
     * @param id SQL��id
     * @param parameterObject �p�����[�^
     * @return �}�������I�u�W�F�N�g
     */
    public Object insert(String id, Object parameterObject);

    /**
     * <pre>
     * �X�VSQL�������s����B
     * �X�V�����s����Ԃ��B�X�V�Ƃ́AUpdate�AInsert�y��Delete���܂ށB
     * </pre>
     *
     * @param id SQL��id
     * @param parameterObject �p�����[�^
     * @return �e�������s���B
     */
    public int update(String id, Object parameterObject);

    /**
     * <pre>
     * �폜SQL�������s����B
     * �폜�����s����Ԃ��B
     * </pre>
     *
     * @param id SQL��id
     * @param parameterObject �p�����[�^
     * @return �e�������s���B
     */
    public int delete(String id, Object parameterObject);

    /**
     * <pre>
     * 1�̌��ʃI�u�W�F�N�g����������B
     * </pre>
     *
     * @param id SQL��id
     * @param parameterObject �p�����[�^
     * @return 1�̌��ʃI�u�W�F�N�g
     */
    public Object queryForObject(String id, Object parameterObject);

    /**
     * <pre>
     * �������錋�ʂ��w��I�u�W�F�N�g�ɒl��ݒ肷��B
     * </pre>
     *
     * @param id SQL��id
     * @param parameterObject �p�����[�^
     * @param resultObject �w��I�u�W�F�N�g
     * @return �w��I�u�W�F�N�g
     */
    public Object queryForObject(String id, Object parameterObject, Object resultObject);

    /**
     * <pre>
     * ���ʃ��X�g����������B
     * </pre>
     *
     * @param id SQL��id
     * @param parameterObject �p�����[�^
     * @return ���ʃ��X�g
     */
    public List queryForList(String id, Object parameterObject);

    /**
     * <pre>
     * �w��͈͓��̕������ʃI�u�W�F�N�g����������B
     * </pre>
     *
     * @param id SQL��id
     * @param parameterObject �p�����[�^
     * @param skip �X�L�b�v�����s��
     * @param max �Ԃ��ő�s��
     * @return ���ʃ��X�g
     */
    public List queryForList(String id, Object parameterObject, int skip, int max);

    /**
     * <pre>
     * �������ʂ���������B�w��J�������L�[�Ƃ��Č��ʂ��}�b�v�ɒu���B
     * </pre>
     *
     * @param id SQL��id
     * @param parameterObject �p�����[�^
     * @param keyProp �}�b�v�̃L�[
     * @return �}�b�v
     */
    public Map queryForMap(String id, Object parameterObject, String keyProp);

    /**
     * <pre>
     * �������ʂ���������B�w��L�[�ŁA�w��J������l�Ƃ��Č��ʂ��}�b�v�ɒu���B
     * </pre>
     *
     * @param id SQL��id
     * @param parameterObject �p�����[�^
     * @param keyProp �}�b�v�̃L�[
     * @param valueProp �}�b�v�̒l
     * @return �}�b�v
     */
    public Map queryForMap(String id, Object parameterObject, String keyProp, String valueProp);

    /**
     * <pre>
     * �o�b�`���J�n����B
     * �o�b�`��DB�����̌�����������B
     * </pre>
     *
     * Starts a batch in which update statements will be cached before being sent to the database all at once. This can improve overall performance of updates update when dealing with numerous updates
     * (e.g. inserting 1:M related data).
     */
    public void startBatch();

    /**
     * �o�b�`�����s����B �~�Ϗ�������C�Ɏ��s����B
     */
    public int executeBatch();

}
