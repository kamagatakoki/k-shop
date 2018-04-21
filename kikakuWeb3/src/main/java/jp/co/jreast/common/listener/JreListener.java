package jp.co.jreast.common.listener;

import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.co.intage.framework.log.Loggable;
import jp.co.intage.framework.web.listener.ContextListener;

/**
 * <pre>
 * コンテキストListenerクラス。.
 * 機能概要　：マスタデータを初期化を行う。
 * </pre>
 *
 * 特記事項　：
 *
 * @author zhu
 * @version 0.1 2006.10.10
 */
public class JreListener extends ContextListener implements Loggable {

	/**
	 * ログ.
	 */
	private static Log log = LogFactory.getLog(JreListener.class);

	/**
	 * 初期化処理。.
	 *
	 * @param e
	 *            開始イベント
	 */
	@Override
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("grjeiojegiorgjeoiwgjieowgjwori");
		super.contextInitialized(e);
		try {

		} catch (RuntimeException re) {
			getLog().error("リスナーを使用時、エラーが発生しました。", re);
		}
	}

	/**
	 * ログを取得する.
	 *
	 * @return ログ
	 */
	@Override
	public Log getLog() {
		return log;
	}

}
